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
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.List;

public interface NinCoreImplementation
{
    NinServer getNinServer();

    void registerNinCommand(NinCommand ninCommand, JavaPlugin plugin);

    void registerNinSubCommand(NinSubCommand subCommand, JavaPlugin plugin)
            throws SubCommandAliasAlreadyRegisteredException, SubCommandAlreadyExistsException;

    // NinCommand constructCommand(@NotNull String name, @Nullable List<NinSubCommand> subCommands, @Nullable List<NinArgument> arguments, @NotNull NinCommandExecutor executor, boolean useArgumentValidation, JavaPlugin plugin);
    NinCommand constructCommand(@NotNull String name, @Nullable String descriptionKey, @Nullable  String descriptionBundleBaseName, @Nullable String staticDescription, @Nullable  List<NinSubCommand> subCommands, @NotNull NinCommandExecutor executor, JavaPlugin plugin);


    // NinSubCommand constructSubCommand(@NotNull String name, @Nullable List<String> aliases, @Nullable String[] description, @Nullable String permission, @Nullable List<NinArgument> arguments, @NotNull SubCommandExecutor executor, @NotNull NinCommand parentCommand, boolean useArgumentValidation);
    NinSubCommand constructSubCommand(@NotNull String name, @Nullable List<String> aliases, @Nullable String descriptionKey, @Nullable String descriptionBundleBaseName, @Nullable String staticDescription, @Nullable String permission, @Nullable String usage, @NotNull SubCommandExecutor executor, @NotNull NinCommand parentCommand);


    //NinArgument constructArgument();

    NinCommandSender getNinCommandSender(CommandSender commandSender);

    NinPlayer getNinPlayer(Player player);

    NinOfflinePlayer getNinOfflinePlayer(OfflinePlayer offlinePlayer);

    MinecraftLocale getDefaultMinecraftLocale();

    void setDefaultMinecraftLocale(MinecraftLocale minecraftLocale);

    void setUseLocalization(boolean value);

    boolean useLocalization();

    JavaPlugin getImplementingPlugin();

    void reloadExternalPlugin(JavaPlugin plugin);

    boolean useColoredLogging();
}
