public class OOPSConcepts {
    /*    final int a = 10;

        public static void main(String[] args){
            OOPSConcepts Obj = new OOPSConcepts();
            System.out.println(Obj.a);
        }*/
    // Static and public methods
    static void staticMethod(){
        System.out.println("You are in static method");
    }

    public void publicMethod(){
        System.out.println("You are under public method");
    }

    public static void main(String[] args){
        staticMethod();
        OOPSConcepts obj = new OOPSConcepts();
        obj.publicMethod();

    }
}