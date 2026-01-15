package basic.dfs;

import basic.algorithm.AbstractTreeAlogorithm;


/*
            0
    1               2
3       4       5       6

dfs 의 경우 0 1 3 4 5 6
 */
public class TreeDFS extends AbstractTreeAlogorithm {

    public static void main(String[] args){
        printAsBinaryTree();
        System.out.print("DFS : ");
        dfs(0);
    }

    private static void dfs(int index){
        System.out.print(field[index]+" -> ");

        int left = (index * 2)+1;
        int right = left +1;

        if(left>=field.length) return;
        else if(right>=field.length) dfs(left);
        else{
            dfs(left);
            dfs(right);
        }
    }
}
