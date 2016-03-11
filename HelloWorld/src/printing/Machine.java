package printing;

/**
 * Created by peatties on 2/17/2015.
 */
public class Machine implements IMachine
{
    protected boolean isOn;

    public Machine(boolean isOn)
    {
        this.isOn = isOn;
    }

    public void TurnOn()
    {
        isOn = true;
        System.out.println("Machine is On!");
    }

    public void TurnOff()
    {
        isOn = false;
    }

    @Override
    public boolean isOn()
    {
        return isOn;
    }
}
