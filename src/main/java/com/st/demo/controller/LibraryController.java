package com.st.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.st.demo.model.Library;
import com.st.demo.service.LibrarySerrvice;

@RestController
public class LibraryController 
{
	@Autowired
	LibrarySerrvice librarySerrvice;
	
	//retrive all data
	@RequestMapping("/library")
	public List<Library> getAllDetails()
	{
		return librarySerrvice.getDetails();
	}
	
	//get perticular data access
	@RequestMapping("/library/{lid}")
	public Library getBook(@PathVariable int lid)
	{
		return librarySerrvice.getbook(lid);	
	}
	
	//save data
	@RequestMapping(method = RequestMethod.POST,value = "/library")
	public void saveBooks(@RequestBody Library library)
	{
		librarySerrvice.saveData(library);
	}
	@RequestMapping(method = RequestMethod.PUT,value = "/library/{bookName}")
	public void updateBooks(@RequestBody Library library,@PathVariable String bookName)
	{
		librarySerrvice.updateDate(bookName,library);
	}
	
	@RequestMapping(method = RequestMethod.DELETE,value = "/library/{lid}")
	public void deleteBooks(@PathVariable int lid)
	{
		librarySerrvice.deleteBook(lid);
	}
	

}
