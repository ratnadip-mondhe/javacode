class assign25 
{              
public static void main(String[] args)  
{  
int alphabet = 65;   
int n=5;
for (int i = 0; i <=n; i++)
{    


for (int j =0; j<=n-i; j++)  
{  
System.out.print(" ");   
}       
for (int k =0; k<=i; k++)  
{  
System.out.print((char) (alphabet +k) + " ");   
}  
System.out.println();  
}  
}  
}  