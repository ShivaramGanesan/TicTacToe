package com.example.shiva.tictactoe;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
Button b1,b2,b3,b4,b5,b6,b7,b8,b9;
    Test check = new Test();
    TextView te;
    Winner w = new Winner();
    int s;
    int[][] m  = new int[3][3];
    int turn=0;
    int r1 = check.row1(m);
    int r2 = check.row2(m);
    int r3 = check.row3(m);
    int c1 = check.col1(m);
    int c2 = check.col2(m);
    int c3 = check.col3(m);
    int d1 = check.diagonal1(m);
    int d2 = check.diagonal2(m);
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        te = (TextView)findViewById(R.id.text) ;
        b1=(Button)findViewById(R.id.button1);b2=(Button)findViewById(R.id.button2);b3=(Button)findViewById(R.id.button3);b4=(Button)findViewById(R.id.button4);b5=(Button)findViewById(R.id.button5);b6=(Button)findViewById(R.id.button6);b7=(Button)findViewById(R.id.button7);b8=(Button)findViewById(R.id.button8);b9=(Button)findViewById(R.id.button9);
        b1.setOnClickListener(this);b2.setOnClickListener(this);b3.setOnClickListener(this);b4.setOnClickListener(this);b5.setOnClickListener(this);b6.setOnClickListener(this);b7.setOnClickListener(this);b8.setOnClickListener(this);b9.setOnClickListener(this);
        for(int l=0;l<3;l++)    {
            for(int k=0;k<3;k++)    {
                m[l][k] = 3;
                te.setText(""+m[0][1]);
            }
        }
    }


    @Override
    public void onClick(View v) {
        switch (v.getId())  {
            case R.id.button1:
                if(turn%2==0)   {
                    b1.setText("X");
                    m[0][0] = 1;

                }
                else    {
                    b1.setText("O");
                    m[0][0] = 0;
                }
                turn++;
                s= w.win(r1,r2,r3,c1,c2,c3,d1,d2);

                if(s==1)    {
                    Toast.makeText(this, "Player X wins", Toast.LENGTH_SHORT).show();
                }
                else if(s==0) {
                    Toast.makeText(this, "Player O wins", Toast.LENGTH_SHORT).show();
                }
                b1.setEnabled(false);

                    break;

            case R.id.button2:
                if(turn%2==0)   {
                    b2.setText("X");
                    m[0][1] = 1;

                }
                else    {
                    b2.setText("O");
                    m[0][1] = 0;
                }
                turn++;
                s= w.win(r1,r2,r3,c1,c2,c3,d1,d2);

                if(s==1)    {
                    Toast.makeText(this, "Player X wins", Toast.LENGTH_SHORT).show();
                }
                else if(s==0) {
                    Toast.makeText(this, "Player O wins", Toast.LENGTH_SHORT).show();
                }

                b2.setEnabled(false);
                break;
            case R.id.button3:
                if(turn%2==0)   {
                    b3.setText("X");
                    m[0][2] = 1;

                }
                else    {
                    b3.setText("O");
                    m[0][2] = 0;
                }
                turn++;
                s= w.win(r1,r2,r3,c1,c2,c3,d1,d2);

                if(s==1)    {
                    Toast.makeText(this, "Player X wins", Toast.LENGTH_SHORT).show();
                }
                else if(s==0) {
                    Toast.makeText(this, "Player O wins", Toast.LENGTH_SHORT).show();
                }
                b3.setEnabled(false);
                break;
            case R.id.button4:
                if(turn%2==0)   {
                    b4.setText("X");
                    m[1][0] = 1;

                }
                else    {
                    b4.setText("O");
                    m[1][0] = 0;
                }
                turn++;
                s= w.win(r1,r2,r3,c1,c2,c3,d1,d2);

                if(s==1)    {
                    Toast.makeText(this, "Player X wins", Toast.LENGTH_SHORT).show();
                }
                else if(s==0) {
                    Toast.makeText(this, "Player O wins", Toast.LENGTH_SHORT).show();
                }

                b4.setEnabled(false);
                break;
            case R.id.button5:
                if(turn%2==0)   {
                    b5.setText("X");
                    m[1][1] = 1;

                }
                else    {
                    b5.setText("O");
                    m[1][1] = 0;
                }
                turn++;
                s= w.win(r1,r2,r3,c1,c2,c3,d1,d2);

                if(s==1)    {
                    Toast.makeText(this, "Player X wins", Toast.LENGTH_SHORT).show();
                }
                else if(s==0) {
                    Toast.makeText(this, "Player O wins", Toast.LENGTH_SHORT).show();
                }
                b5.setEnabled(false);
                break;
            case R.id.button6:
                if(turn%2==0)   {
                    b6.setText("X");
                    m[1][2] = 1;

                }
                else    {
                    b6.setText("O");
                    m[1][2] = 0;
                }
                turn++;
                s= w.win(r1,r2,r3,c1,c2,c3,d1,d2);

                if(s==1)    {
                    Toast.makeText(this, "Player X wins", Toast.LENGTH_SHORT).show();
                }
                else if(s==0) {
                    Toast.makeText(this, "Player O wins", Toast.LENGTH_SHORT).show();
                }
                b6.setEnabled(false);
                break;
            case R.id.button7:
                if(turn%2==0)   {
                    b7.setText("X");
                    m[2][0] = 1;

                }else    {
                    b7.setText("O");
                    m[2][0] = 0;
                }
                turn++;
                s= w.win(r1,r2,r3,c1,c2,c3,d1,d2);

                if(s==1)    {
                    Toast.makeText(this, "Player X wins", Toast.LENGTH_SHORT).show();
                }
                else if(s==0) {
                    Toast.makeText(this, "Player O wins", Toast.LENGTH_SHORT).show();
                }
                b7.setEnabled(false);
                break;
            case R.id.button8:
                if(turn%2==0)   {
                    b8.setText("X");
                    m[2][1] = 1;

                }else    {
                    b8.setText("O");
                    m[2][1] = 0;
                }
                turn++;
                s= w.win(r1,r2,r3,c1,c2,c3,d1,d2);

                if(s==1)    {
                    Toast.makeText(this, "Player X wins", Toast.LENGTH_SHORT).show();
                }
                else if(s==0) {
                    Toast.makeText(this, "Player O wins", Toast.LENGTH_SHORT).show();
                }
                b8.setEnabled(false);
                break;
            case R.id.button9:
                if(turn%2==0)   {
                    b9.setText("X");
                    m[2][2] = 1;

                }else    {
                    b9.setText("O");
                    m[2][2] = 0;
                }
                turn++;

                s= w.win(r1,r2,r3,c1,c2,c3,d1,d2);

                if(s==1)    {
                    Toast.makeText(this, "Player X wins", Toast.LENGTH_SHORT).show();
                }
                else if(s==0) {
                    Toast.makeText(this, "Player O wins", Toast.LENGTH_SHORT).show();
                }
                b9.setEnabled(false);
                break;
        }
    }
}
