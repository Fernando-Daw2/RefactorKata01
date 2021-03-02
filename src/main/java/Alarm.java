public class Alarm
{
    private final double LowPressureThreshold = 17;
    private final double HighPressureThreshold = 21;


    boolean alarmOn = false;

    public boolean check(Sensor sensor)
    {
        double psiPressureValue = sensor.popNextPressurePsiValue();

        if (psiPressureValue < LowPressureThreshold || HighPressureThreshold < psiPressureValue)
        {
            return true;
        }
        return false;
    }

    public boolean isAlarmOn()
    {
        return alarmOn; 
    }
}
