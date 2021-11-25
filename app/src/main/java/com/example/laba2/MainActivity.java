package com.example.laba2;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Spinner;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

public class MainActivity extends AppCompatActivity {
    public static User user;
    public EditText FIOView;
    public EditText ageView;
    public EditText HeightView;
    public EditText WeightView;
    public RadioGroup GenderView;
    RadioButton gender;
    public Spinner ColorHairView;
    Spinner color;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        FIOView = findViewById(R.id.IdFIO);
        ageView = findViewById(R.id.Idage);
        HeightView = findViewById(R.id.Idheight);
        WeightView = findViewById(R.id.IdWeight);
        GenderView = findViewById(R.id.radioGroup);

        Button saveBtn = findViewById(R.id.SaveText);
        saveBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String [] arr = getResources().getStringArray(R.array.ColorHair);
                //Toolbar toolbar = findViewById(R.id.toolbar);

                gender = findViewById(GenderView.getCheckedRadioButtonId());

                color = findViewById(R.id.IdColorHair);
                String text = arr[color.getSelectedItemPosition()];
                int Age = Integer.parseInt(ageView.getText().toString());
                String genderStr =  gender.getText().toString();
                user = new User (FIOView.getText().toString(), Age, HeightView.getText().toString(), WeightView.getText().toString(), text, gender.getText().toString()  );

                Intent intent = new Intent(getApplicationContext(),MainActivity2.class);
                startActivity(intent);
            }
        });
        Button NextBtn = findViewById(R.id.Next);
        NextBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(),MainActivity2.class);
                startActivity(intent);
            }
        });

        Button AddBtn = findViewById(R.id.AddBtn);
        AddBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String [] arr = getResources().getStringArray(R.array.ColorHair);
                //Toolbar toolbar = findViewById(R.id.toolbar);

                gender = findViewById(GenderView.getCheckedRadioButtonId());

                color = findViewById(R.id.IdColorHair);
                String text = arr[color.getSelectedItemPosition()];
                int Age = Integer.parseInt(ageView.getText().toString());
                String genderStr =  gender.getText().toString();
                user = new User (FIOView.getText().toString(), Age, HeightView.getText().toString(), WeightView.getText().toString(), text, gender.getText().toString()  );
            }


        });


    }
}
