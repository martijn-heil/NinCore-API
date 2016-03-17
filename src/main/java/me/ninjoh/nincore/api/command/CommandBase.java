package me.ninjoh.nincore.api.command;


import java.util.List;
import java.util.Locale;

public interface CommandBase
{
    String getName();

    boolean hasDescription();

    String getDescription();

    String getDescription(Locale inLocale);

    List<String> getAliases(boolean includeMainAlias);

    boolean hasAliases();

    boolean requiresPermission();

    String getRequiredPermission();

    String getUsage();

    void setUsage(String value);

    boolean descriptionIsStatic();
}
