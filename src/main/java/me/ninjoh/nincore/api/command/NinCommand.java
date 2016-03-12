package me.ninjoh.nincore.api.command;


import me.ninjoh.nincore.api.command.executors.NinCommandExecutor;
import me.ninjoh.nincore.api.exceptions.technicalexceptions.SubCommandAliasAlreadyRegisteredException;
import me.ninjoh.nincore.api.exceptions.technicalexceptions.SubCommandAlreadyExistsException;

import java.util.List;
import java.util.Locale;

public interface NinCommand
{
    /**
     * Set this command's CommandExecutor.
     *
     * @param executor The CommandExecutor for this command.
     */
    void setExecutor(NinCommandExecutor executor);


    NinCommandExecutor getExecutor();


    /**
     * Get this command's name.
     *
     * @return This command's name.
     */
    String getName();


    /**
     * Get this command's description.
     *
     * @return Get this command's description. Can be null.
     */
    String getDescription();



    String getDescription(Locale inLocale);


    /**
     * Check if this command has a description.
     *
     * @return True/False, does this command have a description set?
     */
    boolean hasDescription();


    /**
     * Get this command's usage syntax.
     * NOTE: This excludes the command itself
     * e.g; (player=you) (world)
     *
     * @return This command's usage syntax. Can be null.
     */
    String getUsage();


    void setUsage(String value);


    /**
     * Check if this command requires the CommandSender to have a permission.
     *
     * @return True/False, does this command require the CommandSender to have a certain permission?
     */
    boolean requiresPermission();


    /**
     * Get this command's required permission.
     *
     * @return This command's required permission.
     */
    String getRequiredPermission();


    /**
     * Get this command's aliases.
     * NOTE: This does not include the main command alias/name.
     *
     * @return This command's aliases. Can be an empty ArrayList.
     */
    List<String> getAliases();


    /**
     * Get this command's aliases, including the main command/alias
     *
     * @return This command's aliases, including the main command/alias.
     */
    List<String> getAliasesWithMainCmd();


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
