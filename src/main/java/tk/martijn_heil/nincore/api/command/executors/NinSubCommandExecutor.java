package tk.martijn_heil.nincore.api.command.executors;


import tk.martijn_heil.nincore.api.command.NinSubCommand;
import tk.martijn_heil.nincore.api.exceptions.TechnicalException;
import tk.martijn_heil.nincore.api.exceptions.ValidationException;
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
