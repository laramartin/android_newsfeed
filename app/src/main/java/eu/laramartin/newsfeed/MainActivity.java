package eu.laramartin.newsfeed;

import android.os.Bundle;
import android.support.v4.app.LoaderManager;
import android.support.v4.content.Loader;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.List;

public class MainActivity extends AppCompatActivity implements LoaderManager.LoaderCallbacks<List<News>> {

    private NewsAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ListView listView = (ListView) findViewById(R.id.list_view);
        adapter = new NewsAdapter(this);
        listView.setAdapter(adapter);

        getSupportLoaderManager().initLoader(0, null, this);

    }



    @Override
    public Loader<List<News>> onCreateLoader(int id, Bundle args) {
        return new NewsLoader(this);
    }

    @Override
    public void onLoadFinished(Loader<List<News>> loader, List<News> data) {
        if (data != null) {
            adapter.addAll(data);
        }
    }


    @Override
    public void onLoaderReset(Loader<List<News>> loader) {

    }
}
