package com.enssistant.model;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "speakingIeltsFiles")
public class SpeakingIeltsFile {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String nameFile;
    private String nameMp3File;

    @ManyToMany
    @JoinTable(
            name = "user_speakingIeltsFile",
            joinColumns = @JoinColumn(name = "speakingIeltsFile_id"),
            inverseJoinColumns = @JoinColumn(name = "user_id")
    )
    List<User> users;

    public SpeakingIeltsFile() {
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

    public String getNameMp3File() {
        return nameMp3File;
    }

    public void setNameMp3File(String nameMp3File) {
        this.nameMp3File = nameMp3File;
    }

    public List<User> getUsers() {
        return users;
    }

    public void setUsers(List<User> users) {
        this.users = users;
    }

    @Override
    public String toString() {
        return "SpeakingIeltsFile{" +
                "id=" + id +
                ", nameFile='" + nameFile + '\'' +
                ", nameMp3File='" + nameMp3File + '\'' +
                ", users=" + users +
                '}';
    }
}
