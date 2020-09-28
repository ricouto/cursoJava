package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Account;

public class ProgramAccount {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Account account = new Account();
		int x = 0;
		String name = null;

		do {
			System.out.println("- - Caixa Eletrônico Banco XPTO - -");
			System.out.println("1. Cadastrar cliente");
			System.out.println("2. Realizar depósito");
			System.out.println("3. Realizar saque");
			System.out.println("4. Fim");
			System.out.print("Digite a opção : ");
			x = sc.nextInt();

			if (x == 1) {
				if (account.getNumber() == 0.0) {
					System.out.print("Enter account number: ");
					int number = sc.nextInt();

					System.out.print("Enter account holder: ");
					sc.nextLine();
					name = sc.nextLine();

					System.out.print("Enter inital deposit value (y/n)? ");
					String initialDeposit = sc.next();

					if (initialDeposit.equals("y")) {
						System.out.print("Enter initial deposit value: ");
						double value = sc.nextDouble();
						account = new Account(number, name, value);
					} else {
						account = new Account(number, name);
					}

					System.out.println();
					System.out.println("Account data:");
					System.out.println(account);
					System.out.println();

				} else {

					System.out.println();
					System.out.print("Change account holder: ");
					sc.nextLine();
					name = sc.nextLine();
					account.setName(name);

					System.out.println();
					System.out.println("Account data:");
					System.out.println(account);
					System.out.println();
				}
			} else if (x == 2) {
				System.out.println();
				System.out.print("Enter a deposit value: ");
				double value = sc.nextDouble();
				account.depositMoney(value);

				System.out.println();
				System.out.println("Updated account data:");
				System.out.println(account);
				System.out.println();
			} else if (x == 3) {
				System.out.println();
				System.out.print("Enter a withdraw value: ");
				double value = sc.nextDouble();
				account.withdrawMoney(value);

				System.out.println();
				System.out.println("Updated account data:");
				System.out.println(account);
				System.out.println();
			}

			if (x == 4) {
				System.out.println();
				System.out.println("Muito Obrigado!");
			}
		} while (x != 4);
		sc.close();
	}
}
