package me.ninjoh.nincore.api;


import java.util.Locale;

public interface HasLocale
{
    MinecraftLocale getMinecraftLocale();

    default Locale getLocale()
    {
        return this.getMinecraftLocale().toLocale();
    }
}
