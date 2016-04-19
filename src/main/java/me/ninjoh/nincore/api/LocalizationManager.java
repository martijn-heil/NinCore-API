package me.ninjoh.nincore.api;


import org.jetbrains.annotations.NotNull;

public interface LocalizationManager
{
    void setLocalizationEnabled(boolean value);

    boolean isLocalizationEnabled();

    @NotNull
    MinecraftLocale getDefaultMinecraftLocale();


    /**
     * The standard default {@link MinecraftLocale} is {@link MinecraftLocale#BRITISH_ENGLISH}
     *
     * @param minecraftLocale The {@link MinecraftLocale} to set default.
     */
    void setDefaultMinecraftLocale(@NotNull MinecraftLocale minecraftLocale);
}
