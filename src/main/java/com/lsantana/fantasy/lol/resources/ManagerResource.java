package com.lsantana.fantasy.lol.resources;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value="/managers")
public class ManagerResource {

   @RequestMapping(method=RequestMethod.GET)
   public List<Manager> getManagers(){
      return null;
   }
   
   @RequestMapping(method=RequestMethod.GET)
   public Manager getManager(){
      return null;
   }
   
   @RequestMapping(method=RequestMethod.POST)
   public void createManager(){
      
   }

}
