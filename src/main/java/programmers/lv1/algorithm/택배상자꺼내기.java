package programmers.lv1.algorithm;

public class 택배상자꺼내기 {
    public int solution(int n, int w, int num) {
        int numY = 0 ;
        int topY = n / w;

        topY += (n%w!=0)?1:0;

        while(numY * w < num){
            numY++;
        }

        int numX = (numY%2==0)?(num-(numY-1)*w+1):(numY*w-num+1);
        int result = topY - numY+1;

        if(topY%2==0){
            int topX = n-(topY-1)*w+1;
            if(topX<numX) result--;
        }else{
            int topX = topY*w -n+1;
            if(topX>numX) result--;
        }

        return result;
    }
}
