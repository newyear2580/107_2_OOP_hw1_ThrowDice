import java.util.* ;
/**
 * 在这里给出对类 test 的描述。
 * 
 * @作者（你的名字）
 * @版本（一个版本号或者一个日期）
 */
public class test
{
    // 实例变量 - 用你自己的变量替换下面的例子
    Dice dice = new Dice() ;
    test() throws Throwable
    {
        dice.mContent.setElementAt( 5, 0 ) ;
        dice.mContent.setElementAt( 2, 1 ) ;
        dice.mContent.setElementAt( 3, 2 ) ;
    }
    
    void Setdices( int i, int j, int k ) throws Throwable
    {
	dice.mContent.setElementAt( i, 0 ) ;
        dice.mContent.setElementAt( j, 1 ) ;
        dice.mContent.setElementAt( k, 2 ) ;
    }
	
    void testSort() throws Throwable
    {
        dice.PrintDices() ;
        dice.Sort() ;
        dice.PrintDices() ;
    }
	
    void testSwap() throws Throwable
    {
		dice.PrintDices() ;
		dice.Swap( dice.mContent, 0, 1 ) ;
		dice.PrintDices() ;
    }
	
    void testIsThree() throws Throwable
    {
	dice.PrintDices() ;
	if ( dice.IsThreeOfAKind() ) System.out.println( "Yes" ) ;
	else System.out.println( "No" ) ;
	Setdices( 1, 1, 1 ) ;
	dice.PrintDices() ;
	if ( dice.IsThreeOfAKind() ) System.out.println( "Yes" ) ;
	else System.out.println( "No" ) ;
    }
	
    void testIsStraight() throws Throwable
    {   
	dice.PrintDices() ;
	if( dice.IsStraight() ) System.out.println( "Yes" ) ;
	else System.out.println( "No" ) ;
	Setdices( 1, 2, 3 ) ;
	dice.PrintDices() ;
	if( dice.IsStraight() ) System.out.println( "Yes" ) ;
	else System.out.println( "No" ) ;
		
    }
	
    void testSum() throws Throwable
    {
	dice.PrintDices() ;
	System.out.println( "Sum is " + dice.Sum() ) ;
	Setdices( 1, 2, 3 ) ;
	dice.PrintDices() ;
	System.out.println( "Sum is " + dice.Sum() ) ;
    }
}
