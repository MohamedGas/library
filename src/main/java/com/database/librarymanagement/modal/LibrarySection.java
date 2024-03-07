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
public class LibrarySection {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public long sectionID;
    public String sectionName;
    public String locationDescription;
    public String targetAudience;
    public String availableServices;
    public int libraryID;
}
