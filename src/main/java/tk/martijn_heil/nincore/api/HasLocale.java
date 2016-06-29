package tk.martijn_heil.nincore.api;


import tk.martijn_heil.nincore.api.localization.MinecraftLocale;

import java.util.Locale;

public interface HasLocale
{
    MinecraftLocale getMinecraftLocale();
    Locale getLocale();
}
