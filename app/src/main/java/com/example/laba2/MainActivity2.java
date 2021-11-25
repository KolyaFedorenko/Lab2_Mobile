package com.example.laba2;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ListView;
import androidx.appcompat.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Toast;
import java.util.ArrayList;

import android.widget.Button;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {

   public static ArrayList<User> users = new ArrayList<User>();
        ListView countriesList;
        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main2);
            // начальная инициализация списка
            setInitialData();
            // получаем элемент ListView
            countriesList = findViewById(R.id.countriesList);
            // создаем адаптер
            UserAdapter stateAdapter = new UserAdapter(this, R.layout.list_item, users);
            // устанавливаем адаптер
            countriesList.setAdapter(stateAdapter);
            // слушатель выбора в списке
            AdapterView.OnItemClickListener itemListener = new AdapterView.OnItemClickListener() {
                @Override
                public void onItemClick(AdapterView<?> parent, View v, int position, long id) {

                    // получаем выбранный пункт
                    User selectedState = (User)parent.getItemAtPosition(position);
                    Toast.makeText(getApplicationContext(), "Был выбран пункт " + selectedState.getFIO(),
                            Toast.LENGTH_SHORT).show();
                }
            };
            countriesList.setOnItemClickListener(itemListener);




        Button prevBtn = findViewById(R.id.prevBtn2);
        prevBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(getApplicationContext(),MainActivity.class);
                startActivity(intent);

            }


        });

        Button ViewBtn = findViewById(R.id.ViewListBtn);
        ViewBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String fio = MainActivity.user.FIO;
                TextView textView = findViewById(R.id.textView);
                textView.setText(fio);
                int age = MainActivity.user.age;
                TextView textView2 = findViewById(R.id.textView2);
                textView2.setText(Integer.toString (age));
                String height = MainActivity.user.Height;
                TextView textView3 = findViewById(R.id.textView3);
                textView3.setText(height);
                String weigth = MainActivity.user.Weight;
                TextView textView4 = findViewById(R.id.textView4);
                textView4.setText(weigth);
                String color = MainActivity.user.ColorHair;
                TextView textView5 = findViewById(R.id.textView5);
                textView5.setText(color);
                String gen = MainActivity.user.Gender;
                TextView textView6 = findViewById(R.id.textView6);
                textView6.setText(gen);


            }


        });
        }

       private void setInitialData() {

        users.add(new User(MainActivity.user.FIO, MainActivity.user.age , MainActivity.user.Height, MainActivity.user.Weight, MainActivity.user.ColorHair, MainActivity.user.Gender));

    }

}