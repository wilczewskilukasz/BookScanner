package com.soldiersofmobile.bookscanner.api;

import com.soldiersofmobile.bookscanner.api.model.BooksResponse;

import retrofit2.Call;
import retrofit2.http.GET;

public interface BookApi {

    //TODO add missing Retrofit annotations
    @GET("/isbn")

    Call<BooksResponse> getBook(String isbn);
}
