package Greetings;

import printing.IMachine;
import printing.Machine;
import printing.Printer;
/**
 * Created by peatties on 2/10/2015.
 */
public class HelloWorld {

    public static void main(String[] args)
    {
        IMachine machine = new Printer(true, "MY PRINTER");
        //Machine machine = new Machine(false);


        machine.TurnOn();

    }
}
