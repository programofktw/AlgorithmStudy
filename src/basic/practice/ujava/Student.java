package basic.practice.ujava;

public class Student {
    public Student(){

    }

    private String name;
    private Integer id;
    private Integer grade;

    public Student(builder builder){
        this.name = builder.builderName;
        this.id = builder.builderId;
        this.grade = builder.builderGrade;
    }
    public String getName(){
        return this.name;
    }

    public int getId(){
        return this.id;
    }

    public int getGrade(){
        return this.grade;
    }

    public boolean match(String kwd){
        if(this.name.equals(kwd)) return true;
        if((""+getId()).contains(kwd)) return true;

        return false;
    }

    public static class builder{
        private String builderName;
        private int builderId;
        private int builderGrade;

        public builder(){

        }
        public builder id(int id){
            this.builderId = id;
            return this;
        }

        public builder name(String builderName){
            this.builderName = builderName;
            return this;
        }

        public builder grade(int builderGrade){
            this.builderGrade =builderGrade;
            return this;
        }

        public Student builde(){
            return new Student(this);
        }
    }
}
