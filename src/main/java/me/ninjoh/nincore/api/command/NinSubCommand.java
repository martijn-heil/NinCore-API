package me.ninjoh.nincore.api.command;


import me.ninjoh.nincore.api.command.executors.NinSubCommandExecutor;

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