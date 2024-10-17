package com.service;

import java.util.Scanner;

import com.dao.*;
import com.entity.Player;

//All opertaions perform from here
public class Ops {

	private static final String String = null;

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

				Ops.csk();
				break;

			}
			case 2: {

				Ops.dc();
				break;
			}
			case 3: {

				Ops.gt();
				break;
			}
			case 4: {

				Ops.kkr();
				break;
			}
			case 5: {

				Ops.lsg();
				break;
			}
			case 6: {

				Ops.mi();
				break;
			}
			case 7: {

				Ops.pk();
				break;
			}
			case 8: {

				Ops.rr();
				break;
			}
			case 9: {

				Ops.rcb();
				break;
			}
			case 10: {

				Ops.srh();
				break;
			}
			default:
				System.out.println("Please Enter Valid choice");
			}
		} while (choice > 10);

//		do {
//
//			System.out.println("Ente Team name ...");
//
//			String tName = sc.next();
//
//			if ("csk".equalsIgnoreCase(tName)) {
//
//				Ops.csk();
//
//			} else if ("dc".equalsIgnoreCase(tName)) {
//
//				Ops.dc();
//			}
//
//			else if ("gt".equalsIgnoreCase(tName)) {
//
//				//// method call
//				Ops.gt();
//			}
//
//			else if ("kkr".equalsIgnoreCase(tName)) {
//
//				//// method call
//				Ops.kkr();
//			}
//
//			else if ("lsg".equalsIgnoreCase(tName)) {
//
//				//// method call
//				Ops.lsg();
//			}
//
//			else if ("mi".equalsIgnoreCase(tName)) {
//				//// method call
//
//				Ops.mi();
//			}
//
//			else if ("pk".equalsIgnoreCase(tName)) {
//
//				//// method call
//				Ops.pk();
//			}
//
//			else if ("rr".equalsIgnoreCase(tName)) {
//
//				//// method call
//				Ops.rr();
//			}
//
//			else if ("rcb".equalsIgnoreCase(tName)) {
//
//				//// method call
//				Ops.rcb();
//			}
//
//			else if ("shr".equalsIgnoreCase(tName)) {
//
//				//// method call
//				Ops.srh();
//			} else {
//				System.out.println("Please Enter Valid Team Name");
//
//				System.out.println("------------------");
//
//			}
//
//			System.out.println("Do you Want to see players of another teams-> y/n");
//			c = sc.next().charAt(0);
//
//		} while (c == 'y');

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
