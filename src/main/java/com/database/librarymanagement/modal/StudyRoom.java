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
public class StudyRoom {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public long roomID;
    public String locationDescription;
    public int capacity;
    public String availableEquipment;
}
