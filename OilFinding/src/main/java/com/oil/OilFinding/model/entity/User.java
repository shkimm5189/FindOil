package com.oil.OilFinding.model.entity;


import com.oil.OilFinding.model.BaseTimeEntity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class User extends BaseTimeEntity {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long userCode;
    private String email;
    private String password;
    private String phoneNumber;
    private LocalDateTime registerDate;
    private LocalDateTime updateDate;

}
