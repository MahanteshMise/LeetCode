interface FactoryDesignPattern {

}
class FactoryDesignCreator implements FactoryDesignPattern {
    static FactoryDesignPattern factoryCreatorMethod(String name){
        if(name.equals("obj1")){
            return new Obj1Class();
        } else if (name.equals("obj2")) {
            return new Obj2Class();
        } else if (name.equals("obj3")) {
            return new Obj3Class();
        }else{
            return null;
        }
    }
}

class Obj1Class implements FactoryDesignPattern{} ;
class Obj2Class implements FactoryDesignPattern{} ;
class Obj3Class implements FactoryDesignPattern{} ;

class Main234{
    public static void main(String[] args){
        FactoryDesignPattern obj1 = FactoryDesignCreator.factoryCreatorMethod("obj1");
        FactoryDesignPattern obj2 = FactoryDesignCreator.factoryCreatorMethod("obj2");
        FactoryDesignPattern obj3 = FactoryDesignCreator.factoryCreatorMethod("obj3");
        FactoryDesignPattern obj4 = FactoryDesignCreator.factoryCreatorMethod("obj4");
        System.out.println(obj1);
        System.out.println(obj2);
        System.out.println(obj3);
        System.out.println(obj4);
    }
}