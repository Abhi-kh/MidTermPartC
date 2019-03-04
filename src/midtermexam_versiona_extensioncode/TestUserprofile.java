
package midtermexam_versiona_extensioncode;

import java.util.Scanner;

/**
 *
 * @author Abhinav
 */
public class TestUserprofile {
    
    public static void main(String args[]){

        Scanner input = new Scanner(System.in);

        UserProfile user1 = new UserProfile("First", "Last");
        System.out.println("Enter ID: ");
        user1.setUserID(input.next());

        System.out.println("Enter a genre: ");
        user1.setGenre(input.next());
        
        System.out.println("userProfile has been created.");
    }
}
