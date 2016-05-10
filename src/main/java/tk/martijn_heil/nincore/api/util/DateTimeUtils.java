package tk.martijn_heil.nincore.api.util;


/**
 * All date and time related utilities.
 */
public class DateTimeUtils
{
    /**
     * Get the current unix time. Is exactly the same as <pre>System.currentTimeMillis() / 1000L;</pre>
     *
     * @return The current unix time.
     */
    public static long getUnixTime()
    {
        return System.currentTimeMillis() / 1000L;
    }
}
