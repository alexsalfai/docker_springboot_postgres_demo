package com.alex.dockerspostgresdemo.service;

import com.alex.dockerspostgresdemo.domain.Book;
import com.alex.dockerspostgresdemo.persistence.BookRepository;
import org.springframework.stereotype.Service;

@Service
public class BookService {

    private final BookRepository repository;

    public BookService(BookRepository repository) {
        this.repository = repository;
    }

    public Iterable<Book> findAll() {
        return repository.findAll();
    }

    public Book save(Book book) {
        return repository.save(book);
    }
}
