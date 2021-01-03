package com.oil.OilFinding.model;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.CreatedDate;

import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.Column;
import javax.persistence.EntityListeners;
import javax.persistence.MappedSuperclass;
import java.time.LocalDateTime;

@Getter
@MappedSuperclass
@EntityListeners(AuditingEntityListener.class)
/*
* 처음 만들어진 시간 저장 , 업데이트 되었을 때 시간 저장 하는 Entity
* */
public abstract class BaseTimeEntity {
    //최초 생성일은 초기에 지정시에 수정 될일이 없다.
    @CreatedDate
    @Column(updatable = false,nullable = false)
    private LocalDateTime registerDate;
    @LastModifiedDate
    @Column(updatable = true,nullable = true)
    private LocalDateTime updateDate;
}
