package EmployeeExample;
//package : Package is name that organizes a set of related classes and interfaces similar to  
//different folders on my computer
//package is EmployeeExample
public class EmployeeDemo {
	//public : members which can access as public,public members are visible to all other classes.
	//class : is a context of java that are used to create objects and to define object data types and methods.

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	//Public is a keyword that is used as an access modifier for methods and variables.
	//static used to prepare a field,method or inner classes as a class field.
	//void: it is void if the method does not return a value.
//main:it is a function name When a program starts running, it has to start execution from somewhere.
	//String[] args: it is  defining a String array to pass arguments at command line. args is the variable name of the String array.

		PermanentEmp p= new PermanentEmp(1234,"nag",21,15000.00);
		System.out.println("details of permanent employee  are :");
		
                          
		System.out.println("Id  =" + p.empId);// displaying the details
		System.out.println("name =" + p.empName);
		System.out.println("leave =" + p.Total_Leaves);
		/* calling id,name,no of TotalLeaves */
		
		p.calculate_balanceLeaves();
		p.avail_leave(20, (char)0);
		p.calculate_salary();
		//calculate the balances leaves and available leaves
		//calculate the salary                
	System.out.println("...................");

	//Creating object of the permanentEmp and passing the arguments

		TemporaryEmp t= new TemporaryEmp(2326,"srujan",20,30000.00);
		System.out.println(" details of Temprory employee are :");
		
		System.out.println("Id  =" + t.empId);//printing  the details
		System.out.println("name =" + t.empName);
		System.out.println("leave =" + t.Total_Leaves);
		/* calling id,name,no of TotalLeaves */
		t.calculate_balanceLeaves();//displaying the method details
		t.avail_leave(22, (char)0);
		t.calculate_salary();


}
}