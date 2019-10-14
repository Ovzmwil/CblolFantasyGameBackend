package com.lsantana.fantasy.lol.resources;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value="/roles")
public class RoleResource {

   @RequestMapping(method=RequestMethod.GET)
   public List<Roles> getRoles(){
      return null;
   }
   
   @RequestMapping(method=RequestMethod.GET)
   public Role getRole(){
      return null;
   }
}
