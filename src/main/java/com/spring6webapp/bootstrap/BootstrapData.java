package com.spring6webapp.bootstrap;

import com.spring6webapp.domain.Author;
import com.spring6webapp.domain.Book;
import com.spring6webapp.repositories.AuthorRepository;
import com.spring6webapp.repositories.BookRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class BootstrapData implements CommandLineRunner {

    private final AuthorRepository authorRepository;
    private final BookRepository bookRepository;

    public BootstrapData(AuthorRepository authorRepository, BookRepository bookRepository) {
        this.authorRepository = authorRepository;
        this.bookRepository = bookRepository;
    }

    @Override
    public void run(String... args) throws Exception {

        Author eric = new Author();
        eric.setFirstName("Eric");
        eric.setLastName("Evans");

        Book ddd = new Book();
        ddd.setTitle("Domain Driven Design");
        ddd.setIsbn("123456");

        Author rod = new Author();
        rod.setFirstName("Rod");
        rod.setLastName("Johnson");

        Book noEJB = new Book();
        noEJB.setTitle("J2EE development without EJB");
        noEJB.setIsbn("345678");

        Author ericSaved = authorRepository.save(eric);
        Author rodSaved = authorRepository.save(rod);

        Book dddSaved = bookRepository.save(ddd);
        Book noEJBSaved = bookRepository.save(noEJB);

        ericSaved.getBooks().add(dddSaved);
        rodSaved.getBooks().add(noEJBSaved);

        System.out.println("In BootStrap:");
        System.out.println("Authors count: " + authorRepository.count());
        System.out.println("Books count: " + bookRepository.count());

    }
}















