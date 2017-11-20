package com.enssistant.model;

import javax.persistence.*;

@Entity
@Table(name = "iListeningFirstTests")
public class IListeningFirstTest {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String question;
    private String answer;

    @ManyToOne
    IListeningQestion iListeningQestion;

    public IListeningFirstTest() {
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

    public IListeningQestion getiListeningQestion() {
        return iListeningQestion;
    }

    public void setiListeningQestion(IListeningQestion iListeningQestion) {
        this.iListeningQestion = iListeningQestion;
    }

    @Override
    public String toString() {
        return "IListeningFirstTest{" +
                "id=" + id +
                ", question='" + question + '\'' +
                ", answer='" + answer + '\'' +
                ", iListeningQestion=" + iListeningQestion +
                '}';
    }
}
