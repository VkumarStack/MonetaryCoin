//*********************************************************
//  Represents an extension of a regular coin that holds
//  monetary value.
//*********************************************************
public class MonetaryCoin extends Coin
{
    private double value;

    //--------------------------------------------------------
    //  Instantiates a MonetaryCoin object by calling a
    //  super to the Coin constructor and setting the value.
    //--------------------------------------------------------
    public MonetaryCoin(double value)
    {
        super();
        this.value = value;
    } // end one-argument constructor

    //--------------------------------------------------------
    //  Returns the value of the MonetaryCoin.
    //--------------------------------------------------------
    public double getValue()
    {
        return value;
    } // end method getValue

    //--------------------------------------------------------
    //  Returns the face of the coin and its value.
    //--------------------------------------------------------
    public String toString()
    {
        String output = super.toString();
        output += "\n" + "$" + value;
        return output;
    } // end method toString
} // end class MonetaryCoin
