package com.st.demo.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import com.st.demo.model.Library;

@Service
public class LibrarySerrvice {
	
	List<Library> lib=new ArrayList<Library>(Arrays.asList(
			new Library(1,"chanakyaNiti","chanakya"),
			new Library(2,"Ramayana","Valmiki"),
			new Library(3,"java","mcGrewHill"),
			new Library(4,"c","Denis Ritche")
			));

	public List<Library> getDetails() {
		
		return lib;
	}

	public Library getbook(int lid)
	{
		return lib.stream().filter(t-> t.getLid()==(lid)).findFirst().get();
	}

	public void saveData(@RequestBody Library library) 
	{
		lib.add(library);
	}

	public void updateDate(String bookName, Library library) 
	{
		for (int i = 0; i <=lib.size(); i++)
		{
			Library l=lib.get(i);
			if(l.getBookName().equalsIgnoreCase(bookName))
			{
				lib.set(i,library);
			}
		}
	}

	public void deleteBook(int lid) {
		
		lib.removeIf(t->t.getLid()==lid);
	}
	

}
