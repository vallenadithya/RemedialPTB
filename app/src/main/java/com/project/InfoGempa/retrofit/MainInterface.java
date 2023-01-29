package com.project.InfoGempa.retrofit;

import com.project.InfoGempa.pjModels.DetailGempa.DetailGempaResponse;
import com.project.InfoGempa.pjModels.ListGempa.ListGempaResponse;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

public interface MainInterface {

    @GET("feed/v1.0/summary/2.5_day.geojson")
    Call<ListGempaResponse> listGempa (

    );

    @GET("feed/v1.0/detail/{id_gempa}.geojson")
    Call<DetailGempaResponse> detailGempa (
            @Path("id_gempa") String id
    );

}
