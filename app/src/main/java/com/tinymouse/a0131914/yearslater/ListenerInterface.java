package com.tinymouse.a0131914.yearslater;

import com.tinymouse.api.newsStoryEndpoint.model.NewsStory;

import java.util.List;

public interface ListenerInterface
{
    void processFinish(List<NewsStory> newsStoryList);
}