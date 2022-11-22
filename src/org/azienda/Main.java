package org.azienda;

import java.time.LocalDate;

public class Main {

	public static void main(String[] args) {
		
		//test creazione Employee
		
		// String name, String surname, LocalDate dateOfBirth, int salary, int monthlyCount
		Employee emp1 = new Employee("Marco" , "Boldrin", LocalDate.of(1963, 06, 24), 1000000, 14);
		System.out.println(emp1);
		
		System.out.println("**********************************");
		
		Employee emp2 = new Employee("Livia" , "Panatta", LocalDate.of(1997, 8, 12), 1500, 12);
		System.out.println(emp2);
		
		System.out.println("**********************************");
		
		Employee emp3 = new Employee("Teresa" , "Rossi", LocalDate.of(1964, 8, 8), 2000, 14);
		System.out.println(emp3);
		
		System.out.println("----------------------------------");
		
		//test creazione Boss
		
		//String name, String surname, LocalDate dateOfBirth, int salary, int bonus
		Boss boss1 = new Boss("Luigi" , "Micco", LocalDate.of(1963, 12, 29), 100, 5000);
		System.out.println(boss1);
		
		System.out.println("**********************************");
		
		Boss boss2 = new Boss("Adriano" , "Girasole", LocalDate.of(1996, 9, 30), 15000, 15000);
		System.out.println(boss2);
		
		
		// controlliamo la persona con guadagno annuale massimo
		
		//creiamo l'array di persone dentro l'azienda
		Person[] peopleCompany = {emp1, emp2, emp3, boss1, boss2};
		
		// variabili di controllo
		int totalSalaries = 0;
		int averageSalaries = 0;
		
		// valori massimi ( l'oggeto che verra instaziato dopo lo iniziamo a null )
		int maxYearIncome = Integer.MIN_VALUE;
		Person maxYearIncomePerson = null;
		
		//valori minimi ( l'oggeto che verra instaziato dopo lo iniziamo a null )
		int minYearIncome = Integer.MAX_VALUE;
		Person minYearIncomePerson = null;
		
		//BONUS
		//Boss con incasso annuale maggiore 
		int maxBossYearIncome = Integer.MIN_VALUE;
		Person maxYearIncomeBossPerson = null;
		
		//Employee con incasso annuale minore
		int minEmpYearIncome = Integer.MAX_VALUE;
		Person minYearIncomeEmpPerson = null;
		
		
		// faccio un ciclo for per iterare su ogni elemento
		for(int i = 0; i < peopleCompany.length; i++) {
			//salvo la persona ed il suo incasso annuale
			Person p = peopleCompany[i];
			int yearIncome =  p.getYearIncome();
			
			totalSalaries += yearIncome;
			averageSalaries = totalSalaries / peopleCompany.length;
			
			//BONUS
			//condizione per vedere di che tipo di classe fa parte
			if(p.getClass().getSimpleName().equals("Employee")) {
				
				//condizione di minoranza
				if(minEmpYearIncome > yearIncome) {
					// associo il valore ottenuto e salvo la persona con quel valore
					minEmpYearIncome =  yearIncome;
					minYearIncomeEmpPerson = p;
				}
		
			}else{
				//condizione di maggioranza Boss
				if(maxBossYearIncome < yearIncome) {
					// associo il valore ottenuto e salvo la persona con quel valore
					maxBossYearIncome =  yearIncome;
					maxYearIncomeBossPerson = p;
				}
			}
			
			//condizione di maggioranza
			if(maxYearIncome < yearIncome) {
				// associo il valore ottenuto e salvo la persona con quel valore
				maxYearIncome =  yearIncome;
				maxYearIncomePerson = p;
			}
			//condizione di minoranza
			if(minYearIncome > yearIncome) {
				// associo il valore ottenuto e salvo la persona con quel valore
				minYearIncome =  yearIncome;
				minYearIncomePerson = p;
			}
		}
		
		//stampiamo la persona con incasso annuale maggiore e minore
		System.out.println("------------------------------------");
		System.out.println("Totale Stipendi : " + totalSalaries);
		System.out.println("Stipendio medio : " + averageSalaries);
		System.out.println("\n");
		System.out.println("Persona che guadagni di più : " + maxYearIncomePerson);
		System.out.println("\n");
		System.out.println("Persona che guadagni di meno : " + minYearIncomePerson);
		System.out.println("\n");
		System.out.println("BOSS che guadagni di più : " + maxYearIncomeBossPerson);
		System.out.println("\n");
		System.out.println("Dipendente che guadagni di meno : " + minYearIncomeEmpPerson);
		
	//FINE METHOD MAIN
	}
	
}
