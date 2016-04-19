package me.ninjoh.nincore.api.command.builders;


import me.ninjoh.nincore.api.NinCore;
import me.ninjoh.nincore.api.command.NinCommand;
import me.ninjoh.nincore.api.command.NinSubCommand;
import me.ninjoh.nincore.api.command.executors.NinSubCommandExecutor;
import me.ninjoh.nincore.api.localization.LocalizedString;
import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.List;

public class SubCommandBuilder
{
    private String name; // Required && Always lowercase.
    private List<String> aliases = new ArrayList<>(); // Optional && All entries always lowercase.
    private LocalizedString localizedDescription;
    private String staticDescription;
    private String requiredPermission; // Optional.
    private NinSubCommandExecutor executor; // Required
    private NinCommand parentCommand;
    private String usage;
    boolean useStaticDescription = true;


    /**
     * Set this sub command's name
     *
     * @param name The name for this sub command.
     * @return {@link SubCommandBuilder}, for method chaining.
     */
    @NotNull
    public SubCommandBuilder setName(@NotNull String name) // Required
    {
        this.name = name.toLowerCase();
        return this;
    }


    /**
     * Add an alias for this sub command.
     *
     * @param alias The alias to add to this sub command.
     * @return {@link SubCommandBuilder}, for method chaining.
     */
    @NotNull
    public SubCommandBuilder addAlias(@NotNull String alias) // Optional
    {
        aliases.add(alias.toLowerCase()); // aliases are always stored lower case.
        return this;
    }


    public SubCommandBuilder setLocalizedDescription(LocalizedString localizedDescription)
    {
        this.localizedDescription = localizedDescription;
        return this;
    }


    public SubCommandBuilder setUseStaticDescription(boolean value)
    {
        this.useStaticDescription = value;
        return this;
    }


    public SubCommandBuilder setStaticDescription(String description)
    {
        this.staticDescription = description;
        return this;
    }


    /**
     * Set this sub command's required permission.
     *
     * @param permission the permission to set.
     * @return {@link SubCommandBuilder}, for method chaining.
     */
    @NotNull
    public SubCommandBuilder setRequiredPermission(String permission) // Optional
    {
        this.requiredPermission = permission;
        return this;
    }


    /**
     * Set this sub command's {@link NinSubCommandExecutor}.
     *
     * @param executor the {@link NinSubCommandExecutor} to set.
     * @return {@link SubCommandBuilder}, for method chaining.
     */
    @NotNull
    public SubCommandBuilder setExecutor(NinSubCommandExecutor executor) // Required
    {
        this.executor = executor;
        return this;
    }


    @NotNull
    public SubCommandBuilder setParentCommand(NinCommand cmd)
    {
        this.parentCommand = cmd;
        return this;
    }


    @NotNull
    public SubCommandBuilder setUsage(String value)
    {
        this.usage = value;
        return this;
    }


    /**
     * Construct the {@link NinSubCommand}.
     *
     * @return The constructed {@link NinSubCommand}.
     */
    @NotNull
    public NinSubCommand construct()
    {
        return NinCore.get().getCommandImplementation().constructSubCommand(this.name, this.useStaticDescription, this.staticDescription, this.localizedDescription, this.requiredPermission, this.usage, this.aliases, this.executor, this.parentCommand);
    }
}
