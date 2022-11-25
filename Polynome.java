public class Polynome {



    private double[] tab;

    public Polynome(double[] tab) {
        this.tab = tab;
    }

    public Polynome(int degre) {

        this.tab = new double[degre + 1];
    }

    public Polynome(Polynome p) {
        tab = new double[p.tab.length];
        for (int i = 0; i < tab.length; i++) {
            tab[i] = p.tab[i];
        }
    }

    public int getDegre() {
        return tab.length - 1;
    }

    public double getCoeff(int degre) {
        return tab[degre];
    }

    public void setCoeff(int degre, double coeff) {
        tab[degre] = coeff;
    }

    public Polynome addition(Polynome p) {
        
        int degreMax = Math.max(this.getDegre(), p.getDegre());
        Polynome res = new Polynome(degreMax);
        for (int i = 0; i <= degreMax; i++) {
            res.setCoeff(i, this.getCoeff(i) + p.getCoeff(i));
        }
        return res;
    }

    public Polynome soustraction(Polynome p) {
        int degreMax = Math.max(getDegre(), p.getDegre());
        Polynome res = new Polynome(degreMax);
        for (int i = 0; i <= degreMax; i++) {
            res.setCoeff(i, getCoeff(i) - p.getCoeff(i));
        }
        return res;
    }

    public Polynome[] division(Polynome p) {
        Polynome[] res = new Polynome[2];
        Polynome q = new Polynome(getDegre() - p.getDegre());
        Polynome r = new Polynome(this);
        while (r.getDegre() >= p.getDegre()) {
            double coeff = r.getCoeff(r.getDegre()) / p.getCoeff(p.getDegre());
            q.setCoeff(r.getDegre() - p.getDegre(), coeff);
            Polynome tmp = new Polynome(p.getDegre());
            for (int i = 0; i <= p.getDegre(); i++) {
                tmp.setCoeff(i, coeff * p.getCoeff(i));
            }
            r = r.soustraction(tmp);
        }
        res[0] = q;
        res[1] = r;
        return res;
    }



    public Polynome multiplication(Polynome p) {
        int degreMax = getDegre() + p.getDegre();
        Polynome res = new Polynome(degreMax);
        for (int i = 0; i <= getDegre(); i++) {
            for (int j = 0; j <= p.getDegre(); j++) {
                res.setCoeff(i + j, res.getCoeff(i + j) + getCoeff(i) * p.getCoeff(j));
            }
        }
        return res;
    }

    

    public Polynome derivee() {
        Polynome res = new Polynome(getDegre() - 1);
        for (int i = 1; i <= getDegre(); i++) {
            res.setCoeff(i - 1, i * getCoeff(i));
        }
        return res;
    }


    public Polynome primitive() {
        Polynome res = new Polynome(getDegre() + 1);
        for (int i = 0; i <= getDegre(); i++) {
            res.setCoeff(i + 1, getCoeff(i) / (i + 1));
        }
        return res;
    }

    public double eval(double x) {
        double res = 0;
        for (int i = 0; i <= getDegre(); i++) {
            res += getCoeff(i) * Math.pow(x, i);
        }
        return res;
    }

    public String toString() {
        String res = "";
        for (int i = 0; i <= getDegre(); i++) {
            if (getCoeff(i) != 0) {
                if (getCoeff(i) > 0 && i != 0) {
                    res += "+";
                }
                res += getCoeff(i);
                if (i != 0) {
                    res += "x";
                    if (i != 1) {
                        res += "^" + i;
                    }
                }
            }
        }
        return res;
    }

    public Polynome multiplicationScalaire(double x) {
        Polynome res = new Polynome(getDegre());
        for (int i = 0; i <= getDegre(); i++) {
            res.setCoeff(i, getCoeff(i) * x);
        }
        return res;
    }

    public boolean equals(Polynome p) {
        if (getDegre() != p.getDegre()) {
            return false;
        }
        for (int i = 0; i <= getDegre(); i++) {
            if (getCoeff(i) != p.getCoeff(i)) {
                return false;
            }
        }
        return true;
    }

    public Polynome[] decomposition() {
        Polynome[] res = new Polynome[2];
        Polynome q = new Polynome(getDegre() - 1);
        Polynome r = new Polynome(this);
        while (r.getDegre() >= 1) {
            double coeff = r.getCoeff(r.getDegre()) / r.getCoeff(1);
            q.setCoeff(r.getDegre() - 1, coeff);
            Polynome tmp = new Polynome(1);
            for (int i = 0; i <= 1; i++) {
                tmp.setCoeff(i, coeff * r.getCoeff(i));
            }
            r = r.soustraction(tmp);
        }
        res[0] = q;
        res[1] = r;
        return res;
    }


    public Polynome pgcd(Polynome p) {
        Polynome r = new Polynome(this);
        Polynome q = new Polynome(p);
        Polynome tmp;
        while (!q.equals(new Polynome(0))) {
            tmp = r;
            r = q;
            q = tmp.division(r)[1];
        }
        return r;
    }

    public Polynome ppcm(Polynome p) {
        Polynome res = new Polynome(this);
        Polynome tmp = new Polynome(p);
        Polynome pgcd = res.pgcd(tmp);
        res = res.division(pgcd)[0];
        tmp = tmp.division(pgcd)[0];
        res = res.multiplication(tmp);
        res = res.multiplication(pgcd);
        return res;
    }

    public Polynome[] decompositionRacine() {
        Polynome[] res = new Polynome[2];
        Polynome q = new Polynome(getDegre() - 1);
        Polynome r = new Polynome(this);
        while (r.getDegre() >= 1) {
            double coeff = r.getCoeff(r.getDegre()) / r.getCoeff(1);
            q.setCoeff(r.getDegre() - 1, coeff);
            Polynome tmp = new Polynome(1);
            for (int i = 0; i <= 1; i++) {
                tmp.setCoeff(i, coeff * r.getCoeff(i));
            }
            r = r.soustraction(tmp);
        }
        res[0] = q;
        res[1] = r;
        return res;
    }



    public Polynome[] racine() {
        Polynome[] res = new Polynome[2];
        Polynome q = new Polynome(getDegre() - 1);
        Polynome r = new Polynome(this);
        while (r.getDegre() >= 1) {
            double coeff = r.getCoeff(r.getDegre()) / r.getCoeff(1);
            q.setCoeff(r.getDegre() - 1, coeff);
            Polynome tmp = new Polynome(1);
            for (int i = 0; i <= 1; i++) {
                tmp.setCoeff(i, coeff * r.getCoeff(i));
            }
            r = r.soustraction(tmp);
        }
        res[0] = q;
        res[1] = r;
        return res;
    }

    public boolean irreductible() {
        Polynome p = new Polynome(this);
        Polynome[] racines = p.racine();
        for (int i = 0; i < racines.length; i++) {
            if (racines[i].getDegre() == 0) {
                return false;
            }
        }
        return true;
    }




    public static void main(String[] args) {
        Polynome p1 = new Polynome(new double[]{1, 2, 3});
        Polynome p2 = new Polynome(new double[]{1, 2, 3, 4});
        Polynome p3 = new Polynome(new double[]{1, 2, 3, 4, 5});

        Polynome p = new Polynome(new double[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14});
        System.out.println(p);
        System.out.println(p.derivee());
        System.out.println(p.derivee().derivee());

        System.out.println(p.primitive());
        System.out.println(p.primitive().primitive());

        System.out.println(p.eval(2));
        
        System.out.println(p1.addition(p2));
        System.out.println(p1.multiplication(p2));

        
        System.out.println(p1.multiplicationScalaire(2));
        System.out.println(p1.equals(p2));
        System.out.println(p1.equals(p3));

        System.out.println(p1.pgcd(p2));
        System.out.println(p1.ppcm(p2));
        
        System.out.println(p1.irreductible());
        System.out.println(p2.irreductible());
        System.out.println(p3.irreductible());

        System.out.println(p1.division(p2)[0]);
        System.out.println(p1.division(p2)[1]);
        System.out.println(p1.division(p2)[0].addition(p1.division(p2)[1]));

        System.out.println(p1.division(p2)[0].multiplication(p2).addition(p1.division(p2)[1]));

    }







}
