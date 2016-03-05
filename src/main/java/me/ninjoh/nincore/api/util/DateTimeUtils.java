package me.ninjoh.nincore.api.util;


public class DateTimeUtils
{
    public static long getUnixTime()
    {
        return System.currentTimeMillis() / 1000L;
    }
}
