package com.oil.OilFinding.model.entity;


import com.oil.OilFinding.model.BaseTimeEntity;
import lombok.*;

import javax.persistence.*;
import java.time.LocalDateTime;


@Getter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class User extends BaseTimeEntity{
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long userCode;
    private String email;
    private String password;
    private String phoneNumber;
}
