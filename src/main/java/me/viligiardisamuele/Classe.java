package me.viligiardisamuele;

import java.util.List;

public class Classe {
    protected int numero;
    protected String sezione;
    protected String aula;
    protected List<Alunno> alunni;

    public Classe(){}

    public Classe(int numero, String sezione, String aula, List<Alunno> alunni) {
        this.numero = numero;
        this.sezione = sezione;
        this.aula = aula;
        this.alunni = alunni;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getSezione() {
        return sezione;
    }

    public void setSezione(String sezione) {
        this.sezione = sezione;
    }

    public String getAula() {
        return aula;
    }

    public void setAula(String aula) {
        this.aula = aula;
    }

    public List<Alunno> getAlunni() {
        return alunni;
    }

    public void setAlunni(List<Alunno> alunni) {
        this.alunni = alunni;
    }

}