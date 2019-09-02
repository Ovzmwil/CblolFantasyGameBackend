package com.lsantana.fantasy.lol.domain;

public class FantasyTeam extends Team {
	private static final long serialVersionUID = 1L;
	
	private Manager manager;

	public FantasyTeam(Manager manager) {
		super();
		this.manager = manager;
	}

	public Manager getManager() {
		return manager;
	}

	public void setManager(Manager manager) {
		this.manager = manager;
	}
	
}
