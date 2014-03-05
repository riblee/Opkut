package model;

public class Tort {
    private int szamlalo;
    private int nevezo;

    public Tort(int szamlalo, int nevezo) {
        this.szamlalo = szamlalo;
        if (nevezo != 0) {
            this.nevezo = nevezo;
        } else {
            this.nevezo = 1;
            System.err.println("Nevezőben 0 nem lehet");
        }
        egyszerusit();
    }

    public Tort(int szamlalo) {
        this.szamlalo = szamlalo;
        this.nevezo = 1;
    }

    public void egyszerusit() {
        if (szamlalo == nevezo) {
            szamlalo = nevezo = 1;
        } else {
            int i;
            int a = (szamlalo>=0) ? (szamlalo):(szamlalo*-1);
            int b = (nevezo>=0) ? (nevezo):(nevezo*-1);
            if (a < b) {
                i = a;
                a = b;
                b = i;
            }
            i = b;
            while (a % i != 0 || b % i != 0) {
                i = i - 1;
            }
            szamlalo/=i;
            nevezo/=i;
        }
}

    public Tort osszead(Tort t) {
        Tort tmp = new Tort(1);
        if (this.nevezo==t.nevezo){
            tmp.setNevezo(this.nevezo);
            tmp.setSzamlalo(this.szamlalo+t.szamlalo);
        } else {
            int i;
            int a = (szamlalo>=0) ? (szamlalo):(szamlalo*-1);
            int b = (nevezo>=0) ? (nevezo):(nevezo*-1);
            if (a < b) {
                i = a;
                a = b;
                b = i;
            }
            i = b;
            while (a % i != 0 || b % i != 0) {
                i = i - 1;
            }
            i=(this.nevezo*t.nevezo)/i;
            tmp.setNevezo(i);
            a = (i/this.nevezo)*this.szamlalo;
            b = (i/t.nevezo)*t.szamlalo;
            tmp.setSzamlalo(a+b);
        }
        tmp.egyszerusit();
        return tmp;
    }

    public Tort kivon(Tort t){
        return this.osszead(new Tort(-t.szamlalo, t.nevezo));
    }

    public Tort szoroz(Tort t) {
        Tort tmp = new Tort(this.szamlalo * t.szamlalo, this.nevezo * t.nevezo);
        return tmp;
    }

    public Tort oszt(Tort t) {
        Tort tmp = new Tort(this.szamlalo * t.nevezo, this.nevezo * t.szamlalo);
        return tmp;
    }

    public Tort reciprok() {
        Tort tmp = new Tort(this.nevezo, this.szamlalo);
        return tmp;
    }

    public int getSzamlalo() {
        return szamlalo;
    }

    public void setSzamlalo(int szamlalo) {
        this.szamlalo = szamlalo;
    }

    public int getNevezo() {
        return nevezo;
    }

    public void setNevezo(int nevezo) {
        this.nevezo = nevezo;
    }

    public void println() {
        System.out.println(szamlalo + "/" + nevezo);
    }
}
