package com.supinternet.tp14;

import java.util.List;

import javax.security.auth.callback.Callback;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

/**
 * Created by AwH on 31/05/16.
 */
public interface GithubRequest {
    @GET("users/{username}/repos")
    Call<List<Repo>> listRepos(@Path("username") String name);
}
