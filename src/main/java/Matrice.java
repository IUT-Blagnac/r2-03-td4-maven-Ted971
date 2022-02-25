
public class Matrice
{    /**
    *place une étoile
     */
    public static void star(){
        System.out.print("*");
    }
    
     /**
    *deplace de un sur la droite
     */
    public static void right(){
        System.out.print(" ");
    }
     /**
    *passe à la prochaine ligne
     */
    public static void next(){
        System.out.print("\n");
    }

     /**
    *place une étoile
    *@param n le nombre d'étoiles qu'on veut placer
     */
    public static void n_star(int n){
        int i;
        for (i=0; i<n ; i=i+1)
            star();
    }

    /**
    *deplace de n sur la droite
    *@param n le nombre de fois qu'on veut se déplacer
     */
    public static void n_right(int n){
        int i;
        for (i=0; i<n ; i=i+1)
            right();
    }

    /**
    *genere un sapin plein
    *@param h la taille du sapin
     */
    public static void genererSapinPlein(int h){
        int l; int nbR=h-1; int nbS=1;
        for (l=1 ; l<=h ; l=l+1){
            n_right(nbR);
            n_star(nbS);
            nbR = nbR - 1;
            nbS = nbS + 2; 
            next();   
        }
    }

    /**
    *genere un sapin vide
    *@param h la taille du sapin
     */
    public static void genererSapinVide(int h){
        int l; int nbR=h-1; int nbS=1; int nbEspace = 1;
        n_right(nbR);
        n_star(nbS);
        next();
        nbR = nbR -1;
        for (l=2 ; l<h ; l=l+1){
            n_right(nbR);
            n_star(1);
            n_right(nbEspace);
            n_star(1);
            nbEspace = nbEspace + 2;
            nbR = nbR - 1;
            next();
        }
        nbEspace = nbEspace + 2;
        n_star(nbEspace);
    }

    /**
    * genere un String en ligne 
    *@param l c'est la taille de la ligne
    *@return une ligne de taille l
     */
    public static String genererStringLigne(int l){
        String ligne="";
        int i;
        for(i=0;i<l;i=i+1){
            ligne=ligne+("*");
        }
        ligne=ligne+("\n");
        return ligne;
    }

    /**
    *vraiment chiant mais génère un sapin couché
    *@param h un int c'est la taille de ton sapin
    *@return le sapin couché
     */
    public static String genererSapinCouche(int h){
        String sapin="";
        int i;
        for(i=0;i<h;i=i+1){
            sapin=sapin+genererStringLigne(i+1);
        }
        for(i=(h-1);i>0;i=i-1){
            sapin=sapin+genererStringLigne(i);
        }
        return sapin;
    }

    /**
    *dessine un sapin couché
    *c'est tout
    *sou-bis
    *@param args aucune idée mais sans lui tout meurs
     */
    public static void main(String[] args){
        System.out.println(genererSapinCouche(5));
        System.out.println("Ca fonctionne");
    }
}


