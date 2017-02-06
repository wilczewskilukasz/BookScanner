package com.soldiersofmobile.bookscanner.api;

import com.soldiersofmobile.bookscanner.api.model.BooksResponse;

import retrofit2.Call;

public interface BookApi {

    //TODO add missing Retrofit annotations
    Call<BooksResponse> getBook(String isbn);
}
