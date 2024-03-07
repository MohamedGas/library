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
public class CheckIn {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public long checkInID;
    public int bookCopyID;
    public int memberID;
    public Date checkInDate;
}
