package com.project.InfoGempa;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.project.InfoGempa.adapter.adapterListGempa;
import com.project.InfoGempa.pjModels.ListGempa.FeaturesItem;
import com.project.InfoGempa.pjModels.ListGempa.ListGempaResponse;
import com.project.InfoGempa.retrofit.MainInterface;
import com.project.InfoGempa.retrofit.RetClient;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class ListGempaActivity extends AppCompatActivity implements adapterListGempa.ItemGempaClickListener {

    private RecyclerView rvLG;
    private adapterListGempa adapter;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_gempa);

        rvLG = findViewById(R.id.rv_listgempa);
        rvLG.setLayoutManager(new LinearLayoutManager(this));
        adapter = new adapterListGempa();
        adapter.setListenerGMP(this);
        rvLG.setAdapter(adapter);

        MainInterface mainInterface = RetClient.getService();
        Call<ListGempaResponse> call = mainInterface.listGempa();
        call.enqueue(new Callback<ListGempaResponse>() {
            @Override
            public void onResponse(Call<ListGempaResponse> call, Response<ListGempaResponse> response) {
                ListGempaResponse listGempaResponse = response.body();
                Log.e("success", listGempaResponse.toString());
                if(listGempaResponse != null){
                    List<FeaturesItem> featuresItems = listGempaResponse.getFeatures();
                    adapter.setListGempa((ArrayList<FeaturesItem>) featuresItems);
                }
            }

            @Override
            public void onFailure(Call<ListGempaResponse> call, Throwable t) {
                Log.e("success", t.getLocalizedMessage());
            }
        });

    }

    @Override
    public void onItemGempaClick(FeaturesItem gempa) {

        Intent listGempa = new Intent(this, DetailGempaActivity.class);
        listGempa.putExtra("id_gempa", gempa.getId());
        startActivity(listGempa);
        finish();
    }

}
