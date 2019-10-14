package com.lsantana.fantasy.lol.resources;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value="/teams")
public class TeamResource {

   @RequestMapping(method=RequestMethod.GET)
   public List<Team> getTeams(){
      return null;
   }
   
   @RequestMapping(method=RequestMethod.GET)
   public Team getTeam(){
      return null;
   }
   
   @RequestMapping(method=RequestMethod.POST)
   public void createTeam(){
      
   }
   
   @RequestMapping(method=RequestMethod.UPDATE)
   public void updateTeam(){
      
   }
   

}
