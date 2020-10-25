package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.EmployeeList;

public class ProgramEmployeeList {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		List<EmployeeList> list = new ArrayList<>();
		int x = 0;

		System.out.print("How many employees will be registered? ");
		x = sc.nextInt();

		for (int i = 0; i < x; i++) {

			System.out.println();
			System.out.println("Employee #" + (i + 1) + ":");
			System.out.print("Id: ");
			Integer id = sc.nextInt();
			while(posicao(list, id) != null){
				System.out.print("Id already taken! Try again: ");
				id = sc.nextInt();
			}

			System.out.print("Name: ");
			sc.nextLine();
			String name = sc.nextLine();

			System.out.print("Salary: ");
			Double salary = sc.nextDouble();

			EmployeeList emp = new EmployeeList(id, name, salary);
			list.add(emp);
		}

		System.out.println();
		System.out.print("Enter the employee Id that will have salary increase : ");
		int id = sc.nextInt();
		Integer posicao = posicao(list, id);

		if (posicao == null) {
			System.out.print("This Id does not exist!");
		} else {
			System.out.print("Enter the percentage: ");
			double percentage = sc.nextDouble();
			list.get(posicao).increaseSalary(percentage);
		}

		System.out.println();
		System.out.println("List of employees:");
		for (EmployeeList emp : list) {
			System.out.println(emp);
		}
		sc.close();
	}

	public static Integer posicao(List<EmployeeList> list, int idPosicao) {
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i).getId() == idPosicao) {
				return i;
			}
		}
		return null;
	}
}
