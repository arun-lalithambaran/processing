package com.neptune;

import processing.core.PApplet;

public class Main extends PApplet {

    public static PApplet processing;

    Ball ball;

    @Override
    public void settings() {
        processing = this;
        size(1024, 700);
    }

    @Override
    public void setup() {
        background(250, 250, 250);
        ball = new Ball();
    }

    @Override
    public void draw() {

        ball.update();
    }

    public static void main(String[] args) {
        String[] processingArgs = {"MySketch"};
        Main mySketch = new Main();
        PApplet.runSketch(processingArgs, mySketch);
    }
}
