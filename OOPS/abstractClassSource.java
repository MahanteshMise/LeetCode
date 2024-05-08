abstract class abstractClassSource {
    public String fname="Mahantesh";
    public int age = 30;
    abstract void Study();
}

class Student extends  abstractClassSource{
    public int graduationYear = 2018;
    @Override
    public void Study(){
        System.out.println("Studying all day long");
    }
}

class Second{
    public static void main(String[] args){
        Student val1 = new Student();
        System.out.println(val1.fname);
        System.out.println(val1.age);
        val1.Study();
    }
}