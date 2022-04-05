package JAVA.Week11;

import java.util.Random;
public class StopWatch {
 
      private long startTime = System.currentTimeMillis();
      private long endTime = startTime;
 
      public StopWatch() {
      }
 
      public void start() {
           startTime = System.currentTimeMillis();
      }
      
      public void stop() {
           endTime = System.currentTimeMillis();
      }
 
      public long getElapsedTime() {
           return endTime - startTime;
      }  
      public static void main(String args[])
     {
         int[] list = new int[1000000];
         Random random = new Random();
         StopWatch stopwatch = new StopWatch();
        stopwatch.start();
         for(int i=0;i<list.length;i++)
            list[i] = random.nextInt(100);
        stopwatch.stop();
        
        System.out.println("Elapsed Time = "+stopwatch.getElapsedTime());
     }
 }