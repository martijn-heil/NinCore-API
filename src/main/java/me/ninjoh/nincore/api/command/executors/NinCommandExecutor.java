package me.ninjoh.nincore.api.command.executors;


import me.ninjoh.nincore.api.command.NinCommand;

public interface NinCommandExecutor extends NinCommandExecutorBase
{
    NinCommandExecutor init(NinCommand command);
}
