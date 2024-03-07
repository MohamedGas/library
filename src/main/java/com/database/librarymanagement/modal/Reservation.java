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
public class Reservation {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public long reservationID;
    public int memberID;
    public long isbn;
    public String reservationType;
    public int roomID;
    public Date reservationDate;
    public Date startTime;
    public Date endTime;
}
