package pack5;

public class Student {
	private String name;
    private int student_number;
    private String age;
    private String class_name;
    Student(){
    }
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name=name;
    }
    public int getStudent_number(){
        return student_number;
    }
    public void setStudent_number(int student_number){
        this.student_number=student_number;
    }
    public String getAge(){
        return age;
    }
    public void setAge(String age){
        this.age=age;
    }
    public String getClass_name(){
        return class_name;
    }
    public void setClass_name(String class_name){
        this.class_name=class_name;
    }
    public String toString(){
        return "����:"+name+",ѧ�ţ�"+student_number+",���䣺"+age+",�༶:"+class_name+"\n";
    }

}

