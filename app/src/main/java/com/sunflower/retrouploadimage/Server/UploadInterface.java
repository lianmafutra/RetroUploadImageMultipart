package com.sunflower.retrouploadimage.Server;

import com.sunflower.retrouploadimage.Model.BaseResponse;

import okhttp3.MultipartBody;
import okhttp3.RequestBody;
import retrofit2.Call;
import retrofit2.http.Multipart;
import retrofit2.http.POST;
import retrofit2.http.Part;

public interface UploadInterface {

    @Multipart
    @POST(Config.API_UPLOAD)
    Call<BaseResponse> uploadPhotoMultipart(
            @Part("action") RequestBody action,
            @Part MultipartBody.Part photo);
}
