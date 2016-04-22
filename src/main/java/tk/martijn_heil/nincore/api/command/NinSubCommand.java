package tk.martijn_heil.nincore.api.command;


import tk.martijn_heil.nincore.api.command.executors.NinSubCommandExecutor;

public interface NinSubCommand extends CommandBase
{
    /**
     * Get the executor for this sub command.
     *
     * @return The executor for this sub command.
     */
    NinSubCommandExecutor getExecutor();


    NinCommand getParentCommand();
}