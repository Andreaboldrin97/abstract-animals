package org.azienda;

import java.time.LocalDate;
import java.util.Random;

// indico la classe Person come classe astratta
public abstract class Person {
	
	//variabili d'istanza
	String name;
	String surname;
	LocalDate dateOfBirth;
	String companyCode; //valore casuale di 5 cifre
	
	// genero dei numeri casuali
	Random rand = new Random();
	
	// creo il costruttore
	public Person(String name, String surname, LocalDate dateOfBirth) {
		// assegnazione delle variabili
		setName(name);
		setSurname(surname);
		setDateOfBirth(dateOfBirth);
		// generazione casuale di un intero poi trasformato in stringa 
		companyCode = Integer.toString(rand.nextInt(10000 , 99999));
	}
	
	// get e set
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public String getSurname() {
		return surname;
	}
	public void setSurname(String surname) {
		this.surname = surname;
	}

	public LocalDate getDateOfBirth() {
		return dateOfBirth;
	}
	public void setDateOfBirth(LocalDate dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public String getCompanyCode() {
		return companyCode;
	}
	public void setCompanyCode(String companyCode) {
		this.companyCode = companyCode;
	}
	
	// restituisce "nome cognome (codice aziendale)"
	public String getFullName() {
		return getName() + " " + getSurname() + " code : " + getCompanyCode();
	}
	
	// metdo astratto
	public abstract int getYearIncome();
	
	//metodo toString() con il metodo astratto già compreso
	@Override
	public String toString() {
		
		return "\nName : " + getName() + " " + getSurname()
				+ "\nDate of birth : " + getDateOfBirth()
		 		+ "\nCcompanyCode : code-" + getCompanyCode()
		 		+ "\nYear Income : " + getYearIncome();
	}
	
}
