package tk.martijn_heil.nincore.api;


import com.google.common.base.Preconditions;
import lombok.Getter;
import org.jetbrains.annotations.NotNull;
import tk.martijn_heil.nincore.api.logging.ModuleLogger;

public class CoreModule
{
    @Getter private Core core;
    @Getter private ModuleLogger logger;


    public CoreModule(@NotNull Core core)
    {
        Preconditions.checkNotNull(core, "core can not be null.");

        this.core = core;
        this.logger = new ModuleLogger(this);
    }

    public void onEnable()
    {

    }


    public void onDisable()
    {

    }
}
