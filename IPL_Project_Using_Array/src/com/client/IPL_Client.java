package com.client;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import com.service.Service;

public class IPL_Client {

	public static void main(String[] args) throws Exception {

		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

		int choice;

		do {
			System.out.println("All Teams Of IPL-2024");
			System.out.println("------------------------");
			Service.displayTeam();// display all teams of IPL-2024
			System.out.println();
			Service.getTeamName();
			System.out.println("----------------------");

			System.out.println("Enter Player name of above team that you want to see all details");
			String pname = bf.readLine();

			Service.getPlayer(pname);
			System.out.println("________________________________________________");

			System.out.println();
			System.out.println("Enter choice");
			System.out.println("1.see all teams again");
			System.out.println("2.exit");
			do {
				choice = Integer.parseInt(bf.readLine());
				switch (choice) {
				case 1: {

					break;
				}
				case 2: {

					break;

				}
				default:
					System.out.println("Please Enter Valid Choice");

				}
			} while (choice <= 0 || choice > 2);

		} while (choice == 1);

	}

}
