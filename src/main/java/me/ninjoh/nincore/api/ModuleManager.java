package me.ninjoh.nincore.api;


import java.util.List;

public class ModuleManager
{
    private List<Module> modules;


    public void enableAll()
    {
        modules.forEach(Module::onEnable);
    }

    public void disableAll()
    {
        modules.forEach(Module::onDisable);
    }
}
