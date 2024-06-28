import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class sorting111 {
    public static void main(String[] args){
        /*ArrayList<Employee> empArrList = new ArrayList<Employee>();
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
        //Sorting based on Salary*/
        Scanner scan = new Scanner(System.in);
        ArrayList<Employee> empArr = new ArrayList<Employee>();
        String[] empDetailsArray = new String[4];
        for(int i=0;i<4;i++){
            System.out.println("Enter the employee details");
            String empDetails = scan.nextLine();
            empDetailsArray = empDetails.split(",");
            Employee empObj = new Employee();
            empObj.setId(Integer.parseInt(empDetailsArray[0]));
            empObj.setName(empDetailsArray[1]);
            empObj.setDepartment(empDetailsArray[2]);
            empObj.setSalary(Integer.parseInt(empDetailsArray[3]));
            empArr.add(empObj);
        }
        System.out.println(empArr);
        //Sorting based on name
        Collections.sort(empArr);
        //Sorting based on Salary*/
        System.out.println(empArr);
    }
}
