import java.util.*;
/**
 * Write a description of class LetterTest here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class LetterTest
{
    private static char[] vowels = {'A','E','I','O','U','Y'};
    ArrayList<Character> vowel = new ArrayList<>();
    public StringBuilder encrypt(String args,int key){
        Letter.setKey(key);
        args = args.toUpperCase();
        ArrayList<Character> vowel = new ArrayList<>();
        for(int i = 0;i<vowels.length;i++){
            vowel.add(vowels[i]);
            
        }
        
       
        
            for (int i =0;i<args.length();i++){
            
            if(vowel.contains(args.charAt(i))){
                Letter x = new Letter('Q');
                Letter y = new Letter('X');
                
            }
            Letter x = new Letter(args.charAt(i));
        }
        return Letter.print();
    }
}
class Letter
{
    // instance variables - replace the example below with your own
    
    private static int key = 0;
    private static char[] alphabet = {'A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z'};
    
    ArrayList<Character> alpha = new ArrayList<>();
    ArrayList<Character> vowel = new ArrayList<>();
    
    static StringBuilder s = new StringBuilder("");
    /**
     * Constructor for objects of class Letter
     */
    public Letter(char a)
    {
        for(int i = 0;i<alphabet.length;i++){
            alpha.add(alphabet[i]);
        }
        
        
        if(alpha.contains(a)){
            a = ceasarCipher(a,key);
            String s1 = "" + a;
            s.append(s1);
        }
        
    }
  
    public static void setKey(int keyP){
        key = keyP;
    }
    
    private char ceasarCipher(char x,int key){
        //this method shifts every alphabet to the left acording to the key
        //it actually carries out the cipher
        
        //setup
        char[] alphabet = {'A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z'};
        ArrayList<Character> alpha = new ArrayList<>();
        key = key%25;
        for(int i = 0;i < alphabet.length;i++){
            alpha.add(alphabet[i]);
            
        }
        
            
        int index = alpha.indexOf(x);
        int newIndex = (index + key)%26;
        
        if (index > 25 - key ){
            newIndex = (index+key-1)%25;

        }
        
        return alpha.get(newIndex);
    }
    public static StringBuilder print(){
        return s;
    }
    
}