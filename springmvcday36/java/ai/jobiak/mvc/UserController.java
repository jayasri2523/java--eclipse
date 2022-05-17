package ai.jobiak.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
 public class UserController {
  
 @RequestMapping(value="display",method=RequestMethod.GET)

 public String message(ModelMap map) {
  map.put("username", "admin");
  map.put("password", "root");
  map.put("otp", "12345");
  return "view";
 }

}












