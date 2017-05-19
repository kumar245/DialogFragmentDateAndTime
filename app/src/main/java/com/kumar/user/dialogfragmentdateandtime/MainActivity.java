package com.kumar.user.dialogfragmentdateandtime;

import android.app.FragmentManager;
import android.content.DialogInterface;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button b1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        b1= (Button) findViewById(R.id.button3);
    }
    public void setTime(String Time){
        Toast.makeText(this, Time, Toast.LENGTH_LONG).show();
    }

    public void tShow(View view) {
        FragmentManager fragmentManager=getFragmentManager();
        timePop tp=new timePop();
        tp.show(fragmentManager,"Show Fragment");
    }

    public void setDate(String Date) {
        Toast.makeText(this, Date, Toast.LENGTH_SHORT).show();
    }

    public void dpShow(View view) {
        FragmentManager fragmentManager1=getFragmentManager();
        datePop dp=new datePop();
        dp.show(fragmentManager1,"show Fragment");
    }

    public void AlDialogue(View view) {
        AlertDialog.Builder alertDialog= new AlertDialog.Builder(this);
        alertDialog.setMessage("Are you sure you want to delete")
                    .setTitle("Confirmation")
                    .setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            Toast.makeText(MainActivity.this, "It's Deleted", Toast.LENGTH_SHORT).show();
                        }
                    })
        .setNegativeButton("NO", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                Toast.makeText(MainActivity.this, "It's not Deleted", Toast.LENGTH_SHORT).show();
            }
        }).show();

    }
}
