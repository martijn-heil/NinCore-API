package tk.martijn_heil.nincore.api.util;


import com.google.common.base.Preconditions;
import org.bukkit.Bukkit;
import org.bukkit.event.Cancellable;
import org.bukkit.event.Event;
import org.jetbrains.annotations.NotNull;

public class Events
{
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
