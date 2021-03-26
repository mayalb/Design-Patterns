package Noyau;
import java.util.*;
public class QCU extends Question {
    private String question;
    private ArrayList<Proposition> PropositionQCU;

    public String getQuestion() {
        return question;
    }
    public QCU(){}
    public QCU(DisplayQuestion dispqo,String title){
        super(dispqo,title);


    }

    public QCU(String question, ArrayList<Proposition> PropositionQCU) {
        this.question=question;
        this.PropositionQCU= PropositionQCU;
    }

    public int evaluation(String question, int evaluation) {
        return evaluation;
    }

    void ajouterQuestion(String question, String type) {
    } //red

    void supprimerQuestion(String question, String type) {
    } //red

    void changerQuestion(String question1, String question2, String type) {
    } //red


    public ArrayList<Proposition> getPropositionQCU() {
        return PropositionQCU;
    }

    @Override
    public void afficherQuestionbridge(String title,ArrayList<Proposition> PropositionQCU) {
        displayQuestion.afficher(title,PropositionQCU);

    }

    @Override
    public void afficherQuestion (){
        System.out.println("lE TYPE est QCU");
        System.out.println("la question :"+question);
        if ( PropositionQCU!= null) {
            for ( int i=0;i<this.PropositionQCU.size();i++) {
                System.out.println(PropositionQCU.get(i).getProposition());
            }
        }

    }
}

