package me.ninjoh.nincore.api;


import lombok.Getter;

import java.util.List;

public class ModuleManager
{
    @Getter private List<CoreModule> modules;


    public void enableAll()
    {
        modules.forEach(CoreModule::onEnable);
    }

    public void disableAll()
    {
        modules.forEach(CoreModule::onDisable);
    }
}
