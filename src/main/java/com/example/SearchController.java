package com.example;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.view.RedirectView;
@Controller
public class SearchController {
    @RequestMapping("/home")
	public String home(){
    	System.out.println("going to home view:");
	    return "home";
   }
    @RequestMapping("/search")
    public RedirectView search(@RequestParam("mysearch") String mysearch) {
    	String url="http://www.google.com/search?q="+mysearch;
    	RedirectView redirectview=new RedirectView();
    	redirectview.setUrl(url);
    	return redirectview;
    }
}
