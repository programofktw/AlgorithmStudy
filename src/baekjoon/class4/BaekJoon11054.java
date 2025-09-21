package baekjoon.class4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BaekJoon11054 {

    static BufferedReader br = new BufferedReader(new  InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {
        int num = Integer.parseInt(br.readLine());

        int[] array = new int[num];

        StringTokenizer st = new StringTokenizer(br.readLine());


        int i = 0;
        while(st.hasMoreTokens()){
            array[i++] = Integer.parseInt(st.nextToken());
        }


        System.out.print(dpSolution(array));
    }


    public static int solution(int[] array){
        return Math.max(dfs(array,1,0,0,false),dfs(array,1,1,array[0],false));
    }

    public static int dpSolution(int[] array){

        int n = array.length;

        //증가 함수
        int[] LIS = new int[array.length];

        //감소 배열
        int[] LDS = new int[array.length];

        // 증가 부분 수열
        for (int i = 0; i < n; i++) {
            LIS[i] = 1;
            for (int j = 0; j < i; j++) {
                if (array[j] < array[i]) LIS[i] = Math.max(LIS[i], LIS[j] + 1);
            }
        }

        // 감소 부분 수열
        for (int i = n - 1; i >= 0; i--) {
            LDS[i] = 1;
            for (int j = n - 1; j > i; j--) {
                if (array[j] < array[i]) LDS[i] = Math.max(LDS[i], LDS[j] + 1);
            }
        }

        int answer = 0;

        for(int i = 0 ; i<n;i++){
            answer = Math.max(answer, LIS[i] + LDS[i] - 1);
        }


        return answer;
    }

    //dfs 시간초과
    public static int dfs(int[] array,int index,int length, int lastNum, boolean isReverse){
        int max =0;

        if(index==array.length) return length;
        //다음 수가 큰 상황
        if(array[index] > lastNum){
            //다음 수가 작은 수여야할 경우 근데 큼 그냥 패스
            if(isReverse){
                max = Math.max(dfs(array, index+1,length,lastNum,isReverse),max);
            }
            //다음 수가 큰 수여야할 경우, 근데 큼, 포함하거나 말거나
            else{
                //포함하거나
                max = Math.max(dfs(array, index+1,length+1,array[index],isReverse),max);
                //포함하지 않거나
                max = Math.max(dfs(array,index+1,length,lastNum,isReverse),max);
            }
            //다음 수가 작은 상황
        }else if(array[index] < lastNum){
            //다음 수가 작아야하는 상황 근데 작음 포함하거나 말거나
            if(isReverse){
                //포함하거나
                max = Math.max(dfs(array, index+1,length+1,array[index],isReverse),max);
                //포함하지 않거나
                max = Math.max(dfs(array,index+1,length,lastNum,isReverse),max);
            }
            //다음수가 커야하는 상황 근데 작음 그럼 reverse를 돌려보서 포함하거나 패스하거나
            else{
                //리버스를 돌려서 포함하거나
                max = Math.max(dfs(array, index+1,length+1,array[index],!isReverse),max);
                //포함하지 않거나
                max = Math.max(dfs(array,index+1,length,lastNum,isReverse),max);
            }
            //같은 경우 그냥 패스
        }else{
            max = Math.max(dfs(array, index+1,length,lastNum,isReverse),max);
        }

        return max;
    }
}
