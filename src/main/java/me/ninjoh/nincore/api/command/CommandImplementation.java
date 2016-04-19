package me.ninjoh.nincore.api.command;


import me.ninjoh.nincore.api.command.executors.NinCommandExecutor;
import me.ninjoh.nincore.api.command.executors.NinSubCommandExecutor;
import me.ninjoh.nincore.api.localization.LocalizedString;
import org.bukkit.plugin.java.JavaPlugin;

import java.util.List;

public interface CommandImplementation
{
    NinCommand constructCommand(String name, boolean useStaticDescription, LocalizedString localizedDescription, String requiredPermission, NinCommandExecutor executor, List<NinSubCommand> subCommands, JavaPlugin plugin);


    NinSubCommand constructSubCommand(String name, boolean useStaticDescription, String staticDescription, LocalizedString localizedDescription, String requiredPermission, String usage, List<String> aliases, NinSubCommandExecutor executor, NinCommand parentCommand);
}
