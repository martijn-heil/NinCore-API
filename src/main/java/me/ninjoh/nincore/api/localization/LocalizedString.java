package me.ninjoh.nincore.api.localization;


import me.ninjoh.nincore.api.util.TranslationUtils;

import java.util.Locale;
import java.util.ResourceBundle;

public class LocalizedString
{
    private ClassLoader loader;
    private String resourceBundleBaseName;
    private String key;


    public LocalizedString(ClassLoader loader, String resourceBundleBaseName, String key)
    {
        this.loader = loader;
        this.resourceBundleBaseName = resourceBundleBaseName;
        this.key = key;
    }


    public String get(Locale locale)
    {
        return this.getResourceBundle(locale).getString(key);
    }


    public String getNonStaticString(Locale locale, Object[] args)
    {
        return TranslationUtils.transWithArgs(this.getResourceBundle(locale), args, this.key);
    }


    private ResourceBundle getResourceBundle(Locale locale)
    {
        return ResourceBundle.getBundle(resourceBundleBaseName, locale, loader);
    }
}
