package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    TextView edtA, edtB, edtC;
    Button btn;
    private static String TAB = "MainActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//        //anh xa toi control
        edtA = findViewById(R.id.edtA);
        edtB = findViewById(R.id.edtB);
        edtC = findViewById(R.id.edtC);
        RadioButton rg = findViewById(R.id.radioButton);
        RadioButton rg2 = findViewById(R.id.radioButton2);
        CheckBox box1 = findViewById(R.id.checkBox2);
        CheckBox box2 = findViewById(R.id.checkBox3);
//        //xu ly su kien
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String ten = edtA.getText().toString();
                int mssv = Integer.parseInt(edtB.getText().toString());
                int tuoi = Integer.parseInt(edtC.getText().toString());

                String gioiTinh;
                if (rg.isChecked()) {
                    gioiTinh = "Nam";
                } else if (rg2.isChecked()) {
                    gioiTinh = "Nữ";
                } else {
                    gioiTinh = "Không xác định"; // Handle the case where neither radio button is checked
                }

                String interests = "";
                if (box1.isChecked()) {
                    interests += "Sở thích 1, ";
                }
                if (box2.isChecked()) {
                    interests += "Sở thích 2";
                }
                Toast.makeText(MainActivity.this, "Tên: " + ten + "\nMSSV: " + mssv + "\nTuổi: " + tuoi + "\nGiới tính: " + gioiTinh + "\nSở thích: " + interests, Toast.LENGTH_SHORT).show();
            }
        });


    }

    @Override
    protected void onStart() {
        super.onStart();
    }

    @Override
    protected void onRestart() {
        super.onRestart();
    }

    @Override
    protected void onStop() {
        super.onStop();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
    }

    @Override
    protected void onPause() {
        super.onPause();
    }

    @Override
    protected void onResume() {
        super.onResume();
    }
}