package me.ninjoh.nincore.api.command;


import me.ninjoh.nincore.api.command.executors.SubCommandExecutor;

import java.util.List;
import java.util.Locale;

public interface NinSubCommand
{
    /**
     * Get the name of this sub command.
     *
     * @return The name of this sub command.
     */
    String getName();


    /**
     * Get all aliases of this sub command.
     *
     * @return All aliases except the sub command name.
     */
    List<String> getAliases();


    /**
     * Get all aliases of this sub command.
     * Including the name which is always the main
     * alias as well.
     *
     * @return All aliases including the sub command name.
     */
    List<String> getAliasesWithMainSubCmd();


    /**
     * Does this sub command have any aliases?
     *
     * @return True/False, Does this sub command have any aliases?
     */
    boolean hasAliases();


    /**
     * Does this sub command require a CommandSender
     * to have a certain permission?
     *
     * @return True/False, Does this sub command require a permission?
     */
    boolean requiresPermission();


    /**
     * Get the required permission for this sub command.
     *
     * @return The required permission for this sub command.
     */
    String getRequiredPermission();


    /**
     * Get this sub command's syntax.
     * ( Only the last part of the syntax, e.g;
     * "<player=you> <world>" )
     *
     * @return The usage string.
     */
    String getUsage();


    /**
     * Get this sub command's description.
     *
     * @param locale The locale to return the description in.
     * @return This sub command's description.
     */
    String getDescription(Locale locale);


    /**
     * Get this sub command's description.
     *
     * @return This sub command's description.
     */
    String getDescription();

    /**
     * Check if this sub command has a description.
     *
     * @return True/False, does this sub command have a description?
     */
    boolean hasDescription();


    /**
     * Check if this sub command has any {@link NinArgument}s.
     *
     * @return True if it has any NCArguments, else false.
     */
    boolean hasArguments();


    /**
     * Get this sub command's {@link NinArgument}s.
     *
     * @return A list of all NCArguments for this sub command.
     */
    List<NinArgument> getArguments();


    /**
     * Get an argument by index.
     *
     * @param i the index to query.
     * @return The argument found, can be null.
     */
    NinArgument getArgumentByIndex(int i);


    List<NinArgument> getRequiredArguments();


    boolean hasRequiredArguments();


    /**
     * Get the executor for this sub command.
     *
     * @return The executor for this sub command.
     */
    SubCommandExecutor getExecutor();


    NinCommand getParentCommand();


    void setUseArgumentValidation(boolean value);


    boolean useArgumentValidation();
}