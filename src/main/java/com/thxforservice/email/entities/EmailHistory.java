package com.thxforservice.email.entities;

import jakarta.persistence.*;
import lombok.*;
import org.springframework.data.annotation.CreatedBy;
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

    private String subject;

    @Lob
    private String message;

    @CreatedDate
    @Column(updatable = false)
    private LocalDateTime createdAt;
}
