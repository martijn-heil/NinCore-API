package tk.martijn_heil.nincore.api;


import com.google.common.base.Preconditions;
import org.bukkit.plugin.java.JavaPlugin;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;

public final class NinCore
{
    private static NinCoreImplementation implementation = null;


    /**
     * Get the plugin which implements the NinCore API.
     *
     * @return The plugin which implements the NinCore API.
     */
    @NotNull
    public static JavaPlugin getImplementingPlugin()
    {
        if(implementation == null) throw new IllegalStateException("The NinCore implementation is not set.");

        return implementation.getImplementingPlugin();
    }


    /**
     * Set the current NinCore implementation. This can only be set once during
     * the lifetime of this application. It will log an warning message if the implementation is already set.
     *
     * @param implementation The current NinCore implementation.
     */
    public static void setImplementation(@NotNull NinCoreImplementation implementation)
    {
        Preconditions.checkNotNull(implementation);

        if (NinCore.implementation == null)
        {
            NinCore.implementation = implementation;
        }
    }


    /**
     * Get the current NinCore implementation
     *
     * @return The current {@link NinCoreImplementation}
     */
    @NotNull
    public static NinCoreImplementation getImplementation()
    {
        if(implementation == null) throw new IllegalStateException("The NinCore implementation is not set.");

        return implementation;
    }


    @Contract(pure = true)
    public static boolean isImplementationSet()
    {
        return implementation != null;
    }


    /**
     * An alias for {@link NinCore#getImplementation()}
     *
     * @return The current {@link NinCoreImplementation}
     */
    @NotNull
    public static NinCoreImplementation get()
    {
        if(implementation == null) throw new IllegalStateException("The NinCore implementation is not set.");

        return implementation;
    }
}
