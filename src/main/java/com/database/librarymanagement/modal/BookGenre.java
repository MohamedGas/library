package com.database.librarymanagement.modal;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table
public class BookGenre {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public long bookGenreID;
    public long isbn;
    public int genreID;
}
