package baekjoon.class3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

//AC
public class BaekJoon5430 {
    public static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static StringBuilder output = new StringBuilder();
    public static void main(String[] args) throws IOException {
        int N = inputTestCaseNum();

        for(int i=0 ; i< N;i++){
            testCase();
        }
        System.out.println(output);

    }

    public static int inputTestCaseNum() throws IOException {
        return Integer.parseInt(br.readLine());
    }

    public static void testCase() throws IOException {
        boolean reverse = false;
        boolean error = false;
        String commands = br.readLine();

        int arrayNum = Integer.parseInt(br.readLine());

        String inputArray = br.readLine();

        ArrayList<Integer> arrayList = new ArrayList<>();

        inputArray = inputArray.substring(1,inputArray.length()-1);

        String[] inputNum = inputArray.split(",");

        if(arrayNum>0){
            for(String num : inputNum){
                arrayList.add(Integer.parseInt(num));
            }
        }

        for(String command : commands.split("")){
            if(command.equals("R")){
                reverse = !reverse;
            }else if(command.equals("D")){
                if(arrayList.isEmpty()){
                    output.append("error").append("\n");
                    error = true;
                    break;
                }
                else{
                    if(reverse){
                        arrayList.remove(arrayList.size()-1);
                    }else{
                        arrayList.remove(0);
                    }
                }
            }
        }
        if(!error) insertArrayResult(arrayList, reverse);
    }

    public static void insertArrayResult(ArrayList<Integer> arrayList,boolean reverse){

        output.append("[");

        if(reverse){
            for(int i = arrayList.size()-1;i>=0;i--){
                output.append(arrayList.get(i)).append(",");
            }
        }else{
            for(int a : arrayList){
                output.append(a).append(",");
            }
        }
        if(!arrayList.isEmpty()) output.deleteCharAt(output.length()-1);
        output.append("]").append("\n");
    }
}
