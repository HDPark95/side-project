package com.study.side.entity;

import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@NoArgsConstructor
public class Lotto {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long lottoId;

    /*TODO 6개의 번호는 엔티티를 분리할지 string으로 ,연결해서 사용할지, 컬럼을 분리할지 */
    private long lottoNumber;
}
