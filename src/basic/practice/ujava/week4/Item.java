package basic.practice.ujava.week4;

import java.util.Scanner;

public class Item {
    int num ,price;
    String code,name;

    public Item(String code){
        this.code = code;
    }

    public void read(Scanner scan,int num){
        this.num = num;
        this.name = scan.next();
        this.price = Integer.parseInt(scan.next());

    }

    boolean matches(String request){
        if((""+num).equals(request)) return true;
        if((code).equals(request)) return true;
        if((name).equals(request)) return true;
        return false;
    }

    void print(){
        System.out.printf("[%d] %s %s %d원\n",num,code,name,price);
    }
}
