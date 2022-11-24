import java.lang.Math;

public class Matrice {

    public static void main(String[] args) {

        // Pour voir si les fonctions marchent

        System.out.println("test creerMatrice");

        int[][] matrice = creerMatrice(5, 5);
        afficherMatrice(matrice);
        System.out.println();

        System.out.println("test copierMatrice");

        int[][] matrice2 = copierMatrice(matrice);
        afficherMatrice(matrice2);
        System.out.println();

        System.out.println("test remplirMatrice");

        remplirMatrice(matrice2, 0, 10);
        afficherMatrice(matrice2);
        System.out.println();

        System.out.println("test additionnerMatrice");

        int[][] matrice3 = additionnerMatrice(matrice, matrice2);
        afficherMatrice(matrice3);
        System.out.println();

        System.out.println("test soustraireMatrice");

        int[][] matrice4 = soustraireMatrice(matrice, matrice2);
        afficherMatrice(matrice4);
        System.out.println();

        System.out.println("test multiplierMatrice");

        int[][] matrice5 = multiplierMatrice(matrice, matrice2);
        afficherMatrice(matrice5);
        System.out.println();

        System.out.println("test transposerMatrice");

        int[][] matrice7 = transposerMatrice(matrice);
        afficherMatrice(matrice7);
        System.out.println();

        System.out.println("test determinantMatrice");

        int det = determinantMatrice(matrice);
        System.out.println(det);
        System.out.println();

        System.out.println("test inverserMatrice");

        int[][] matrice8 = inverserMatrice(matrice);
        afficherMatrice(matrice8);
        System.out.println();

        System.out.println("test matriceIdentite");

        int[][] matrice9 = matriceIdentite(5);
        afficherMatrice(matrice9);
        System.out.println();

        System.out.println("matriceZero");

        int[][] matrice10 = matriceZero(5);
        afficherMatrice(matrice10);
        System.out.println();

        System.out.println("test matriceAleatoire");

        int[][] matrice11 = matriceAleatoire(10);
        afficherMatrice(matrice11);
        System.out.println();

        System.out.println("test matriceCarree");

        boolean carree = matriceCarree(matrice);
        System.out.println(carree);
        System.out.println();

        System.out.println("test puissanceMatrice");

        int[][] matrice12 = puissanceMatrice(matrice, 3);
        afficherMatrice(matrice12);
        System.out.println();

        System.out.println("test matriceInversible");

        boolean inversible = matriceInversible(matrice);
        System.out.println(inversible);
        System.out.println();

        System.out.println("test multiplierMatriceVecteur");

        int[] vecteur = { 1, 2, 3, 4, 5 };
        int[] vecteur2 = multiplierMatriceVecteur(matrice, vecteur);
        afficherVecteur(vecteur2);
        System.out.println();

        System.out.println("test systemeLineaire");

        int[][] matrice13 = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
        int[] vecteur3 = { 1, 2, 3 };
        int[] vecteur4 = systemeLineaire(matrice13, vecteur3);
        afficherVecteur(vecteur4);
        System.out.println();

        System.out.println("test matrice symetrique");

        int[][] matrice14 = { { 1, 2, 3 }, { 2, 4, 5 }, { 3, 5, 6 } };
        boolean symetrique = matriceSymetrique(matrice14);
        System.out.println(symetrique);
        System.out.println();

        System.out.println("test matriceAntiSymetrique");

        int[][] matrice15 = { { 0, 2, 3 }, { -2, 0, 5 }, { -3, -5, 0 } };
        boolean antisymetrique = matriceAntiSymetrique(matrice15);
        System.out.println(antisymetrique);
        System.out.println();

        System.out.println("test matriceDiagonale");

        int[][] matrice16 = { { 1, 0, 0 }, { 0, 2, 0 }, { 0, 0, 3 } };
        boolean diagonale = matriceDiagonale(matrice16);
        System.out.println(diagonale);
        System.out.println();

        System.out.println("test matriceVide");

        int[][] matrice17 = { { 0, 0, 0 }, { 0, 0, 0 }, { 0, 0, 0 } };
        boolean vide = matriceVide(matrice17);
        System.out.println(vide);
        System.out.println();

    }

    public static void afficherVecteur(int[] vecteur) {
        for (int i = 0; i < vecteur.length; i++) {
            System.out.print(vecteur[i] + " ");
        }
        System.out.println();
    }

