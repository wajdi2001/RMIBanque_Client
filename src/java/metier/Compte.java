package java.metier;

import java.io.Serializable;
import java.util.Date;

public class Compte implements Serializable {
    int code ;
    double solde;
    Date dateCreation =new Date();

    public Compte(int code, double solde) {
        this.code = code;
        this.solde = solde;

    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public double getSolde() {
        return solde;
    }

    public void setSolde(double solde) {
        this.solde = solde;
    }

    public Date getDateCreation() {
        return dateCreation;
    }

    public void setDateCreation(Date dateCreation) {
        this.dateCreation = dateCreation;
    }
}
