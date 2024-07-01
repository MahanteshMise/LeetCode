class singleTonDesign {
    static singleTonDesign var1 = new singleTonDesign();
    //Empty constructor used to create object
    private singleTonDesign(){}
    static singleTonDesign getInstance(){
        if(var1 == null){
            var1 = new singleTonDesign();
        }
        return var1;
    }
}
class Main333 {
    public static void main(String[] args) {
        singleTonDesign obj1 = singleTonDesign.getInstance();
        System.out.println(obj1);
        singleTonDesign obj2 = singleTonDesign.getInstance();
        System.out.println(obj2);
        singleTonDesign obj3 = singleTonDesign.getInstance();
        System.out.println(obj3);
        singleTonDesign obj4 =  singleTonDesign.getInstance();
        System.out.println(obj4);
    }
}

