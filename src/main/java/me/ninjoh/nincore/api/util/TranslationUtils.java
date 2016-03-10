package me.ninjoh.nincore.api.util;


import org.jetbrains.annotations.NotNull;

import java.text.MessageFormat;
import java.util.ResourceBundle;

public class TranslationUtils
{
    /**
     * Translate a message with arguments.
     *
     * @param bundle The resource bundle to get the message from.
     * @param args The arguments to supply.
     * @param msg The message key (e.g messages.hello)
     * @return the formatted message.
     */
    public static String transWithArgs(ResourceBundle bundle, Object[] args, String msg)
    {;
        MessageFormat formatter = new MessageFormat("");
        formatter.setLocale(bundle.getLocale());

        formatter.applyPattern(bundle.getString(msg));
        return formatter.format(args);
    }

    /**
     * Get a static message from a resource bundle.
     *
     * @param bundle The resource bundle to query.
     * @param msg The message key to get (e.g messages.hello)
     * @return the message.
     */
    public static String getStaticMsg(@NotNull ResourceBundle bundle, @NotNull String msg)
    {
        return bundle.getString(msg);
    }
}
