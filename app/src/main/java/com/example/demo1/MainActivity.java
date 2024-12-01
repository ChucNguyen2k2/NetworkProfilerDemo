package com.example.demo1;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button buttonFetch = findViewById(R.id.button_fetch);
        TextView textViewResult = findViewById(R.id.textView_result);

        buttonFetch.setOnClickListener(v -> {
            new Thread(() -> {
                OkHttpClient client = new OkHttpClient();
                Request request = new Request.Builder()
                        .url("https://jsonplaceholder.typicode.com/posts/1")
                        .build();
                try (Response response = client.newCall(request).execute()) {
                    String result = response.body() != null ? response.body().string() : "No response";
                    runOnUiThread(() -> textViewResult.setText(result));
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }).start();
        });
    }
}
