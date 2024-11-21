import java.rmi.*; 
import java.rmi.registry.*;
public class MyClient
{ 
public static void main(String args[])
{ 
try
{ 
Adder st=(Adder)Naming.lookup("rmi://localhost:8000"+"/add"); 
System.out.println("Successfully Connected! using RMI");
System.out.println(st.add(39,5)); 
}
catch(Exception e)
{
System.err.println("Client Side exception: " + e.toString()); 
 e.printStackTrace();
} 
} 
} 
