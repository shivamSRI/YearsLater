package com.tinymouse.a0131914.yearslater;

/**
 * Created by a0131914 on 4/19/2015.
 */

import android.content.Context;
import android.os.AsyncTask;
import android.util.Log;

import com.google.api.client.extensions.android.http.AndroidHttp;
import com.google.api.client.extensions.android.json.AndroidJsonFactory;
import com.google.api.client.googleapis.services.AbstractGoogleClientRequest;
import com.google.api.client.googleapis.services.GoogleClientRequestInitializer;
import com.tinymouse.api.newsStoryEndpoint.NewsStoryEndpoint;
import com.tinymouse.api.newsStoryEndpoint.model.NewsStory;

import java.io.IOException;
import java.util.Collections;
import java.util.List;



//import com.example.a0131914.myapplication.backend.NewsStoryEndpoint.*;
//import com.example.a0131914.myapplication.backend.NewsStoryEndpoint.model.NewsStory;

class EndpointsAsyncTask extends AsyncTask<Void, Void, List<NewsStory>> {
    private static final String TAG = "EndPointTask";
    private static NewsStoryEndpoint myApiService = null;
    private Context context;
    private Void[] params;
    ListenerInterface asyncResponse;

    EndpointsAsyncTask(ListenerInterface listenerObject) {
        asyncResponse = listenerObject;
    }

    @Override
    protected List<NewsStory> doInBackground(Void... params) {
        this.params = params;
        if(myApiService == null) {  // Only do this once
            NewsStoryEndpoint.Builder builder = new NewsStoryEndpoint.Builder(AndroidHttp.newCompatibleTransport(),
                    new AndroidJsonFactory(), null)
                    // options for running against local devappserver
                    // - 10.0.2.2 is localhost's IP address in Android emulator
                    // - turn off compression when running against local devappserver
                    .setRootUrl("http://10.0.2.2:8080/_ah/api/")
                    .setGoogleClientRequestInitializer(new GoogleClientRequestInitializer() {
                        @Override
                        public void initialize(AbstractGoogleClientRequest<?> abstractGoogleClientRequest) throws IOException {
                            abstractGoogleClientRequest.setDisableGZipContent(true);
                        }
                    });
            // end options for devappserver

            myApiService = builder.build();
        }

        try {
            return myApiService.listNewsStory().execute().getItems();
        } catch (IOException e) {
            return Collections.EMPTY_LIST;
        }
    }

    @Override
    protected void onPostExecute(List<NewsStory> result) {

        if(result != null) {
            FragmentMain.setNewsList(result);
            asyncResponse.processFinish(result);
        }
        else
        {
            Log.v(TAG, "result is null");
        }
    }
}
