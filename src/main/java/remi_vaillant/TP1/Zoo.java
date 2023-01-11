package remi_vaillant.TP1;

import java.util.List;

public class Zoo {
    private int visiteurs;
    private List<Secteur> secteursAnimaux;

    private int  nbvisiteursMaxParSecteur;

    public Zoo (int v,List<Secteur> sa,int nbm){
        this.visiteurs=v;
        this.secteursAnimaux=sa;
        this.nbvisiteursMaxParSecteur=nbm;
    }

    public void ajouterSecteur(TypeAnimal t){
        secteursAnimaux.add(new Secteur(t));
    }

    public void nouveauVisiteur(){
        if (visiteurs<this.getLimiteVisiteur())visiteurs+=1;
        else throw LimiteVisiteurException;
    }

    public int getLimiteVisiteur(){
        return secteursAnimaux.size()*nbvisiteursMaxParSecteur;
    }

    public int nombreAnimaux(){
        int maxAnim=0;
        for(int i=0;i< secteursAnimaux.size();i++){
            maxAnim+=secteursAnimaux.get(i).getNombreAnimaux();
        }
        return maxAnim;
    }
}
