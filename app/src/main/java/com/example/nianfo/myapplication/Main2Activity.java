package com.example.nianfo.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity implements View.OnClickListener {
    Button valide;
    TextView editTextName;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        init();
    }
    public void init() {
        valide = findViewById(R.id.valide);
        editTextName = findViewById(R.id.editText_saisie);
        valide.setOnClickListener(this);
    }
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.valide:
                saveData();
                break;
        }
    }
    public void saveData(){
        //Intent intent = new Intent();
        //intent.putExtra("text_saisie",editTextName.getText().toString());
       // setResult(RESULT_OK, intent);
        String name = editTextName.getText().toString();
        if(!name.isEmpty()){
            DataManager.getInstance().addName(name);
        }

        finish();
    }
}
