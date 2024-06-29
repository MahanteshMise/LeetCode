import java.util.Comparator;
import java.util.Scanner;
import java.util.TreeSet;

class SortByID implements Comparator<Employee111>{
    @Override
    public int compare(Employee111 a, Employee111 b){
        return a.getId() - b.getId();
    }
}
class SortByName implements Comparator<Employee111>{
    @Override
    public int compare(Employee111 a, Employee111 b){
        return (a.getName()).compareTo(b.getName());
    }
}
class SortByDepartment implements Comparator<Employee111>{
    @Override
    public int compare(Employee111 a, Employee111 b){
        return (a.getDepartment()).compareTo(b.getDepartment());
    }
}
class SortBySalary implements Comparator<Employee111>{
    @Override
    public int compare(Employee111 a, Employee111 b){
        return a.getSalary() - b.getSalary();
    }
}

public class sortingBasedOnComparator {
    public static void main(String[] args){
        System.out.println("Enter the number of employees");
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        System.out.println("Enter the options to sort\n1.ID \n2.Name\n3.Department\n4.Salary\n");
        int m = scan.nextInt();
        scan.nextLine();

        Comparator<Employee111> comparator;
        switch (m){
            case 1: comparator = new SortByID(); break;
            case 2: comparator = new SortByName();break;
            case 3: comparator = new SortByDepartment();break;
            case 4: comparator = new SortBySalary(); break;
            default: throw new IllegalArgumentException("Invalid sort Option");
        }
        TreeSet<Employee111> empTreeSet = new TreeSet<>(comparator);
        for(int i=0;i<n;i++){
            System.out.println("Enter the details of the employee");
            String empDetails = scan.nextLine();
            String[] empdArray = empDetails.split(",");
            Employee111 obj = new Employee111(Integer.parseInt(empdArray[0]),empdArray[1],empdArray[2],Integer.parseInt(empdArray[3]));
            empTreeSet.add(obj);
        }
        System.out.println(empTreeSet);
    }
}
