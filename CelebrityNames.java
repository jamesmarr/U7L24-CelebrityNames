import java.io.*;
import java.util.*;

/**
 * Write a description of class CelebrityNames here.
 * 
 * @author James Marr
 * @version  
 */
public class CelebrityNames
{
    public static final String FILE_NAME = "CelebrityData.txt";
    public static void main(String args[]) throws IOException
    { 
        Scanner sf = new Scanner(new File(FILE_NAME));

        int maxIndx = -1; //-1 so when we increment below, the first index is 0
        String text[] = new String[1000]; //to be safe, declare more than we need

        while(sf.hasNext( ))
        { 
            maxIndx++;
            text[maxIndx] = sf.nextLine( ); 
        } 
        //maxIndx is now the highest index of text[], = -1 if no text lines 
        sf.close( ); //We opened a file above, so close it when finished.

        String reversedName[] = new String[maxIndx + 1];
        for (int j = 0; j <= maxIndx; j++)
        { 
            Scanner sc = new Scanner( text[j] );
            String firstName = sc.next( );
            String middleName = sc.next( );
            String lastName = sc.next();
            String birthDate = sc.nextLine();
            reversedName[j] = lastName + ", " + firstName + " " + middleName + " -- " + birthDate;
        } 
        
        Arrays.sort(reversedName);
        for (int j =0; j <= maxIndx; j++)
        { 
            System.out.println(reversedName[j]);
        } 
    }
}
