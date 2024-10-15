package basic.practice.ujava.week4;

import java.util.ArrayList;
import java.util.Scanner;

public class Store {
    ArrayList<Item> itemList = new ArrayList<>();
    ArrayList<User> userList = new ArrayList<>();
    Scanner scan = new Scanner(System.in);

    public void readAllUser(){
        User user = null;

        while(true){
            String id = scan.next();
            if(id.equals("0")) break;
            user = new User(id);
            user.read(scan,this);
            userList.add(user);
        }

    }
    public void readAllItem(){
        Item item = null;

        while(true){
            String code = scan.next();
            if(code.equals("0")) break;
            item = new Item(code);
            item.read(scan,itemList.size()+1);
            this.itemList.add(item);
        }
    }

    public Item findItem(String num){
        Item it = null;
        for(Item item : itemList){
            if(item.matches(num)) it = item;
        }
        return it;
    }

    public void printAllUser(){
        for(User user : userList){
            user.print();
        }
    }

    public void printAllItem(){
        for(Item item : itemList){
            item.print();
        }
    }

    public void serchItem(){
        String kwd = scan.next();
        for(Item it : itemList){
            if(it.matches(kwd)) it.print();
        }
    }

    public void serchUser(){
        String kwd = scan.next();
        for(User user : userList){
            if(user.matches(kwd)) user.print();
        }
    }

    public void serchUserByItem(){
        System.out.print("키워드 검색 : ");
        String kwd = scan.next();
        boolean isPrint = false;
        for(User user : userList){
            isPrint = false;
            for(Item item : user.basket){
                if(item.matches(kwd)) isPrint =true;
            }
            if(isPrint) user.print();
        }
    }

    public void printSellData(){
        int[] sellNum = new int[itemList.size()];

        for(User user : userList){
            for(Item item : user.basket){
                sellNum[item.num-1]++;
            }
        }

        for(Item item : itemList){
            System.out.printf("누적 : %d개 ",sellNum[item.num-1]);
            item.print();
        }
    }

    public void withSellData(){
        String kwd = scan.next();
        Item item = findItem(kwd);
        int[] sellNum = new int[itemList.size()];
        System.out.print(item.name+"과 함께 팔린 상품\n");
        for(User user : userList){
            boolean isAdd = false;
            for(Item items : user.basket){
                if(items.matches(""+item.num)) isAdd = true;
            }

            if(isAdd){
                for(Item items : user.basket){
                    sellNum[items.num-1]++;
                }
            }
        }

        for(int i = 3 ; i >=1;i--){
            System.out.print(i+"회 : ");
            for(int j = 0 ; j<sellNum.length;j++){
                if(sellNum[j]==i&&item.num!=j+1) System.out.print(itemList.get(j).name+" ");
            }
            System.out.println();
        }
    }

    public void menu(){
        int input;
        m : while(true){
            System.out.printf("\n[%d]상품출력 [%d]유저출력 [%d]상품검색 [%d]사용자검색 [%d]상품으로사용자검색 [%d]상품별판매현황 [%d]같이판매된상품검색 [%d]종료 : ",1,2,3,4,5,6,7,0);
            input = scan.nextInt();
            switch (input){
                case 1:
                    printAllItem();
                    break;
                case 2:
                    printAllUser();
                    break;
                case 3:
                    serchItem();
                    break;
                case 4:
                    serchUser();
                    break;
                case 5:
                    serchUserByItem();
                    break;
                case 6 :
                    printSellData();
                    break;
                case 7 :
                    withSellData();
                    break;
                default:
                    break m;
            }
        }
    }

    public void myMain(){
        readAllItem();
        readAllUser();
//        printAllUser();
//        printAllItem();

        menu();
    }
    public static void main(String[] args){
        Store store = new Store();

        store.myMain();
    }
}
