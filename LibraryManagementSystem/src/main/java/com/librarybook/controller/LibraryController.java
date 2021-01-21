package com.librarybook.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.librarybook.model.LibraryModel;
import com.librarybook.service.LibraryService;

@Controller
public class LibraryController {

	@Autowired
	private LibraryService service;

	@RequestMapping("/")
	public String viewHomePage(Model model) {
		List<LibraryModel> listobj = service.listAll();
		model.addAttribute("listBook", listobj);

		return "index";
	}

	@RequestMapping("/new")
	public String showNewBookPage(Model model) {
		LibraryModel obj = new LibraryModel();
		model.addAttribute("book", obj);

		return "new_book";
	}

	@RequestMapping(value = "/AddNewBook", method = RequestMethod.POST)
	public String saveBook(@ModelAttribute("book") LibraryModel libraryModel) {
		service.save(libraryModel);

		return "redirect:/";
	}

	@RequestMapping("/edit/{id}")
	public ModelAndView showEditBookPage(@PathVariable(name = "id") int id) {
		ModelAndView modelobj = new ModelAndView("edit_book");
		LibraryModel obj = service.get(id);
		modelobj.addObject("book", obj);

		return modelobj;
	}

	@RequestMapping("/delete/{id}")
	public String deleteBook(@PathVariable(name = "id") int id) {
		service.delete(id);
		return "redirect:/";
	}

}
