package me.ninjoh.nincore.api.command.executors;


import me.ninjoh.nincore.api.command.NinSubCommand;
import org.bukkit.command.CommandSender;

public interface SubCommandExecutor
{
    SubCommandExecutor init(NinSubCommand subCommand);
    void execute(CommandSender sender, String[] args);
}
