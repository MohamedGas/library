package com.database.librarymanagement.repository;

import com.database.librarymanagement.modal.Shelf;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ShelfRepository extends JpaRepository<Shelf, Integer> {
    // Add custom queries if needed
}
