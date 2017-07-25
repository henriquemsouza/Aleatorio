package com.hm.souza.projeto02sleeptime;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private TextView texto1;
    private Button botao1;
    private EditText editText1;
    private EditText editText2;
    private Button calcular;
    private TextView result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        texto1=(TextView)findViewById(R.id.txt1ID);
        botao1=(Button)findViewById(R.id.btnOneID);

        editText1=(EditText)findViewById(R.id.editOneID);
        editText2=(EditText)findViewById(R.id.edit2ID);
        result=(TextView)findViewById(R.id.txtResID);

        calcular=(Button)findViewById(R.id.btnCalc);
        calcular.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                result.setText("nome"+editText1.getText()+"idade"+editText2.getText());

            }
        });

        texto1.setText("NO CLICK");

        botao1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                texto1.setText("SHORT CLICK");

            }
        });
        botao1.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                Toast.makeText(MainActivity.this,"apertou nao",Toast.LENGTH_SHORT).show();
                sharedW();
                texto1.setText("LONG CLICK WORK");
                return false;
            }
        });

    }
    public  void sharedW()
    {
        Intent share = new Intent(Intent.ACTION_SEND);
        share.setType("text/plain");
        //texto1.getText()
        share.putExtra(Intent.EXTRA_TEXT,texto1.getText() );
        startActivity(Intent.createChooser(share, "Share using"));
    }
}
