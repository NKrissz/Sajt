package com.example.sajt;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import static android.widget.Toast.LENGTH_LONG;
import static android.widget.Toast.LENGTH_SHORT;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



//        Button btnMessage = (Button) (findViewById(R.id.btnMessage));
//        btnMessage.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {

//            }
//
//
//        });

    Button btnExit = (Button) findViewById(R.id.btnExit);
        btnExit.setOnClickListener(new View.OnClickListener() {

        @Override
        public void onClick(View v) {
            // TODO Auto-generated method stub
            finish();
            System.exit(0);
        }
    });

        Context context = getApplicationContext();
        CharSequence text = "Sajt";
        int duration = LENGTH_LONG;
        final Toast toast = Toast.makeText(context, text, duration);

    Button btnMessage = (Button) findViewById(R.id.btnMessage);
        btnMessage.setOnClickListener(new View.OnClickListener() {


//            private TextView textView;
//            private TextView fuckolor;
            private EditText favcolor;
            private TextView textout;
//public String getText()
//(
//            TextView=(TextView)findViewById(R.id.editText)
//            String txt1= TextView.getText().toString();
//            String txt2="Sajt";



            // }
            @Override
            public void onClick(View v) {
                Button button = (Button) v;
                favcolor = (EditText) findViewById(R.id.editText);
                textout = (TextView) findViewById(R.id.txtOutput);
                textout.setText (favcolor.getText());
                Context context = getApplicationContext();
                CharSequence text = "Sajt";
                int duration = LENGTH_LONG;
                Toast toast = Toast.makeText(context, text, duration);
//                final EditText editText = (EditText) findViewById(R.id.editText);
//              final String txt1= TextView.getTexttoString();
//                final     String txt2="Sajt";
//
//              if (txt1.equals(txt2))
//                {
//                    toast.show();
//                }
            }
        });
        Button button = (Button) findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                toast.show();
            }
        });

    }}
