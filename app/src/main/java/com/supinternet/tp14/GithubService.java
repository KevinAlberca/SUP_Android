package com.supinternet.tp14;

import java.util.List;


import retrofit2.Callback;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by AwH on 31/05/16.
 */
public class GithubService {

    public static Retrofit retrofit;

    public static void listRepos(String username, Callback<List<Repo>> callback) {

        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("http://api.github.com/")
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        GithubRequest service = retrofit.create(GithubRequest.class);

        service.listRepos(username).enqueue(callback);

    }
}
