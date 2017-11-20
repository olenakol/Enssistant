package com.enssistant.model;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "iReadingQuestions")
public class IReadingQuestion {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String nameQuestion;
    private String explanation;

    @ManyToOne
    IeltsTest ieltsTest;

    @OneToMany(mappedBy = "iReadingQestion")
    List<IReadingFirstTest> iReadingFirstTests;

    @OneToMany(mappedBy = "iReadingQestion")
    List<IReadingSecondTest> iReadingSecondTests;

    public IReadingQuestion() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNameQuestion() {
        return nameQuestion;
    }

    public void setNameQuestion(String nameQuestion) {
        this.nameQuestion = nameQuestion;
    }

    public String getExplanation() {
        return explanation;
    }

    public void setExplanation(String explanation) {
        this.explanation = explanation;
    }

    public IeltsTest getIeltsTest() {
        return ieltsTest;
    }

    public void setIeltsTest(IeltsTest ieltsTest) {
        this.ieltsTest = ieltsTest;
    }

    public List<IReadingFirstTest> getiReadingFirstTests() {
        return iReadingFirstTests;
    }

    public void setiReadingFirstTests(List<IReadingFirstTest> iReadingFirstTests) {
        this.iReadingFirstTests = iReadingFirstTests;
    }

    public List<IReadingSecondTest> getiReadingSecondTests() {
        return iReadingSecondTests;
    }

    public void setiReadingSecondTests(List<IReadingSecondTest> iReadingSecondTests) {
        this.iReadingSecondTests = iReadingSecondTests;
    }

    @Override
    public String toString() {
        return "IReadingQuestion{" +
                "id=" + id +
                ", nameQuestion='" + nameQuestion + '\'' +
                ", explanation='" + explanation + '\'' +
                ", ieltsTest=" + ieltsTest +
                ", iReadingFirstTests=" + iReadingFirstTests +
                ", iReadingSecondTests=" + iReadingSecondTests +
                '}';
    }
}
