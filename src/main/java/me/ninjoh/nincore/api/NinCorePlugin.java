package me.ninjoh.nincore.api;


import org.bukkit.plugin.java.JavaPlugin;

public class NinCorePlugin extends JavaPlugin
{
    @Override
    public void onEnable()
    {
        this.getLogger().info("");
        this.getLogger().info("===== ENABLING " + this.getName() + " v" + this.getDescription().getVersion() + " =====");
        this.getLogger().info("");





        this.onEnableInner();


        if(this.isEnabled())
        {
            this.getLogger().info("");
            this.getLogger().info("===== SUCCESSFULLY ENABLED " + this.getName() + " v" +
                    this.getDescription().getVersion() + " =====");
            this.getLogger().info("");
        }
        else
        {
            this.endEnable();
        }
    }


    @Override
    public void onDisable()
    {
        this.onDisableInner();

        //AnsiConsole.systemUninstall();
    }


    public void onEnableInner()
    {

    }


    public void onDisableInner()
    {

    }


    public void endEnable()
    {
        this.getLogger().info("");
        this.getLogger().warning("===== COULD NOT ENABLE " + this.getName() + " v" +
                this.getDescription().getVersion() + " =====");
        this.getLogger().info("");
    }
}
