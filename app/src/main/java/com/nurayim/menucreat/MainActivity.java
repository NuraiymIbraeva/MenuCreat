package com.nurayim.menucreat;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView textView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu,menu);
        return super.onCreateOptionsMenu(menu);
    }

    @SuppressLint("NonConstantResourceId")
    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {

        textView = findViewById(R.id.textView);
        switch (item.getItemId()){
            case
            R.id.action_cat1:{
                textView.setText("Вы выбрали кота!");
                return true;

            }
            case R.id.action_cat2:{
                textView.setText("Вы выбрали кошку");
                return true;
            }
            case R.id.action_cat3:{
                textView.setText("Вы выбрали котенка");
                return true;
            }
        }
        return super.onOptionsItemSelected(item);
    }

    public void onSettingClick(MenuItem item) {
        TextView infoTextView = findViewById(R.id.textView);
        infoTextView.setText("Вы выбрали пункт Settings,лучше бы выбрали кота ");
    }
}