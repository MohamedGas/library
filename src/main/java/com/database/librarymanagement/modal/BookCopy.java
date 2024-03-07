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
public class BookCopy {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public long copyID;
    public long isbn;
    public int shelfID;
    public Date acquisitionDate;
    public String condition;
    public String status;
}
