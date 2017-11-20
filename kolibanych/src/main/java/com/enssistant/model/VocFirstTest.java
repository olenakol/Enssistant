package com.enssistant.model;

import javax.persistence.*;

@Entity
@Table(name ="socFirstTests" )
public class VocFirstTest {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String question;
    private String answer1;
    private String answer2;
    private String correctAnswer;

    @ManyToOne
    Vocabulary vocabulary;


    public VocFirstTest() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public String getAnswer1() {
        return answer1;
    }

    public void setAnswer1(String answer1) {
        this.answer1 = answer1;
    }

    public String getAnswer2() {
        return answer2;
    }

    public void setAnswer2(String answer2) {
        this.answer2 = answer2;
    }

    public String getCorrectAnswer() {
        return correctAnswer;
    }

    public void setCorrectAnswer(String correctAnswer) {
        this.correctAnswer = correctAnswer;
    }

    public Vocabulary getVocabulary() {
        return vocabulary;
    }

    public void setVocabulary(Vocabulary vocabulary) {
        this.vocabulary = vocabulary;
    }

    @Override
    public String toString() {
        return "VocFirstTest{" +
                "id=" + id +
                ", question='" + question + '\'' +
                ", answer1='" + answer1 + '\'' +
                ", answer2='" + answer2 + '\'' +
                ", correctAnswer='" + correctAnswer + '\'' +
                ", vocabulary=" + vocabulary +
                '}';
    }
}

