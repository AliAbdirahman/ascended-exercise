package patternStructure;

public class isocelesTriangle  
{    
public static void main(String args[])   
{    
//rw for rows and clm for columns      
//row denotes the number of rows you want to print  
int rw, clm, row = 5;      
 
for (rw=0; rw<row; rw++)   
{  
        
for (clm=row-rw; clm>1; clm--)   
{  
     
System.out.print(" ");   
}   

for (clm=0; clm<=rw; clm++ )   
{   
//prints star      
System.out.print("* ");   
}   

System.out.println();   
}   
}   
}  