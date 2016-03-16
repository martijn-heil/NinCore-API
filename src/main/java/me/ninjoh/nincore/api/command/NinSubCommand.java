package me.ninjoh.nincore.api.command;


import me.ninjoh.nincore.api.command.executors.SubCommandExecutor;

public interface NinSubCommand extends CommandBase
{
    /**
     * Get the executor for this sub command.
     *
     * @return The executor for this sub command.
     */
    SubCommandExecutor getExecutor();


    NinCommand getParentCommand();
}