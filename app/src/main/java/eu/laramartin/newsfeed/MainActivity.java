package eu.laramartin.newsfeed;

import android.os.Bundle;
import android.support.v4.app.LoaderManager;
import android.support.v4.content.Loader;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

import org.json.JSONArray;

public class MainActivity extends AppCompatActivity implements LoaderManager.LoaderCallbacks<JSONArray> {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getSupportLoaderManager().initLoader(0, null, this);

    }



    @Override
    public Loader<JSONArray> onCreateLoader(int id, Bundle args) {
        return new NewsLoader(this);
    }

    @Override
    public void onLoadFinished(Loader<JSONArray> loader, JSONArray data) {

        Log.v("Mainactivity", String.valueOf(data));
    }

    @Override
    public void onLoaderReset(Loader<JSONArray> loader) {

    }
}
