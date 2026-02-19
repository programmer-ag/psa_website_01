package com.psa.psa_website.entity;

import jakarta.persistence.*;
import lombok.Data;
import java.util.List;

import org.hibernate.annotations.JdbcTypeCode;
import org.hibernate.type.SqlTypes;

import com.fasterxml.jackson.annotation.JsonProperty;

@Entity
@Table(name = "course_list")
@Data // Generates getters, setters, toString, etc.
public class Course {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "name")
    @JsonProperty("courseName")
    private String courseName;

    @Column(name = "duration_hrs")
    @JsonProperty("duration")
    private int duration;

    // Mapping a PostgreSQL String Array to a Java List
    @JdbcTypeCode(SqlTypes.ARRAY)
    @Column(name = "content",columnDefinition = "text[]")
    @JsonProperty("contents")
    private List<String> contents;
}