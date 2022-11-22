package org.azienda;

import java.time.LocalDate;

//estendo la classe astratta Person
public class Employee extends Person {
	
	// variabili d'istanza
	int salary;
	int monthlyCount;
	
	public Employee(String name, String surname, LocalDate dateOfBirth, int salary, int monthlyCount) {
		// chiamo il costruttore della classe astratta (superClass )
		super(name, surname, dateOfBirth);
		setSalary(salary);
		setMonthlyCount(monthlyCount);
	}

	// get e set
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	
	public int getMonthlyCount() {
		return monthlyCount;
	}
	public void setMonthlyCount(int monthlyCount) {
		this.monthlyCount = monthlyCount;
	}

	@Override
	// dichiaro il metodo
	public int getYearIncome() {
		
		return getSalary() * getMonthlyCount();
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "EMPLOYEE :" + super.toString();
	}
	
}
