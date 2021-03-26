package Noyau;

import java.util.ArrayList;

public class QO extends Question {
    private String question;
    private String reponse;
         public QO(){}

    public QO(String question, String reponse) {
        this.question=question;
        this.reponse=reponse ;
    }
     public QO(DisplayQuestion dispqo,String title){
             super(dispqo,title);
           //  this.question=title;

     }
    public String getReponse() {
        return reponse;
    }

    public QO(String question) {
        this.question=question;
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

    public String getQuestion() {
        return question;
    }

    @Override
    public void afficherQuestion() {

    }

    @Override
    public void afficherQuestionbridge(String qus, ArrayList<Proposition> PropositionQCM) {


        displayQuestion.afficher(qus,PropositionQCM);



    }
}
