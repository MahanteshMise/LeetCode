class lateStaticBinding {
    static lateStaticBinding var1;

    //Empty constructor used to create object
    private lateStaticBinding(){
    }

    static synchronized lateStaticBinding getInstance() {
        if (var1 == null) {
            var1 = new lateStaticBinding();
        }
        return var1;
    }
}
class Main334 {
    public static void main(String[] args) {
        lateStaticBinding obj1 = lateStaticBinding.getInstance();
        System.out.println(obj1);
        lateStaticBinding obj2 = lateStaticBinding.getInstance();
        System.out.println(obj2);
        lateStaticBinding obj3 = lateStaticBinding.getInstance();
        System.out.println(obj3);
        lateStaticBinding obj4 =  lateStaticBinding.getInstance();
        System.out.println(obj4);
    }
}



