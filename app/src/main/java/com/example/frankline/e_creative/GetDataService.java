package com.example.frankline.e_creative;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface GetDataService {

    @GET("api/articles_api")
    Call<List<RetroArticle>> getAllArticle();
}
