package me.ninjoh.nincore.api.util;


import me.ninjoh.nincore.api.NinCore;

import java.util.Locale;

/**
 * @deprecated Use {@link me.ninjoh.nincore.api.MinecraftLocale} and
 * {@link me.ninjoh.nincore.api.NinCoreImplementation} methods instead.
 */
@Deprecated
public class LocaleUtils
{
    public static void setDefaultLocale(Locale locale)
    {
        Locale.setDefault(locale);
    }


    /**
     * Set if localization should be used.
     *
     * @param value True/False, enable localization?
     */
    public static void setUseLocalization(boolean value)
    {
        NinCore.getImplementation().setUseLocalization(value);
    }


    /**
     * Check if localization is used.
     *
     * @return True if localization is used.
     */
    public static boolean useLocalization()
    {
        return NinCore.getImplementation().useLocalization();
    }
}
