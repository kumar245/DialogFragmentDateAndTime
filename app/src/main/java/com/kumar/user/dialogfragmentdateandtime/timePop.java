package com.kumar.user.dialogfragmentdateandtime;

import android.app.DialogFragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TimePicker;

/**
 * Created by User on 5/18/2017.
 */

public class timePop extends DialogFragment implements View.OnClickListener {
    View view;
    TimePicker timePicker;
    Button button;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        view=inflater.inflate(R.layout.pop_time,container,false);
        timePicker= (TimePicker) view.findViewById(R.id.tp);
        button= (Button) view.findViewById(R.id.b1);
        button.setOnClickListener(this);
        return view;
    }

    @Override
    public void onClick(View v) {
        this.dismiss();
        String timeOn=timePicker.getHour()+":"+timePicker.getMinute();
        MainActivity ma= (MainActivity) getActivity();
        ma.setTime(timeOn);
    }
}
