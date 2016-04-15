package me.ninjoh.nincore.api;


import me.ninjoh.nincore.api.command.NinCommand;
import me.ninjoh.nincore.api.command.NinSubCommand;
import me.ninjoh.nincore.api.command.executors.NinCommandExecutor;
import me.ninjoh.nincore.api.command.executors.NinSubCommandExecutor;
import me.ninjoh.nincore.api.entity.NinPlayer;
import me.ninjoh.nincore.api.localization.LocalizedString;
import org.bukkit.OfflinePlayer;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.List;

public interface NinCoreImplementation
{
    NinServer getNinServer();


    NinCommand constructCommand(String name, boolean useStaticDescription, LocalizedString localizedDescription, String requiredPermission, NinCommandExecutor executor, List<NinSubCommand> subCommands, JavaPlugin plugin);


    NinSubCommand constructSubCommand(String name, boolean useStaticDescription, String staticDescription, LocalizedString localizedDescription, String requiredPermission, String usage, List<String> aliases, NinSubCommandExecutor executor, NinCommand parentCommand);

    @NotNull
    NinCommandSender getNinCommandSender(@NotNull CommandSender commandSender);

    @NotNull
    NinConsoleCommandSender getNinConsoleCommandSender();

    @Nullable
    NinPlayer getNinPlayer(@NotNull Player player);

    @Nullable
    NinOfflinePlayer getNinOfflinePlayer(@NotNull OfflinePlayer offlinePlayer);

    @NotNull
    MinecraftLocale getDefaultMinecraftLocale();


    /**
     * The standard default {@link MinecraftLocale} is {@link MinecraftLocale#BRITISH_ENGLISH}
     *
     * @param minecraftLocale The {@link MinecraftLocale} to set default.
     */
    void setDefaultMinecraftLocale(@NotNull MinecraftLocale minecraftLocale);

    void setLocalized(boolean value);

    boolean isLocalized();

    @NotNull
    JavaPlugin getImplementingPlugin();


    /**
     * If colored logging is enabled and the console is ANSI supported, the {@link me.ninjoh.nincore.api.logging.NinPluginLogger}
     * and the {@link me.ninjoh.nincore.api.logging.NinLogger} send messages in color.
     *
     * @return Is colored logging enabled?
     */
    boolean useColoredLogging();


    boolean consoleIsAnsiSupported();
}
