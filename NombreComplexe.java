import java.lang.Math;


public class NombreComplexe {
    
    

    public static void main(String[] args) {


    }



    public static double[] creeNombreComplexe(double reel, double imaginaire) {
        double[] nombreComplexe = new double[2];
        nombreComplexe[0] = reel;
        nombreComplexe[1] = imaginaire;
        return nombreComplexe;
    }

    public static void afficheNombreComplexe(double[] nombreComplexe) {
        System.out.println(nombreComplexe[0] + " + " + nombreComplexe[1] + "i");
    }

    public static double[] addition(double[] nombreComplexe1, double[] nombreComplexe2) {
        double[] nombreComplexe = new double[2];
        nombreComplexe[0] = nombreComplexe1[0] + nombreComplexe2[0];
        nombreComplexe[1] = nombreComplexe1[1] + nombreComplexe2[1];
        return nombreComplexe;
    }

    public static double[] soustraction(double[] nombreComplexe1, double[] nombreComplexe2) {
        double[] nombreComplexe = new double[2];
        nombreComplexe[0] = nombreComplexe1[0] - nombreComplexe2[0];
        nombreComplexe[1] = nombreComplexe1[1] - nombreComplexe2[1];
        return nombreComplexe;
    }

    public static double[] multiplication(double[] nombreComplexe1, double[] nombreComplexe2) {
        double[] nombreComplexe = new double[2];
        nombreComplexe[0] = nombreComplexe1[0] * nombreComplexe2[0] - nombreComplexe1[1] * nombreComplexe2[1];
        nombreComplexe[1] = nombreComplexe1[0] * nombreComplexe2[1] + nombreComplexe1[1] * nombreComplexe2[0];
        return nombreComplexe;
    }

    public static double[] division(double[] nombreComplexe1, double[] nombreComplexe2) {
        double[] nombreComplexe = new double[2];
        nombreComplexe[0] = (nombreComplexe1[0] * nombreComplexe2[0] + nombreComplexe1[1] * nombreComplexe2[1]) / (Math.pow(nombreComplexe2[0], 2) + Math.pow(nombreComplexe2[1], 2));
        nombreComplexe[1] = (nombreComplexe1[1] * nombreComplexe2[0] - nombreComplexe1[0] * nombreComplexe2[1]) / (Math.pow(nombreComplexe2[0], 2) + Math.pow(nombreComplexe2[1], 2));
        return nombreComplexe;
    }

    public static double module(double[] nombreComplexe) {
        return Math.sqrt(Math.pow(nombreComplexe[0], 2) + Math.pow(nombreComplexe[1], 2));
    }

    public static double argument(double[] nombreComplexe) {
        return Math.atan(nombreComplexe[1] / nombreComplexe[0]);
    }

    public static double[] conjugue(double[] nombreComplexe) {
        double[] nombreComplexeConjugue = new double[2];
        nombreComplexeConjugue[0] = nombreComplexe[0];
        nombreComplexeConjugue[1] = -nombreComplexe[1];
        return nombreComplexeConjugue;
    }

    public static double[] inverse(double[] nombreComplexe) {
        double[] nombreComplexeInverse = new double[2];
        nombreComplexeInverse[0] = nombreComplexe[0] / (Math.pow(nombreComplexe[0], 2) + Math.pow(nombreComplexe[1], 2));
        nombreComplexeInverse[1] = -nombreComplexe[1] / (Math.pow(nombreComplexe[0], 2) + Math.pow(nombreComplexe[1], 2));
        return nombreComplexeInverse;
    }

    public static double[] puissance(double[] nombreComplexe, int puissance) {
        double[] nombreComplexePuissance = new double[2];
        nombreComplexePuissance[0] = Math.pow(module(nombreComplexe), puissance) * Math.cos(puissance * argument(nombreComplexe));
        nombreComplexePuissance[1] = Math.pow(module(nombreComplexe), puissance) * Math.sin(puissance * argument(nombreComplexe));
        return nombreComplexePuissance;
    }

    public static double[] racine(double[] nombreComplexe, int racine) {
        double[] nombreComplexeRacine = new double[2];
        nombreComplexeRacine[0] = Math.pow(module(nombreComplexe), 1 / racine) * Math.cos(argument(nombreComplexe) / racine);
        nombreComplexeRacine[1] = Math.pow(module(nombreComplexe), 1 / racine) * Math.sin(argument(nombreComplexe) / racine);
        return nombreComplexeRacine;
    }

    public static double[] exponentielle(double[] nombreComplexe) {
        double[] nombreComplexeExponentielle = new double[2];
        nombreComplexeExponentielle[0] = Math.exp(nombreComplexe[0]) * Math.cos(nombreComplexe[1]);
        nombreComplexeExponentielle[1] = Math.exp(nombreComplexe[0]) * Math.sin(nombreComplexe[1]);
        return nombreComplexeExponentielle;
    }

    public static double[] trigonométrique(double[] nombreComplexe) {
        double[] nombreComplexeTrigonométrique = new double[2];
        nombreComplexeTrigonométrique[0] = module(nombreComplexe) * Math.cos(argument(nombreComplexe));
        nombreComplexeTrigonométrique[1] = module(nombreComplexe) * Math.sin(argument(nombreComplexe));
        return nombreComplexeTrigonométrique;
    }


    public static double[] multiplicationScalaire(double[] nombreComplexe, double scalaire) {
        double[] nombreComplexeScalaire = new double[2];
        nombreComplexeScalaire[0] = nombreComplexe[0] * scalaire;
        nombreComplexeScalaire[1] = nombreComplexe[1] * scalaire;
        return nombreComplexeScalaire;
    }

    public static double[] additionScalaire(double[] nombreComplexe, double scalaire) {
        double[] nombreComplexeScalaire = new double[2];
        nombreComplexeScalaire[0] = nombreComplexe[0] + scalaire;
        nombreComplexeScalaire[1] = nombreComplexe[1];
        return nombreComplexeScalaire;
    }

    public static double[] soustractionScalaire(double[] nombreComplexe, double scalaire) {
        double[] nombreComplexeScalaire = new double[2];
        nombreComplexeScalaire[0] = nombreComplexe[0] - scalaire;
        nombreComplexeScalaire[1] = nombreComplexe[1];
        return nombreComplexeScalaire;
    }

    public static double[] divisionScalaire(double[] nombreComplexe, double scalaire) {
        double[] nombreComplexeScalaire = new double[2];
        nombreComplexeScalaire[0] = nombreComplexe[0] / scalaire;
        nombreComplexeScalaire[1] = nombreComplexe[1] / scalaire;
        return nombreComplexeScalaire;
    }










    







}
