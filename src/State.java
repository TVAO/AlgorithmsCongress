/**
 * Created by JakeMullit on 02/03/15.
 */
public class State implements Comparable<State> {

    private String stateName;
    private int population;
    private int seats;


    public State(String stateName, int population) {
        this.stateName = stateName;
        this.population = population;
    }

    public String getStateName()
    {
        return stateName;
    }

    public int getPopulation()
    {
        return population;
    }

    public int getSeats()
    {
        return seats;
    }


    public void decreasePopulation(int n)
    {
        population -= n;
    }

    /**
     * Increments seat by one.
     */
    public void addSeat()
    {
        seats++;
    }

    /**
     * Compares state based on population size 
     * @param otherState
     * @return
     */
    public int compareTo(State otherState) {
        return Integer.compare(population, otherState.getPopulation());
    }
    
}
