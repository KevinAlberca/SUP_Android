package com.supinternet.retrofit;

import okhttp3.ResponseBody;
import retrofit2.http.Query;
import retrofit2.http.GET;
import retrofit2.Call;

/**
 * Created by AwH on 24/05/16.
 */
public interface GoogleSearch {

    @GET("search?q={q}")
    Call<ResponseBody> search(@Query("q") String keyword);
}
