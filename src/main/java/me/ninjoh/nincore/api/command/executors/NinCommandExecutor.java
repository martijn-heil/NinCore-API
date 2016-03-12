package me.ninjoh.nincore.api.command.executors;


import me.ninjoh.nincore.api.command.NinCommand;
import me.ninjoh.nincore.api.exceptions.TechnicalException;
import me.ninjoh.nincore.api.exceptions.ValidationException;
import org.bukkit.command.CommandSender;

public interface NinCommandExecutor
{
    NinCommandExecutor init(NinCommand command);
    void execute(CommandSender sender, org.bukkit.command.Command cmd, String label, String[] args) throws ValidationException, TechnicalException;
}
