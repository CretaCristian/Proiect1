package App.Classes;

import java.util.Random;
import App.Interfaces.Imasina;

public class Mercedes extends Strategie implements Imasina  {
    private String pneuri="";
    private double lapTime=0.0;
    private String nume_circuit="";
    Random rnd=new Random();
    public Mercedes(String pneuri,double lapTime,String nume_circuit){
        super("",0.0);
        this.pneuri=pneuri;
        this.lapTime=lapTime;
        this.nume_circuit=nume_circuit;

    }

    public void setPneuri(String pneuri) {
        this.pneuri = pneuri;
    }

    public void setLapTime(double lapTime) {
        this.lapTime = lapTime;
    }


    public String getPneuri() {
        return pneuri;
    }

    public double getLapTime() {
        return lapTime;
    }


    @Override
    public String getNume_circuit() {
        return nume_circuit;
    }

    @Override
    public double lapTime() {
        this.lapTime=super.lapTimePneuri()+rnd.nextDouble(0.1);
        return this.lapTime;
    }


    @Override
    public void pneuri(String x) {
        super.setPneuri(x);

    }

    @Override
    public void selectCircuit(String x) {
        super.setNume_circuit(x);
    }

}
