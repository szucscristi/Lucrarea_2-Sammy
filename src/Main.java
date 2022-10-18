import java.util.Scanner;
import javax.swing.JOptionPane;
public class Main {
    public static void main(String[] args) {
        JOptionPane.showMessageDialog(null, "Sammy’s makes it fun in the sun");
        int PretTotal,Ore=0,Minute;
        System.out.print("Precizati cate minute utilizatorul a folosit o piesa de echipament sportiv: ");
        Scanner inputDevice = new Scanner(System.in);
        Minute=inputDevice.nextInt();
        inputDevice.nextLine();//if you keep this line the program wait to introduce another string but you don't do anything with it
        while(Minute>=60){// interesting choice but what if you devide by 60 for houres and for extra minutes use %
            Ore++;
            Minute=Minute-60; 
        }
        PretTotal=40*Ore+Minute;
        System.out.print("Ore: "+Ore+"\n"); // instead of '\n' you can use System.out.println method
        System.out.print("Minute: "+Minute+"\n");
        System.out.print("Pretul total: "+PretTotal+"$");
    }
}
