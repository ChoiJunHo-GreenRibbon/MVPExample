package com.example.mvpexample;

public class MainModel {
    MainContract.Presenter presenter;

    public MainModel(MainContract.Presenter presenter){
        this.presenter = presenter;
    }

    public void saveCalcNum(int calcNum){
        //TODO 실제 데이터가 저장되는 로직
    }
}
