package me.ninjoh.nincore.api;


import me.ninjoh.nincore.api.logging.NinPluginLogger;
import me.ninjoh.nincore.api.util.DataManager;
import org.bukkit.plugin.java.JavaPlugin;
import org.jetbrains.annotations.NotNull;

import java.util.logging.Logger;

public abstract class Core extends JavaPlugin
{
    private ModuleManager moduleManager = new ModuleManager();
    private NinPluginLogger logger;

    @NotNull
    private DataManager dataManager = new DataManager(this);


    @Override
    public final void onLoad()
    {
        this.logger = new NinPluginLogger(this);

        this.onLoadInner();
    }


    @Override
    public final void onEnable()
    {
        this.onEnableInner();
    }


    @Override
    public final void onDisable()
    {
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


    public Logger getNinLogger()
    {
        return logger;
    }


    @NotNull
    public DataManager getDataManager()
    {
        return dataManager;
    }

    public ModuleManager getModuleManager()
    {
        return this.moduleManager;
    }
}
