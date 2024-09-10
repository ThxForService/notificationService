package com.thxforservice.email.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import java.time.LocalDateTime;

@Data
@Entity
@Builder
@NoArgsConstructor
@AllArgsConstructor
@EntityListeners(AuditingEntityListener.class)
public class EmailHistory {

    @Id
    @GeneratedValue
    private Long seq;

    @Column(name = "_to", length = 100)
    private String to;

    @Column(name = "_from", length = 100)
    private  String _from;

    private String subject;

    @Lob
    private String message;


    @Column(name = "file_nm", length = 200)
    private String fileNm;  // 원본 파일 이름

    @Column(name = "saved_nm", length = 200)
    private String savedNm;  // 저장된 파일 이름

    @Column(name = "path_nm", length = 1000)
    private String pathNm;  // 파일 경로

    @Column(name = "filesize")
    private Long filesize;  // 파일 크기 (바이트)

    @CreatedDate
    @Column(name = "file_created_at", updatable = false)
    private LocalDateTime fileCreatedAt;  // 파일 생성일자


    @CreatedDate
    @Column(updatable = false)
    private LocalDateTime createdAt;


}
