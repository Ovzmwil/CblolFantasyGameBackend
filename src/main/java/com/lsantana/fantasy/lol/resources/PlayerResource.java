package com.lsantana.fantasy.lol.resources;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value="/players")
public class PlayerResource {

   @RequestMapping(method=RequestMethod.GET)
   public List<Player> getPlayers(){
      return null;
   }
   
   @RequestMapping(method=RequestMethod.GET)
   public Player getPlayer(){
      return null;
   }
}
