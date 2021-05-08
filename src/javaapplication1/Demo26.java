 class Pattern
    {
        Pattern(int n)
         {  
            int i;
        for ( i=0; i<n; i++) 
            { 
                System.out.print(" ");
            }  
            for (int j=0; j<=i; j++ ) 
            { 
                System.out.print("* "); 
            } 
  
            System.out.println(); 
        }       
    
 }
class Demo26 {
    public static void main(String args[])
    { 
     Pattern p=new Pattern(5); 
       
    }
}
