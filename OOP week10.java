//Creating interface that has 2 methods  
interface typeColor{  
void white();//bydefault, public and abstract  
void black();  
}  
  
//Creating abstract class that provides the implementation of one method of A interface  
abstract class watColor implements typeColor{  
public void black(){System.out.println("I am the color black");}  
}  
  
//Creating subclass of abstract class, now we need to provide the implementation of rest of the methods  
class M extends watColor{  
public void white(){System.out.println("I am the color white");}  
}  
  
//Creating color test class that calls the methods of Color interface  
class Test5{  
public static void main(String args[]){  
var test=new M();  
test.white();  
test.black();  
}}  