package com.azt.ooplab;

public class Employee {
	 private  int id;
	 private  String firstName;
	 private  String lastName;
	 private  int salary;
	 
	 public static void main(String[] agrs) {
		 Employee c1 = new Employee(11, "Tha", "Ya", 300);
		 System.out.println(c1.getName());
		 System.out.println(c1.getSalary());
		 System.out.println(c1.raiseSalary(1));
	 }
	 
	 public Employee(int id,String firstName, String lastName, int salary) {
	     this.firstName = firstName;
	     this.lastName = lastName;
	     this.salary = salary;
	     
	 }
	 
	 public int getID(){
		 return id;
	 }
	 
	 public String getFitstname(){
		 return firstName;
	 }
	 
	 public String getLastname(){
		 return lastName;
	 }
	 public String getName() {
		 return firstName+" "+lastName;
	 }
	 
	 public int getSalary(){
		 return salary;
	 }
	 
	 public void setSalary(int salary) {
		 this.salary = salary;
	 }
	 
	 public int getAnnualSalary(int salary) {
		 return salary*12;
	 }
	 public int raiseSalary(int percent) {
		 return salary*(percent+100)/100;
	 }
	 
	 @Override
	 public String toString() {
		 return "Employee [id="+id+",name="+firstName+" "+lastName+",salary ="+salary+"]";
	 }
}
