package com.bikram.sqllite;

import androidx.appcompat.app.AppCompatActivity;

import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.bikram.sqllite.helper.MyHelper;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    EditText etword, etmeaning;
    Button btnsave;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etword = findViewById(R.id.word);
        etmeaning = findViewById(R.id.meaning);
        btnsave = findViewById(R.id.save);
        btnsave.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        MyHelper myHelper = new MyHelper(this);

        SQLiteDatabase sqLiteDatabase = myHelper.getWritableDatabase();
    }
}
