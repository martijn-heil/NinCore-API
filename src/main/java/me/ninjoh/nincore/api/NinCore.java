package me.ninjoh.nincore.api;


import me.ninjoh.nincore.api.logging.LogColor;
import org.bukkit.plugin.java.JavaPlugin;

public final class NinCore
{
    private static NinCoreImplementation implementation = null;
    private static NinCoreAPILogger logger = new NinCoreAPILogger();


    /**
     * Get the plugin which implements the NinCore API.
     *
     * @return The plugin which implements the NinCore API.
     */
    public static JavaPlugin getImplementingPlugin()
    {
        return implementation.getImplementingPlugin();
    }


    /**
     * Set the current NinCore implementation. This can only be set once during
     * the lifetime of this application. It will silently fail if the NinCore implementation has already been set.
     *
     * @param implementation The current NinCore implementation.
     */
    public static void setImplementation(NinCoreImplementation implementation)
    {
        if (NinCore.implementation != null)
        {
            getApiLogger().warning(LogColor.HIGHLIGHT + implementation.getImplementingPlugin().getName() + LogColor.RESET +
                    " tried to update the current NinCore implementation, but was prevented from doing so.");
        }
        else
        {
            NinCore.implementation = implementation;
            getApiLogger().info("NinCore implementation set to: " + LogColor.HIGHLIGHT +
                    NinCore.getImplementation().getImplementingPlugin().getName() + " v" +
                    NinCore.getImplementation().getImplementingPlugin().getDescription().getVersion());
        }
    }


    /**
     * Get the current NinCore implementation
     *
     * @return The current {@link NinCoreImplementation}
     */
    public static NinCoreImplementation getImplementation()
    {
        return implementation;
    }


    /**
     * An alias for {@link NinCore#getImplementation()}
     *
     * @return The current {@link NinCoreImplementation}
     */
    public static NinCoreImplementation get()
    {
        return implementation;
    }


    /**
     * <bold>Only for internal usage! Do NOT use!</bold>
     */
    @Deprecated
    public static NinCoreAPILogger getApiLogger()
    {
        return logger;
    }
}
