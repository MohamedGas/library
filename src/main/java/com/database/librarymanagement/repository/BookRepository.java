package com.database.librarymanagement.repository;

import com.database.librarymanagement.modal.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BookRepository extends JpaRepository<Book, Long> {
    // You can add custom queries here if needed
}

