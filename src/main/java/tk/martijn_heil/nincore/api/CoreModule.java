package tk.martijn_heil.nincore.api;


import com.google.common.base.Preconditions;
import lombok.Getter;
import org.jetbrains.annotations.NotNull;
import tk.martijn_heil.nincore.api.logging.ModuleLogger;

/**
 * A module belonging to a {@link Core}
 *
 * @param <T> The {@link Core} this belongs to.
 */
public abstract class CoreModule <T extends Core>
{
    @Getter private T core;
    @Getter private ModuleLogger logger;


    /**
     *
     * @param core The {@link Core} this belongs to.
     *
     * @throws NullPointerException if core is null.
     */
    public CoreModule(@NotNull T core)
    {
        Preconditions.checkNotNull(core, "core can not be null.");

        this.core = core;
        this.logger = new ModuleLogger(this);
    }


    /**
     * This gets fired when this module gets enabled.
     */
    public void onEnable()
    {

    }


    /**
     * This gets fired when this module gets disabled.
     */
    public void onDisable()
    {

    }


    /**
     * Get this module's name. A module's name should be unique.
     *
     * @return This module's name.
     */
    public abstract String getName();
}
