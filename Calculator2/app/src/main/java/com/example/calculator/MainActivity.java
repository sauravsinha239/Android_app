package com.example.calculator;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import org.mozilla.javascript.Context;
import org.mozilla.javascript.Scriptable;

import androidx.appcompat.app.AppCompatActivity;
import com.google.android.material.button.MaterialButton;

import javax.xml.transform.SourceLocator;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    TextView resultTv, SoultionTv;
    MaterialButton C,RP,LP,Div;
    MaterialButton Seven,Eight,Nine,Star;
    MaterialButton Six,FIve,Four,Plus;
    MaterialButton Three,Two,One,Minus;
    MaterialButton AC,Zero,Dot,Equal;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        resultTv=findViewById(R.id.resultTv);
        SoultionTv=findViewById(R.id.SolutionTv);

        /*
        Assigning the id of All buttons
         */
        AssignId(C,R.id.Clear);
        AssignId(Div,R.id.Div);
        AssignId(Star,R.id.multiply);
        AssignId(Plus,R.id.Plus);
        AssignId(Minus,R.id.Minus);
        AssignId(LP,R.id.LP);
        AssignId(RP,R.id.RP);
        AssignId(AC,R.id.AC);
        AssignId(Dot,R.id.DOT);
        AssignId(Zero,R.id.Zero);
        AssignId(One,R.id.One);
        AssignId(Two,R.id.Two);
        AssignId(Three,R.id.Three);
        AssignId(Four,R.id.Four);
        AssignId(FIve,R.id.Five);
        AssignId(Six,R.id.SIx);
        AssignId(Seven,R.id.Seven);
        AssignId(Eight,R.id.Eight);
        AssignId(Nine,R.id.Nine);
        AssignId(Equal,R.id.Equal);

    }
    void AssignId(MaterialButton btn, int id)
    {
        btn = findViewById(id);
        btn.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {

        MaterialButton button =(MaterialButton) v;
        String buttontext=button.getText().toString();
        String dataToCalculate=SoultionTv.getText().toString();
        if(buttontext.equals("AC"))
        {
            SoultionTv.setText("");
            resultTv.setText("0");
            return;
        }
        if(buttontext.equals("="))
        {
            SoultionTv.setText(resultTv.getText());
            return;
        }
        if (buttontext.equals("C"))
        {
            dataToCalculate=dataToCalculate.substring(0,dataToCalculate.length()-1);
        }
        else {
            dataToCalculate = dataToCalculate + buttontext;
        }
        SoultionTv.setText(dataToCalculate);
        String finalReseult = getResult(dataToCalculate);
        if(!finalReseult.equals("Err"))
        {
            resultTv.setText(finalReseult);
        }
    }
    String getResult(String data)
    {
        try {
            Context context =Context.enter();
            context.setOptimizationLevel(-1);
            Scriptable scriptable= context.initStandardObjects();

            String finalResult=  context.evaluateString(scriptable,data,"Javascript",1,null).toString();
            if( finalResult.endsWith(".0"))
            {
                finalResult=finalResult.replace(".0","");
            }
            return finalResult;
        }catch (Exception e)
        {
            return "Err";
        }
    }
}