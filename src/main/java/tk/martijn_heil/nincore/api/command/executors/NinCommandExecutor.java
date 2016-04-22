package tk.martijn_heil.nincore.api.command.executors;


import tk.martijn_heil.nincore.api.command.NinCommand;
import tk.martijn_heil.nincore.api.exceptions.TechnicalException;
import tk.martijn_heil.nincore.api.exceptions.ValidationException;
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
