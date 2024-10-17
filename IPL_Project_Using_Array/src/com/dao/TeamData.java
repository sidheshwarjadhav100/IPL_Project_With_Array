package com.dao;

import com.entity.Player;

public class TeamData {

	public static String[] getTeams() {
		String db[] = { "CSK", "DC", "GT", "KKR", "LSG", "MI", "PK", "RR", "RCB", "SRH" };

		return db;

	}

	public static Player[] playersData() {
//		String name; int jrcyNo; String teamName; int runs; int wickets; int matches;

		Player p1 = new Player("MS Dhoni", 7, "CSK", 5045, 0, 234);
		Player p2 = new Player("Ruturaj Gaikwad", 3, "CSK", 2883, 3, 102);
		Player p3 = new Player("Deepak Chahar", 9, "CSK", 914, 109, 90);
		Player p4 = new Player("Mukesh Choudhari", 63, "CSK", 190, 25, 18);
		Player p5 = new Player("Ravindra Jadeja", 8, "CSK", 2827, 165, 192);
		Player p6 = new Player("Shivam Dube", 4, "CSK", 1034, 30, 58);

		Player p7 = new Player("Rishabh Pant", 65, "DC", 4534, 2, 127);
		Player p8 = new Player("Davi Warner", 6, "DC", 5434, 12, 127);
		Player p9 = new Player("Axar Patel", 2, "DC", 3456, 65, 234);
		Player p10 = new Player("Lalit Yadav", 13, "DC", 6434, 3, 487);
		Player p11 = new Player("Pravin Dubey", 20, "DC", 6434, 3, 487);
		Player p12 = new Player("Kuldeep Yadav", 21, "DC", 6434, 3, 487);

		Player p13 = new Player("Shubham Gill", 7, "GT", 3216, 0, 103);
		Player p14 = new Player("David Miller", 7, "GT", 2924, 0, 130);
		Player p15 = new Player("Abhinav Manohar", 7, "GT", 520, 11, 21);
		Player p16 = new Player("B.Sai Sudharsan", 7, "GT", 1034, 13, 25);
		Player p17 = new Player("Mohammad Shami", 7, "GT", 69, 79, 110);
		Player p18 = new Player("Umesh Yadav", 7, "GT", 208, 144, 148);

		// runs>1000--matter | wicket>50--Boller | runs>1000&& wicket>20
		Player p19 = new Player("Shreyas Iyer (C)", 41, "KKR", 2989, 0, 101);// bat
		Player p21 = new Player("Nitish Rana", 27, "KKR", 2181, 7, 98);// bat
		Player p22 = new Player("Sunil Narine", 74, "KKR", 1025, 153, 148);// bal;
		Player p23 = new Player("Varun Chakravarthy", 29, "KKR", 23, 67, 53);// bal
		Player p24 = new Player("Venkatesh Iyer", 25, "KKR", 823, 3, 35);// all
		Player p25 = new Player("Andre Russell	", 12, "KKR", 2200, 96, 112);// all

		Player p26 = new Player("KL Rahul (C & WK)", 1, "LSG", 4000, 0, 117);// bat
		Player p27 = new Player("Nicholas Pooran", 29, "LSG", 1500, 0, 47);// bat
		Player p28 = new Player("Ravi Bishnoi", 56, "LSG", 50, 51, 15);// ball
		Player p29 = new Player("Mohsin Khan", 13, "LSG", 14, 59, 30);// ball
		Player p30 = new Player("Krunal Pandya", 24, "LSG", 1326, 61, 109);// all
		Player p31 = new Player("Deepak Hooda", 5, "LSG", 1236, 17, 95);// all

		Player p32 = new Player("Rohit Sharma ", 45, "MI", 4982, 0, 187);// bat
		Player p33 = new Player("Suryakumar Yadav", 63, "MI", 2700, 0, 120);// bat
		Player p34 = new Player("Piyush Chawla", 11, "MI", 550, 157, 170);// ball
		Player p35 = new Player("Jason Behrendorff", 67, "MI", 00, 60, 40);// ball
		Player p36 = new Player("Cameron Green", 42, "MI", 2600, 40, 50);// all
		Player p37 = new Player("Tim David", 20, "MI", 1500, 12, 70);// all

		Player p38 = new Player("Shikhar Dhawan", 25, "PK", 6536, 0, 210);// bat
		Player p39 = new Player("Rilee Rossouw", 17, "PK", 678, 0, 21);// bat
		Player p40 = new Player("Kagiso Rabada", 25, "PK", 73, 106, 71);// ball
		Player p41 = new Player("Arshdeep Singh", 2, "PK", 23, 56, 44);// ball
		Player p42 = new Player("Sam Curran", 58, "PK", 695, 47, 42);// all
		Player p43 = new Player(" Liam Livingstone", 23, "PK", 618, 117, 28);// all

		Player p44 = new Player("Yashasvi Jaiswal", 23, "RR", 1511, 0, 39);// bat
		Player p45 = new Player("Shimron Hetmyer", 15, "RR", 1385, 0, 61);// bat
		Player p46 = new Player("Trent Boult", 18, "RR", 44, 102, 85);// ball
		Player p47 = new Player("Yuzvendra Chahal", 3, "RR", 26, 187, 145);// ball
		Player p48 = new Player("Riyan Parag", 12, "RR", 600, 12, 54);// all
		Player p49 = new Player(" Ravichandran Ashwin", 99, "RR", 647, 171, 197);// all

		Player p50 = new Player("Virat Kohli", 18, "RCB", 7263, 4, 237);// bat
		Player p51 = new Player("Faf du Plessis", 18, "RCB", 4048, 0, 137);// bat
		Player p52 = new Player("Mohammed Siraj", 13, "RCB", 85, 99, 79);// ball
		Player p53 = new Player("Karn Sharma", 33, "RCB", 317, 59, 73);// ball
		Player p54 = new Player("Glenn Maxwell", 32, "RCB", 2711, 34, 120);// all
		Player p55 = new Player(" Cameron Green", 42, "RCB", 343, 15, 23);// all

		Player p56 = new Player("David Warner", 18, "SRH", 7263, 4, 85);// bat
		Player p57 = new Player("Kane Williamson", 18, "SRH", 4048, 0, 137);// bat
		Player p58 = new Player("Bhuvneshwar Kumar", 13, "SRH", 85, 99, 79);// ball
		Player p59 = new Player("Rashid Khan", 33, "SRH", 317, 59, 73);// ball
		Player p60 = new Player("Abdul Samad", 32, "SRH", 2711, 34, 120);// all
		Player p20 = new Player(" Umran Malik", 42, "SRH", 343, 15, 23);// all

		Player p[] = { p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13, p14, p16, p17, p18, p19, p20, p21, p22,
				p23, p24, p25, p26, p27, p28, p29, p30, p31, p32, p34, p35, p36, p37, p38, p39, p40, p41, p42, p43, p44,
				p45, p46, p47, p48, p49, p50, p51, p52, p53, p54, p55, p56, p57, p58, p59, p60 };

		return p;

	}

}