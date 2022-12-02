package org.example;

public class Measurement {
    private Sensor sensor;
    private double value;
    private boolean raining;

    public Measurement(Sensor sensor, double value, boolean raining) {
        this.sensor = sensor;
        this.value = value;
        this.raining = raining;
    }

    public Sensor getSensor() {
        return sensor;
    }

    public void setSensor(Sensor sensor) {
        this.sensor = sensor;
    }

    public double getValue() {
        return value;
    }

    public void setValue(double value) {
        this.value = value;
    }

    public boolean isRaining() {
        return raining;
    }

    public void setRaining(boolean raining) {
        this.raining = raining;
    }
}
