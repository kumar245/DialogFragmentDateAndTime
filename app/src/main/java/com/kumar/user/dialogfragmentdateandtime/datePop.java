package com.kumar.user.dialogfragmentdateandtime;

import android.app.DialogFragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.DatePicker;

/**
 * Created by User on 5/19/2017.
 */

public class datePop extends DialogFragment implements View.OnClickListener {
    DatePicker datePicker;
    Button button1;
    View view;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        view=inflater.inflate(R.layout.pop_date,container,false);
        datePicker= (DatePicker) view.findViewById(R.id.dp1);
        button1= (Button) view.findViewById(R.id.dpButton);
        button1.setOnClickListener(this);
        return view;
    }

    @Override
    public void onClick(View v) {
    this.dismiss();
        String dateOn=datePicker.getYear()+"-"+datePicker.getMonth()+"-"+datePicker.getDayOfMonth();
        MainActivity mainActivity= (MainActivity) getActivity();
        mainActivity.setDate(dateOn);
    }
}
