package com.donny.sportstatistic;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

/**
 * Created by Donny on 9/21/2016.
 */
public class DTextBox extends LinearLayout {

    private TextView tvTag, tvNum, tvUnit;

    public DTextBox(Context context, AttributeSet attrs) {
        super(context, attrs);
        View view = View.inflate(context, R.layout.control_textbox, this);
        tvTag = (TextView) view.findViewById(R.id.tag);
        tvNum = (TextView) view.findViewById(R.id.number);
        tvUnit = (TextView) view.findViewById(R.id.unit);

        TypedArray attributes = context.obtainStyledAttributes(attrs, R.styleable.textBox);
        setTag(attributes.getString(R.styleable.textBox_tag));
        setNum(attributes.getInt(R.styleable.textBox_number, 0));
        setUnit(attributes.getString(R.styleable.textBox_unit));
        // TODO Auto-generated constructor stub
    }

    public void setTag(String sTag) {
        tvTag.setText(sTag);
    }

    public void setNum(int num) {
        tvNum.setText(String.valueOf(num));
    }

    public void setUnit(String sUnit) {
        tvUnit.setText(sUnit);
    }

}