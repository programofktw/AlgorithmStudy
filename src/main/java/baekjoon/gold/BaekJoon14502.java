package baekjoon.gold;


import java.util.Scanner;

public class BaekJoon14502 {
	private static final int[][] DIRECTIONS = { {-1, 0},{0, -1}, {0, 1}, {1, 0}};
	static int[][] field;
	static int[][] temp;
	static int N;
	static int M;
	private static boolean[][] visited;
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int max = 0;
		//세로
		N = scan.nextInt();
		//가로
		M = scan.nextInt();
	
		field = new int[N][M];
		temp = new int[N][M];
		for(int i = 0 ; i<N;i++) {
			for(int j = 0 ; j<M;j++) {
				field[i][j] = scan.nextInt();
			}
		}
		
		for (int i = 0; i < field.length; i++) {
            for (int j = 0; j < field[i].length; j++) {
                for (int k = 0; k < field.length; k++) {
                    for (int l = 0; l < field[k].length; l++) {
                        for (int m = 0; m < field.length; m++) {
                            for (int n = 0; n < field[m].length; n++) {
                            	if(m<N&&i<N&&k<N&&j<M&&l<M&&n<M) {
                            		copyField();
                            		int change= 0;
                                    if(temp[i][j]==0) {
                                    	change++;
                                    	temp[i][j] = 1;
                                    }
                                    if(temp[k][l]==0) {
                                    	change++;
                                    	temp[k][l] = 1;
                                    }
                                    if(temp[m][n]==0) {
                                    	change++;
                                    	temp[m][n] = 1;
                                    }
                                    
                                    if(change<3) continue;

                                    
                                   
                                    dfs(temp);
                                    int now = checkSafeZone(temp);
                                    if(max<now) {
                                    	max = now;
                                    }
                                    
                                    
                            	}
                            }
                        }
                    }
                }
            }
        }
		
		
		
		System.out.print(max);
		
	}
	
	public static void dfs(int[][] temp) {
		for(int i = 0 ; i<N;i++) {
			for(int j = 0 ; j<M;j++) {
				if(temp[i][j]==2&&!visited[i][j]) {
					infection(j,i);
				}
			}
		}
	}
	
	public static void infection(int x, int y){
		temp[y][x]=2;
		visited[y][x] = true;
		for(int[] dir : DIRECTIONS) {
			int nextX = x+dir[0];
			int nextY = y+dir[1];
			if(isValid(nextX,nextY)) {
				if(temp[nextY][nextX] == 0) {
					infection(nextX, nextY);
				}
			}
		}
		
		
		
	}
	
	public static int checkSafeZone(int[][] arr) {
		int count = 0;
		for(int i = 0 ; i<N;i++) {
			for(int j = 0 ; j<M;j++) {
				if(arr[i][j]==0) count++;
			}
		}
		
		return count;
	}
	
	public static void copyField(){
		for(int i = 0 ; i<N;i++) {
			for(int j = 0 ; j<M;j++) {
				temp[i][j] = field[i][j];
			}
		}
		visited = new boolean[N][M];
	}
	
	
    public static boolean isValid(int x, int y) {
        return y >= 0 && y < N && x >= 0 && x < M;
    }
    
    public static void printField(int[][] arr) {
    	for(int i = 0 ; i<arr.length;i++) {
    		for(int j= 0;j<arr[i].length;j++) {
    			System.out.print(arr[i][j]+" ");
    		}
    		System.out.println("");
    	}
    }
}
