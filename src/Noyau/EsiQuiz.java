package Noyau;
import java.util.*;
public class EsiQuiz {

    public static void main(String args[]) {

///---------------------- cretation des liste de propositin et de questions et la cretaion d'un quiz -----------------------------------///



      ;

        //-------------factory method---------------/
             //------Produitfactory qcm:
        CreatorQuestion produitfactoryQCM=new QCMCreator();
        CreatorQuestion produitfactoryQCU=new QCUCreator();
        CreatorQuestion produitfactoryQO=new QOCreator();

        Question qcm=new QCM();
        Question qcu=new QCU();


         System.out.println("-----------Test patron Factory Method------------- ");
        System.out.println("-----------Création des Questions type QCM,QCU,QO ------------- ");

        System.out.println("Création des Question type QCM,Veuillez introduire la question ");
        Scanner sn = new Scanner(System.in);
        String question;
        question=sn.next();
        System.out.println("Veuillez introduire la question le nombre de proposition ");
        Scanner j = new Scanner(System.in);
         int k= j.nextInt();
        ArrayList<Proposition>ListeProp1= new ArrayList<>();
        for( int i=0;i<k;i++){
            System.out.println("Veuillez proposition ");
            Scanner pn = new Scanner(System.in);
            String pro;
            pro=pn.next();
            Proposition proposition1= new Proposition(pro);

            ListeProp1.add(proposition1);
        }


        qcm =produitfactoryQCM.creerquestion(question,ListeProp1);

        System.out.println("Création des Question type QCU,Veuillez introduire la question ");
        Scanner snu = new Scanner(System.in);
        String question1;
        question1=snu.next();
        System.out.println("Veuillez introduire la question le nombre de proposition ");
        Scanner L = new Scanner(System.in);
        int d= L.nextInt();
        ArrayList<Proposition>ListeProp2= new ArrayList<>();
        for( int i=0;i<d;i++){
            System.out.println("Veuillez proposition ");
            Scanner pn = new Scanner(System.in);
            String pro;
            pro=pn.next();
            Proposition proposition2= new Proposition(pro);

            ListeProp2.add(proposition2);
        }

        //------Produitfactory qcu:
        qcu =produitfactoryQCU.creerquestion(question1,ListeProp2);

        System.out.println("Veuillez introduire une question  ouverte");
        Scanner sno = new Scanner(System.in);
        String question2;
        question2=snu.next();
        Question qo=new QO(new DisplayQO(),question2);
         qo= produitfactoryQCU.creerquestion(question2,ListeProp1);
        qcm.afficherQuestion();
          qcu.afficherQuestion();
          qo.afficherQuestion();
        System.out.println("Création des questions en utilisqnt le patron factory method est effectuée..");
         //affichage questions :

        //----------test patron bridge:
        System.out.println("-----test bridge,Nous allons afficher les questions en utilisant le test Bridge..");
        String title="question QO";

        Proposition propo= new Proposition("1er proposoition");
        ArrayList <Proposition> PropositionQO=new ArrayList<>();
        Question questionQo=new QO(new DisplayQO(),title);
        questionQo.afficherQuestionbridge(title, PropositionQO);
       ArrayList <Proposition> PropositionQO1=new ArrayList<>();
       questionQo.afficherQuestionbridge(title, PropositionQO1);
        //question qcm
        String title1="question QCM";
        Question questionQCM=new QCM(new DisplayQCM(),title1);
        Proposition propo1= new Proposition("1er proposoition QCU");
        ArrayList <Proposition> PropositionQCM=new ArrayList<>();
        PropositionQCM.add(propo1);
        questionQCM.afficherQuestionbridge(title1, PropositionQCM);

        //question qcu
        String title2="question 3 QCU";
        Question questionQCU=new QCU(new DisplayQCU(),title2);
        Proposition propo2= new Proposition("1er proposoition");
        ArrayList <Proposition> PropositionQCU=new ArrayList<>();
        PropositionQCU.add(propo2);
        questionQCU.afficherQuestionbridge(title2, PropositionQCU);









      // ------------------------Template method-------------------------------//
               //-------- ReponseQCU
        System.out.println("-----------Test patron Template Method------------- ");

        ArrayList <String> ListeRepQcu=new ArrayList<String>();
        propositiontemplate reponseqcm= new ReponseQCU("Reponse QCU");
        ArrayList<String >ReponseApprenant = new ArrayList<>();
        Apprenant app=new Apprenant("maya", "larbi", "Tizi ouzou", "17/09/1999",ReponseApprenant) ;
        reponseqcm.RepondreQuiz(app);
        System.out.println("reponse ajouté avec template methode..");

        //-------- ReponseQO
      //  String answerqo="ceci est la reponse de la question ouverte";
      //  propositiontemplate reponseqo= new ReponseQO("Reponse QO");
       // Apprenant app1=new Apprenant("safi", "rihani", "Batna", "17/09/1999",ReponseApprenant) ;
     //   reponseqo.RepondreQuiz(app1);
       // System.out.println("Reponse au Quiz en utilisant le patron template method est effectué");
        }

    }