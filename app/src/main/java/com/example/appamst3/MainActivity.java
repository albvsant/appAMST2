package com.example.appamst3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import android.widget.CalendarView;

import android.net.Uri;
import androidx.appcompat.app.AppCompatActivity;

import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;


public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    private EditText edtUsuario, edtClave;
    private Button btnLogin,btnRegistro;

    private Button btnVideoView;
    private Button btnCalendarView;
    private CalendarView calendarView;

    private Button btnMapView;
    private Button btnLineChart;

    private WebView webView;

    @Override
    protected void onCreate(Bundle savedInstanceState)  {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Referencias a los controles del diseño
        edtUsuario = (EditText) findViewById(R.id.edtUsuario);
        edtClave = (EditText) findViewById(R.id.edtClave);

        btnLogin = (Button) findViewById(R.id.btnLogin);
        btnRegistro = (Button) findViewById(R.id.btnRegistro);


        btnVideoView = findViewById(R.id.btnVideoView);
        btnCalendarView = findViewById(R.id.btnCalendarView);
        btnMapView = findViewById(R.id.btnMapView);
        btnLineChart = findViewById(R.id.btnLineChart);

        webView = findViewById(R.id.webView);
        btnVideoView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showWebView();
                loadYouTubeVideo();
            }
        });
        btnCalendarView.setOnClickListener(this);

        calendarView = findViewById(R.id.calendarView);

        btnCalendarView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mostrarCalendario();
            }
        });
        btnMapView.setOnClickListener(this);
        btnLineChart.setOnClickListener(this);


    }

    private void showWebView() {
        webView.setVisibility(View.VISIBLE);
    }
    public void registrarse(View view) {
        Intent intent = new Intent(this, formulario_registro.class);
        startActivity(intent);
    }

    public void login(View view) {
        Toast toast=Toast.makeText(getApplicationContext(),"Usted no cuenta con un usuario",Toast.LENGTH_SHORT);

        toast.show();
    }

    public void onClick(View v) {
        if(v.getId() == R.id.btnLogin){
            Log.d("mensaje","ïngreso");

        }else if(v.getId() == R.id.btnRegistro) {
        }
        else if(v.getId() == R.id.btnVideoView) {
        }
        else if(v.getId() == R.id.btnCalendarView) {
        }
        else if(v.getId() == R.id.btnMapView) {
        }
        else if(v.getId() == R.id.btnLineChart) {
        }
    }

    private void loadYouTubeVideo() {
        // Habilitar JavaScript
        WebSettings webSettings = webView.getSettings();
        webSettings.setJavaScriptEnabled(true);

        // Cargar el video de YouTube
        String videoId = "LH4id9JY9u4";
        String videoUrl = "https://www.youtube.com/embed/" + videoId;

        webView.setWebViewClient(new WebViewClient());
        webView.loadUrl(videoUrl);
    }

    private void mostrarCalendario() {
        calendarView.setVisibility(View.VISIBLE);
    }

}