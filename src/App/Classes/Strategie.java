package App.Classes;

public class Strategie extends Circuit{
    private String pneuri="";
    private double lapTime=0.0;
    private int x=0;
    public Strategie(String pneuri, double lapTime){
        super("",0.0);
        this.lapTime=lapTime;
        this.pneuri=pneuri;
    }

    public String getPneuri() {
        return pneuri;
    }

    public void setPneuri(String pneuri) {
        this.pneuri = pneuri;
    }

    public double lapTimePneuri(){
        if("Soft".equals(pneuri)){
            x=1;
        }
        else if("Medium".equals(pneuri)){
            x=2;
        }
        else if("Hard".equals(pneuri)){
            x=3;
        }
        switch(x){
            case 1:
                this.lapTime=super.timeLapCircuit();
                break;
            case 2:
                this.lapTime=super.timeLapCircuit()+1.5;
                break;
            case 3:
                this.lapTime=super.timeLapCircuit()+2.2;
                break;
        }
        return this.lapTime;
    }

}
