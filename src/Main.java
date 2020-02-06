//*********************************************************
//  Driver class for the MonetaryCoin object.
//*********************************************************
public class Main
{
    //--------------------------------------------------------
    //  Adds a series of MonetaryCoin objects into an array
    //  and computes their sum. It also flips the first
    //  Coin in the array and prints out its side and
    //  value.
    //--------------------------------------------------------
    public static void main (String[] args)
    {
        MonetaryCoin[] wallet = new MonetaryCoin[5];
        wallet[0] = new MonetaryCoin(0.25);
        wallet[1] = new MonetaryCoin(0.25);
        wallet[2] = new MonetaryCoin(0.50);
        wallet[3] = new MonetaryCoin(0.10);
        wallet[4] = new MonetaryCoin(0.01);

        double sum = 0;
        for (MonetaryCoin coin : wallet)
        {
            sum += coin.getValue();
        }
        System.out.println("Sum: " + sum);
        wallet[0].flip();
        System.out.println("Information of First Coin:\n" + wallet[0].toString());
    } // end method main
} // end class Main
