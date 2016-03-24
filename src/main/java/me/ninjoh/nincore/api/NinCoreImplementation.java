package me.ninjoh.nincore.api;


import me.ninjoh.nincore.api.command.NinCommand;
import me.ninjoh.nincore.api.command.NinSubCommand;
import me.ninjoh.nincore.api.command.executors.NinCommandExecutor;
import me.ninjoh.nincore.api.command.executors.SubCommandExecutor;
import me.ninjoh.nincore.api.entity.NinPlayer;
import me.ninjoh.nincore.api.exceptions.technicalexceptions.SubCommandAliasAlreadyRegisteredException;
import me.ninjoh.nincore.api.exceptions.technicalexceptions.SubCommandAlreadyExistsException;
import org.bukkit.OfflinePlayer;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;

import java.util.List;

public interface NinCoreImplementation
{
    NinServer getNinServer();

    void registerNinCommand(NinCommand ninCommand, JavaPlugin plugin);

    void registerNinSubCommand(NinSubCommand subCommand, JavaPlugin plugin)
            throws SubCommandAliasAlreadyRegisteredException, SubCommandAlreadyExistsException;

    NinCommand constructCommand(String name, boolean useStaticDescription, String descriptionKey, String descriptionBundleBaseName, String requiredPermission, NinCommandExecutor executor, List<NinSubCommand> subCommands, JavaPlugin plugin);

    NinSubCommand constructSubCommand(String name, boolean useStaticDescription, String staticDescription, String descriptionKey, String descriptionBundleBaseName, String requiredPermission, String usage, List<String> aliases, SubCommandExecutor executor, NinCommand parentCommand);

    NinCommandSender getNinCommandSender(CommandSender commandSender);

    NinPlayer getNinPlayer(Player player);

    NinOfflinePlayer getNinOfflinePlayer(OfflinePlayer offlinePlayer);

    MinecraftLocale getDefaultMinecraftLocale();


    /**
     * The standard default {@link MinecraftLocale} is {@link MinecraftLocale#BRITISH_ENGLISH}
     *
     * @param minecraftLocale The {@link MinecraftLocale} to set default.
     */
    void setDefaultMinecraftLocale(MinecraftLocale minecraftLocale);

    void setLocalized(boolean value);

    boolean isLocalized();

    JavaPlugin getImplementingPlugin();


    /**
     * If colored logging is enabled and the console is ANSI supported, the {@link me.ninjoh.nincore.api.logging.NinLogger}
     * sends messages in color.
     *
     * @return Is colored logging enabled?
     */
    boolean useColoredLogging();
}
