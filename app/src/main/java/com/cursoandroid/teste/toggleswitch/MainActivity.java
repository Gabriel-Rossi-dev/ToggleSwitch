package com.cursoandroid.teste.toggleswitch;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.ToggleButton;

public class MainActivity extends AppCompatActivity {

    private ToggleButton togglePassword;
    private Switch switchPassword;
    private TextView textResult;
    private RadioButton radioH, radioM, radioNb;
    private CheckBox checkMail;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        togglePassword = findViewById(R.id.togglePassword);
        switchPassword = findViewById(R.id.switchPassword);
        textResult = findViewById(R.id.textResult);
        radioH = findViewById(R.id.radioH);
        radioM = findViewById(R.id.radioM);
        radioNb = findViewById(R.id.radioNb);
        checkMail = findViewById(R.id.checkMail);
        addListener();

    }


    public void addListener(){

        togglePassword.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if (b){
                    textResult.setText("Toggle ligado");
                }else{
                textResult.setText("Toggle desligado");
            }
            }
        });

        switchPassword.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if (b){
                    textResult.setText("Switch ligado");
                }else {
                    textResult.setText("Switch desligado");
                }
            }
        });

        radioH.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if (b){
                    textResult.setText("Homem selecionado");
                }
            }
        });

        radioM.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if (b){
                    textResult.setText("Mulher selecionado");
                }
            }
        });

        radioNb.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if(b){
                    textResult.setText("Não binário selecionado");
                }
            }
        });

        checkMail.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if(b){
                    textResult.setText("Receberá e-mails");
                }else{
                    textResult.setText("Não receberá e-mails");
                }
            }
        });

    }

    public void send (View view){

        /*if(togglePassword.isChecked()){
            textResult.setText("Toggle ligado");
        }else{
            textResult.setText("Toggle desligado");
        }

         */

        /*if (switchPassword.isChecked()){
            textResult.setText("Switch ligado");
        }else {
            textResult.setText("Switch desligado");
        }

         */
        if (radioH.isChecked()){
            textResult.setText("Masculino Selecionado");
        }else if (radioM.isChecked()){
            textResult.setText("Feminino selecionado");
        }else if (radioNb.isChecked()){
            textResult.setText("Não binário selecionado");
        }else {
            textResult.setText("Selecione um gênero");
        }

        if(checkMail.isChecked()){
            textResult.setText("Você receberá e-mails");
        }else{
            textResult.setText("Você não receberá e-mails");
        }
    }

    }

