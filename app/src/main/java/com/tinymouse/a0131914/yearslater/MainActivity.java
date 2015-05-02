package com.tinymouse.a0131914.yearslater;

import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.support.v4.view.ViewPager;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;

import com.tinymouse.api.newsStoryEndpoint.model.NewsStory;

import java.util.List;


public class MainActivity extends FragmentActivity implements ListenerInterface{


    private static final String TAG = "MyActivity";
    List<NewsStory> newsStoryList;
    ViewPager viewpager;
    boolean isGetDataDone = false;
    public boolean isGetDataDone() {
        return isGetDataDone;
    }

    public void setGetDataDone(boolean isGetDataDone) {
        this.isGetDataDone = isGetDataDone;
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        new EndpointsAsyncTask(this).execute();

    }

    public List<NewsStory> getNewsStoryList() {
        return newsStoryList;
    }

    public void processFinish(List<NewsStory> newsStoryList)
    {
        this.newsStoryList = newsStoryList;
        if(this.newsStoryList != null)
        {
            if (!newsStoryList.isEmpty()) {
                Log.v(TAG, newsStoryList.get(0).getStoryHead());
                viewpager = (ViewPager) findViewById(R.id.pager);
                NewsStoryAdepter padapter = new NewsStoryAdepter(getSupportFragmentManager());
                viewpager.setAdapter(padapter);
            }
            else
            {
                Log.v(TAG, "List is empty");
            }
        }
        else
        {
            Log.v(TAG, "List is null");
        }
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}
