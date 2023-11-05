package com.codegym.entity;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name="video")
public class Video extends BaseEntity{
    @Column
    private String title;
    @Column
    private String description;
    @ManyToMany
    @JoinTable(name="video_playlist",
        joinColumns = @JoinColumn(name="video_id"),
        inverseJoinColumns = @JoinColumn(name="playlist_id"))
    private List<Playlist> playlists = new ArrayList<>();

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public List<Playlist> getPlaylists() {
        return playlists;
    }

    public void setPlaylists(List<Playlist> playlists) {
        this.playlists = playlists;
    }
}
