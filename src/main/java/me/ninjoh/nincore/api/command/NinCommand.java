package me.ninjoh.nincore.api.command;


import me.ninjoh.nincore.api.command.executors.NinCommandExecutor;
import me.ninjoh.nincore.api.exceptions.technicalexceptions.SubCommandAliasAlreadyRegisteredException;
import me.ninjoh.nincore.api.exceptions.technicalexceptions.SubCommandAlreadyExistsException;

import java.util.List;

public interface NinCommand extends CommandBase
{
    /**
     * Set this command's CommandExecutor.
     *
     * @param executor The CommandExecutor for this command.
     */
    void setExecutor(NinCommandExecutor executor);


    NinCommandExecutor getExecutor();


    /**
     * Get this command's sub commands.
     *
     * @return This command's sub commands. Can be an empty ArrayList.
     */
    List<NinSubCommand> getSubCommands();


    /**
     * Add a sub command to this command.
     *
     * @param NinSubCommand The NinSubCommand to add.
     * @throws SubCommandAlreadyExistsException
     * @throws SubCommandAliasAlreadyRegisteredException
     */
    void addSubCommand(NinSubCommand NinSubCommand)
            throws SubCommandAlreadyExistsException, SubCommandAliasAlreadyRegisteredException;


    void setSubCommands(List<NinSubCommand> ninSubCommands);


    /**
     * Delete a sub command from this command by name.
     *
     * @param name The name of the sub command to be deleted from this command.
     */
    void removeSubCommand(String name);


    /**
     * Get a sub command by name.
     *
     * @param name The name of the sub command to get.
     * @return The NinSubCommand queried for. Can be null.
     */
    NinSubCommand getSubCommand(String name);


    /**
     * Get a sub command by alias.
     *
     * @param alias The sub command alias to query for.
     * @return The NinSubCommand queried for. Can be null.
     */
    NinSubCommand getSubCommandByAlias(String alias);


    /**
     * Check if this command has sub commands.
     *
     * @return True/False, does this command have any sub commands?
     */
    boolean hasSubCommands();


    /**
     * Check if a sub command exists by name.
     *
     * @param name The name to query for.
     * @return True/False, does this sub command exist?
     */
    boolean subCommandExists(String name);


    /**
     * Check if a sub command exists by alias.
     *
     * @param alias The alias to query for.
     * @return True/False, does this sub command exist?
     */
    boolean subCommandExistsByAlias(String alias);

    void addDefaultHelpSubCmd();
}
