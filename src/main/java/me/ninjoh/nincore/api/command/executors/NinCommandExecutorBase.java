package me.ninjoh.nincore.api.command.executors;


import me.ninjoh.nincore.api.exceptions.TechnicalException;
import me.ninjoh.nincore.api.exceptions.ValidationException;
import org.bukkit.command.CommandSender;

public interface NinCommandExecutorBase
{
    void execute(CommandSender sender, String[] args) throws ValidationException, TechnicalException;
}
