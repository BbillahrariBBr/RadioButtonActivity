package com.example.alliance.radiobuttonactivity;

import android.content.Intent;
import android.support.annotation.IdRes;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.ButtonBarLayout;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;

public class MainActivity extends AppCompatActivity {

    RadioButton rmale;
    RadioButton rfemale;
    RadioButton rchild;

    Button btnNext;
    RadioGroup rgroup;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        rmale = (RadioButton) findViewById(R.id.male);
        rfemale = (RadioButton) findViewById(R.id.female);
        rchild = (RadioButton) findViewById(R.id.children);

        btnNext = (Button) findViewById(R.id.buttonNext);
        rgroup = (RadioGroup) findViewById(R.id.radiogroup);

        rgroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, @IdRes int i) {

                btnNext.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        if(rmale.isChecked()){
                            Intent mIntent = new Intent(MainActivity.this,MaleFemale.class);
                            startActivity(mIntent);
                        }
                        if(rfemale.isChecked()){
                            Intent FIntent = new Intent(MainActivity.this,MaleFemale.class);
                            startActivity(FIntent);
                        }

                        if(rchild.isChecked()){
                            Intent chIntent = new Intent(MainActivity.this,Childeren.class);
                            startActivity(chIntent);
                        }
                    }
                });
            }
        });


    }

//    public void BttnOnclick(View view){
//        if (view.getId()==R.id.radiogroup){
//            if((rmale.isChecked()) || (rfemale.isChecked())){
//                Intent FmIntent = new Intent(MainActivity.this,MaleFemale.class);
//                startActivity(FmIntent);
//            }
//
//            if(view.getId()==R.id.children){
//                Intent chIntent = new Intent(MainActivity.this,Childeren.class);
//                startActivity(chIntent);
//            }
//        }
//    }


}
