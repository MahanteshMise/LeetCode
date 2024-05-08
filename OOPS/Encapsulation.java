public class Encapsulation {
    // Defining the attributes of the class
    private String name;
    private int age;
    //Defining the constructors of the class
    public Encapsulation(String name,int age){
        this.name = name;
        this.age = age;
    }
    // Getting the name of class
    public String getName(){
        return this.name;
    }
    //Setting the name of the class
    public void setName(String name){
        this.name = name;
    }
    //Defining the getter to get the age
    public int getAge(){
        return this.age;
    }
    //Defining the setter to set the age.
    public void setAge(int age){
        this.age = age;
    }

    public static void main(String[] args){
        Encapsulation person = new Encapsulation("Mahantesh",30);
        System.out.println(person.getName());
        System.out.println(person.getAge());
        person.setName("Kunal Lamkhade");
        person.setAge(28);
        System.out.println(person.getName());
        System.out.println(person.getAge());
    }
}


