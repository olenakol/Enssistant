package com.enssistant.model;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "iListeningQestions")
public class IListeningQestion {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String nameQuestion;
    private String explanation;

    @ManyToOne
    IeltsTest ieltsTest;

    @OneToMany(mappedBy = "iListeningQestion")
    List<IListeningFirstTest> iListeningFirstTests;

    @OneToMany (mappedBy = "iListeningQestion")
    List<IListeningSecondTest> iListeningSecondTests;

    public IListeningQestion() {
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

    public List<IListeningFirstTest> getiListeningFirstTests() {
        return iListeningFirstTests;
    }

    public void setiListeningFirstTests(List<IListeningFirstTest> iListeningFirstTests) {
        this.iListeningFirstTests = iListeningFirstTests;
    }

    public List<IListeningSecondTest> getiListeningSecondTests() {
        return iListeningSecondTests;
    }

    public void setiListeningSecondTests(List<IListeningSecondTest> iListeningSecondTests) {
        this.iListeningSecondTests = iListeningSecondTests;
    }

    @Override
    public String toString() {
        return "IListeningQestion{" +
                "id=" + id +
                ", nameQuestion='" + nameQuestion + '\'' +
                ", explanation='" + explanation + '\'' +
                ", ieltsTest=" + ieltsTest +
                ", iListeningFirstTests=" + iListeningFirstTests +
                ", iListeningSecondTests=" + iListeningSecondTests +
                '}';
    }
}
