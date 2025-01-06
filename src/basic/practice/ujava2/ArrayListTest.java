package basic.practice.ujava2;

import java.util.ArrayList;

public class ArrayListTest {
    static ArrayList<Person> ar = new ArrayList<Person>();

    public static void main(String[] args){
        Person person = new Person();

        person.age =1;
        person.name = "김태완";

        ar.add(person);

        Person p = findPerson("김태완");
        if(p==null) return;
        p.addIar(5);
        p.addIar(6);
        p.print();

        p = findPerson("김태완");
        if(p==null) return;
        p.addIar(7);

        p =findPerson("김태완");
        if(p==null) return;
        p.print();

    }

    public static Person findPerson(String name){
        for(Person p : ar){
            if(p.mathes(name)) return p;
        }

        return null;
    }
}



class Person{
    int age;
    String name;

    ArrayList<Integer> iar = new ArrayList<>();

    public void addIar(int a){
        iar.add(a);
    }

    public int getIarLength(){
        return iar.size();
    }

    public void print(){
        System.out.println(this.name +" "+this.age+" "+this.getIarLength());
        for(int a : iar){
            System.out.println(a);
        }
    }

    public boolean mathes(String name){
        return name.equals(this.name);
    }
}