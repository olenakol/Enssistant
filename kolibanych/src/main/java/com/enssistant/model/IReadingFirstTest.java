package com.enssistant.model;

import javax.persistence.*;

@Entity
@Table(name = "iReadingFirstTests")
public class IReadingFirstTest {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String question;
    private String answer;

    @ManyToOne
    IReadingQuestion iReadingQuestion;

    public IReadingFirstTest() {
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

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }

    public IReadingQuestion getiReadingQuestion() {
        return iReadingQuestion;
    }

    public void setiReadingQuestion(IReadingQuestion iReadingQuestion) {
        this.iReadingQuestion = iReadingQuestion;
    }

    @Override
    public String toString() {
        return "IReadingFirstTest{" +
                "id=" + id +
                ", question='" + question + '\'' +
                ", answer='" + answer + '\'' +
                ", iReadingQuestion=" + iReadingQuestion +
                '}';
    }
}
