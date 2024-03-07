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
public class Staff {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public long staffID;
    public int accessLevelID;
    public String name;
    public int roleID;
    public String contactInfo;
    public String address;
    public Date employmentStartDate;
    public String schedule;
}
