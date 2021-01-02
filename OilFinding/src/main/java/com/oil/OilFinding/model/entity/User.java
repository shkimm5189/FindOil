package com.oil.OilFinding.model.entity;


import com.oil.OilFinding.model.BaseTimeEntity;
import lombok.*;

import javax.persistence.*;


@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class User  {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long userCode;
    private String email;
    private String password;
    private String phoneNumber;
}
