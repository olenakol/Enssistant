package com.enssistant.model;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

@Entity
@Table(name = "users")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @Column(name = "username")
    private String username;
    @Column(name = "password")
    private String password;
    @Transient
    transient private String confirmPassword;

    @ManyToMany
    @JoinTable(
            name = "user_roles",
            joinColumns = @JoinColumn(name = "user_id"),
            inverseJoinColumns = @JoinColumn(name = "role_id"))
    private List<Role>roles;

    @ManyToMany
    @JoinTable(
            name = "user_vocabulary",
            joinColumns = @JoinColumn(name = "user_id"),
            inverseJoinColumns = @JoinColumn(name = "vocabulary_id"))
    private List<Vocabulary>vocabularies;

    @ManyToMany
    @JoinTable(
            name = "user_ieltsTest",
            joinColumns =@JoinColumn(name = "user_id"),
            inverseJoinColumns =@JoinColumn(name = "ieltsTest_id"))
    private List<IeltsTest>ieltsTests = new ArrayList<>();

    @ManyToMany
    @JoinTable(
            name = "user_readingIeltsFile",
            joinColumns =@JoinColumn(name = "user_id"),
            inverseJoinColumns =@JoinColumn(name = "readingIeltsFile_id"))
    private List<ReadingIeltsFile>readingIeltsFiles = new ArrayList<>();

    @ManyToMany
    @JoinTable(
            name = "user_listeningIeltsFile",
            joinColumns =@JoinColumn(name = "user_id"),
            inverseJoinColumns =@JoinColumn(name = "listeningIeltsFile_id"))
    private List<ListeningIeltsFile>listeningIeltsFiles = new ArrayList<>();


    @ManyToMany
    @JoinTable(
            name = "user_writingIeltsFile",
            joinColumns =@JoinColumn(name = "user_id"),
            inverseJoinColumns =@JoinColumn(name = "writingIeltsFile_id"))
    private List<WritingIeltsFile>writingIeltsFiles= new ArrayList<>();

    @ManyToMany
    @JoinTable(
            name = "user_speakingIeltsFile",
            joinColumns =@JoinColumn(name = "user_id"),
            inverseJoinColumns =@JoinColumn(name = "speakingIeltsFile_id"))
    private List<SpeakingIeltsFile>speakingIeltsFiles = new ArrayList<>();

   @ManyToMany
    @JoinTable(
            name = "user_audioFile",
            joinColumns =@JoinColumn(name = "user_id"),
            inverseJoinColumns =@JoinColumn(name = "audioFile_id"))
    private List<AudioFile>audioFiles = new ArrayList<>();


   @ManyToMany
    @JoinTable(
            name = "user_videoFile",
            joinColumns =@JoinColumn(name = "user_id"),
            inverseJoinColumns =@JoinColumn(name = "videoFile_id"))
    private List<VideoFile> videoFiles = new ArrayList<>();

   @ManyToMany
    @JoinTable(
            name = "user_bookFile",
            joinColumns =@JoinColumn(name = "user_id"),
            inverseJoinColumns =@JoinColumn(name = "bookFile_id"))
    private List<BookFile> bookFiles = new ArrayList<>();

   @ManyToMany
    @JoinTable(
            name = "user_downloadFile",
            joinColumns =@JoinColumn(name = "user_id"),
            inverseJoinColumns =@JoinColumn(name = "downloadFile_id"))
    private List<DownloadFile> downloadFiles = new ArrayList<>();

    public User() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getConfirmPassword() {
        return confirmPassword;
    }

    public void setConfirmPassword(String confirmPassword) {
        this.confirmPassword = confirmPassword;
    }

    public List<Role> getRoles() {
        return roles;
    }

    public void setRoles(List<Role> roles) {
        this.roles = roles;
    }

    public List<Vocabulary> getVocabularies() {
        return vocabularies;
    }

    public void setVocabularies(List<Vocabulary> vocabularies) {
        this.vocabularies = vocabularies;
    }

    public List<IeltsTest> getIeltsTests() {
        return ieltsTests;
    }

    public void setIeltsTests(List<IeltsTest> ieltsTests) {
        this.ieltsTests = ieltsTests;
    }

    public List<ReadingIeltsFile> getReadingIeltsFiles() {
        return readingIeltsFiles;
    }

    public void setReadingIeltsFiles(List<ReadingIeltsFile> readingIeltsFiles) {
        this.readingIeltsFiles = readingIeltsFiles;
    }

    public List<ListeningIeltsFile> getListeningIeltsFiles() {
        return listeningIeltsFiles;
    }

    public void setListeningIeltsFiles(List<ListeningIeltsFile> listeningIeltsFiles) {
        this.listeningIeltsFiles = listeningIeltsFiles;
    }

    public List<WritingIeltsFile> getWritingIeltsFiles() {
        return writingIeltsFiles;
    }

    public void setWritingIeltsFiles(List<WritingIeltsFile> writingIeltsFiles) {
        this.writingIeltsFiles = writingIeltsFiles;
    }

    public List<SpeakingIeltsFile> getSpeakingIeltsFiles() {
        return speakingIeltsFiles;
    }

    public void setSpeakingIeltsFiles(List<SpeakingIeltsFile> speakingIeltsFiles) {
        this.speakingIeltsFiles = speakingIeltsFiles;
    }

    public List<AudioFile> getAudioFiles() {
        return audioFiles;
    }

    public void setAudioFiles(List<AudioFile> audioFiles) {
        this.audioFiles = audioFiles;
    }

    public List<VideoFile> getVideoFiles() {
        return videoFiles;
    }

    public void setVideoFiles(List<VideoFile> videoFiles) {
        this.videoFiles = videoFiles;
    }

    public List<BookFile> getBookFiles() {
        return bookFiles;
    }

    public void setBookFiles(List<BookFile> bookFiles) {
        this.bookFiles = bookFiles;
    }

    public List<DownloadFile> getDownloadFiles() {
        return downloadFiles;
    }

    public void setDownloadFiles(List<DownloadFile> downloadFiles) {
        this.downloadFiles = downloadFiles;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", confirmPassword='" + confirmPassword + '\'' +
                ", roles=" + roles +
                ", vocabularies=" + vocabularies +
                ", ieltsTests=" + ieltsTests +
                ", readingIeltsFiles=" + readingIeltsFiles +
                ", listeningIeltsFiles=" + listeningIeltsFiles +
                ", writingIeltsFiles=" + writingIeltsFiles +
                ", speakingIeltsFiles=" + speakingIeltsFiles +
                ", audioFiles=" + audioFiles +
                ", videoFiles=" + videoFiles +
                ", bookFiles=" + bookFiles +
                ", downloadFiles=" + downloadFiles +
                '}';
    }
}
