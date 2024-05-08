public class ConstructorExample {
    int modelYear;
    String modelName;

    public ConstructorExample(int modelYear,String modelName){
        this.modelYear = modelYear;
        this.modelName = modelName;
    }
    public void displayMethod(){
        System.out.println("I have "+modelName+"modelled"+modelYear);
    }

    public static void main(String[] args){
        ConstructorExample car = new ConstructorExample(2019,"Tesla");
        System.out.println("The car is "+car.modelName+" modelled "+car.modelYear+".");
    }
}