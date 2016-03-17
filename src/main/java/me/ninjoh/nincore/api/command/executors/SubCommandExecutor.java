package me.ninjoh.nincore.api.command.executors;


import me.ninjoh.nincore.api.command.NinSubCommand;

public interface SubCommandExecutor extends NinCommandExecutorBase
{
    SubCommandExecutor init(NinSubCommand subCommand);
}
