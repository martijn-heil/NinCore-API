package tk.martijn_heil.nincore.api.util;


public class DateTimeUtils
{
    /**
     * Get the current unix time.
     *
     * @return The current unix time.
     */
    public static long getUnixTime()
    {
        return System.currentTimeMillis() / 1000L;
    }
}
