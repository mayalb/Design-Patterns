package Noyau;
import java.util.*;
public class ReponseQCU extends propositiontemplate {
    private String reponse ;

    public String getReponse() {
        return reponse;
    }

    public void setReponse(String reponse) {
        this.reponse = reponse;
    }

    public ReponseQCU(String reponse )
    {
        this.reponse=reponse;

    }

    @Override
    public String recreponse() {
        Scanner sc = new Scanner(System.in);
        int i=0;
        System.out.println("Repoondre au qcu: Entrez la reponse unique  :");
        return sc.next();

    }

    @Override
    public void ajoutreponse(String rep,Apprenant apprenant) {
        ArrayList<String>repo = new ArrayList<>();
        repo.add(rep);
        apprenant.setReponseApprenant(repo);
    }




}
