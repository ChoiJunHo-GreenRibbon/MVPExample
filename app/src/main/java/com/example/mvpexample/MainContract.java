package com.example.mvpexample;

public interface MainContract {

    interface View{
        void setCalcResult(int res);
        int getFirstNum();
        int getSecondNum();
    }

    interface Presenter{
        void calc(int x, int y, char type);
    }
}
