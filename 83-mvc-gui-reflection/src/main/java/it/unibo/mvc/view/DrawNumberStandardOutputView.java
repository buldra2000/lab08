package it.unibo.mvc.view;

import it.unibo.mvc.api.DrawNumberController;
import it.unibo.mvc.api.DrawNumberView;
import it.unibo.mvc.api.DrawResult;

public final class DrawNumberStandardOutputView implements DrawNumberView{

    @Override
    public void setController(DrawNumberController observer) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'setController'");
    }

    @Override
    public void start() {
        System.out.println("Start game");
    }

    @Override
    public void result(DrawResult res) {
        System.out.println("Result = " + res);
    }



}