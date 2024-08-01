package com.ust.Question_Service.Model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Table(name = "question_info")
public class Question {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int qId;
    private String domain;
    private String qdetails;
    private String answers;
    private String uname;
    private String created_at;
    private String modified_at;
}
