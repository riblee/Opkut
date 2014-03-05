package model;

/**
 * Created by riblee on 2014.03.05..
 */
public class Egyenlet {
    private Tort[] egyutthatok;
    private int oszlop;

    /**
     * Az egyenlet utolsó eleme a b vektor megfelelő eleme
     * @param oszlop
     */
    public Egyenlet(int oszlop) {

    }

    public Tort[] getEgyutthatok() {
        return egyutthatok;
    }

    public void setEgyutthatok(Tort[] egyutthatok) {
        this.egyutthatok = egyutthatok;
    }
}
