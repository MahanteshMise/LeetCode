import java.util.ArrayList;
import java.util.Collections;

public class sorting111 {
    public static void main(String[] args){
        ArrayList<Employee> empArrList = new ArrayList<Employee>();
        Employee empObj1 = new Employee(1,"Mahantesh","IT",20000);
        Employee empObj2 = new Employee(2,"Soumya","Medicine",30000);
        Employee empObj3 = new Employee(3,"Suvarna","Electricity",150000);
        Employee empObj4 = new Employee(4,"Shashikant","Education",300000);
        Employee empObj5 = new Employee(5,"Abhishek","Civil",5000000);

        empArrList.add(empObj1);
        empArrList.add(empObj2);
        empArrList.add(empObj3);
        empArrList.add(empObj4);
        empArrList.add(empObj5);

        System.out.println(empArrList);
        //Sorting based on name
        Collections.sort(empArrList);
        System.out.println(empArrList);
        //Sorting based on Salary
    }
}
