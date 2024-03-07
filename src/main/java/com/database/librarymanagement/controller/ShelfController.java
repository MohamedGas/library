package com.database.librarymanagement.controller;

import com.database.librarymanagement.modal.Shelf;
import com.database.librarymanagement.service.ShelfService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/shelves")
public class ShelfController {
    private final ShelfService shelfService;

    @Autowired
    public ShelfController(ShelfService shelfService) {
        this.shelfService = shelfService;
    }

    @GetMapping
    public List<Shelf> getAllShelves() {
        return shelfService.getAllShelves();
    }

    @GetMapping("/{shelfId}")
    public ResponseEntity<Shelf> getShelfById(@PathVariable Integer shelfId) {
        Optional<Shelf> shelf = shelfService.getShelfById(shelfId);
        return shelf.map(value -> new ResponseEntity<>(value, HttpStatus.OK))
                .orElseGet(() -> new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }

    @PostMapping
    public ResponseEntity<Shelf> createShelf(@RequestBody Shelf shelf) {
        Shelf savedShelf = shelfService.saveShelf(shelf);
        return new ResponseEntity<>(savedShelf, HttpStatus.CREATED);
    }

    @DeleteMapping("/{shelfId}")
    public ResponseEntity<Void> deleteShelf(@PathVariable Integer shelfId) {
        shelfService.deleteShelf(shelfId);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}
