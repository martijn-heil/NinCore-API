package tk.martijn_heil.nincore.api;


import tk.martijn_heil.nincore.api.localization.MinecraftLocale;

import java.util.Locale;

public interface HasLocale
{
    MinecraftLocale getMinecraftLocale();

    /**
     * A shortcut for {@link MinecraftLocale#toLocale()}
     * @see {@link MinecraftLocale#toLocale()}
     */
    default Locale getLocale()
    {
        return this.getMinecraftLocale().toLocale();
    }
}
