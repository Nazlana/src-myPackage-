
package myPackage;
public class StudentMain {
	public static void main(String[] args) {
		
	// System.out.println("Online student: " + Student.howStudent()); //object üretmeden çağırabildik
	
	Student s1 = new Student("Nazlan", 220, 90);
	Student s2 = new Student("Kenan", 330, 100);
    Student s3 = new Student("Kemal", 400, 70); 
   
    
    System.out.println("Online student: "+ Student.howStudent());
    s1.exit();
    
    System.out.println("Online Student: "+ Student.howStudent());
    
    int[]grades=new int[3];
    grades[0]=s1.point;
    grades[1]=s2.point;
    grades[2]=s3.point;
    
    System.out.println(Student.calcOverall(grades)); 

}
}

