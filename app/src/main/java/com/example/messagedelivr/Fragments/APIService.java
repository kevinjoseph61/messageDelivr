package com.example.messagedelivr.Fragments;


import com.example.messagedelivr.Notifications.MyResponse;
import com.example.messagedelivr.Notifications.Sender;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.Headers;
import retrofit2.http.POST;

public interface APIService {
    @Headers(
        {
            "Content-Type:application/json",
            "Authorization:key=SERVER_KEY_HERE"
        }
    )
    @POST("fcm/send")
    Call<MyResponse> sendNotification(@Body Sender body);
}
