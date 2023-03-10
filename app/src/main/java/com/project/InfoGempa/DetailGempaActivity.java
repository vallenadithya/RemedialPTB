package com.project.InfoGempa;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.project.InfoGempa.pjModels.DetailGempa.DetailGempaResponse;
import com.project.InfoGempa.retrofit.MainInterface;
import com.project.InfoGempa.retrofit.RetClient;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class DetailGempaActivity extends AppCompatActivity {

    Button backbutton, mapsButton;
    Intent getIntent;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_gempa);


        backbutton = findViewById(R.id.backButton);
        backbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent back = new Intent(DetailGempaActivity.this, ListGempaActivity.class);
                startActivity(back);
                finish();
            }
        });

        getIntent = getIntent();
        if (getIntent != null){
            MainInterface mainInterface = RetClient.getService();
            String idgempa = getIntent.getStringExtra("id_gempa");
            Call<DetailGempaResponse> call = mainInterface.detailGempa(idgempa);
            call.enqueue(new Callback<DetailGempaResponse>() {
                @Override
                public void onResponse(Call<DetailGempaResponse> call, Response<DetailGempaResponse> response) {
                    DetailGempaResponse detailGempaResponse = response.body();
                    Log.e("Suc", response.toString());

                    TextView replaceLokasi = findViewById(R.id.lokasii);
                    TextView replaceWaktu = findViewById(R.id.waktuu);
                    TextView replaceSkala = findViewById(R.id.skalaa);
                    TextView replaceLatti = findViewById(R.id.latiii);
                    TextView replaceLongi = findViewById(R.id.loongg);
                    TextView replacetsunami = findViewById(R.id.tsunaa);
                    TextView replaceUrl = findViewById(R.id.uurrll);

                    String lokasi = detailGempaResponse.getProperties().getPlace();
                    String waktu = detailGempaResponse.getProperties().getTime();
                    String skalaaa = detailGempaResponse.getProperties().getMag();
                    String Laaatt = detailGempaResponse.getProperties().getProducts().getOrigin().get(0).getProperties().getLatitude();
                    String Lonng = detailGempaResponse.getProperties().getProducts().getOrigin().get(0).getProperties().getLongitude();
                    String tsunami = detailGempaResponse.getProperties().getTsunami();
                    String URL = detailGempaResponse.getProperties().getUrl();

                    replaceLokasi.setText(lokasi);
                    replaceWaktu.setText(waktu);
                    replaceSkala.setText(skalaaa);
                    replaceLatti.setText(Laaatt);
                    replaceLongi.setText(Lonng);
                    replacetsunami.setText(tsunami);
                    replaceUrl.setText(URL);

                    mapsButton = findViewById(R.id.webbutton);
                    mapsButton.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            String url = URL+"/map";
                            Intent map = new Intent(Intent.ACTION_VIEW);
                            map.setData(Uri.parse(url));
                            startActivity(map);
                        }
                    });

                }

                @Override
                public void onFailure(Call<DetailGempaResponse> call, Throwable t) {
                    Log.e("error", t.getLocalizedMessage());
                }
            });
        }
    }
}