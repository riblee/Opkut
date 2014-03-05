package model;

/**
 * Created by riblee on 2014.03.05..
 */
public class Matrix {
    private int sor;
    private int oszlop;
    private int[] bazisIndex;
    private int[] dontesiIndex;
    private Egyenlet[] egyenletek;
    private Egyenlet celfuggveny;

    public Matrix(int sor, int oszlop, Egyenlet[] egyenletek, Egyenlet celfuggveny) {
        this.sor = sor;
        this.oszlop = oszlop;
        this.egyenletek = egyenletek;
        this.celfuggveny = celfuggveny;
    }

    public void setBazisIndex(int[] bazisIndex) {
        this.bazisIndex = bazisIndex;
    }

    public void setDontesiIndex(int[] dontesiIndex) {
        this.dontesiIndex = dontesiIndex;
    }

    public void setEgyenletek(Egyenlet[] egyenletek) {
        this.egyenletek = egyenletek;
    }

    public void setCelfuggveny(Egyenlet celfuggveny) {
        this.celfuggveny = celfuggveny;
    }

    public int getSor() {

        return sor;
    }

    public int getOszlop() {
        return oszlop;
    }

    public int[] getBazisIndex() {
        return bazisIndex;
    }

    public int[] getDontesiIndex() {
        return dontesiIndex;
    }

    public Egyenlet[] getEgyenletek() {
        return egyenletek;
    }

    public Egyenlet getCelfuggveny() {
        return celfuggveny;
    }
}
