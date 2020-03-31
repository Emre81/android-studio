package com.javahelps.sample.calendar;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Locale;

public class MainActivity extends AppCompatActivity {





    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        TextView year = (TextView)findViewById(R.id.year);
        TextView month = (TextView)findViewById(R.id.month);
        TextView day_Int = (TextView)findViewById(R.id.day_Int);
        TextView day_Str = (TextView)findViewById(R.id.day_Str);
        final EditText edit_text = (EditText)findViewById(R.id.edit_text) ;


        Calendar cal = Calendar.getInstance();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MMMM/d/E", Locale.getDefault());

        String strDate = sdf.format(cal.getTime());

        String[] values = strDate.split("/",0);

        year.setText(values[0]);
        month.setText(values[1]);
        day_Int.setText(values[2]);
        day_Str.setText(values[3]);

        edit_text.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edit_text.setText(" ");
            }
        });


    }
}


