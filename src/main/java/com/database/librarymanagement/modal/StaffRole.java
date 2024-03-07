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
public class StaffRole {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public long roleID;
    public String roleName;
    public int accessLevel;
}
