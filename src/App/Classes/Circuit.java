package App.Classes;

public class Circuit  {
    private double laptime=0.0;
    private String nume_circuit="";
    private int x=0;

    public Circuit(String nume_circuit, double laptime){
    this.nume_circuit=nume_circuit;
    this.laptime=laptime;

    }

    public String getNume_circuit() {
        return nume_circuit;
    }

    public void setNume_circuit(String nume_circuit) {
        this.nume_circuit = nume_circuit;
    }

    public double getLaptime() {
        return laptime;
    }

    public void setLaptime(double laptime) {
        this.laptime = laptime;
    }
    public double timeLapCircuit(){
        if("Monza".equals(nume_circuit)){
            x=1;
        }
        else if("Austria".equals(nume_circuit)){
            x=2;
        }
        else if("Monaco".equals(nume_circuit)){
            x=3;
        }
        switch (x){
            case 1:
                setLaptime(1.20);
                break;
            case 2:
                setLaptime(1.06);
                break;
            case 3:
                setLaptime(1.15);
                break;
        }
        return laptime;
    }
}

