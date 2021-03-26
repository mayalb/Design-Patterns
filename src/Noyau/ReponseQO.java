package Noyau;
import java.util.*;

public class ReponseQO extends propositiontemplate{
     private String reponse;

     public ReponseQO (String reponse) {
         this.reponse= reponse;

     }

    public String getReponse() {
        return reponse;
    }

    @Override
    public String recreponse() {
        Scanner sc = new Scanner(System.in);
        int i=0;
        System.out.println("Repoondre au qo: Entrez la reponse de la question ouverte ");
        return sc.next();

    }
    @Override
    public void ajoutreponse(String rep, Apprenant app) {
        app.getReponseApprenant().set(0,rep);
    }



}
