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

    // NinCommand constructCommand(@NotNull String name, @Nullable List<NinSubCommand> subCommands, @Nullable List<NinArgument> arguments, @NotNull NinCommandExecutor executor, boolean useArgumentValidation, JavaPlugin plugin);
    NinCommand constructCommand(String name, boolean useStaticDescription, String descriptionKey, String descriptionBundleBaseName, String requiredPermission, NinCommandExecutor executor, List<NinSubCommand> subCommands, JavaPlugin plugin);


    // NinSubCommand constructSubCommand(@NotNull String name, @Nullable List<String> aliases, @Nullable String[] description, @Nullable String permission, @Nullable List<NinArgument> arguments, @NotNull SubCommandExecutor executor, @NotNull NinCommand parentCommand, boolean useArgumentValidation);
    NinSubCommand constructSubCommand(String name, boolean useStaticDescription, String staticDescription, String descriptionKey, String descriptionBundleBaseName, String requiredPermission, String usage, List<String> aliases, SubCommandExecutor executor, NinCommand parentCommand);


    //NinArgument constructArgument();

    NinCommandSender getNinCommandSender(CommandSender commandSender);

    NinPlayer getNinPlayer(Player player);

    NinOfflinePlayer getNinOfflinePlayer(OfflinePlayer offlinePlayer);

    MinecraftLocale getDefaultMinecraftLocale();

    void setDefaultMinecraftLocale(MinecraftLocale minecraftLocale);

    void setUseLocalization(boolean value);

    boolean useLocalization();

    JavaPlugin getImplementingPlugin();

    boolean useColoredLogging();
}
