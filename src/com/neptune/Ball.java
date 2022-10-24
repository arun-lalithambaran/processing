package com.neptune;

import static com.neptune.Main.processing;

public class Ball {

    private long x = 100;
    private long y = 100;
    private double g = 0.001;

    Ball() {
        processing.ellipse(x, y, 100, 100);
    }
    public void update() {
        y += g;
    }
}
