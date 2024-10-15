package basic.practice.ujava;

import java.util.ArrayList;
import java.util.Scanner;

public class Department {
    ArrayList<Student> nList = new ArrayList<>();
    void myMain() {
        readAll();
        Scanner scan = new Scanner(System.in);
        String kwd = scan.next();
        findStudent(kwd);
    }

    void findStudent(String kwd){
        for(Student st : nList){
            if(st.match(kwd)){
                System.out.println(st.getId()+" "+st.getName()+" "+st.getGrade());
            }
        }
    }
    void readAll(){
        Scanner scan = new Scanner(System.in);

        while(true){
            String line = scan.nextLine();

            String[] data = line.split(" ");
            if(data[0].equals(".")) break;
            String name = data[1];
            int id = Integer.parseInt(data[0]);
            int grade = Integer.parseInt(data[2]);

            Student st = new Student.builder()
                    .id(id)
                    .grade(grade)
                    .name(name)
                    .builde();
            
            nList.add(st);
        }
    }

    void printAll(){
        for(Student st : nList){
            System.out.println(st.getId()+" "+st.getName()+" "+st.getGrade());
        }
    }
}
