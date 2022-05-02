package com.cursoandroid.teste.toggleswitch;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.ToggleButton;

public class MainActivity extends AppCompatActivity {


    private Switch switchPassword;
    private ToggleButton togglePassword;
    private TextView textResult;
    private CheckBox checkPassword;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        switchPassword = findViewById(R.id.switchPassword);
        togglePassword = findViewById(R.id.togglePassword);
        textResult = findViewById(R.id.textResult);
        checkPassword = findViewById(R.id.checkPassword);
        addListener();

    }

    public void addListener(){

        switchPassword.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean isChecked) {

                if ( isChecked ){
                    textResult.setText("Switch ligado");
                }else{
                    textResult.setText("Switch desligado");
                }
            }
        });

        togglePassword.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean isChecked) {

                if ( isChecked ){
                    textResult.setText("Toggle ligado");
                }else{
                    textResult.setText("Toggle desligado");
                }
            }
        });

        checkPassword.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean isChecked) {

                if ( isChecked ){
                    textResult.setText("Check ligado");
                }else{
                    textResult.setText("Check desligado");
                }
            }
        });



    }

    public void send (View view){

        if (switchPassword.isChecked()){
            textResult.setText("Check marcado");
        }else{
            textResult.setText("Check desmarcado");
        }




        if (togglePassword.isChecked()){
            textResult.setText("Botão ligado");
        }else{
            textResult.setText("Botão desligado");
        }





        if (checkPassword.isChecked()){
            textResult.setText("Check marcado");
        }else {
            textResult.setText("Check desmarcado");
        }
        
    }

}
