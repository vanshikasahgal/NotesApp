package com.example.android.notesapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.CalendarView;
import android.widget.TextView;

public class cal extends AppCompatActivity {

    CalendarView calendarView;
    TextView dateDisplay;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cal);
        calendarView = (CalendarView) findViewById(R.id.calendarView);
        dateDisplay = (TextView) findViewById(R.id.date_display);


        calendarView.setOnDateChangeListener(new CalendarView.OnDateChangeListener() {
            @Override
            public void onSelectedDayChange(CalendarView calendarView, int year, int month, int dayOfMonth) {
                dateDisplay.setText("Date selected: " + dayOfMonth + " - " + (month+1) + " - " + year);
            }
        });
    }


}