public class Student {
    private String name;
    private int age;
    private int iit_no;

    public Student (String name, int age, int iit_no){
        this.name = name;
        this.age = age;
        this.iit_no = iit_no;
    }
    //default
    public Student (){
        name = "name";
        age = 0000;
        iit_no = 00000000;
    }

    public String sleep(){
        return "I like to sleep";
    }
}
