package longkod;

//Java program to demonstrate 
//allocate() method 

import java.nio.*; 
import java.util.*; 

public class longcode { 
 public static void main(String[] args) 
 { 

     // Declaring the capacity of the LongBuffer 
     int Capacity = 10; 

     // Creating the LongBuffer 

     // creating object of Longbuffer 
     // and allocating size capacity 
     LongBuffer ib = LongBuffer.allocate(Capacity); 

     // putting the value in Longbuffer 
     ib.put(11); 
     ib.put(2, 19); 

     System.out.println("LongBuffer: "
                        + Arrays.toString(ib.array())); 
 } 
} 