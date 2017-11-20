package com.enssistant.model;

import javax.persistence.*;

@Entity
@Table(name = "iListeningSecondTests")
public class IListeningSecondTest {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String question;
    private String answer1;
    private String answer2;
    private String answer3;
    private String correctAnswer;

    @ManyToOne
    IListeningQestion iListeningQestion;

    public IListeningSecondTest() {
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

    public String getAnswer3() {
        return answer3;
    }

    public void setAnswer3(String answer3) {
        this.answer3 = answer3;
    }

    public String getCorrectAnswer() {
        return correctAnswer;
    }

    public void setCorrectAnswer(String correctAnswer) {
        this.correctAnswer = correctAnswer;
    }

    public IListeningQestion getiListeningQestion() {
        return iListeningQestion;
    }

    public void setiListeningQestion(IListeningQestion iListeningQestion) {
        this.iListeningQestion = iListeningQestion;
    }

    @Override
    public String toString() {
        return "IListeningSecondTest{" +
                "id=" + id +
                ", question='" + question + '\'' +
                ", answer1='" + answer1 + '\'' +
                ", answer2='" + answer2 + '\'' +
                ", answer3='" + answer3 + '\'' +
                ", correctAnswer='" + correctAnswer + '\'' +
                ", iListeningQestion=" + iListeningQestion +
                '}';
    }
}
