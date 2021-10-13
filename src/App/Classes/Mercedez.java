package App.Classes;

import App.Interfaces.Imasina;

public class Mercedez implements Imasina {
    private String pneuri;
    private double lapTime;
    private int nrLaps;

    @Override
    public double lapTime() {
        return 0;
    }

    @Override
    public String pneuri() {
        return null;
    }

    @Override
    public int nrLap() {
        return 0;
    }
}
