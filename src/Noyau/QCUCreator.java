package Noyau;

import java.util.ArrayList;

public class QCUCreator extends  CreatorQuestion{
    public Question creerquestion(String question , ArrayList<Proposition> listeprop) {
        return new QCU(question,listeprop);

    }
    }
