package EmployeeExample;
//package : Package is name that organizes a set of related classes and interfaces similar to  
//different folders on my computer
//package is EmployeeExample
public class Employee {
	//public : members which can access as public,public members are visible to all other classes.
			//class : is a context of java that are used to create objects and to define object data types and methods.
	 int empId;
	 String empName;
	 int Total_Leaves;
	 double TotalSalary;
	                       // here we are Creating the constructor of the Employee class
	public Employee(int empId, String empName, int totalLeaves, double totalSalary) {
		       super();
	            	this.empId = empId; //implementing the super keyword
		            this.empName = empName;
		Total_Leaves = totalLeaves;
		TotalSalary = totalSalary;
		}
                                                	// here we are Creating the abstract method  as calculate_balanceLeaves
	void  calculate_balanceLeaves(){
	}
	                                        // here we are Creating the abstract method as avail_leave
	boolean avail_leave(int no_of_leaves, char type_of_leave){
		return true;
	}
	                         //here we are Creating the abstract methoda
	void calculate_salary(){
		//void: it is void if the method does not return a value.
	
	}
	}
	
	                     class PermanentEmp extends Employee{ // here we Created a class PermanentEmp which is extends the Employee class
		
	
	double basic,hra,pfa;  //taking three variables of double data type
	                                    
		public PermanentEmp(int empId, String empName, int totalLeaves, double totalSalary) { //here implemented constructor of parent class
			super(empId, empName, totalLeaves, totalSalary);
			
		}
		                                                // here we are initializing the variables
		int paid_leave=2,sick_leave=3,casual_leave=6;
		                                 //taking a  Method to display leaves
		void print_leave_details() {
			//void: it is void if the method does not return a value.
	
			System.out.println("paid_leave" + paid_leave + "sick_leave" + sick_leave + "casual_leave" + casual_leave);
		}
		
		
		void calculate_balanceLeaves() {// here overriding the calculate_balanceLeaves method
			
			int balanceTotal=Total_Leaves-(paid_leave+sick_leave+casual_leave);
			System.out.println("Total leaves left= "+balanceTotal);
			}
		

		boolean avail_leave(int no_of_leaves, char type_of_leave) {//here overriding the method 
			if( no_of_leaves< Total_Leaves){
				return true;
			}else{
				return false;
			}
			
		}
		
		void calculate_salary() {    //Overriding the calculate_salary method
			
			double hra=0.5f* basic;
			double da= .2f * basic;
			double totalSalary = TotalSalary + (hra + da) - pfa;
			System.out.println("Salary of the employee is = "+ totalSalary);
			//system : system is a class in java language.lang package
		  	//out : out is the static member of system class.It's type PrintStream
		  	//println: which is used to print the output.
		
		}
		
	}
	//Creating a class TemporaryEmp which is extending Employee class
	class TemporaryEmp extends Employee{
		//Creating three variables
		double basic,hra,pfa;
		//Creating the constructor of the Employee class
		public TemporaryEmp(int empId, String empName, int totalLeaves, double totalSalary) {
			super(empId, empName, totalLeaves, totalSalary);
			
		}
		//initializing the variables
		int paid_leave=2,sick_leave=3,casual_leave=7;
		// Method to display leave details
		void print_leave_details() {
			System.out.println("paid_leave" + paid_leave + "sick_leave" + sick_leave + "casual_leave" + casual_leave);
			//system : system is a class in java language.lang package
		  	//out : out is the static member of system class.It's type PrintStream
		  	//println: which is used to print the output.
		
		}
		//overriding the calculate_balanceLeaves method

		void calculate_balanceLeaves() {
			
			int balanceTotal=Total_Leaves-(paid_leave+sick_leave+casual_leave);
			System.out.println("Total leaves left= "+balanceTotal);
			//system : system is a class in java language.lang package
		  	//out : out is the static member of system class.It's type PrintStream
		  	//println: which is used to print the output.
		
			}
		//Overriding the calculate_salary method
		
		boolean avail_leave(int no_of_leaves, char type_of_leave) {
			if( no_of_leaves< Total_Leaves){
				return true;
			}else{
				return false;
			}
			
			}
		
		
	                            	//Overriding the calculate_salary method
		void calculate_salary() {
			double hra=0.5f* basic;
			double da= .2f * basic;
			double totalSalary = TotalSalary + (hra + da) - pfa;
			System.out.println("Salary of the employee is = "+ totalSalary);
			//system : system is a class in java language.lang package
		  	//out : out is the static member of system class.It's type PrintStream
		  	//println: which is used to print the output.
		
		}		
}
