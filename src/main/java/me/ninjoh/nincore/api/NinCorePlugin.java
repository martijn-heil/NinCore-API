package me.ninjoh.nincore.api;


import me.ninjoh.nincore.api.logging.NinLogger;
import me.ninjoh.nincore.api.logging.LogColor;
import me.ninjoh.nincore.api.util.DataManager;
import org.bukkit.plugin.java.JavaPlugin;

public abstract class NinCorePlugin extends JavaPlugin
{
    private NinLogger logger = new NinLogger(this);
    private DataManager dataManager = new DataManager(this);
    private boolean silentDisable = false;

    @Override
    public final void onEnable()
    {
        this.getNinLogger().info("");
        this.getNinLogger().info("===== ENABLING " + LogColor.HIGHLIGHT + this.getName() + " v" + this.getDescription().getVersion() + LogColor.RESET + " =====");
        this.getNinLogger().info("");


        this.onEnableInner();


        if(this.isEnabled())
        {
            this.getNinLogger().info("");
            this.getNinLogger().info("===== " + LogColor.GOOD + "SUCCESSFULLY " + LogColor.RESET + "ENABLED " + LogColor.HIGHLIGHT + this.getName() + " v" +
                    this.getDescription().getVersion() + LogColor.RESET + " =====");
            this.getNinLogger().info("");
        }
    }


    @Override
    public final void onDisable()
    {
        if(!silentDisable)
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


    public abstract void onEnableInner();

    public abstract void onDisableInner();


    public final void endEnable()
    {
        this.getNinLogger().info("");
        this.getNinLogger().severe("===== COULD NOT ENABLE " + LogColor.HIGHLIGHT + this.getName() + " v" +
                this.getDescription().getVersion() + LogColor.RESET + " =====");
        this.getNinLogger().info("");
        this.silentDisable = true;
        this.setEnabled(false);
    }


    public NinLogger getNinLogger()
    {
        return logger;
    }


    public DataManager getDataManager()
    {
        return dataManager;
    }
}
