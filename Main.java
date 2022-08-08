import java.util.* ;
/**
 * 主程式。
 * 
 * @作者:陳力維
 * @版本（4/9）
 */
public class Main
{
    public static void main(String[] args) throws Throwable 
    {
        Dice dice = new Dice() ;
        dice.ThrowDices( 3 ) ;
        dice.PrintDices() ;
        dice.Sort() ;
        if ( dice.IsThreeOfAKind() ) 
            System.out.println("This is three of a kind") ;
        else if ( dice.IsStraight() )
            System.out.println("This is straight") ;
        else if ( dice.HasPair() ) 
            System.out.println("There has a pair") ;
        else
            System.out.println("Sum is : " + dice.Sum() ) ;
           
        //test temp = new test() ;
        //temp.testSort() ;
        //temp.testSwap() ;
        //temp.testIsThree() ;
        //temp.testIsStraight() ;
        //temp.testSum() ;
    }
}
