package Noyau;
import java.util.ArrayList;
public abstract class Question {
    public String question;
    private String type ;
    private ArrayList<Proposition> ListeProp;
    protected DisplayQuestion displayQuestion; //instancier interface
    public Question(){}
    public Question(DisplayQuestion dq,String title){
        this.displayQuestion=dq;
        this.question=title;

    }

    public Question(String type, String question, ArrayList<Proposition> listeProp) {
        this.type=type;
        this.question = question;
        this.ListeProp = listeProp;
    }
    public void ajouterPropposition(Question question , Proposition proposition ){
        int i=0;
        boolean trouv = false;
        while ( i<question.ListeProp.size() )
        {
            if( question.ListeProp.get(i)!= proposition)
            {

                 i++;
            }
            else trouv = true;
        }  if (trouv = false)
        question.ListeProp.set( question.ListeProp.size()+1,proposition);

    }



    void afficherLesPropositions (String Question) {}

    abstract public void afficherQuestion ();
    abstract public void afficherQuestionbridge (String title , ArrayList <Proposition> PropositionQCM);


}

