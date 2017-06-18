package com.example.shiva.tictactoe;

/**
 * Created by shiva on 6/14/2017.
 */

public class Winner {
    public int win(int r1,int r2,int r3,int c1,int c2,int c3,int d1,int d2)    {
        if(r1==1 ||r2==1||r3==1||c1==1||c2==1||c3==1||d1==1||d2==1) {
            return 1;
        }
        else if (r1==0 ||r2==0||r3==0||c1==0||c2==0||c3==0||d1==0||d2==0)   {
            return 0;
        }
        return 2;
    }
}
