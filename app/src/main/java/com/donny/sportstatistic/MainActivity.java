package com.donny.sportstatistic;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView tb_steps;
    private DTextBox tbCalorie, tbDistance;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tb_steps = (TextView) findViewById(R.id.tb_steps);
        tbCalorie = (DTextBox) findViewById(R.id.tb_calorie);
        tbDistance = (DTextBox) findViewById(R.id.tb_distance);

        RadioButton rb_today = (RadioButton)findViewById(R.id.rb_today);
        rb_today.setChecked(true);

        setTitle("今日运动情况");
    }

}
