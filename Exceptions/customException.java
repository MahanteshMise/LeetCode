import java.util.Scanner;
public class customException {
    public class InvalidUserDefinedException extends Exception{
        @Override
        public String getMessage(){
            return "You have exhausted maximum password attempts.Hence your system is blocked";
        }
    }
    public class ATM{
        int accNo = 12345;
        int passWord = 3390;
        int userAccNo;
        int userPassWord;

        public void getInput(){
            Scanner scan = new Scanner(System.in);
            System.out.println("Enter the account number");
            userAccNo = scan.nextInt();
            System.out.println("Enter the passWord");
            userPassWord = scan.nextInt();
        }

        public void validate() throws InvalidUserDefinedException{
            if(userAccNo == accNo && userPassWord == passWord){
                System.out.println("You have withdraw the cash");
            }
            else{
                InvalidUserDefinedException ude = new InvalidUserDefinedException();
                System.out.println(ude.getMessage());
                throw ude;
            }
        }
    }
    public class DrawMoney{

        public void withDrawMoney(){
            ATM obj = new ATM();
            try{
                obj.getInput();
                obj.validate();
            } catch (InvalidUserDefinedException e) {
                try {
                    obj.getInput();
                    obj.validate();
                }
                catch (InvalidUserDefinedException f){
                    try {
                        obj.getInput();
                        obj.validate();
                    }
                    catch (InvalidUserDefinedException g){
                        System.out.println("You have exhausted the maximum number of allowed attempts, your account is locked");
                    }
                }
            }
        }
    }

    public static void main(String[] args){
        customException obj11 = new customException();
        customException.DrawMoney person1 = obj11.new DrawMoney();
        person1.withDrawMoney();
    }
}