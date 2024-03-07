package com.database.librarymanagement.modal;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table
public class Shelf {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public long shelfID;
    public int sectionID;
    public String locationDescription;
    public int capacity;
    public int currentOccupancy;
}

