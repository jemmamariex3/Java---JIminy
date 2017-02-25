/*
Jemma Tiongson
Section #16031
App: Jiminy
Purpose: Demonstrate manipulation of Java Arrays by programming an assistant appilication called Jiminy
-------------------------------------------------------------------------
Jiminy is an assitant app that is used in the terminal: should be able to
output the time, date, and pwd commands on Linux

Instructions in Terminal:
   Compile: javac Jiminy
   Run: java Jiminy
_________________________________________________________________________
*/

import java.util.Calendar;
import java.util.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;

class Jiminy{
   public static void main (String [] args){
   
      DateFormat date = SimpleDateFormat.getDateInstance();
      DateFormat time = SimpleDateFormat.getTimeInstance();
     
      if(args.length == 0){
         System.out.println("Available options:\n\t-date\n\t-time\n\t-proc\n\t-freemem\n\t-maxmem\n\t-totmem");
      }
      
      for(int i = 0; i<args.length; i++){
         
         switch (args[i]){
            case "-date":
               System.out.println("Date: " +date.format(Calendar.getInstance().getTime()));
               break;
            case "-time":
               System.out.println("Time: " +time.format(Calendar.getInstance().getTime()));
               break;
            case "-proc":
               System.out.println("Number of available processors: "+Runtime.getRuntime().availableProcessors());
               break;
            case "-freemem":
               System.out.println("Free Memory: "+Runtime.getRuntime().freeMemory());
               break;
            case "-maxmem":
               System.out.println("Max Memory: "+Runtime.getRuntime().maxMemory());
               break;
            case "-totmem":
               System.out.println("Total Memory: "+Runtime.getRuntime().totalMemory());
               break;
            default:
               System.out.println("Option is not supported");
               
         }
      }
      
   }
}