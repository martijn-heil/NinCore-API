package me.ninjoh.nincore.api.command.executors;


import me.ninjoh.nincore.api.command.NinSubCommand;
import me.ninjoh.nincore.api.exceptions.TechnicalException;
import me.ninjoh.nincore.api.exceptions.ValidationException;
import org.bukkit.command.CommandSender;

public abstract class NinSubCommandExecutor implements NinCommandExecutorBase
{
    private NinSubCommand ninSubCommand;


    public final NinSubCommandExecutor init(NinSubCommand ninSubCommand)
    {
        this.ninSubCommand = ninSubCommand;
        return this;
    }


    public NinSubCommand getNinSubCommand()
    {
        return this.ninSubCommand;
    }


    @Override
    public abstract void execute(CommandSender sender, String[] args) throws ValidationException, TechnicalException;
}
