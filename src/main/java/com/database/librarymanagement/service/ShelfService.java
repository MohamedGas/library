package com.database.librarymanagement.service;

import com.database.librarymanagement.modal.Shelf;
import com.database.librarymanagement.repository.ShelfRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ShelfService {
    private final ShelfRepository shelfRepository;

    @Autowired
    public ShelfService(ShelfRepository shelfRepository) {
        this.shelfRepository = shelfRepository;
    }

    public List<Shelf> getAllShelves() {
        return shelfRepository.findAll();
    }

    public Optional<Shelf> getShelfById(Integer shelfId) {
        return shelfRepository.findById(shelfId);
    }

    public Shelf saveShelf(Shelf shelf) {
        return shelfRepository.save(shelf);
    }

    public void deleteShelf(Integer shelfId) {
        shelfRepository.deleteById(shelfId);
    }
}

