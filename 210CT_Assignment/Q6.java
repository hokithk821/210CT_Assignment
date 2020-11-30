
/**
 * Write a description of class Q6 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */

import javax.swing.JOptionPane;
public class Q6{
    public static void main(String[] args) {  
        try{//    ListQueue t = new ListQueue();  
            ArrayQueue t = new ArrayQueue(50);  
            int code, time, count;  
            Integer item;  
            int totalPeople = 0;  
            int totalBus = 0;  
            int totalVacantSeat = 0;  
            int outstandingWait = 0;  
            int people = 0;  
            int wait = 0;  

            do  
            {  
                code = Q6.getInteger("Code (0 for people, 1 for bus, -1 to exit): ");  
            } while (code < -1 || code > 1);  

            int lastTime = 0;  

            while (code!=-1)  
            {  
                do  
                {  
                    time = Q6.getInteger("Arrival time (>="+Integer.toString(lastTime)+"): ");  
                } while (lastTime > time);  

                lastTime = time;  

                do  
                {  
                    count = SimpleInput.getInteger("Arrival count (> 0): ");  
                } while (count <= 0);  

                // output the triplet (for checking)  
                System.out.println(code + "  " + time + "  " + count);  

                if (code==0)  
                {  
                    totalPeople += count;  
                    while (count-- > 0)  
                        t.enqueue (new Integer(time));  
                }  
                else  
                if (code==1)  
                {  
                    totalBus++;  
                    while ( (count > 0) && !t.isEmpty())  
                    {  
                        item = (Integer) t.dequeue();  
                        wait += time - item.intValue();  
                        people++;  
                        count--;  
                    }  
                    totalVacantSeat += count;  
                }  

                do  
                {  
                    code = Q6.getInteger("Code (0 for people, 1 for bus, -1 to exit): ");  
                } while (code < -1 || code > 1);  
            }  

            // check # of people got on a bus  
            if (people != 0) {  // some people got on the bus  
                System.out.println (people + " people waited for " +  
                    wait + " minutes, average waiting time = " +  
                    (float) wait/people + " minutes.");  
            }  
            else {  // no one got on the bus  
                System.out.println ("0 people go on the bus.");  
            }  

            // check # o buses passed the bus stop  
            if (totalBus != 0) {    // some buses did pass the bus stop  
                System.out.println ("Number of buses passed the bus stop = " + totalBus);  
                System.out.println ("Average number of people got on a bus = " +  
                    (float) people/totalBus);  
                System.out.println ("Average number of vacant seats for a bus = " +  
                    (float) totalVacantSeat / totalBus );  
            }  
            else {  // no bus passed the bus stop  
                System.out.println("0 bus passed the bus stop.");  
            }  

            // check # of people still waiting at the bus stop  
            System.out.print ("Number of people still waiting = " +  
                (totalPeople - people)  );  
            if (!t.isEmpty()) {  
                while (!t.isEmpty()) {  
                    item = (Integer) t.dequeue ();  
                    outstandingWait += lastTime - item.intValue();  
                }  
                System.out.println(" with average waiting time = " +  
                    (float) outstandingWait / (totalPeople - people) + " minutes");  
            }  
            else {  
                System.out.println(" with average waiting time = 0.0 minute");  
            }  

            System.exit(0);  

        }catch(QueueFullException e){
            
        }catch(EmptyQueueException e){
        }
    }// main

    public static int getInteger(String prompt) {  
        do {  
            try {  
                return Integer.parseInt(JOptionPane.showInputDialog(null, prompt));  
            }  
            catch (NumberFormatException nfe) {  
                JOptionPane.showMessageDialog(null, "Invalid integer!");  
            }  
        } while (true); 

    }  

    public static float getFloat(String prompt) {  
        do {  
            try {  
                return Float.parseFloat(JOptionPane.showInputDialog(null, prompt));  
            }  
            catch (NumberFormatException nfe) {  
                JOptionPane.showMessageDialog(null, "Invalid number!");  
            }  
        } while (true);  
    }  

    public static String getString(String prompt) {  
        return JOptionPane.showInputDialog(null, prompt);  
    }  

    public static char getChar(String prompt) {  
        String s;  
        do {  
            s = JOptionPane.showInputDialog(null, prompt);  
            if (s.length() == 1)  
                return s.charAt(0);  
        } while (true);  
    } 
}
