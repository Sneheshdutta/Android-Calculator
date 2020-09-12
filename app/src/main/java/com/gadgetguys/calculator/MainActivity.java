package com.gadgetguys.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button btn1,btn2,btn3,btn4,btn5,btn6,btn7,btn8,btn9,btn0,btnDot;
    Button btnAdd,btnSub,btnMul,btnDiv,btnEqual;
    Button btnClear;
    EditText ed1,ed2,ed3;
    int x;
    float Res1,Res2;
    boolean Add,Sub,Mul,Div,copy;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn0=(Button)findViewById(R.id.btn0);
        btn1=(Button)findViewById(R.id.btn1);
        btn2=(Button)findViewById(R.id.btn2);
        btn3=(Button)findViewById(R.id.btn3);
        btn4=(Button)findViewById(R.id.btn4);
        btn5=(Button)findViewById(R.id.btn5);
        btn6=(Button)findViewById(R.id.btn6);
        btn7=(Button)findViewById(R.id.btn7);
        btn8=(Button)findViewById(R.id.btn8);
        btn9=(Button)findViewById(R.id.btn9);
        btnAdd=(Button)findViewById(R.id.btnAdd);
        btnSub=(Button)findViewById(R.id.btnSub);
        btnMul=(Button)findViewById(R.id.btnMul);
        btnDiv=(Button)findViewById(R.id.btnDiv);
        btnDot=(Button)findViewById(R.id.btnDot);
        btnClear=(Button)findViewById(R.id.btnClear);
        btnEqual=(Button)findViewById(R.id.btnEqual);
        ed1=(EditText)findViewById(R.id.ed1);
        ed2=(EditText)findViewById(R.id.ed2);
        ed3=(EditText)findViewById(R.id.ed3);
        x=Integer.parseInt("0");
        ed1.setText(x+"");
        ed2.setText(null);
        ed3.setText(null);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ed1.setText(ed1.getText()+"1");
            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ed1.setText(ed1.getText()+"2");
            }
        });
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ed1.setText(ed1.getText()+"3");
            }
        });
        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ed1.setText(ed1.getText()+"4");
            }
        });
        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ed1.setText(ed1.getText()+"5");
            }
        });
        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ed1.setText(ed1.getText()+"6");
            }
        });
        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ed1.setText(ed1.getText()+"7");
            }
        });
        btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ed1.setText(ed1.getText()+"8");
            }
        });
        btn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ed1.setText(ed1.getText()+"9");
            }
        });
        btnDot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ed1.setText(ed1.getText()+".");
            }
        });
        btn0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ed1.setText(ed1.getText()+"0");
            }
        });


        btnAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(ed1.length()==0){
                    ed1.setText(x+"");
                }
                else{
                    if(copy==true){
                        ed3.setText(ed2.getText()+"+");
                        Res1=Float.parseFloat(ed2.getText()+"");
                        ed1.setText(x+"");
                        Add=true;
                        copy=false;
                    }
                    else {
                        Res1 = Float.parseFloat(ed1.getText() + "");
                        Add = true;
                        ed3.setText(ed1.getText() + "+");
                        ed1.setText(x+"");
                    }
                }
            }
        });
        btnSub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(ed1.length()==0){
                    ed1.setText(x+"");;
                }
                else{
                    if(copy==true){
                        ed3.setText(ed2.getText()+"-");
                        Res1=Float.parseFloat(ed2.getText()+"");
                        ed1.setText(x+"");
                        Sub=true;
                        copy=false;
                    }
                    else {
                        Res1 = Float.parseFloat(ed1.getText() + "");
                        Sub = true;
                        ed3.setText(ed1.getText() + "-");
                        ed1.setText(x+"");
                    }
                }
            }
        });
        btnMul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(ed1.length()==0){
                    ed1.setText(x+"");
                }
                else{
                    if(copy==true){
                        ed3.setText(ed2.getText()+"*");
                        Res1=Float.parseFloat(ed2.getText()+"");
                        ed1.setText(x+"");
                        Mul=true;
                        copy=false;
                    }
                    else {
                        Res1 = Float.parseFloat(ed1.getText() + "");
                        Mul = true;
                        ed3.setText(ed1.getText() + "*");
                        ed1.setText(x+"");
                    }
                }
            }
        });
        btnDiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(ed1.length()==0){
                    ed1.setText(x+"");
                }
                else{
                    if(copy==true){
                        ed3.setText(ed2.getText()+"/");
                        Res1=Float.parseFloat(ed2.getText()+"");
                        ed1.setText(x+"");
                        Div=true;
                        copy=false;
                    }
                    else {
                        Res1 = Float.parseFloat(ed1.getText() + "");
                        Div = true;
                        ed3.setText(ed1.getText() + "/");
                        ed1.setText(x+"");
                    }
                }
            }
        });
        btnEqual.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(Add==true){
                    Res2=Float.parseFloat(ed1.getText()+"");
                    ed2.setText(Res1+Res2+"");
                    Add=false;
                    copy=true;
                }
                if(Sub==true){
                    Res2=Float.parseFloat(ed1.getText()+"");
                    ed2.setText(Res1-Res2+"");
                    Sub=false;
                    copy=true;
                }
                if(Mul==true){
                    Res2=Float.parseFloat(ed1.getText()+"");
                    ed2.setText(Res1*Res2+"");
                    Mul=false;
                    copy=true;
                }
                if(Div==true){
                    Res2=Float.parseFloat(ed1.getText()+"");
                    ed2.setText(Res1/Res2+"");
                    Div=false;
                    copy=true;
                }
            }
        });
        btnClear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ed1.setText(x+"");
                ed2.setText(null);
                ed3.setText(null);
            }
        });
    }
}
