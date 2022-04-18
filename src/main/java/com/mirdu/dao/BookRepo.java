package com.mirdu.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mirdu.entiry.Book;

public interface BookRepo extends JpaRepository<Book,Integer>{

}
