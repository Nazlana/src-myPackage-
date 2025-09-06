package myPackage;

public class EmployeeMain {
public static void main(String[] args) {
	Employee emp1= new Employee(1985, 45, 2000.0, "Nazlan");
	//System.out.println("Tax:"+ emp1.Tax()); ----> toString
	//System.out.println("Bonus: "+emp1.Bonus());  ----> toString
	//System.out.println("Raise of Salary: "+emp1.increase());   ----> toString
	//double totalSalary=emp1.salary-emp1.Tax()+emp1.Bonus();  ----> toString
	//System.out.println("Total Salary with tax and bonus: "+totalSalary) ;  ----> toString
	//System.out.println("Total salary with the raise of salary: "+ (emp1.salary+emp1.increase()));----> toString 

	emp1.toString(emp1);

}
}
