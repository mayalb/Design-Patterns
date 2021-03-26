package Noyau;

import java.util.ArrayList;

public class QCMCreator extends CreatorQuestion{

    public Question creerquestion(String question , ArrayList<Proposition> listeprop) {
        return new QCM(question,listeprop);
    }
}
