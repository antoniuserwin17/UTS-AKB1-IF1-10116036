package com.example.myselfapps;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

/* Tanggal Pengerjaan : 15-21 Mei 2019
 * NIM: 10116036
 * NAMA: Antonius Erwin
 * KELAS: IF1
 */



public class SplashActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_splash);
        Thread thread = new Thread() {
            public void run() {
                    try {
                        sleep(3000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    } finally {
                        startActivity(new Intent(SplashActivity.this, WelcomeActivity.class));
                        finish();
                    }


            }
        };
        thread.start();
    }
}