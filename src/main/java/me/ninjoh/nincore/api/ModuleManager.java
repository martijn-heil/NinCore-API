package me.ninjoh.nincore.api;


import lombok.Getter;
import lombok.Setter;

import java.util.List;

public class ModuleManager
{
    @Getter @Setter private List<CoreModule> modules;


    public void addModule(CoreModule module)
    {
        modules.add(module);
    }


    public void enableAll()
    {
        modules.forEach(CoreModule::onEnable);
    }

    public void disableAll()
    {
        modules.forEach(CoreModule::onDisable);
    }
}
