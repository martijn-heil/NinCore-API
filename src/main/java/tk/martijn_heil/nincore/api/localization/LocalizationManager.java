package tk.martijn_heil.nincore.api.localization;


import org.jetbrains.annotations.NotNull;

public interface LocalizationManager
{
    void setLocalizationEnabled(boolean value);

    boolean isLocalizationEnabled();

    @NotNull
    tk.martijn_heil.nincore.api.localization.MinecraftLocale getDefaultMinecraftLocale();


    /**
     * The standard default {@link tk.martijn_heil.nincore.api.localization.MinecraftLocale} is {@link tk.martijn_heil.nincore.api.localization.MinecraftLocale#BRITISH_ENGLISH}
     *
     * @param minecraftLocale The {@link tk.martijn_heil.nincore.api.localization.MinecraftLocale} to set default.
     */
    void setDefaultMinecraftLocale(@NotNull tk.martijn_heil.nincore.api.localization.MinecraftLocale minecraftLocale);
}
