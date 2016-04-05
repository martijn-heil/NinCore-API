package me.ninjoh.nincore.api;


import com.google.common.base.Preconditions;
import me.ninjoh.nincore.api.internals.Internals;
import me.ninjoh.nincore.api.logging.LogColor;
import org.bukkit.plugin.java.JavaPlugin;
import org.jetbrains.annotations.NotNull;

public final class NinCore
{
    private static NinCoreImplementation implementation = null;


    /**
     * Get the plugin which implements the NinCore API.
     *
     * @return The plugin which implements the NinCore API.
     */
    public static JavaPlugin getImplementingPlugin()
    {
        if(implementation == null) throw new IllegalStateException("The NinCore implementation is not set.");

        return implementation.getImplementingPlugin();
    }


    /**
     * Set the current NinCore implementation. This can only be set once during
     * the lifetime of this application. It will silently fail if the NinCore implementation has already been set.
     *
     * @param implementation The current NinCore implementation.
     */
    public static void setImplementation(@NotNull NinCoreImplementation implementation)
    {
        Preconditions.checkNotNull(implementation);

        if (NinCore.implementation != null)
        {
            Internals.getApiLogger().warning(LogColor.HIGHLIGHT + implementation.getImplementingPlugin().getName() + LogColor.RESET +
                    " tried to update the current NinCore implementation, but was prevented from doing so.");
        }
        else
        {
            NinCore.implementation = implementation;
            Internals.getApiLogger().info("NinCore implementation set to: " + LogColor.HIGHLIGHT +
                    implementation.getImplementingPlugin().getName() + " v" +
                    implementation.getImplementingPlugin().getDescription().getVersion());
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
        return implementation;
    }
}
