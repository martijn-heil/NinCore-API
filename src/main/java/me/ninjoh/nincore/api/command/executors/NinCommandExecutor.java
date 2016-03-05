package me.ninjoh.nincore.api.command.executors;


import me.ninjoh.nincore.api.command.NinCommand;
import org.bukkit.command.CommandSender;

public interface NinCommandExecutor
{
    NinCommandExecutor init(NinCommand command);
    void execute(CommandSender sender, org.bukkit.command.Command cmd, String label, String[] args);
}
