package me.ninjoh.nincore.api.command.executors;


import me.ninjoh.nincore.api.command.NinCommand;
import me.ninjoh.nincore.api.exceptions.TechnicalException;
import me.ninjoh.nincore.api.exceptions.ValidationException;
import org.bukkit.command.CommandSender;

public abstract class NinCommandExecutor implements NinCommandExecutorBase
{
    private NinCommand ninCommand;


    public final NinCommandExecutor init(NinCommand ninCommand)
    {
        this.ninCommand = ninCommand;
        return this;
    }


    public NinCommand getNinCommand()
    {
        return this.ninCommand;
    }


    @Override
    public abstract void execute(CommandSender sender, String[] args) throws ValidationException, TechnicalException;
}
