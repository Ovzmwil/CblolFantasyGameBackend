package com.lsantana.fantasy.lol.resources;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.lsantana.fantasy.lol.domain.League;

@RestController
@RequestMapping(value="/leagues")
public class LeagueResource {

	@RequestMapping(method=RequestMethod.GET)
	public List<League> getLeagues() {
		League l1 = new League(1, "CBLOL");
		League l2 = new League(2, "LCK");
		List<League> list = new ArrayList<>();
		list.add(l1);
		list.add(l2);
		
		return list;
	}
   
   @RequestMapping(method=RequestMethod.GET)
   public League getLeaget(){
      return null;
   }
}
