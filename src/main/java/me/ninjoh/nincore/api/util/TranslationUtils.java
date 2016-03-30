package me.ninjoh.nincore.api.util;


import com.google.common.base.Preconditions;
import org.jetbrains.annotations.NotNull;

import java.text.MessageFormat;
import java.util.ResourceBundle;

public class TranslationUtils
{
    /**
     * Translate a message with arguments.
     *
     * @param bundle The resource bundle to get the message from.
     * @param args   The arguments to supply.
     * @param msg    The message key (e.g messages.hello)
     * @return the formatted message.
     */
    @NotNull
    public static String transWithArgs(@NotNull ResourceBundle bundle, @NotNull Object[] args, @NotNull String msg)
    {
        Preconditions.checkNotNull(bundle);
        Preconditions.checkNotNull(args);
        Preconditions.checkNotNull(msg);

        MessageFormat formatter = new MessageFormat("");
        formatter.setLocale(bundle.getLocale());

        formatter.applyPattern(bundle.getString(msg));
        return formatter.format(args);
    }


    /**
     * Get a static message from a resource bundle.
     *
     * @param bundle The resource bundle to query.
     * @param msg    The message key to get (e.g messages.hello)
     * @return the message.
     */
    @NotNull
    public static String getStaticMsg(@NotNull ResourceBundle bundle, @NotNull String msg)
    {
        return bundle.getString(msg);
    }
}
