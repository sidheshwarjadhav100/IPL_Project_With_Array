package com.service;

import java.util.Scanner;

import com.dao.*;
import com.entity.Player;

//All opertaions perform from here
public class Service {
	static Scanner sc = new Scanner(System.in);
	static char c;
	static int choice;

//displayTeam display all teams.
	public static void displayTeam() {
		int a = 1;
		String tm[] = TeamData.getTeams();
		for (String iterable_element : tm) {

			String teamname = iterable_element;
			System.out.printf(" %d  %s    \n", a, teamname);
			a++;
			System.out.println("------------");

		}

	}

	public static void getTeamName() {

		System.out.println("Enter Choice");

		do {

			choice = sc.nextInt();
			switch (choice) {
			case 1: {

				Service.csk();
				break;

			}
			case 2: {

				Service.dc();
				break;
			}
			case 3: {

				Service.gt();
				break;
			}
			case 4: {

				Service.kkr();
				break;
			}
			case 5: {

				Service.lsg();
				break;
			}
			case 6: {

				Service.mi();
				break;
			}
			case 7: {

				Service.pk();
				break;
			}
			case 8: {

				Service.rr();
				break;
			}
			case 9: {

				Service.rcb();
				break;
			}
			case 10: {

				Service.srh();
				break;
			}
			default:
				System.out.println("Please Enter Valid choice");
			}
		} while (choice > 10);

	}

	public static void getPlayer(String playername) {

		Player[] pldata = TeamData.playersData();
		// System.out.println(pldata);

		for (Player player : pldata) {

			if (player.getName().equalsIgnoreCase(playername)) {

				System.out.println(player);
			}

		}

	}

	public static Player[] csk() {
		System.out.println("CSK SQUAD");
		System.out.println("-------------------------------------------------------");

		Player[] pldata = TeamData.playersData();

		for (Player player : pldata) {

			if (player.getTeamName().equalsIgnoreCase("csk")) {

				System.out.println(player.getName());// print squad of CSK Team

			}

		}
		System.out.println("-------------------------------------------------------");

		return pldata;

	}

	public static void dc() {
		System.out.println("DC Squad");
		// String teamName =

		Player[] dc = TeamData.playersData();
		for (Player player : dc) {

			if (player.getTeamName().equalsIgnoreCase("dc")) {

				System.out.println(player.getName());
			}

		}

	}

	public static void gt() {
		System.out.println();
		System.out.println("GT Squad");
		System.out.println("-------------------");

		Player[] gt = TeamData.playersData();
		for (Player player : gt) {

			if (player.getTeamName().equalsIgnoreCase("gt")) {

				System.out.println(player.getName());
			}

		}
	}

	public static void kkr() {
		System.out.println("KKR team");

		Player[] kkr = TeamData.playersData();
		for (Player player : kkr) {

			if (player.getTeamName().equalsIgnoreCase("kkr")) {

				System.out.println(player.getName());
			}

		}
	}

	public static void lsg() {
		System.out.println("LSG team");

		Player[] kkr = TeamData.playersData();
		for (Player player : kkr) {

			if (player.getTeamName().equalsIgnoreCase("kkr")) {

				System.out.println(player.getName());
			}

		}
	}

	public static void mi() {
		System.out.println("MI team");

		Player[] mi = TeamData.playersData();
		for (Player player : mi) {

			if (player.getTeamName().equalsIgnoreCase("mi")) {

				System.out.println(player.getName());
			}

		}
	}

	public static void pk() {
		System.out.println("PK team");

		Player[] pk = TeamData.playersData();
		for (Player player : pk) {

			if (player.getTeamName().equalsIgnoreCase("pk")) {

				System.out.println(player.getName());
			}

		}
	}

	public static void rr() {
		System.out.println("RR team");
		Player[] rr = TeamData.playersData();
		for (Player player : rr) {

			if (player.getTeamName().equalsIgnoreCase("rr")) {

				System.out.println(player.getName());
			}

		}
	}

	public static void rcb() {
		System.out.println("RCB team");

		Player[] rcb = TeamData.playersData();
		for (Player player : rcb) {

			if (player.getTeamName().equalsIgnoreCase("rcb")) {

				System.out.println(player.getName());
			}

		}
	}

	public static void srh() {
		System.out.println("SHR team");

		Player[] shr = TeamData.playersData();
		for (Player player : shr) {

			if (player.getTeamName().equalsIgnoreCase("srh")) {

				System.out.println(player.getName());
			}

		}
	}

}
