package com.example.a0131914.myapplication.backend;

import com.googlecode.objectify.annotation.Entity;
import com.googlecode.objectify.annotation.Id;
/**
 * Created by a0131914 on 4/17/2015.
 */
@Entity
public class NewsStory {

    @Id
    Long Id;
    String storyHead;
    String storyText;

    public NewsStory() {}

    public Long getId() {
        return Id;
    }

    public void setId(Long id) {
        Id = id;
    }

    public String getStoryHead() {
        return storyHead;
    }

    public void setStoryHead(String storyHead) {
        this.storyHead = storyHead;
    }

    public String getStoryText() {
        return storyText;
    }

    public void setStoryText(String storyText) {
        this.storyText = storyText;
    }
}
