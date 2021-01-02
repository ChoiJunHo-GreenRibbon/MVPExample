package com.example.mvpexample;

public class MainPresenter implements MainContract.Presenter {

    private MainContract.View view;
    private MainModel mainModel;

    MainPresenter(MainContract.View view) {
        this.view = view;
        mainModel = new MainModel(this);
    }

    @Override
    public void calc(int x, int y, char type) {
        int cal = 0;

        switch (type) {
            case '+':
                cal = x + y;
                break;
            case '-':
                cal = x - y;
                break;
        }

        view.setCalcResult(cal);
    }
}
