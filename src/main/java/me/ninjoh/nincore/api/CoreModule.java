package me.ninjoh.nincore.api;


import lombok.Getter;

public class CoreModule
{
    @Getter private Core core;
    @Getter private ModuleLogger logger = new ModuleLogger(this);


    public CoreModule(Core core)
    {
        this.core = core;
    }

    public void onEnable()
    {

    }


    public void onDisable()
    {

    }
}
