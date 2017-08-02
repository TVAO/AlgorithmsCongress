import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;


/**
 * Created by JakeMullit on 02/03/15.
 */
public class loader {

    public static int STATES; // 50 states 
    public static int SEATS; // 435 seats 
    public static State[] STATELIST;

    private static String state;
    private static int population;


    public static State[] loadStates()
            
    {
        try
        {
            BufferedReader reader = new BufferedReader(new FileReader("Data.txt"));

            STATES = Integer.parseInt(reader.readLine());
            SEATS  = Integer.parseInt(reader.readLine());

            STATELIST = new State[STATES]; // Array with same size as amount of states 

            String line = reader.readLine();

            int counter = 0; 

            while (line!= null)
            {
                state = line;
                population = Integer.parseInt(reader.readLine());

                STATELIST[counter] = new State(state,population);
                counter++;
                line = reader.readLine();
            }

        }
        catch(IOException e)
        {
            e.printStackTrace();
        }

        return STATELIST;
    }
}
