package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;;

@Controller
public class HeloController {
	
	  @RequestMapping(value="/", method=RequestMethod.GET)
	  public ModelAndView index(ModelAndView mav) {
		   
		                      mav.setViewName("index");
		  	                  mav.addObject("msg","이름을 적어서 전송해주세요");
		                      return mav;
	  
	  }



	  
	  @RequestMapping(value="/", method=RequestMethod.POST)
	  public ModelAndView send(@RequestParam("text1")String str, ModelAndView mav) {
	                          mav.addObject("msg", "안녕하세요 !! "  + str + " 님");
		                      mav.addObject("value", str);
		                      mav.setViewName("index");
		                      return mav;
		  
	  }
	          


}	



/*
 * int res = 0; for(int i = 1;i <= num;i++) res += i;
 */


/*
 * @RestController public class HeloController {
 * 
 * String[] names = { "see", "tea", "lee", "mee", "raa" };
 * 
 * String[] mails = { "see@mail.com", "tea@mail.com", "lee@mail.com",
 * "mee@mail.com", "raa@mail.com" };
 * 
 * @RequestMapping("/{id}") public DataObject index(@PathVariable int id) {
 * 
 * return new DataObject(id, names[id], mails[id]); } }
 * 
 * 
 * class DataObject { private int id; private String name; private String value;
 * 
 * 
 * public DataObject (int id, String name, String value) { super(); this.id =
 * id; this.name = name; this.value = value; }
 * 
 * public int getId() { return id; } public void setId(int Id) { this.id = id;}
 * 
 * 
 * public String getName() { return name; } public void setName(String name) {
 * this.name =name; }
 * 
 * public String getValue() { return value; }
 * 
 * public void setValue(String value) { this.value = value; }
 * 
 * 
 * }
 * 
 * 
 */
