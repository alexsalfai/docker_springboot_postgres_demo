package com.alex.dockerspostgresdemo.persistence;

import com.alex.dockerspostgresdemo.domain.Book;
import org.springframework.data.repository.CrudRepository;

public interface BookRepository extends CrudRepository<Book, Integer> {
}

