package App.Classes;

public class Circuit {
    private int laps=0;
    private int vreme= 0;
    public Circuit(int laps, int vreme){
        this.laps= laps;
        this.vreme= vreme;
    }

    public int getLaps() {
        return laps;
    }

    public void setLaps(int laps) {
        this.laps = laps;
    }

    public int getVreme() {

        return vreme;
    }

    public void setVreme(int vreme) {
        this.vreme = vreme;
    }

    public String toString() {
        if (vreme==1){
            return "vremea este de cauciucuri de uscat";
        }
        else if(vreme==2){
            return "vremea este de cauciucuri intermediare";
        }
        else if(vreme==3){
            return "vremea este de cauciucuri de umed";
        }
        return ".";
    }
}
