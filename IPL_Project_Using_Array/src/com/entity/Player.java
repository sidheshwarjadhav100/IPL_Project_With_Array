package com.entity;

//POJO CLASS
public class Player {
	private String name;
	private int jrcyNo;
	private String teamName;
	private int runs;
	private int wickets;
	private int matches;

	// Zero param const
	public Player() {
		super();

	}

//parameterized const
	public Player(String name, int jrcyNo, String teamName, int runs, int wickets, int matches) {

		this.name = name;
		this.jrcyNo = jrcyNo;
		this.teamName = teamName;
		this.runs = runs;
		this.wickets = wickets;
		this.matches = matches;

	}

	// getter setters
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getJrcyNo() {
		return jrcyNo;
	}

	public void setJrcyNo(int jrcyNo) {
		this.jrcyNo = jrcyNo;
	}

	public String getTeamName() {
		return teamName;
	}

	public void setTeamName(String teamName) {
		this.teamName = teamName;
	}

	public int getRuns() {
		return runs;
	}

	public void setRuns(int runs) {
		this.runs = runs;
	}

	public int getWickets() {
		return wickets;
	}

	public void setWickets(int wickets) {
		this.wickets = wickets;
	}

	public int getMatches() {
		return matches;
	}

	public void setMatches(int matches) {
		this.matches = matches;
	}

	// toString()
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Player [Name=");
		builder.append(name);
		builder.append(", jrcyNo=");
		builder.append(jrcyNo);
		builder.append(", Team Name=");
		builder.append(teamName);
		builder.append(", Runs=");
		builder.append(runs);
		builder.append(", Wickets=");
		builder.append(wickets);
		builder.append(", Matches=");
		builder.append(matches);
		builder.append("]");
		return builder.toString();
	}

}
