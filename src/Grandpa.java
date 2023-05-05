public class Grandpa {
    private String name;
    private Hobby hobby;
    private  int age;
    private int pension;

    public String getName() {
        return name;
    }

    public Hobby getHobby() {
        return hobby;
    }

    public int getAge() {
        return age;
    }

    public int getPension() {
        return pension;
    }

    public Grandpa(String name, Hobby hobby, int age) {
        this.name = name;
        this.hobby = hobby;
        this.age = age;
    }

    public Grandpa(String name, Hobby hobby, int age, int pension) {
        this.name = name;
        this.hobby = hobby;
        this.age = age;
        this.pension = pension;
    }

    public void aboutMe(){
        System.out.println("I am grandfather");
    }

    public void aboutMe(int age){
        System.out.println("I am "+ age + " y.o");
    }

    public void aboutMe(String name){
        System.out.println("My name is " + name);
    }

    public String selfInfo(){
        return "Name:"+ getName()
                + "\nAge: "+ getAge()
                + "\nHobby: " + getHobby()
                + "\nPension: " + getPension();

    }


}
