package App.Classes;

public class Strategie {
    private String pneuri = "";
    private double combustibil = 0.0;

    public Strategie(String pneuri, double combustibil) {
        this.pneuri = pneuri;
        this.combustibil = combustibil;
    }

    public double getCombustibil() {
        return combustibil;
    }

    public void setCombustibil(double combustibil) {
        this.combustibil = combustibil;
    }

    public String getPneuri() {
        return pneuri;
    }

    public void setPneuri(String pneuri) {
        this.pneuri = pneuri;
    }
    public void cursa(int laps, int vreme)
    {

        switch (vreme){
            case 1:
                if(laps<=15)
                {
                    setCombustibil(laps+0.5);
                    setPneuri("soft");
                    break;
                }
                else if(laps>15 || laps<=30){
                    setCombustibil(laps+0.5);
                    setPneuri("medium");
                    break;
                }
                else if(laps>30)
                {
                    setCombustibil(laps+0.5);
                    setPneuri("hard");
                    break;
                }
            case 2:
                if(laps<=30){
                    setPneuri("intermidiants");
                    setCombustibil(laps);
                    break;
                }
                else if(laps>30)
                {
                    setPneuri("inermidiants+inermidiants");
                    setCombustibil(laps);
                    break;
                }
            case 3:
                setCombustibil(laps-0.5);
                setPneuri("wets");
                break;

        }

    }
    public String toString(){
        return "recomandam sa utilizati urmatoarele cauciucuri: "+pneuri+" si uramtoare cantitate de combustibil: "+combustibil;
    }

}
