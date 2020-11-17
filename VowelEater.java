// This program asks a user to input a string which can be  a sentence, a word, or any combination of 
// charcaters that contains vowels. The program eat or remove all vowels in the string and display the 
// remaining consonants

package javafromnetbeans;

import javax.swing.JOptionPane;


/**
 *
 * @author Benjamin
 */

public class VowelEater {
    
    static String vowelRegex = "[aeiouAEIOU]"; // regex pattern to search for a vowel in a word
                                               // or compare a character with
    private static String userString;
   
    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
       

       String userName = JOptionPane.showInputDialog(null, "Please what is your name?", "I would like to meet you", JOptionPane.QUESTION_MESSAGE);
       
       if(userName != null)
       {
         JOptionPane.showMessageDialog(null, userName + ", I am am a vowel eater, I am very hungry and ready to eat your vowels if you choose to feed me.\n\n You can terminate this program at any time by feeding me with number 1 or close the dialog box", "Welcome " + userName + " to vowel eater program!", JOptionPane.INFORMATION_MESSAGE);
       }//end if
       else
       {
           JOptionPane.showMessageDialog(null, "Bye you have terminated the program!", "Program Termination Message", JOptionPane.INFORMATION_MESSAGE);
           System.exit(0);   // Program successfully exits or end.             
       }// end else
                       
       while(true) // As long as the user keeps supplying input and hasn't terminated with number 1.
        {
            try
            {
               userString = JOptionPane.showInputDialog(null, userName+ ", please enter a sentence or set of characters containing vowels to feed me", "Plea for vowels", JOptionPane.INFORMATION_MESSAGE);
               if(userString.matches("1")) // Compares user input string with number 1 in order to decide if the program should be terminated.
               {
                   JOptionPane.showMessageDialog(null, "Bye " + userName + " you have terminated the program!", "Program Termination Message", JOptionPane.INFORMATION_MESSAGE);
                   System.exit(0);   // Program successfully exits or end.    
               }//end if                                   
            }//end try
            catch(NullPointerException e)
            {
                JOptionPane.showMessageDialog(null, "Bye " + userName + " you have terminated the program!", "Program Termination Message", JOptionPane.INFORMATION_MESSAGE);
                System.exit(0);   // Program successfully exits or end.
            }//end catch
            
            userString = userString.replaceAll(vowelRegex, ""); // Use String replaceAll method to remove all occurrence of a vowel in userString
            JOptionPane.showMessageDialog(null, "The characters left after I have eaten some vowels is: " + userString + "\n\nThanks for feeding me " + userName + "!");       }//end while      
    }//end main 
}//end class VowelEater
