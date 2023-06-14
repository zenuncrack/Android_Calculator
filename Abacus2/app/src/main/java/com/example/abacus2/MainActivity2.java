package com.example.abacus2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {
    private final String [] BODMAS_RULE={"÷","×","\\+","-"};
    private int CURR_RULE=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);


        final TextView expression = findViewById(R.id.expressions);
        final TextView resultholder = findViewById(R.id.resultholder);

        final Button cBtn = findViewById(R.id.cBtn);
        final Button addSubbtn = findViewById(R.id.addSubBtn);
        final Button modulusBtn = findViewById(R.id.modulusBtn);
        final Button divideBtn = findViewById(R.id.divideBtn);
        final Button Btn7 = findViewById(R.id.Btn7);
        final Button Btn8 = findViewById(R.id.Btn8);
        final Button Btn9 = findViewById(R.id.Btn9);
        final Button MultiplyBtn = findViewById(R.id.MultiplyBtn);
        final Button Btn4 = findViewById(R.id.Btn4);
        final Button Btn5 = findViewById(R.id.Btn5);
        final Button Btn6 = findViewById(R.id.Btn6);
        final Button PlusBtn = findViewById(R.id.PlusBtn);
        final Button Btn1 = findViewById(R.id.Btn1);
        final Button Btn2 = findViewById(R.id.Btn2);
        final Button Btn3 = findViewById(R.id.Btn3);
        final Button SubstractBtn = findViewById(R.id.SubstractBtn);
        final Button DotBtn = findViewById(R.id.DotBtn);
        final Button Btn0 = findViewById(R.id.Btn0);
        final Button DelBtn = findViewById(R.id.DelBtn);
        final Button AnswerBtn = findViewById(R.id.AnswerBtn);

        cBtn.setOnClickListener(v -> {
            expression.setText("");
            resultholder.setText("");
        });

        addSubbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
        modulusBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

        divideBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final String expressionText=expression.getText().toString();
                if(expressionText.isEmpty()){
                    expression.setText("0÷");
                }
                else{
                    final char getLastCharacter = expressionText.charAt(expressionText.length()-1);
                    if(getLastCharacter == '+'|| getLastCharacter == '-'|| getLastCharacter == '÷'||getLastCharacter == '×'){
                        expression.setText(expressionText.substring(0,expressionText.length()-1)+"÷");
                    }
                    else{
                        expression.setText(expressionText+"÷");
                    }

                }
            }
        });

        Btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                    final String expressionText = expression.getText().toString();
                    expression.setText(expressionText+"7");
            }
        });

        Btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final String expressionText = expression.getText().toString();
                expression.setText(expressionText+"8");
            }
        });
        Btn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final String expressionText = expression.getText().toString();
                expression.setText(expressionText+"9");
            }
        });
        MultiplyBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final String expressionText=expression.getText().toString();
                if(expressionText.isEmpty()){
                    expression.setText("0×");
                }
                else{
                    final char getLastCharacter = expressionText.charAt(expressionText.length()-1);
                    if(getLastCharacter == '+'|| getLastCharacter == '-'|| getLastCharacter == '÷'||getLastCharacter == '×'){
                        expression.setText(expressionText.substring(0,expressionText.length()-1)+"×");
                    }
                    else{
                        expression.setText(expressionText+"×");
                    }

                }
            }
        });

        Btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final String expressionText = expression.getText().toString();
                expression.setText(expressionText+"4");
            }
        });
        Btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final String expressionText = expression.getText().toString();
                expression.setText(expressionText+"5");
            }
        });
        Btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final String expressionText = expression.getText().toString();
                expression.setText(expressionText+"6");
            }
        });

        PlusBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                    final String expressionText=expression.getText().toString();
                    if(expressionText.isEmpty()){
                        expression.setText("0+");
                    }
                    else{
                        final char getLastCharacter = expressionText.charAt(expressionText.length()-1);
                        if(getLastCharacter == '+'|| getLastCharacter == '-'|| getLastCharacter == '÷'||getLastCharacter == '×'){
                            expression.setText(expressionText.substring(0,expressionText.length()-1)+"+");
                        }
                        else{
                            expression.setText(expressionText+"+");
                        }

                    }
            }
        });

        Btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final String expressionText = expression.getText().toString();
                expression.setText(expressionText+"1");
            }
        });
        Btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final String expressionText = expression.getText().toString();
                expression.setText(expressionText+"2");
            }
        });

        Btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final String expressionText = expression.getText().toString();
                expression.setText(expressionText+"3");
            }
        });
        SubstractBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final String expressionText=expression.getText().toString();
                if(expressionText.isEmpty()){
                    expression.setText("0-");
                }
                else{
                    final char getLastCharacter = expressionText.charAt(expressionText.length()-1);
                    if(getLastCharacter == '+'|| getLastCharacter == '-'|| getLastCharacter == '÷'||getLastCharacter == '×'){
                        expression.setText(expressionText.substring(0,expressionText.length()-1)+"-");
                    }
                    else{
                        expression.setText(expressionText+"-");
                    }

                }
            }
        });
        DotBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final String expressionText = expression.getText().toString();
                expression.setText(expressionText+".");
            }
        });
        Btn0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final String expressionText = expression.getText().toString();
                expression.setText(expressionText+"0");
            }
        });
        DelBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final String expressionText = expression.getText().toString();
                if(!expressionText.isEmpty()){
                    expression.setText(expressionText.substring(0,expressionText.length()-1));
                }
            }
        });
        AnswerBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final String expressionText = expression.getText().toString();
                if (expressionText.contains("+") || expressionText.contains("-") || expressionText.contains("÷") || expressionText.contains("×")) {
                    final char getLastCharacter = expressionText.charAt(expressionText.length() - 1);
                    if(getLastCharacter != '+'||getLastCharacter != '-'||getLastCharacter != '÷'||getLastCharacter != '×') {
                        calculateResult(expression, resultholder, expressionText);
                    }
                }
            }
        });

    }

    private void calculateResult(TextView expression, TextView resultholder, String expressionText) {

        String expressionText2= expressionText;
        while(true){
                if(CURR_RULE==2 && !expressionText2.contains("+")){
                    CURR_RULE++;
                    continue;
                }
                else if(CURR_RULE!=2&& !expressionText2.contains(BODMAS_RULE[CURR_RULE])){
                    if(CURR_RULE==3){
                        break;

                    }
                    else{
                        CURR_RULE++;
                        continue;
                    }
                }
                String [] expressionArray = expressionText2.split(BODMAS_RULE[CURR_RULE]);
                if(expressionArray.length==1||expressionArray[0].isEmpty()){
                    break;
                }
                StringBuilder firstValue = new StringBuilder();
                StringBuilder secondValue= new StringBuilder();

                for(int i=expressionArray[0].length()-1;i>=0;i--){
                    if(expressionArray[0].charAt(i)=='+'|| expressionArray[0].charAt(i)=='-'||expressionArray[0].charAt(i)=='÷'||expressionArray[0].charAt(i)=='×')
                    {
                        break;
                    }
                    else{
                        firstValue.insert(0,expressionArray[0].charAt(i));
                    }
                }
                for(int i=0;i<expressionArray[1].length();i++){
                    if(expressionArray[i].charAt(i)=='+'||expressionArray[i].charAt(i)=='-'||expressionArray[i].charAt(i)=='÷'||expressionArray[i].charAt(i)=='×'){
                        break;
                    }
                    else{
                        secondValue.append((expressionArray[i].charAt(i)));
                    }
                }
              double results;

                switch(BODMAS_RULE[CURR_RULE]){
                    case "÷":
                        results=Double.parseDouble(firstValue.toString())/Double.parseDouble(secondValue.toString());
                        break;
                    case "×":
                        results=Double.parseDouble(firstValue.toString())*Double.parseDouble(secondValue.toString());
                        break;
                    case "\\+":
                        results=Double.parseDouble(firstValue.toString())+Double.parseDouble(secondValue.toString());
                        break;
                    case "-":
                        results=Double.parseDouble(firstValue.toString())-Double.parseDouble(secondValue.toString());
                        break;
                    default:
                        results=0;
                }
                expressionText2=expressionText2.replaceFirst(firstValue+BODMAS_RULE[CURR_RULE]+secondValue,String.valueOf(results));
        }
        CURR_RULE=0;
        resultholder.setText(expressionText);
        String[] finalResultArray = expressionText2.split("\\.");
        if(finalResultArray[1].length()==1&&finalResultArray[1].equals("0")){
            expression.setText(finalResultArray[0]);
        }
        else{
            expression.setText(expressionText2);
        }


    }
}

    

