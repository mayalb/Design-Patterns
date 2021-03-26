package Noyau;

import java.util.ArrayList;

public class QOCreator extends CreatorQuestion{
    public Question creerquestion(String question , ArrayList<Proposition> listeprop) {
        return new QO(question);

    }
}
