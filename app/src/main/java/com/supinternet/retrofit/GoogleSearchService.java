package com.supinternet.retrofit;


import okhttp3.ResponseBody;
import retrofit2.Callback;
import retrofit2.http.Query;
import retrofit2.Retrofit;
import retrofit2.Call;

/**
 * Created by AwH on 24/05/16.
 */
public class GoogleSearchService {

    private static  Retrofit retrofit;

    public static void searchAsynchrone(String keyword, Callback<ResponseBody> callback) {
        GoogleSearch service = getOrCreate().create(GoogleSearch.class);

        Call<ResponseBody> request = service.search(keyword);

        request.enqueue(callback);
    }

    private static Retrofit getOrCreate() {
        if(retrofit == null) {
            retrofit = new Retrofit.Builder()
                    .baseUrl("https://www.google.com/")
                    .build();
        }
        return retrofit;
    }
}
