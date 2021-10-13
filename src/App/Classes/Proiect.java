package App.Classes;

import App.Classes.Strategie;

import java.util.Scanner;
public class Proiect {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        F1car carSet = new F1car("Monza",1,1);
        Strategie strategie= new Strategie("soft",10.0);
        Circuit circuit = new Circuit(10,1);
        int a=1;
        while(a==1){
            System.out.println("Meniu:\n1)Introduceti circuitul\n2)Introduceti numarul de ture\n3)Introduceti vremea\n4)Iesire");
            int b= sc.nextInt();
            switch(b){
                case 1:
                    System.out.println("Ce traseu doriti?(Monza/Monaco/Baku)");
                    String c= sc.next();
                    carSet.setNume_circuit(c);
                    carSet.setup();
                    break;
                case 2:
                    System.out.println("Cate ture doriti sa dureze cursa?");
                    int d= sc.nextInt();
                    circuit.setLaps(d);
                    break;
                case 3:
                    System.out.println("Pe ce tip de vreme doriti sa se desfasoare cursa?(1-Uscat/2-Conditii mixte/3-Umed)");
                    int e= sc.nextInt();
                    circuit.setVreme(e);
                    int g= circuit.getVreme();
                    int h= circuit.getLaps();
                    strategie.cursa(h,g);
                    break;
                case 4:
                    System.out.println("Sunteti sigura ca vreti sa iesiti?(true/false)");
                    boolean f=sc.nextBoolean();
                    if(f){
                        System.out.println(carSet.toString());
                        System.out.println(circuit.toString());
                        System.out.println(strategie.toString());
                        a=0;
                        break;
                    }
                    else{
                        break;
                    }

            }
        }
    }
}