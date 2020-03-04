package dev.com.springboot.bootdemo.entity;

import java.time.LocalDate;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Data;

public class ReviewEntity {
    @Data
    @Entity
    public class Review {
        @Id
        private Long id;
        private String userId;
        private String productId;
        private String profileName;
        private Integer helpfulnessNumerator;
        private Integer helpfulnessDenominator;
        private Integer score;
        private LocalDate time;
        private String summary;
        @Column(columnDefinition = "TEXT")
        private String text;
    }
}
