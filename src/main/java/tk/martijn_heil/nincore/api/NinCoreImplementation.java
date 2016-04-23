package tk.martijn_heil.nincore.api;


import org.bukkit.World;
import org.bukkit.entity.Entity;
import org.bukkit.plugin.java.JavaPlugin;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tk.martijn_heil.nincore.api.command.CommandImplementation;
import tk.martijn_heil.nincore.api.localization.LocalizationManager;
import tk.martijn_heil.nincore.api.logging.NinPluginLogger;

public interface NinCoreImplementation
{

    CommandImplementation getCommandImplementation();

    LocalizationManager getLocalizationManager();

    EntityManager getEntityManager();

    @NotNull
    JavaPlugin getImplementingPlugin();


    /**
     * If colored logging is enabled and the console is ANSI supported, the {@link NinPluginLogger}
     *  sends messages in color.
     *
     * @return Is colored logging enabled?
     */
    boolean useColoredLogging();


    boolean isConsoleAnsiSupported();


    /**
     * Dispatch a command from console. A pre command slash should NOT be included.
     *
     * @param command The command string to send.
     */
    void dispatchCommand(String command);

    /**
     * Get an entity by it's entity ID. Searches in all worlds.
     *
     * @param id The entity ID to search the related entity for.
     * @return The entity, if no entity was found, null will be returned.
     */
    @Nullable
    Entity getEntityById(int id);

    /**
     * @deprecated Use <pre>Bukkit.getWorlds().get(0)</pre> instead.
     * @return The default world.
     */
    @Deprecated
    @NotNull
    World getDefaultWorld();
}
