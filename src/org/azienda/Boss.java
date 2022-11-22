package org.azienda;

import java.time.LocalDate;

// estendo la classe astratta Person
public class Boss extends Person {

	// variabili d'istanza
		int salary;
		int bonus;
		
		public Boss(String name, String surname, LocalDate dateOfBirth, int salary, int bonus) {
			// chiamo il costruttore della classe astratta (superClass )
			super(name, surname, dateOfBirth);
			setSalary(salary);
			setBonus(bonus);
		}

		// get e set
		public int getSalary() {
			return salary;
		}
		public void setSalary(int salary) {
			this.salary = salary;
		}

		public int getBonus() {
			return bonus;
		}
		public void setBonus(int bonus) {
			this.bonus = bonus;
		}

		@Override
		// dichiaro il metodo
		public int getYearIncome() {
			
			return  getSalary() * 12 + getBonus();
		}
		
		@Override
		public String toString() {
			// TODO Auto-generated method stub
			return "BOSS " + super.toString();
		}
}
