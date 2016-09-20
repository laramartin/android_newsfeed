package eu.laramartin.newsfeed;

import android.content.Context;
import android.support.v4.content.AsyncTaskLoader;

import org.json.JSONArray;

import java.io.IOException;
import java.net.URL;

/**
 * Created by lara on 20/9/16.
 */
public class NewsLoader extends AsyncTaskLoader<JSONArray> {

    public NewsLoader(Context context) {
        super(context);
    }

    @Override
    protected void onStartLoading() {
        super.onStartLoading();
        forceLoad();
    }

    @Override
    public JSONArray loadInBackground() {

        JSONArray newsList = null;
        try {
            URL url = QueryUtils.createUrl();
            String jsonResponse = QueryUtils.makeHttpRequest(url);
            newsList = QueryUtils.parseJson(jsonResponse);
        } catch (IOException e) {
            e.printStackTrace();
        }

        return newsList;
    }
}
