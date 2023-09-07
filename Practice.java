class Pratice  
{  
public static void main(String args[])   
{  
System.out.println(capitalize("welcome"));     
System.out.println(capitalize("to"));          
System.out.println(capitalize("java"));    
}  
 
public static final String capitalize(String str)   
{  
if (str == null || str.length() == 0) return str;  
return str.substring(0, 1).toUpperCase() + str.substring(1);  
}  
}  