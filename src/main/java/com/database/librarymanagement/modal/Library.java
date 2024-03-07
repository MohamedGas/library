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
public class Library {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public long libraryID;
    public String city;
    public String contactInfo;
    public String name;
    public int libraryCityID;
}
