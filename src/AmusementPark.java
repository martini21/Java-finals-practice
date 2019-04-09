/*
  Name:
  StudentNr:
 */

import Attractions.Attraction;
import Visitor.Visitor;

import java.lang.UnsupportedOperationException;
import java.time.Month;
import java.time.Year;
import java.util.List;
import java.time.LocalDate;


public class AmusementPark
{

    // TODO: implement this class

    private List<Visitor> visitors;

    public AmusementPark(String name)
    {

    }

    public void addVisitor(Visitor visitor) {
        //create visitor assign ticket
        throw new UnsupportedOperationException("Not yet implemented");
    }

    //TODO addVisitros(List<Visitor>) if > 5 cheapest free

    /**
     * Assignment 2
     * @param date The date of which you want to know what attractions need to be serviced
     * @return a list of attractions that need to be serviced on the supplied date
     */
    public List<Attraction> getAttractionsToBeServiced(LocalDate date) {
        throw new UnsupportedOperationException("Not yet implemented");
    }

    /**
     * Assignment 3, part 1
     * @param month the month of which the revenue must be calculated
     * @param year the year where the month is in
     * @return The revenue of the park in the specified month and year given
     */
    public int getRevenuePerMonth(Month month, Year year)
    {
        throw new UnsupportedOperationException("Not yet implemented");
    }

    /**
     * Assignment 3, part 2
     * @param month the month of which the number of children must be counted
     * @param year the year where the month is in
     * @return The amount of children that visited the park in the month and year given
     */
    public int getAmountOfChildrenPerMonth(Month month, Year year)
    {
        throw new UnsupportedOperationException("Not yet implemented");
    }

    /**
     * Assignment 4
     * @return The average length of all the pregnant women that have visited the park
     */
    public double getAverageLengthOfPregnantWomen() {
        throw new UnsupportedOperationException("Not yet implemented");
    }

    /**
     * Assignment 5
     * @param visitor the visitor that needs the list of attractions
     * @return the list of attractions that are suitable for the supplied visitor
     */
    public List<Attraction> getSuitableAttraction(Visitor visitor)
    {
        throw new UnsupportedOperationException("Not yet implemented");
    }
}
