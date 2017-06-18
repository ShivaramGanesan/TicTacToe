package com.example.shiva.tictactoe;

import android.widget.Button;

/**
 * Created by shiva on 6/14/2017.
 */

public class Test {
    public int row1(int[][] m) {
        if(m[0][0]==1 && m[0][1]==1 && m[0][2]==1)  {
            return 1;
        }
        else if(m[0][0]==0 && m[0][1]==0 && m[0][2]==0) {
            return 0;
        }
        return 2;
    }
    public int row2(int[][] m) {
        if(m[1][0]==1 && m[1][1]==1 && m[1][2]==1)  {
            return 1;
        }
        else if(m[1][0]==0 && m[1][1]==0 && m[1][2]==0) {
            return 0;
        }
        return 2;
    }
    public int row3(int[][] m) {
        if(m[2][0]==1 && m[2][1]==1 && m[2][2]==1)  {
            return 1;
        }
        else if(m[2][0]==0 && m[2][1]==0 && m[2][2]==0) {
            return 0;
        }
        return 2;
    }
    public int col1(int[][] m) {
        if(m[0][0]==1 && m[1][0]==1 && m[2][0]==1)  {
            return 1;
        }
        else if(m[0][0]==0 && m[1][0]==0 && m[2][0]==0) {
            return 0;
        }
        return 2;
    }
    public int col2(int[][] m) {
        if(m[0][1]==1 && m[1][1]==1 && m[2][1]==1)  {
            return 1;
        }
        else if(m[0][1]==0 && m[1][1]==0 && m[2][1]==0) {
            return 0;
        }
        return 2;
    }
    public int col3(int[][] m) {
        if(m[0][2]==1 && m[1][2]==1 && m[2][2]==1)  {
            return 1;
        }
        else if(m[0][2]==0 && m[1][2]==0 && m[2][2]==0) {
            return 0;
        }
        return 2;
    }
    public int diagonal1(int[][] m) {
        if(m[0][0]==1 && m[1][1]==1 && m[2][2]==1)  {
            return 1;
        }
        else if(m[0][0]==0 && m[1][1]==0 && m[2][2]==0) {
            return 0;
        }
        return 2;
    }
    public int diagonal2(int[][] m) {
        if(m[0][2]==1 && m[1][1]==1 && m[2][0]==1)  {
            return 1;
        }
        else if(m[0][2]==0 && m[1][1]==0 && m[2][0]==0) {
            return 0;
        }
        return 2;
    }
}
