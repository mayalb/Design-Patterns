package Noyau;

public abstract class propositiontemplate {
    //public void repondreQuiz(){};

    public final void RepondreQuiz(Apprenant app){
       String rep= recreponse();
        ajoutreponse(rep,app);

    }

    public abstract String recreponse();
    public abstract void ajoutreponse(String rep,Apprenant app);
}

