package tk.martijn_heil.nincore.api.localization;


import tk.martijn_heil.nincore.api.util.TranslationUtils;

import java.util.Locale;
import java.util.ResourceBundle;

/**
 * A static localized string. This does not work with strings which require arguments.
 * This utilizes Java resource bundles.
 */
public class LocalizedString
{
    private ClassLoader loader;
    private String resourceBundleBaseName;
    private String key;


    /**
     * Create a new {@link LocalizedString}
     *
     * @param loader The {@link ClassLoader} to use when loading the {@link ResourceBundle}
     * @param resourceBundleBaseName The fully qualified base name for the resource bundle.
     * @param key The key in the {@link ResourceBundle} to use.
     */
    public LocalizedString(ClassLoader loader, String resourceBundleBaseName, String key)
    {
        this.loader = loader;
        this.resourceBundleBaseName = resourceBundleBaseName;
        this.key = key;
    }


    /**
     * Get this string in a {@link Locale}
     *
     * @param locale The {@link Locale} you want to get the string in.
     * @return The localized string.
     */
    public String get(Locale locale)
    {
        return this.getResourceBundle(locale).getString(key);
    }


    public String getNonStaticString(Locale locale, Object[] args)
    {
        return TranslationUtils.transWithArgs(this.getResourceBundle(locale), args, this.key);
    }


    /**
     * Get the {@link ResourceBundle} this {@link LocalizedString} is stored in.
     *
     * @param locale The locale to get the {@link ResourceBundle} in.
     * @return The {@link ResourceBundle} this {@link LocalizedString} is stored in.
     */
    private ResourceBundle getResourceBundle(Locale locale)
    {
        return ResourceBundle.getBundle(resourceBundleBaseName, locale, loader);
    }
}
