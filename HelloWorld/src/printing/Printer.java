package printing;

import java.awt.print.Paper;

public class Printer implements IMachine
{
    private String modelNumber;
    private PaperTray paperTray = new PaperTray();
    private Machine machine;

    public Printer(boolean isOn, String modelNumber)
    {
        machine = new Machine(isOn);
        this.modelNumber = modelNumber;
    }

    public void loadPaper(int count)
    {
        paperTray.addPaper(count);
    }

    @Override
    public void TurnOn()
    {
        machine.TurnOn();
    }

    @Override
    public void TurnOff()
    {
        machine.TurnOff();
    }

    public void print(int copies)
    {
        String onStatus = "";
        if(machine.isOn())
            onStatus = " Is On!";
        else
            onStatus = " Is Off!";

        String textToPrint = modelNumber + onStatus;

        //for(int i = 0; i < copies; i++)
        while(copies > 0 && !paperTray.isEmpty())
        {
            System.out.println(textToPrint);
            copies--;
            paperTray.usePage();
        }

        if(paperTray.isEmpty())
            System.out.println("Load more paper");
    }

    public void printColors()
    {
        String[] colors = new String[] {"Red", "Blue", "Green"};

        for(String currentColor : colors)
        {
            if("Blue".equals(currentColor) )
                continue;

            System.out.println(currentColor);
        }

    }

    @Override
    public boolean isOn()
    {
        return machine.isOn;
    }

    private void print(String text)
    {
        System.out.println(text);
    }

    public String getModelNumber()
    {
        return modelNumber;
    }

}
