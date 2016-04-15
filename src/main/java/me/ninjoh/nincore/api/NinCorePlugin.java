package me.ninjoh.nincore.api;


import me.ninjoh.nincore.api.logging.LogColor;
import me.ninjoh.nincore.api.logging.NinPluginLogger;
import me.ninjoh.nincore.api.util.DataManager;
import org.bukkit.plugin.java.JavaPlugin;
import org.jetbrains.annotations.NotNull;

import java.util.logging.Logger;

public abstract class NinCorePlugin extends JavaPlugin
{
    private NinPluginLogger logger;
    @NotNull
    private DataManager dataManager = new DataManager(this);
    private boolean silentDisable = false;


    @Override
    public final void onLoad()
    {
        this.logger = new NinPluginLogger(this);

        this.onLoadInner();
    }


    @Override
    public final void onEnable()
    {
        this.getNinLogger().info("");
        this.getNinLogger().info("===== ENABLING " + LogColor.HIGHLIGHT + this.getName() + " v" +
                this.getDescription().getVersion() + LogColor.RESET + " =====");
        this.getNinLogger().info("");


        this.onEnableInner();


        if (this.isEnabled())
        {
            this.getNinLogger().info("");
            this.getNinLogger().info("===== " + LogColor.GOOD + "SUCCESSFULLY " + LogColor.RESET + "ENABLED " +
                    LogColor.HIGHLIGHT + this.getName() + " v" + this.getDescription().getVersion() + LogColor.RESET + " =====");
            this.getNinLogger().info("");
        }
    }


    @Override
    public final void onDisable()
    {
        if (!silentDisable)
        {
            this.getNinLogger().info("");
            this.getNinLogger().info("===== DISABLING " + LogColor.HIGHLIGHT + this.getName() + " v" + this.getDescription().getVersion() + LogColor.RESET + " =====");
            this.getNinLogger().info("");

            this.onDisableInner();

            this.getNinLogger().info("");
            this.getNinLogger().info("===== DISABLED " + LogColor.HIGHLIGHT + this.getName() + " v" + this.getDescription().getVersion() + LogColor.RESET + " =====");
            this.getNinLogger().info("");
        }
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
        this.getNinLogger().info("");
        this.getNinLogger().severe("===== COULD NOT ENABLE " + LogColor.HIGHLIGHT + this.getName() + " v" +
                this.getDescription().getVersion() + LogColor.RESET + " =====");
        this.getNinLogger().info("");
        this.silentDisable = true;
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
}