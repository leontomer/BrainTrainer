package com.leont.braintrainer;

import android.os.CountDownTimer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    int c1;
    int c2;
    int s1;
    int s2;
public void start(View v){
    s1=0;
    s2=0;
    Button pa=findViewById(R.id.playagain);
    pa.setVisibility(View.INVISIBLE);
    Button go=findViewById(R.id.go);
    go.setVisibility(View.INVISIBLE);
    Button b=findViewById(R.id.button1);
    Button b2=findViewById(R.id.button2);
    Button b3=findViewById(R.id.button3);
    Button b4=findViewById(R.id.button4);
    TextView v1=findViewById(R.id.calc);
    TextView v2=findViewById(R.id.score);
    TextView v3=findViewById(R.id.answer);
    v3.setText("");
   final TextView v4=findViewById(R.id.timer);
    v2.setText(s1+"/"+s2);
    Random rand = new Random();


    int n1= rand.nextInt(199);
    int n2= rand.nextInt(199);
    int n3= rand.nextInt(199);
    c1= rand.nextInt(100);
    c2= rand.nextInt(100);
    int botsel=rand.nextInt(4);
    if (botsel==0){
        b.setText(String.valueOf(c1+c2));
        b2.setText(String.valueOf(n1));
        b3.setText(String.valueOf(n2));
        b4.setText(String.valueOf(n3));
    }
    else if(botsel==1) {
        b.setText(String.valueOf(n1));
        b2.setText(String.valueOf(c1+c2));
        b3.setText(String.valueOf(n2));
        b4.setText(String.valueOf(n3));
    }
    else if(botsel==2){
        b.setText(String.valueOf(n1));
        b2.setText(String.valueOf(n2));
        b3.setText(String.valueOf(c1+c2));
        b4.setText(String.valueOf(n3));
    }
    else{
        b.setText(String.valueOf(n1));
        b2.setText(String.valueOf(n2));
        b3.setText(String.valueOf(n3));
        b4.setText(String.valueOf(c1+c2));
    }




    b.setVisibility(View.VISIBLE);

    b2.setVisibility(View.VISIBLE);

    b3.setVisibility(View.VISIBLE);

    b4.setVisibility(View.VISIBLE);

    v1.setText(String.valueOf(c1)+"+"+String.valueOf(c2));
    v1.setVisibility(View.VISIBLE);

    v2.setVisibility(View.VISIBLE);

    v3.setVisibility(View.VISIBLE);

    v4.setVisibility(View.VISIBLE);
    b.setEnabled(true);

    b2.setEnabled(true);

    b3.setEnabled(true);

    b4.setEnabled(true);

    new CountDownTimer(31000,1000){
        public void onTick(long msud){

            v4.setText(String.valueOf(msud/1000+"s"));

        }

        public void onFinish(){
        TextView v=findViewById(R.id.answer);
            TextView v2=findViewById(R.id.score);
            v.setText("Your score: "+v2.getText().toString());
            Button pa=findViewById(R.id.playagain);
            pa.setVisibility(View.VISIBLE);
            Button b1=findViewById(R.id.button1);
            b1.setEnabled(false);
            Button b2=findViewById(R.id.button2);
            b2.setEnabled(false);
            Button b3=findViewById(R.id.button3);
            b3.setEnabled(false);
            Button b4=findViewById(R.id.button4);
            b4.setEnabled(false);
        }
    }.start();

}

    public void checkRes(View view){
        Button b1=(Button)view;
        TextView an=findViewById(R.id.answer);
        TextView sc=findViewById(R.id.score);
        if(Integer.parseInt(b1.getText().toString())==c1+c2) {
            s1++;
            s2++;
            an.setText("Correct!");
            sc.setText(s1+"/"+s2);
            //sc.setText(String.valueOf(Character.getNumericValue(sc.getText().charAt(0))+1)+"/"+String.valueOf(Character.getNumericValue(sc.getText().charAt(2))+1));
        }
        else {
            s2++;
            an.setText("Wrong!!");
            sc.setText(s1+"/"+s2);
          //  sc.setText(String.valueOf(Character.getNumericValue(sc.getText().charAt(0)))+"/"+String.valueOf(Character.getNumericValue(sc.getText().charAt(2))+1));
        }

        Button go=findViewById(R.id.go);
        go.setVisibility(View.INVISIBLE);
        Button b=findViewById(R.id.button1);
        Button b2=findViewById(R.id.button2);
        Button b3=findViewById(R.id.button3);
        Button b4=findViewById(R.id.button4);
        TextView v1=findViewById(R.id.calc);
        TextView v2=findViewById(R.id.score);
        TextView v3=findViewById(R.id.answer);
        final TextView v4=findViewById(R.id.timer);
        v2.setText(s1+"/"+s2);
        Random rand = new Random();

        int n1= rand.nextInt(199);
        int n2= rand.nextInt(199);
        int n3= rand.nextInt(199);
        c1= rand.nextInt(100);
        c2= rand.nextInt(100);
        int botsel=rand.nextInt(4);
        if (botsel==0){
            b.setText(String.valueOf(c1+c2));
            b2.setText(String.valueOf(n1));
            b3.setText(String.valueOf(n2));
            b4.setText(String.valueOf(n3));
        }
        else if(botsel==1) {
            b.setText(String.valueOf(n1));
            b2.setText(String.valueOf(c1+c2));
            b3.setText(String.valueOf(n2));
            b4.setText(String.valueOf(n3));
        }
        else if(botsel==2){
            b.setText(String.valueOf(n1));
            b2.setText(String.valueOf(n2));
            b3.setText(String.valueOf(c1+c2));
            b4.setText(String.valueOf(n3));
        }
        else{
            b.setText(String.valueOf(n1));
            b2.setText(String.valueOf(n2));
            b3.setText(String.valueOf(n3));
            b4.setText(String.valueOf(c1+c2));
        }




        b.setVisibility(View.VISIBLE);

        b2.setVisibility(View.VISIBLE);

        b3.setVisibility(View.VISIBLE);

        b4.setVisibility(View.VISIBLE);

        v1.setText(String.valueOf(c1)+"+"+String.valueOf(c2));
        v1.setVisibility(View.VISIBLE);

        v2.setVisibility(View.VISIBLE);

        v3.setVisibility(View.VISIBLE);

        v4.setVisibility(View.VISIBLE);    }



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
     Button    b=findViewById(R.id.button1);
        b.setVisibility(View.INVISIBLE);
        Button b2=findViewById(R.id.button2);
        b2.setVisibility(View.INVISIBLE);
        Button b3=findViewById(R.id.button3);
        b3.setVisibility(View.INVISIBLE);
        Button b4=findViewById(R.id.button4);
        b4.setVisibility(View.INVISIBLE);
        TextView v1=findViewById(R.id.calc);
        v1.setVisibility(View.INVISIBLE);
        TextView v2=findViewById(R.id.score);
        v2.setVisibility(View.INVISIBLE);
        TextView v3=findViewById(R.id.answer);
        v3.setVisibility(View.INVISIBLE);
        TextView v4=findViewById(R.id.timer);
        v4.setVisibility(View.INVISIBLE);
        Button pa=findViewById(R.id.playagain);
        pa.setVisibility(View.INVISIBLE);

    }
}
