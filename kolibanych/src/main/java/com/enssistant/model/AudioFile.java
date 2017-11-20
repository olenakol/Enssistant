package com.enssistant.model;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "audioFiles")
public class AudioFile {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String nameFile;

    @ManyToMany
    @JoinTable(
            name = "user_audioFile",
            joinColumns = @JoinColumn(name = "audioFile_id"),
            inverseJoinColumns = @JoinColumn(name = "user_id")
    )
    List<User> users;

    public AudioFile() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNameFile() {
        return nameFile;
    }

    public void setNameFile(String nameFile) {
        this.nameFile = nameFile;
    }

    public List<User> getUsers() {
        return users;
    }

    public void setUsers(List<User> users) {
        this.users = users;
    }

    @Override
    public String toString() {
        return "AudioFile{" +
                "id=" + id +
                ", nameFile='" + nameFile + '\'' +
                ", users=" + users +
                '}';
    }
}
