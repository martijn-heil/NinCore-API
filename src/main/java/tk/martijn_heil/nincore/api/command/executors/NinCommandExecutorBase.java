package tk.martijn_heil.nincore.api.command.executors;


import tk.martijn_heil.nincore.api.exceptions.TechnicalException;
import tk.martijn_heil.nincore.api.exceptions.ValidationException;
import org.bukkit.command.CommandSender;

public interface NinCommandExecutorBase
{
    void execute(CommandSender sender, String[] args) throws ValidationException, TechnicalException;
}
