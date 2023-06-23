package com.si6a.rakitkuy;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.DELETE;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.PATCH;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Path;

public interface APIService {
    @FormUrlEncoded
    @POST("auth/login")
    Call<ValueData<User>> login(@Field("username") String username,
                                @Field("password") String password);

    @FormUrlEncoded
    @POST("auth/register")
    Call<ValueData<User>> register(@Field("username") String username,
                                   @Field("password") String password);

    @GET("rakitkuy")
    Call<ValueData<List<Unggah>>> getUnggah();

    @FormUrlEncoded
    @POST("rakitkuy")
    Call<ValueNoData> addUnggah(@Field("content") String content,
                                  @Field("user_id") String userId);

    @FormUrlEncoded
    @PUT("rakitkuy")
    Call<ValueNoData> updateUnggah(@Field("id") String id,
                                   @Field("content") String content);

    @DELETE("rakitkuy/{id}")
    Call<ValueNoData> deleteUnggah(@Path("id") String id);
}
