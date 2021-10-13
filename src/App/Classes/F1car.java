package App.Classes;

public class F1car {
    private double downforceFront = 0.0;
    private double downforceRear = 0.0;
    private String nume_circuit="";

    public F1car(String nume_circuit, double downforceFront, double downforceRear)
    {
        this.downforceFront = downforceFront;
        this.nume_circuit=nume_circuit;
        this.downforceRear = downforceRear;
    }

    public double getDownforceRear() {
        return downforceRear;
    }
    public void setDownforceRear(double downforceRear) {
        this.downforceRear = downforceRear;
    }

    public double getDownforceFront() {
        return downforceFront;
    }
    public void setDownforceFront(double downforceFront) {
        this.downforceFront = downforceFront;
    }

    public String getNume_circuit() {
        return nume_circuit;
    }

    public void setNume_circuit(String nume_circuit) {
        this.nume_circuit = nume_circuit;
    }

    public void setup(){
        int y=0;
        String nume_circuit=getNume_circuit();
        if(nume_circuit.equals("Monza")){
            y=1;
        }
        else if(nume_circuit.equals("Monaco")){
            y=2;
        }
        else if(nume_circuit.equals("Baku")){
            y=3;
        }
        else{
            System.out.println("Acest circuit nu exista:");
        }
        switch(y){
            case 1 :
                setDownforceFront(3);
                setDownforceRear(3);
                break;
            case 2:
                setDownforceFront(10);
                setDownforceRear(11);
                break;
            case 3:
                setDownforceFront(6);
                setDownforceRear(8);
                break;
            default:
                break;
        }
    }
    public String toString(){
        return " pe circuitul: "+nume_circuit+ " trebuie folosit urmatorul setup:\naripa fata: "+downforceFront+"\naripa spate: "+downforceRear;
    }
}
