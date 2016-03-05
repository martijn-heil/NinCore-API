package me.ninjoh.nincore.api.util;


import org.jetbrains.annotations.NotNull;

import java.text.MessageFormat;
import java.util.Locale;
import java.util.ResourceBundle;

public class TranslationUtils
{
    public static String transWithArgs(@NotNull String bundleName, @NotNull Locale locale, Object[] args, String msg)
    {
        ResourceBundle messages = ResourceBundle.getBundle(bundleName, locale);
        MessageFormat formatter = new MessageFormat("");
        formatter.setLocale(locale);


        formatter.applyPattern(messages.getString("commandHelp.commandHelpFor"));
        return formatter.format(args);
    }

    public static String getStaticMsg(@NotNull ResourceBundle bundle, @NotNull String msg)
    {
        return bundle.getString(msg);
    }
}
