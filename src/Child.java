import java.util.Arrays;

public class Child extends Father{
    private School school;

    private String gender;

    public School getSchool() {
        return school;
    }

    public String getGender() {
        return gender;
    }

    public Child(String name, Hobby hobby, int age, School school, String gender) {
        super(name, hobby, age);
        this.school = school;
        this.gender = gender;
    }

    public void aboutMe(){
        if (gender == "Male"){
        System.out.println("I am son and brother");}
        else if(gender == "Female"){
            System.out.println("I am daughter and sister");
        }else{
            System.out.println("I am a child");
        }
    }

    public void aboutMe(int age){
        System.out.println("I am "+ age + " y.o");
    }

    public void aboutMe(String name){
        System.out.println("My name is " + name);
    }

    @Override
    public String selfInfo() {
        return super.getInfo()+
                "\nSchool: " + school.getPlace()
                +"\nSchool address: " + school.getAddress()
                +"\nMarks"+ Arrays.toString(school.getMarks());
    }
}
