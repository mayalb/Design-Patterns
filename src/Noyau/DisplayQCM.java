package Noyau;

import java.util.ArrayList;

public class DisplayQCM implements  DisplayQuestion{
    public void afficher(String question, ArrayList<Proposition> Proposition) {

        System.out.println("la question :" +question);
        if ( Proposition!= null) {
            for ( int i=0;i<Proposition.size();i++) {
                System.out.println(Proposition.get(i).getProposition());
            }
        }

    }
}
