package com.impirobotics.frc2014;

import com.sun.squawk.util.MathUtils;

public class ImpiLib {
    public static double clamp(double value, double min, double max) {
        if (value < min)
            return min;
        else if (value > max)
            return max;
        return value;
    }
    
    public static double deadzone(double inputValue, double deadzone) {
        if (Math.abs(inputValue) < deadzone) {
            return 0.0;
        }
        return inputValue;
    }

    public static double signedSquare(double inputValue) {
        return Math.abs(inputValue)*inputValue;
    }
}
