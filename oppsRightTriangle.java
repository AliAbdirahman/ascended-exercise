package patternStructure;

public class oppsRightTriangle   
{   
public static void main(String args[])   
{   
//"rw" for the row number and "clm" for column
    int rows=5;      
    for (int rw= rows-1; rw>=0 ; rw--)  
{    
    for (int clm=0; clm<=rw; clm++)  
{    
    System.out.print("* ");  
}  
    System.out.println();   
}   
}   
}  