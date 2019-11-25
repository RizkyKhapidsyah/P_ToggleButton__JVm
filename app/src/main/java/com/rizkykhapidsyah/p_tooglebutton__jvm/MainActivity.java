package com.rizkykhapidsyah.p_tooglebutton__jvm;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.ToggleButton;

public class MainActivity extends AppCompatActivity {

    ToggleButton ToggleButtonDemo_IDJAVA;
    TextView TextViewDemo_IDJAVA;

    String[] Pesan = {
            "Tombol Dalam Posisi : ",
            "Anda Menekan Tombol Dalam Posisi : "
    };


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextViewDemo_IDJAVA = findViewById(R.id.TextViewDemo_IDXML);
        ToggleButtonDemo_IDJAVA = findViewById(R.id.ToggleButtonDemo_IDXML);
        ToggleButtonDemo_IDJAVA.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (ToggleButtonDemo_IDJAVA.isChecked()) {
                    Toast.makeText(getApplicationContext(),
                            Pesan[0] + ToggleButtonDemo_IDJAVA.getText().toString(),
                            Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(getApplicationContext(),
                            Pesan[0] + ToggleButtonDemo_IDJAVA.getText().toString(),
                            Toast.LENGTH_LONG).show();
                }
                TextViewDemo_IDJAVA.setText(Pesan[1] + ToggleButtonDemo_IDJAVA.getText().toString());
            }
        });
    }
}
