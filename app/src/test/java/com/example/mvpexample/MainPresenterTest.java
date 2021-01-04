package com.example.mvpexample;

import com.example.mvpexample.Main.MainContract;
import com.example.mvpexample.Main.MainPresenter;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

public class MainPresenterTest {

    MainPresenter presenter;
    MainContract.View view;

    @Before
    public void setUp(){
        view = Mockito.mock(MainContract.View.class);
        presenter = new MainPresenter(view);
    }

    @Test
    public void calc() {
        presenter.calc(3,5,'+');    //3 + 5를 실행
        Mockito.verify(view).setCalcResult(8);   //view의 setCalcResult(8)이 실행되었는지 검증
    }
}