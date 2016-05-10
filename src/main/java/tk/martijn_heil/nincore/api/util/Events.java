package tk.martijn_heil.nincore.api.util;


import com.google.common.base.Preconditions;
import org.bukkit.Bukkit;
import org.bukkit.event.Cancellable;
import org.bukkit.event.Event;
import org.jetbrains.annotations.NotNull;

/**
 * All {@link Event} related utilities.
 */
public class Events
{
    /**
     * Attempt an event to check it's result.
     * @param c Not just any {@link Cancellable}, it must also be an instance of {@link Event}.
     *
     * @throws IllegalArgumentException if the given {@link Cancellable} is not also an instance of {@link Event}
     *
     * @return Has the event been cancelled?
     */
    public static boolean attempt(@NotNull Cancellable c)
    {
        Preconditions.checkNotNull(c);
        Preconditions.checkArgument(c instanceof Event,
                "The given org.bukkit.event.Cancellable is not an instance of org.bukkit.event.Event");

        Event e = (Event) c;
        Bukkit.getPluginManager().callEvent(e);
        return c.isCancelled();
    }
}
