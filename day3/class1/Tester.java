package com.sonata.assignment.day3.class1;

public class Tester extends Employee {
	double yearlySal;
	Tester() {}
	Tester(int empId, String empName, double empSal) {
		super.empId = empId;
		super.empName = empName;
		super.empSal = empSal;
	}
	public void display() {
		System.out.print(" - Tester Details - \nEmployee ID - " + empId + "\nEmployee Name - " + empName + "\nMonthly Salary - " + empSal + "\nYearly Salary - ");
		salCal();
	}
	public void salCal() {
		yearlySal = 12 * empSal;
		System.out.println(yearlySal + "\n");
	}
}