package com.example.laba2;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class UserAdapter extends ArrayAdapter<User> {

    private LayoutInflater inflater;
    private int layout;
    private List<User> states;

    public UserAdapter(Context context, int resource, List<User> states) {
        super(context, resource, states);
        this.states = states;
        this.layout = resource;
        this.inflater = LayoutInflater.from(context);
    }

    public View getView(int position, View convertView, ViewGroup parent) {

        View view = inflater.inflate(this.layout, parent, false);


        TextView FIOView = view.findViewById(R.id.name);
        TextView agelView = view.findViewById(R.id.age);
        TextView HeigthView = view.findViewById(R.id.Heigth);
        TextView WeigthView = view.findViewById(R.id.Weigth);
        TextView ColorView = view.findViewById(R.id.Color);
        TextView GenderlView = view.findViewById(R.id.Gender);

        User state = states.get(position);


        FIOView.setText(state.getFIO());
        agelView.setText(Integer.toString(state.getage()));
        HeigthView.setText(state.getHeigth());
        WeigthView.setText(state.getWeight());
        ColorView.setText(state.getColorHair());
        GenderlView.setText(state.getGender());


        return view;
    }
}
