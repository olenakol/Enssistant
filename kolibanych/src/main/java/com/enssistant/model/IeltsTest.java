package com.enssistant.model;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "ieltsTests")
public class IeltsTest {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String name;
    private String mp3File;
    private String textFirst;
    private String textSecond;
    private String textThird;

    @ManyToMany
    @JoinTable(
            name="user_iltsTest",
            joinColumns = @JoinColumn(name = "ieltsTest_id"),
            inverseJoinColumns = @JoinColumn(name = "user_id"))
    private List<User>users;

    @OneToMany(mappedBy = "ieltsTest")
    List<IReadingQuestion> iReadingQuestions;

    @OneToMany(mappedBy = "ieltsTest")
    List<IListeningQestion> iListeningQestions;

    public IeltsTest() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMp3File() {
        return mp3File;
    }

    public void setMp3File(String mp3File) {
        this.mp3File = mp3File;
    }

    public String getTextFirst() {
        return textFirst;
    }

    public void setTextFirst(String textFirst) {
        this.textFirst = textFirst;
    }

    public String getTextSecond() {
        return textSecond;
    }

    public void setTextSecond(String textSecond) {
        this.textSecond = textSecond;
    }

    public String getTextThird() {
        return textThird;
    }

    public void setTextThird(String textThird) {
        this.textThird = textThird;
    }

    public List<User> getUsers() {
        return users;
    }

    public void setUsers(List<User> users) {
        this.users = users;
    }

    public List<IReadingQuestion> getiReadingQuestions() {
        return iReadingQuestions;
    }

    public void setiReadingQuestions(List<IReadingQuestion> iReadingQuestions) {
        this.iReadingQuestions = iReadingQuestions;
    }

    public List<IListeningQestion> getiListeningQestions() {
        return iListeningQestions;
    }

    public void setiListeningQestions(List<IListeningQestion> iListeningQestions) {
        this.iListeningQestions = iListeningQestions;
    }

    @Override
    public String toString() {
        return "IeltsTest{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", mp3File='" + mp3File + '\'' +
                ", textFirst='" + textFirst + '\'' +
                ", textSecond='" + textSecond + '\'' +
                ", textThird='" + textThird + '\'' +
                ", users=" + users +
                ", iReadingQuestions=" + iReadingQuestions +
                ", iListeningQestions=" + iListeningQestions +
                '}';
    }
}
