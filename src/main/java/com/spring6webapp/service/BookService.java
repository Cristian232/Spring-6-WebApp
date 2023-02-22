package com.spring6webapp.service;

import com.spring6webapp.domain.Book;

public interface BookService {

    Iterable<Book> findAll();

}
