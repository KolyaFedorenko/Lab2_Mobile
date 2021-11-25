package com.example.laba2;

import android.content.Intent;
import android.os.Bundle;
import android.util.SparseBooleanArray;
import android.widget.ArrayAdapter;
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
        ListView UsersList;
        @Override
        public void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main2);

            // получаем элемент TextView
            TextView selection = findViewById(R.id.selection);
            // начальная инициализация списка
            setInitialData();
            // получаем элемент ListView
            UsersList = findViewById(R.id.userList);
            // создаем адаптер
            UserAdapter stateAdapter = new UserAdapter(this, R.layout.list_item, users);
            // устанавливаем адаптер
            UsersList.setAdapter(stateAdapter);
            // слушатель выбора в списке
            AdapterView.OnItemClickListener itemListener = new AdapterView.OnItemClickListener() {
                @Override
                public void onItemClick(AdapterView<?> parent, View v, int position, long id) {

                    // получаем выбранный пункт

                    User selectedState = (User)parent.getItemAtPosition(position);
                    Toast.makeText(getApplicationContext(), "Был выбран пункт " + selectedState.getFIO(),
                            Toast.LENGTH_SHORT).show();

                    Button remove = findViewById(R.id.remove);
                    remove.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            users.remove(selectedState);
                            stateAdapter.notifyDataSetChanged();
                        }
                    });
                }

            };
            UsersList.setOnItemClickListener(itemListener);



        Button prevBtn = findViewById(R.id.prevBtn2);
        prevBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(getApplicationContext(),MainActivity.class);
                startActivity(intent);
            }
        });

            }



       private void setInitialData() {

        users.add(new User(MainActivity.user.FIO, MainActivity.user.age , MainActivity.user.Height, MainActivity.user.Weight, MainActivity.user.ColorHair, MainActivity.user.Gender));

    }

}