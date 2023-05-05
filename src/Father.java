public class Father extends Grandpa{
    private Job job;

    public Job getJob() {
        return job;
    }

    public Father(String name, Hobby hobby, int age) {
        super(name, hobby, age);
    }

    public Father(String name, Hobby hobby, int age, Job job) {
        super(name, hobby, age);
        this.job = job;
    }

    public void aboutMe(){
        System.out.println("I am father");
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
                + "\nJob: " + job.getJobTitle()
                + "\nWorking place"+ job.getPlace()
                + "\nWork place address: "+ job.getAddress()
                +"\nSalary: " + job.getSalary();
    }

    public String getInfo(){
        return "Name:"+ getName()
                + "\nAge: "+ getAge()
                + "\nHobby: " + getHobby();
    }
}
