package me.ninjoh.nincore.api;


import org.bukkit.plugin.java.JavaPlugin;

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
        if(NinCore.implementation != null)
        {
            NinCore.getImplementation().getImplementingPlugin().getLogger().warning(
                    implementation.getImplementingPlugin().getName() +
                            " tried to update the current NinCore implementation, but was prevented from doing so.");

            return;
        }

        NinCore.implementation = implementation;
        NinCore.getImplementation().getImplementingPlugin().getLogger().info("NinCore implementation set to: " +
        NinCore.getImplementation().getImplementingPlugin().getName() + " v" +
                NinCore.getImplementation().getImplementingPlugin().getDescription().getVersion());
    }


    /**
     * Get the current NinCore implementation
     *
     * @return The current NinCore implementation
     */
    public static NinCoreImplementation getImplementation()
    {
        return implementation;
    }
}
