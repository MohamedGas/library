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
public class LibraryCity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public long libraryCityID;
    public String state;
    public String address;
}
