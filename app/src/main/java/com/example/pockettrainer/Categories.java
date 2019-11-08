package com.example.pockettrainer;

import android.app.Dialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import org.w3c.dom.Text;

public class Categories extends AppCompatActivity {

    Dialog myDialog;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_categories);
        myDialog = new Dialog(this);
    }

    public void showPopup(View v) {
        myDialog.setContentView(R.layout.workout_display);
        myDialog.show();
    }

    public void removePopup(View v) {
        myDialog.dismiss();
    }
}
