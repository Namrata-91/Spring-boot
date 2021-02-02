package com.security.controller;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;
import com.security.model.Bank;
import com.security.repository.BankRepository;


@Controller
public class DashboardController {

	@Autowired
	private BankRepository bankRepository;
	//save customer data
	  @PostMapping("/bankpage") 
	  public String addCustomer(@ModelAttribute("bank") Bank bank) {
	  bankRepository.save(bank);
	  return ("redirect:/welcome"); }
	 
	//view bank form data
		@GetMapping("/bankpage")
		public ModelAndView viewForm() {
			Bank Obj = new Bank();
			return new ModelAndView("bankform","bank",Obj);
		}
		
		@GetMapping("/welcome")
		public ModelAndView firstPage() {
			return new ModelAndView("welcome");
		}
		//view customer data
		@GetMapping("/viewdetails") 
		  public ModelAndView listOfPatients() {
		  List<Bank> custlist = bankRepository.findAll();
		  return new ModelAndView("viewdetails","customerData",custlist); 
		  }
		
		@GetMapping("/login")
	    public String login(Model model, String error, String logout) {
	        if (error != null)
	            model.addAttribute("errorMsg", "Your username and password are invalid.");

	        if (logout != null)
	            model.addAttribute("msg", "You have been logged out successfully.");

	        return "login";
	    }
}
