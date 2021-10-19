package App.Classes;

public class Driver {
    private String nume="";
    private String prenume="";
    private String masina="";
    private double lapTime=0.0;
    public Driver(String nume, String prenume, String masina, double lapTime){
        this.nume=nume;
        this.prenume=prenume;
        this.masina=masina;
        this.lapTime=lapTime;
    }

    public void setLapTime(double lapTime) {
        this.lapTime = lapTime;
    }

    public double getLapTime() {
        return lapTime;
    }

    public String getMasina() {
        return masina;
    }

    public String getNume() {
        return nume;
    }

    public String getPrenume() {
        return prenume;
    }

    @Override
    public String toString() {
        return prenume+" "+nume+" "+masina+" :"+lapTime;
    }
}
