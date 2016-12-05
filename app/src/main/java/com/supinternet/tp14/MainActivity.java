package com.supinternet.tp14;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;


public class MainActivity extends AppCompatActivity {
    private ListView listView;
    private RepoAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listView = (ListView) findViewById(R.id.listView);

        adapter = new RepoAdapter(this);
        listView.setAdapter(adapter);

        retrieveRepos("KevinAlberca");
    }

    public void retrieveRepos(String username) {
        GithubService.listRepos(username, new Callback<List<Repo>>() {
            @Override
            public void onResponse(Call<List<Repo>> call, Response<List<Repo>> response) {
                Log.d(TAG, "Succes !" + response);
                adapter.setRepos(response.body());
            }

            @Override
            public void onFailure(Call<List<Repo>> call, Throwable t) {
                Log.d(TAG, "Failed", t);
            }
        });
    }
}
