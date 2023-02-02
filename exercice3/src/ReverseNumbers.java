package io.github.jiangdequan;
import java.util.Scanner;

public class ReverseNumbers {

    // Méthode pour inverser une string en Java en utilisant un array de caractères
    public static String reverse(String str)
    {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Entrer une valeur :");
       str = scanner.nextLine();
        // renvoie si la string est nulle ou vide
        if (str == null || str.equals("")) {
            return str;
        }
 
        // Récupère la longueur de la string
        int n = str.length();
 
        // crée un array de caractères de la même taille que celui de string
        char[] temp = new char[n];
 
        // remplit le array de caractères à l'envers avec les caractères de la string
        for (int i = 0; i < n; i++) {
            temp[n - i - 1] = str.charAt(i);
        }
 
        // convertit le array de caractères en string et le renvoie
        return String.copyValueOf(temp);
    }
        public static void main(String[] args) {
        
            // String str = "Techie Delight";
 
            // La string est immuable
            str = reverse(str);
     
            System.out.println("The reverse of the given string is: " + str);
    }
}