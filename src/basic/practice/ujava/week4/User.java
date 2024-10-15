package basic.practice.ujava.week4;

import java.util.ArrayList;
import java.util.Scanner;

public class User{
    String id, pwd;
    String name;
    int point;
    ArrayList<Item> basket = new ArrayList<>();

    public User(String id){
        this.id = id;
    }


    public void print() {
        System.out.printf("[%s] 총구매 %d건 %d원 (%d점)\n\t",id,basket.size(),returnAllPrice(),point);
        for(Item it : basket){
            System.out.print(it.name+" ");
        }
        System.out.println();
    }

    public void read(Scanner scan,Store store) {
        Item item = null;
        String num;
        this.pwd = scan.next();
        point = Integer.parseInt(scan.next());
        while(true){
            num =scan.next();
            if(num.equals("0")) break;
            item = store.findItem(num);
            this.point+=item.price/100;
            this.basket.add(item);
        }
    }

    public int returnAllPrice(){
        int sum=0;
        for(Item it : basket){
            sum+=it.price;
        }
        return sum;
    }

    public boolean matches(String input) {
        if((""+id).contains(input)) return true;

        return false;
    }
}
