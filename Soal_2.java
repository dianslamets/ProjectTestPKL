package project_testpkl;

/*
Soal 2
By: Dian Slamet Saputra | SMKN 4 Bandung
Thanks to: w3schools.com & youtube :)
*/

public class Soal_2 {
    
    public static void main(String[] args) {
        //input
        String r = reverse("hello");
        System.out.println(r);
    }
    
    public static String reverse(String s) {
        char[] letters = new char[s.length()];
        int letterIndex = 0;
        for(int i = s.length() - 1; i >= 0; i--) {
            letters[letterIndex] = s.charAt(i);
            letterIndex++;
        }
        
        String reverse = "Output: ";
        for(int i = 0; i < s.length(); i++) {
            reverse = reverse + letters[i];
        }
        
        return reverse;
	}
}