public class abstraction111 {
    abstract class Bird{
        abstract void eat();
        abstract void fly();
    }

    abstract class Eagle extends Bird{
        protected void eat(){
            System.out.println("The Eagle is a Carnivorous bird");
        }
        protected void fly(){
            System.out.println("The Eagle flies very high");
        }
    }

    protected class SerpentEagle extends Eagle{
        protected void eat(){
            System.out.println("The serpent Eagle eats snake");
        }
        protected void fly(){
            System.out.println("The Serpent Eagle flies near mountains");
        }
    }

    protected class GoldenEagle extends Eagle{
        protected void eat(){
            System.out.println("The Golden Eagle eats fishes");
        }
        protected void fly(){
            System.out.println("The golden eagle flies over oceans");
        }
    }

    public static void main(String[] args){
        abstraction111.SerpentEagle obj1 = new abstraction111.SerpentEagle();
        abstraction111.GoldenEagle obj2 = new abstraction111.GoldenEagle();
        
        obj1.eat();
        obj1.fly();
        obj2.eat();
        obj2.fly();
    }
}