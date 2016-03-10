package me.ninjoh.nincore.api.command.builders;


import me.ninjoh.nincore.api.NinCore;
import me.ninjoh.nincore.api.command.NinCommand;
import me.ninjoh.nincore.api.command.NinSubCommand;
import me.ninjoh.nincore.api.command.executors.SubCommandExecutor;
import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.List;

public class SubCommandBuilder
{
    private String Name; // Required && Always lowercase.
    private List<String> aliases = new ArrayList<>(); // Optional && All entries always lowercase.
    private String[] description; // Optional
    private String requiredPermission; // Optional.
    private SubCommandExecutor executor; // Required
    private NinCommand parentCommand;
    private String usage;



    /**
     * Set this sub command's name
     *
     * @param name The name for this sub command.
     * @return {@link SubCommandBuilder}, for method chaining.
     */
    @NotNull
    public SubCommandBuilder setName(@NotNull String name) // Required
    {
        this.Name = name.toLowerCase();
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


    /**
     * Set this sub command's description
     *
     * @param description the description to set.
     * @return {@link SubCommandBuilder}, for method chaining.
     */
    @NotNull
    public SubCommandBuilder setDescription(String[] description) // Optional
    {
        this.description = description;
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
     * Set this sub command's {@link SubCommandExecutor}.
     *
     * @param executor the {@link SubCommandExecutor} to set.
     * @return {@link SubCommandBuilder}, for method chaining.
     */
    @NotNull
    public SubCommandBuilder setExecutor(SubCommandExecutor executor) // Required
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
        return NinCore.getImplementation().constructSubCommand(this.Name, this.aliases,
                this.description, this.requiredPermission, this.usage, this.executor, this.parentCommand);
    }
}
