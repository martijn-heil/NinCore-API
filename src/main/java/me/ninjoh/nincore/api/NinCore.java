package me.ninjoh.nincore.api;


import org.bukkit.Bukkit;
import org.bukkit.plugin.Plugin;

public class NinCore
{
    private static NinCoreImplementation implementation;


    public static Plugin getProvidingPlugin()
    {
        return Bukkit.getPluginManager().getPlugin("NinCore");
    }


    public static void setImplementation(NinCoreImplementation implementation)
    {
        if(NinCore.implementation != null) return;

        NinCore.implementation = implementation;
    }


    public static NinCoreImplementation getImplementation()
    {
        return implementation;
    }
}
