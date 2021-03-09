package patternStructure;

public class rightTriangle   
{   
public static void main(String args[])   
{   
//"rw" for the row number and "clm" for column
    int rw, clm, row=5;    
    for(rw=0; rw<row; rw++)   
{    
    for(clm=0; clm<=rw; clm++)   
{     
    System.out.print("* ");   
}   
    System.out.println();   
}   
}   
}  