package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Employee;
import entities.OutsourcedEmployee;

public class Programa {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		
		List <Employee> list = new ArrayList<>();
		
		System.out.print("ENTER THE NUMBER OF EMPLOYEES:  ");
		int n = sc.nextInt();
		
		for(int a = 1; a <= n; a++) {
			
			System.out.println("Employee #" + a + " data:");
			System.out.print("Outsourced (y/n) ?  ");
			char b = sc.next().charAt(0);
			sc.nextLine(); //consumindo a quebra de linha do next()
			
			//if (b == 'n') {
				
				
				System.out.print("NAME:  ");
				String name = sc.nextLine();
				System.out.print("HOURS:  ");
				int hours = sc.nextInt();
				System.out.print("VALUE PER HOUR:  ");
				double value = sc.nextDouble();
				
				if (b == 'n') {
				Employee emp = new Employee(name, hours, value);
				list.add(emp);
			}
			else {
			/*	
				System.out.print("NAME:  ");
				String name = sc.nextLine();
				System.out.print("HOURS:  ");
				int hours = sc.nextInt();
				System.out.print("VALUE PER HOUR:  ");
				double value = sc.nextDouble(); */
				
				System.out.print("ADDITIONAL CHARGE:  ");
				double add = sc.nextDouble();
				
				Employee emp = new OutsourcedEmployee(name, hours, value, add);
				list.add(emp);
				
			}
			
		}
		System.out.println();
		System.out.println("PAYMENTS:");
		for (Employee e : list) {     //para cada employee "e" na minha lista "list" faça:
			
			System.out.println(e.getName() + " -  $ " + String.format("%.2f", e.payment()));
			
		}
		
		sc.close();
	}

}
