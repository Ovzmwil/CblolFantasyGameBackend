package com.lsantana.fantasy.lol.domain;

import java.io.Serializable;
import java.util.List;

public class Player implements Serializable {
	private static final long serialVersionUID = 1L;
	
	private Integer id;
	private String name;
	private Role role;
	private Team team;
	private List<FantasyTeam> fantasyTeams;

	public Player() {
	}
	
	public Player(Integer id, String name, Role role, Team team, List<FantasyTeam> fantasyTeams) {
		super();
		this.id = id;
		this.name = name;
		this.role = role;
		this.team = team;
		this.fantasyTeams = fantasyTeams;
	}

	public Team getTeam() {
		return team;
	}

	public void setTeam(Team team) {
		this.team = team;
	}

	public List<FantasyTeam> getFantasyTeams() {
		return fantasyTeams;
	}

	public void setFantasyTeams(List<FantasyTeam> fantasyTeams) {
		this.fantasyTeams = fantasyTeams;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Role getRole() {
		return role;
	}

	public void setRole(Role role) {
		this.role = role;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Player other = (Player) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}

}
