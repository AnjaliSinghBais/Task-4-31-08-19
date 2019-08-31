package com.ssi.CollectionTask;

public class Employee {
	 int eno;
    String ename;
     int sal;
   String des;
   String dept;

  //  @Override
//    public String toString() {
//        return "Employee{" + "eno=" + eno + ", ename=" + ename + ", dept=" + dept + ",desg=" + des + ", sal=" + sal + '}';
//        }

    
    
    public Employee(int eno, String ename,  String dept, String des, int sal) {
        this.eno = eno;
        this.ename =ename;
        this.dept = dept;
        this.des=des;
        this.sal = sal;
    }
    


}
