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
public class Borrow {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public long borrowID;
    public int memberID;
    public long isbn;
    public Date borrowDate;
    public Date dueDate;
}
