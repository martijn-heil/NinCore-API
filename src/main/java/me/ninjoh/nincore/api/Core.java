package me.ninjoh.nincore.api;


import lombok.Getter;
import me.ninjoh.nincore.api.logging.NinPluginLogger;
import me.ninjoh.nincore.api.util.DataManager;
import org.bukkit.plugin.java.JavaPlugin;
import org.jetbrains.annotations.NotNull;

public abstract class Core extends JavaPlugin
{
    @Getter private ModuleManager moduleManager = new ModuleManager();
    @Getter private NinPluginLogger ninLogger;

    @NotNull
    @Getter
    private DataManager dataManager = new DataManager(this);


    @Override
    public final void onLoad()
    {
        this.ninLogger = new NinPluginLogger(this);

        this.onLoadInner();
    }


    @Override
    public final void onEnable()
    {
        this.onEnableInner();
        this.getModuleManager().enableAll();
    }


    @Override
    public final void onDisable()
    {
        this.getModuleManager().disableAll();
        this.onDisableInner();
    }


    public void onLoadInner()
    {
    }


    public void onEnableInner()
    {
    }


    public void onDisableInner()
    {
    }


    public final void endEnable()
    {
        this.setEnabled(false);
    }
}
