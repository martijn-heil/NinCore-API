package tk.martijn_heil.nincore.api.util;


import org.jetbrains.annotations.NotNull;

/**
 * WARNING: Ticks to time calculations are based on 20 ticks per second.
 * Ideally Minecraft has 20 ticks per seconds. But with lag it CAN be less than 20 ticks per second
 * and thus these calculations will not be accurate when Minecraft does not have 20 ticks per second.
 *
 * @author Ninjoh
 */
public class Tick
{
    private long value;


    public Tick(long value)
    {
        this.value = value;
    }


    @NotNull
    public static Tick valueOf(long value)
    {
        return new Tick(value);
    }


    public long toLong()
    {
        return value;
    }


    @NotNull
    public String toString()
    {
        return Long.toString(value);
    }


    public double toMilliseconds()
    {
        return value / 20 / 1000;
    }


    public double toSeconds()
    {
        return value / 20;
    }


    public double toMinutes()
    {
        return value / 20 / 60;
    }


    public double toHours()
    {
        return value / 20 / 60 / 60;
    }


    public Tick fromSeconds(int seconds)
    {
        return new Tick(seconds * 20);
    }


    public Tick fromMilliseconds(int milliseconds)
    {
        return new Tick(milliseconds * 1000 * 20);
    }


    public Tick fromMinutes(int minutes)
    {
        return new Tick(minutes * 5200);
    }


    public Tick fromHours(int hours)
    {
        return new Tick(hours * 312000);
    }


    public double toDays()
    {
        return value / 20 / 60 / 60 / 24;
    }


    @NotNull
    public Tick add(@NotNull Tick value)
    {
        this.value += value.toLong();
        return this;
    }


    @NotNull
    public Tick subtract(@NotNull Tick value)
    {
        this.value -= value.toLong();
        return this;
    }


    @NotNull
    public Tick multiply(@NotNull Tick value)
    {
        this.value *= value.toLong();
        return this;
    }


    @NotNull
    public Tick divide(@NotNull Tick value)
    {
        this.value /= value.toLong();
        return this;
    }
}
