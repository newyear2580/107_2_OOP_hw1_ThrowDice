import java.util.* ;
/**
 * what the dices do.
 * 
 * @陳力維
 * @2019/4/9
 */
public class Dice
{
    public Vector<Integer> mContent = null ;

    /**
     * 直接給3個骰子
     */   
    Dice() throws Throwable
    {
        mContent = new Vector<Integer>() ;
        int i = 0 ;
        while ( i < 3 )
        {
            mContent.addElement(0) ;
            i++ ;
        }
    } // Dice
    
    void SetDices( int index, int num ) throws Throwable
    {
        mContent.setElementAt( num, index ) ;
    } // SetDices
    
    void ThrowDices( int dices ) throws Throwable
    {
        Random ran = new Random() ;
        int i = 0 ;
        while ( i < dices ) 
        {
            SetDices( i, ran.nextInt(6) + 1 ) ;
            i ++ ;
        } // while
    } // ThrowDices

    void PrintDices() throws Throwable
    {
        System.out.println( "First:   " + mContent.get(0) ) ;
        System.out.println( "Second:  " + mContent.get(1) ) ;
        System.out.println( "Third:   " + mContent.get(2) ) ;
    } // PrintDices()
    
    void Sort() throws Throwable
    {
        for ( int i = mContent.size() - 1 ; i > 0 ; i -- )
        {
            boolean swapped = false ;
            for( int j = 0 ; j < i ; j++ )
            {
                if ( mContent.get(j) > mContent.get(j+1) )
                {
                    Swap( mContent, j, j + 1 ) ;
                    swapped = true ;
                } // if
            } // for
            
            if ( ! swapped ) break ;
        } // for
    } // Sort
    
    void Swap( Vector<Integer> arr, int i, int j ) throws Throwable
    {
        int temp = arr.get(i) ;
        arr.setElementAt( arr.get(j), i ) ;
        arr.setElementAt( temp, j ) ;
    } // Swap
    
    boolean IsThreeOfAKind() throws Throwable
    {
        if ( mContent.get(0) == mContent.get(1) && mContent.get(1) == mContent.get(2) ) 
            return true ;
        else return false ;
    } // is three of a kind
    
    boolean IsStraight() throws Throwable
    {
        if ( mContent.get(0) + 1 == mContent.get(1) && mContent.get(1) + 1 == mContent.get(2) )
            return true ;
        else return false ;
    } // IsStraight
    
    boolean HasPair() throws Throwable
    {
        if ( mContent.get(0) == mContent.get(1) || mContent.get(1) == mContent.get(2) ||
             mContent.get(0) == mContent.get(2) )
             return true ;
        else return false ;
    } // HasPair
    
    int Sum() throws Throwable
    {
        int i = 0, sum = 0 ;
        for ( i = 0 ; i < mContent.size() ; i ++ )
        {
            sum = sum + mContent.get(i) ;
        } // for
        
        return sum ;
    } // Sum
}