    public static int[][] creerMatrice(int n, int m) {
        int[][] matrice = new int[n][m];
        return matrice;
    }

    public static void remplirMatrice(int[][] matrice, int min, int max) {
        for (int i = 0; i < matrice.length; i++) {
            for (int j = 0; j < matrice[i].length; j++) {
                matrice[i][j] = (int) (Math.random() * (max - min + 1) + min);
            }
        }
    }

    public static void afficherMatrice(int[][] matrice) {
        for (int i = 0; i < matrice.length; i++) {
            for (int j = 0; j < matrice[i].length; j++) {
                System.out.print(matrice[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static int[][] copierMatrice(int[][] matrice) {
        int[][] copie = new int[matrice.length][matrice[0].length];
        for (int i = 0; i < matrice.length; i++) {
            for (int j = 0; j < matrice[i].length; j++) {
                copie[i][j] = matrice[i][j];
            }
        }
        return copie;
    }

    public static int[][] additionnerMatrice(int[][] matrice1, int[][] matrice2) {
        int[][] somme = new int[matrice1.length][matrice1[0].length];
        for (int i = 0; i < matrice1.length; i++) {
            for (int j = 0; j < matrice1[i].length; j++) {
                somme[i][j] = matrice1[i][j] + matrice2[i][j];
            }
        }
        return somme;
    }

    public static int[][] soustraireMatrice(int[][] matrice1, int[][] matrice2) {
        int[][] difference = new int[matrice1.length][matrice1[0].length];
        for (int i = 0; i < matrice1.length; i++) {
            for (int j = 0; j < matrice1[i].length; j++) {
                difference[i][j] = matrice1[i][j] - matrice2[i][j];
            }
        }
        return difference;
    }

    public static int[][] multiplierMatrice(int[][] matrice1, int[][] matrice2) {
        int[][] produit = new int[matrice1.length][matrice2[0].length];
        for (int i = 0; i < matrice1.length; i++) {
            for (int j = 0; j < matrice2[0].length; j++) {
                for (int k = 0; k < matrice1[0].length; k++) {
                    produit[i][j] += matrice1[i][k] * matrice2[k][j];
                }
            }
        }
        return produit;

    }


    public static int[][] transposerMatrice(int[][] matrice) {
        int[][] transposee = new int[matrice[0].length][matrice.length];
        for (int i = 0; i < matrice.length; i++) {
            for (int j = 0; j < matrice[i].length; j++) {
                transposee[j][i] = matrice[i][j];
            }
        }
        return transposee;
    }

    public static int determinantMatrice(int[][] matrice) {
        int determinant = 0;
        if (matrice.length == 2) {
            determinant = matrice[0][0] * matrice[1][1] - matrice[0][1] * matrice[1][0];
        } else {
            for (int i = 0; i < matrice.length; i++) {
                int[][] sousMatrice = new int[matrice.length - 1][matrice.length - 1];
                for (int j = 1; j < matrice.length; j++) {
                    for (int k = 0; k < matrice.length; k++) {
                        if (k < i) {
                            sousMatrice[j - 1][k] = matrice[j][k];
                        } else if (k > i) {
                            sousMatrice[j - 1][k - 1] = matrice[j][k];
                        }
                    }
                }
                determinant += Math.pow(-1, i) * matrice[0][i] * determinantMatrice(sousMatrice);
            }
        }
        return determinant;
    }

    public static int[][] inverserMatrice(int[][] matrice) {
        int[][] inverse = new int[matrice.length][matrice.length];
        int determinant = determinantMatrice(matrice);
        if (determinant != 0) {
            for (int i = 0; i < matrice.length; i++) {
                for (int j = 0; j < matrice.length; j++) {
                    int[][] sousMatrice = new int[matrice.length - 1][matrice.length - 1];
                    for (int k = 0; k < matrice.length; k++) {
                        for (int l = 0; l < matrice.length; l++) {
                            if (k < i && l < j) {
                                sousMatrice[k][l] = matrice[k][l];
                            } else if (k < i && l > j) {
                                sousMatrice[k][l - 1] = matrice[k][l];
                            } else if (k > i && l < j) {
                                sousMatrice[k - 1][l] = matrice[k][l];
                            } else if (k > i && l > j) {
                                sousMatrice[k - 1][l - 1] = matrice[k][l];
                            }
                        }
                    }
                    inverse[j][i] = (int) Math.pow(-1, i + j) * determinantMatrice(sousMatrice);
                }
            }
            for (int i = 0; i < matrice.length; i++) {
                for (int j = 0; j < matrice.length; j++) {
                    inverse[i][j] = inverse[i][j] / determinant;
                }
            }
        }
        return inverse;
    }

    public static int[][] matriceIdentite(int taille) {
        int[][] identite = new int[taille][taille];
        for (int i = 0; i < taille; i++) {
            for (int j = 0; j < taille; j++) {
                if (i == j) {
                    identite[i][j] = 1;
                } else {
                    identite[i][j] = 0;
                }
            }
        }
        return identite;
    }

    public static int[][] matriceZero(int taille) {
        int[][] zero = new int[taille][taille];
        for (int i = 0; i < taille; i++) {
            for (int j = 0; j < taille; j++) {
                zero[i][j] = 0;
            }
        }
        return zero;
    }

    public static int[][] matriceAleatoire(int taille) {
        int[][] aleatoire = new int[taille][taille];
        for (int i = 0; i < taille; i++) {
            for (int j = 0; j < taille; j++) {
                aleatoire[i][j] = (int) (Math.random() * 10);
            }
        }
        return aleatoire;
    }

    public static boolean matriceCarree(int[][] matrice) {
        boolean carree = true;
        for (int i = 0; i < matrice.length; i++) {
            if (matrice[i].length != matrice.length) {
                carree = false;
            }
        }
        return carree;
    }

    public static int[][] puissanceMatrice(int[][] matrice, int puissance) {
        int[][] puissanceMatrice = matrice;
        for (int i = 1; i < puissance; i++) {
            puissanceMatrice = multiplierMatrice(puissanceMatrice, matrice);
        }
        return puissanceMatrice;
    }

    public static boolean matriceInversible(int[][] matrice) {
        boolean inversible = true;
        if (determinantMatrice(matrice) == 0) {
            inversible = false;
        }
        return inversible;
    }

    public static int[] multiplierMatriceVecteur(int[][] matrice, int[] vecteur) {
        int[] produit = new int[matrice.length];
        for (int i = 0; i < matrice.length; i++) {
            for (int j = 0; j < matrice[i].length; j++) {
                produit[i] += matrice[i][j] * vecteur[j];
            }
        }
        return produit;
    }

    public static int[] systemeLineaire(int[][] matrice, int[] vecteur) {
        int[] solution = new int[vecteur.length];
        if (matriceCarree(matrice) && matriceInversible(matrice)) {
            int[][] inverse = inverserMatrice(matrice);
            solution = multiplierMatriceVecteur(inverse, vecteur);
        }
        return solution;
    }

    public static boolean matriceSymetrique(int[][] matrice) {
        boolean symetrique = true;
        if (matriceCarree(matrice)) {
            for (int i = 0; i < matrice.length; i++) {
                for (int j = 0; j < matrice[i].length; j++) {
                    if (matrice[i][j] != matrice[j][i]) {
                        symetrique = false;
                    }
                }
            }
        } else {
            symetrique = false;
        }
        return symetrique;
    }

    public static boolean matriceAntiSymetrique(int[][] matrice) {
        boolean antisymetrique = true;
        if (matriceCarree(matrice)) {
            for (int i = 0; i < matrice.length; i++) {
                for (int j = 0; j < matrice[i].length; j++) {
                    if (matrice[i][j] != -matrice[j][i]) {
                        antisymetrique = false;
                    }
                }
            }
        } else {
            antisymetrique = false;
        }
        return antisymetrique;
    }

    public static boolean matriceVide(int[][] matrice) {
        boolean vide = true;
        for (int i = 0; i < matrice.length; i++) {
            for (int j = 0; j < matrice[i].length; j++) {
                if (matrice[i][j] != 0) {
                    vide = false;
                }
            }
        }
        return vide;
    }

    public static boolean matriceDiagonale(int[][] matrice) {
        boolean diagonale = true;
        if (matriceCarree(matrice)) {
            for (int i = 0; i < matrice.length; i++) {
                for (int j = 0; j < matrice[i].length; j++) {
                    if (i != j && matrice[i][j] != 0) {
                        diagonale = false;
                    }
                }
            }
        } else {
            diagonale = false;
        }
        return diagonale;
    }

}