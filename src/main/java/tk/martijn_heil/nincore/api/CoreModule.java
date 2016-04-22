package tk.martijn_heil.nincore.api;


import lombok.Getter;

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
