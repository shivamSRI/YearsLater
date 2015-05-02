package com.tinymouse.a0131914.yearslater;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.tinymouse.api.newsStoryEndpoint.model.NewsStory;

import java.util.List;


/**
 * A simple {@link Fragment} subclass.
 * Activities that contain this fragment must implement the
 *  interface
 * to handle interaction events.
 * Use the {@link FragmentMain#newInstance} factory method to
 * create an instance of this fragment.
 */
public class FragmentMain extends Fragment {

    int IndexPosition;
    static List<NewsStory> newsStoryList;
    public static final String ARG_PARAM1 = "NEWS_STORY_POSITION";
    private static final String TAGF = "FragmentActivity";

    public static FragmentMain newInstance(int indexPosition) {
        FragmentMain fragment = new FragmentMain();
        Bundle args = new Bundle();
        args.putInt(ARG_PARAM1 , indexPosition);
        fragment.setArguments(args);
        return fragment;
    }

    public static void setNewsList(List<NewsStory> newsStoryListReturned)
    {
        newsStoryList = newsStoryListReturned;
    }

    public FragmentMain() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            IndexPosition = getArguments().getInt(ARG_PARAM1);
        }

        if(newsStoryList == null)
            Log.v(TAGF,"newsstoryList is null");
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_main, container, false);
        //ImageView rocketImage = (ImageView)view.findViewById(R.id.vertical_bar);
        //rocketImage.setBackgroundResource(R.drawable.black_bar);
        if(newsStoryList != null) {
            TextView tvLabel = (TextView) view.findViewById(R.id.StoryHeader);
            tvLabel.setText(newsStoryList.get(IndexPosition).getStoryHead());

            TextView tvLabel2 = (TextView) view.findViewById(R.id.StoryBody);
            tvLabel2.setText(newsStoryList.get(IndexPosition).getStoryText());
        }

        return view;
    }


}
