package com.enssistant.model;


import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "vocabulary")
public class Vocabulary {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String unit;

    @OneToMany(mappedBy = "unit")
    List<VocWord>vocWords;

    @OneToMany(mappedBy = "unit")
    List<VocFirstTest>vocFirstTests;

    @OneToMany(mappedBy = "unit")
    List<VocSecondTest>vocSecondTests;

    @OneToMany(mappedBy = "unit")
    List<VocTextTest>vocTextTests;

    @ManyToMany
    @JoinTable(name = "user_vocabulary", joinColumns =@JoinColumn(name = "vocabulary_id"),
            inverseJoinColumns =@JoinColumn(name = "user_id"))
    private List<User>users;

    public Vocabulary() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    public List<VocWord> getVocWords() {
        return vocWords;
    }

    public void setVocWords(List<VocWord> vocWords) {
        this.vocWords = vocWords;
    }

    public List<VocFirstTest> getVocFirstTests() {
        return vocFirstTests;
    }

    public void setVocFirstTests(List<VocFirstTest> vocFirstTests) {
        this.vocFirstTests = vocFirstTests;
    }

    public List<VocSecondTest> getVocSecondTests() {
        return vocSecondTests;
    }

    public void setVocSecondTests(List<VocSecondTest> vocSecondTests) {
        this.vocSecondTests = vocSecondTests;
    }

    public List<VocTextTest> getVocTextTests() {
        return vocTextTests;
    }

    public void setVocTextTests(List<VocTextTest> vocTextTests) {
        this.vocTextTests = vocTextTests;
    }

    public List<User> getUsers() {
        return users;
    }

    public void setUsers(List<User> users) {
        this.users = users;
    }

    @Override
    public String toString() {
        return "Vocabulary{" +
                "id=" + id +
                ", unit='" + unit + '\'' +
                ", vocWords=" + vocWords +
                ", vocFirstTests=" + vocFirstTests +
                ", vocSecondTests=" + vocSecondTests +
                ", vocTextTests=" + vocTextTests +
                ", users=" + users +
                '}';
    }
}
