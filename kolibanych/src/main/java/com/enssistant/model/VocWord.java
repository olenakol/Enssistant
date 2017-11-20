package com.enssistant.model;

import javax.persistence.*;

@Entity
@Table(name = "vocWords")
public class VocWord {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String word;
    private String definition;
    private String exemple;

    @ManyToOne
    Vocabulary vocabulary;

    public VocWord() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getWord() {
        return word;
    }

    public void setWord(String word) {
        this.word = word;
    }

    public String getDefinition() {
        return definition;
    }

    public void setDefinition(String definition) {
        this.definition = definition;
    }

    public String getExemple() {
        return exemple;
    }

    public void setExemple(String exemple) {
        this.exemple = exemple;
    }

    public Vocabulary getVocabulary() {
        return vocabulary;
    }

    public void setVocabulary(Vocabulary vocabulary) {
        this.vocabulary = vocabulary;
    }

    @Override
    public String toString() {
        return "VocWord{" +
                "id=" + id +
                ", word='" + word + '\'' +
                ", definition='" + definition + '\'' +
                ", exemple='" + exemple + '\'' +
                ", vocabulary=" + vocabulary +
                '}';
    }
}
