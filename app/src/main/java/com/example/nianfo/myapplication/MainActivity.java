package com.example.nianfo.myapplication;

import android.content.Intent;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    Button edit;
    private RecyclerView recyclerView;
    NameListAdapter nameListAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        nameListAdapter = new NameListAdapter();
        init();
        iniList();
    }

    public void init() {
        edit = findViewById(R.id.edit_b);
        recyclerView = findViewById(R.id.main_recyleview);
        edit.setOnClickListener(this);
    }
    private void iniList(){
        final LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
        linearLayoutManager.setOrientation(LinearLayoutManager.VERTICAL);
        recyclerView.setLayoutManager(linearLayoutManager);
        recyclerView.setAdapter(nameListAdapter);
    }
   /* @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data){
        super.onActivityResult(requestCode,resultCode,data);
        if(requestCode==1){
            if(resultCode==RESULT_OK && data.getExtras()!=null){
                Bundle args = data.getExtras();
                String textname = args.getString("text_saisie");
                textName.setText(textname);
            }else{

            }
        }

    }*/

   protected void onResume(){
       super.onResume();
       nameListAdapter.updateData(DataManager.getInstance().getNameList());

   }
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.edit_b:
                Intent intent = new Intent(this,Main2Activity.class);
                startActivity(intent);
                break;
        }
    }
}
