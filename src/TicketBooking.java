import java.util.ArrayList;
import java.util.Scanner;
import java.util.SortedMap;

public class TicketBooking {
    public static void main(String[] args) {
        ArrayList<Integer> mlist = new ArrayList<>();
        mlist.add(1);
        mlist.add(2);
        mlist.add(3);
        mlist.add(4);
        mlist.add(5);
        while (mlist.size() != 0){
            pho(mlist);
        }
    }
    static void pho(ArrayList<Integer> mlist){
        System.out.println("Enter Phone Number");
        Scanner in = new Scanner(System.in);
        String usermob = in.next();
        if (usermob.length() == 10){
            userInput(mlist);
        }
    }

        static void userInput(ArrayList<Integer> mlist){
                System.out.println("Available Seats"+ " " +mlist);
                Scanner in = new Scanner(System.in);
                int userseat = in.nextInt();
               int index = mlist.indexOf(userseat);
                mlist.remove(index);
                System.out.println("Seat"+" "+userseat+" "+"Booked Successfully");
           // System.out.println("Remaining Seat"+" "+mlist);
            System.out.println("Do u want norukutheeni"+" "+"Type yes or no");
            Scanner inpu = new Scanner(System.in);
            String scn = inpu.next().toLowerCase();
            String[] snck = {"1.ladu","2.egg puff","3.chicken roll"};
            if (scn.equals("y")){
                 for (int i =0; i<snck.length;i++){
                     System.out.println(snck[i]);
                 }
            }else if(scn.equals("n")) {
                System.out.println("Thank you");
            }
            System.out.println("Select Item number");
            int item = inpu.nextInt();
            System.out.println(snck[item-1] +" "+ "Has booked");
            System.out.println("Ticket Booked");

        }
    }

