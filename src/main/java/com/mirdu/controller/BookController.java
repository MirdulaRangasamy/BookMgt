package com.mirdu.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.mirdu.dao.BookRepo;
import com.mirdu.entiry.Book;

@Controller
public class BookController {
	@Autowired
	BookRepo br;
	
	@RequestMapping("home")
	public String home()
	{
		return "home.jsp";
	}
	
	@RequestMapping("addbook")
	@ResponseBody
	public String addBook(Book b)
	{
		br.save(b);
		return "book added";
	}
}
