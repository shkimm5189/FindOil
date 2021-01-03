package com.oil.OilFinding.model.entity;


import com.oil.OilFinding.model.BaseTimeEntity;
import com.sun.istack.Nullable;
import lombok.*;

import javax.persistence.*;
import java.time.LocalDateTime;


@Getter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "user")
@Entity
public class User extends BaseTimeEntity{
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(updatable = false,nullable = false,columnDefinition = "BIGINT")
    private Long userCode;
    @Column(nullable = false)
    private String email;
    @Column(nullable = false)
    private String password;
    @Column(nullable = false)
    private String phoneNumber;
}
