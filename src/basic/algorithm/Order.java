package basic.algorithm;

public class Order extends AbstractTreeAlogorithm {

    public static void main(String[] args){
        printAsBinaryTree();

        System.out.print("preOrder : ");
        preOrder(0);
        System.out.print("\ninOrder : ");
        inOrder(0);
        System.out.print("\npostOrder : ");
        postOrder(0);
    }

    private static void preOrder(int index){

        int left = index *2+1;
        int right = index*2+2;

        System.out.print(field[index]+" -> ");

        if(left < field.length){
            preOrder(left);
        }
        if(right < field.length){
            preOrder(right);
        }

    }


    private static void inOrder(int index){

        int left = index *2+1;
        int right = index*2+2;

        if(left < field.length){
            inOrder(left);
        }

        System.out.print(field[index]+" -> ");
        if(right < field.length){
            inOrder(right);
        }
    }



    private static void postOrder(int index){

        int left = index *2+1;
        int right = index*2+2;


        if(left < field.length){
            postOrder(left);
        }

        if(right < field.length){
            postOrder(right);
        }

        System.out.print(field[index]+" -> ");
    }

}
