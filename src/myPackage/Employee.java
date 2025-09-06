package myPackage;

import java.security.PublicKey;

public class Employee {
   private String name;
   public double salary;
   private int workHours, hireYear;
   public Employee(int hireYear, int workHours, double salary, String name) {
	this.name= name;
	this.salary=salary;
	this.workHours=workHours;
	this.hireYear=hireYear;
}
   public double Tax() {
	   if(this.salary>=1000) {
		   return this.salary *0.03;
	   }
	   return 0.0; //else
   }
	public double Bonus(){
		
	    int extrahours= this.workHours-40;
		return 30* extrahours;
	}
		
	
	public double increase() 
{
		int year= 2020-this.hireYear;
		if(year<10){
		return this.salary*0.5;	
		}else if(year>=10 && year <20) {
			return this.salary*0.1;
		}else {
			return this.salary * 0.15;
		}

	}

public void toString(Employee emp) {
	
	System.out.println("Tax:"+ emp.Tax());
	System.out.println("Bonus: "+emp.Bonus());
	System.out.println("Raise of Salary: "+emp.increase());
	double totalSalary=emp.salary-emp.Tax()+emp.Bonus();
	System.out.println("Total Salary with tax and bonus: "+totalSalary) ;
	System.out.println("Total salary with the raise of salary: "+ (emp.salary+emp.increase()));
}
}

