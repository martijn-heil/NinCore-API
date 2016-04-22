package tk.martijn_heil.nincore.api;


import lombok.Getter;
import tk.martijn_heil.nincore.api.logging.ModuleLogger;

public class CoreModule
{
    @Getter private Core core;
    @Getter private ModuleLogger logger;


    public CoreModule(Core core)
    {
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
