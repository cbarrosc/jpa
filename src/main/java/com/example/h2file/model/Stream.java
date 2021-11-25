package com.example.h2file.model;

import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "Stream")
@NoArgsConstructor
public class Stream {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String name;

    @ManyToMany(mappedBy = "followedStreams")
    private List<Viewer> followers = new ArrayList<>();

    public Stream(String name) {
        this.name = name;
    }

    public void addViewer(Viewer viewer){
        followers.add(viewer);
    }
}
