package com.ssi.CollectionTask;


import java.util.*;

public class CollectionTask {
	static CollectionTask t=new CollectionTask();
	static ArrayList <Employee> list= new ArrayList<Employee>();
	static Scanner input = new Scanner(System. in);
	private static String c;
	
	 public static void addEmployee()
	 {
		 System.out.println("Enter ENO");
		 int eno = input. nextInt();
		 System.out.println("Enter ENAME");
		 String ename = input. next();
		 System.out.println("Enter DEPT");
		 String dept = input. next();
		 System.out.println("Enter DESG");
		 String desg = input. next();
		 System.out.println("Enter SAl");
		 int sal = input. nextInt();
		 Employee e =new Employee(eno,ename,dept,desg,sal);
		 list.add(e);
 
		 
		 
	 }
	
	 
	
	
	public static void viewAll()
				 
	{
		
		for (int i = 0; i < list.size(); i++) {
			
			System.out.println("ENO"+list.get(i).eno);
			System.out.println("Ename"+list.get(i).ename);
			System.out.println("DEPT"+list.get(i).dept);
			System.out.println("DESG"+list.get(i).des);
			System.out.println("Sal"+list.get(i).sal);
			
			
		}
		
	}
	public static void searchEmp()
	{
		
		
		System.out.println("Enter Eno of employee whom you want to search");
	   	int srch=input.nextInt();
	   	for(int i=0;i<list.size();i++)
	   	{ 
	   	if(list.get(i).eno==srch)
	   	{System.out.println("Employee no is "+list.get(i).eno);
	       System.out.println("Employee name is "+list.get(i).ename);
	       System.out.println("Employee department is "+list.get(i).dept);
	       System.out.println("Employee salary is "+list.get(i).sal);
	       System.out.println("Employee designation is "+list.get(i).des);}
	   	}
		
	}
	public static void removeEmp(){
		
		System.out.println("Enter Eno of employee whom you want to delete");
	   	int del=input.nextInt();
	   	for(int i=0;i<list.size();i++)
	   	{ 
	   	if(list.get(i).eno==del)
	   	   list.remove(list.get(i));
	   	System.out.println("Employee Deleted");
	   	}
		
	}
	public static void clearData(){
		list.clear();
	}
	public static void changeSal(){
		
		System.out.println("Enter Eno of employee whom you want to change salary");
	   	int chgsal=input.nextInt();
	   	for(int i=0;i<list.size();i++)
	   	{ 
	   	if(list.get(i).eno==chgsal)
	   	{
	   	System.out.println("Insert the new salary you want");
	   	int newsal=input.nextInt();
	   	list.get(i).sal=newsal;
	   	System.out.println("salary Changed");
	   	}
	   	}
		
	}


	
	public  void viewDeptWise(){
		 
  c = input. next();
		
for (int i = 0; i < list.size(); i++) {
	if(list.get(i).dept.equals(c))
	{
	
			System.out.println("ENO"+list.get(i).eno);
			System.out.println("Ename"+list.get(i).ename);
			System.out.println("DEPT"+list.get(i).dept);
			System.out.println("DESG"+list.get(i).des);
			System.out.println("Sal"+list.get(i).sal);
}
		
		
}	
	}
	
	
	public static void main(String[] args) {
		
	
		System.out.println("Enter YOur CHOICE");
		System.out.println("1. Add Employee ");
		System.out.println("2. view All: ");
		System.out.println("3. Search Employee");
		System.out.println("4.Remove Employee ");
		System.out.println("5.Clear Data ");
		System.out.println("6.Change Salary ");
		System.out.println("7.View Dept Wise ");
		System.out.println("8. EXIT");
		//Scanner input = new Scanner(System. in);
		 while(true){  
		int choice = input. nextInt();
	      
	       
		switch (choice) {
		
		case 1: addEmployee();
			  break;
	     
		case 2: viewAll();
		  break;
		  
		case 3: searchEmp();
		  break;
		  
		case 4: removeEmp();
		  break;
		  
		case 5: clearData();
		  break;
		  
		case 6: changeSal();
		  break;
		  
		case 7: t.viewDeptWise();
		  break;
		  
		case 8: System.exit(1);
		  break;
		default:
			break;
		}
		
	       }     
	}

}
