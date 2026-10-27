package com.resultbrowser.app;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    public static final String EXTRA_URL = "extra_url";
    public static final String EXTRA_SERVER_NAME = "extra_server_name";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnServer1 = findViewById(R.id.btnServer1);
        Button btnServer2 = findViewById(R.id.btnServer2);

        btnServer1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openWebView(
                    "https://eboardresults.com/v2/home",
                    "Server 1 - eboardresults.com"
                );
            }
        });

        btnServer2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openWebView(
                    "https://www.educationboardresults.gov.bd/v2/home",
                    "Server 2 - educationboardresults.gov.bd"
                );
            }
        });
    }

    private void openWebView(String url, String serverName) {
        Intent intent = new Intent(MainActivity.this, WebViewActivity.class);
        intent.putExtra(EXTRA_URL, url);
        intent.putExtra(EXTRA_SERVER_NAME, serverName);
        startActivity(intent);
    }
}
