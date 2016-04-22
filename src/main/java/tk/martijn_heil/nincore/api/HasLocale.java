package tk.martijn_heil.nincore.api;


import java.util.Locale;

public interface HasLocale
{
    tk.martijn_heil.nincore.api.localization.MinecraftLocale getMinecraftLocale();

    default Locale getLocale()
    {
        return this.getMinecraftLocale().toLocale();
    }
}
