package me.ninjoh.nincore.api.command.builders;


import me.ninjoh.nincore.api.NinCore;
import me.ninjoh.nincore.api.command.NinCommand;
import me.ninjoh.nincore.api.command.NinSubCommand;
import me.ninjoh.nincore.api.command.executors.NinCommandExecutor;
import org.bukkit.command.CommandExecutor;
import org.bukkit.plugin.java.JavaPlugin;

import java.util.ArrayList;
import java.util.List;

public class CommandBuilder
{
    private String name; // Required
    private List<NinSubCommand> subCommands = new ArrayList<>(); // Optional
    private NinCommandExecutor executor; // Required
    private String descriptionKey;
    private String descriptionBundleBaseName;
    private String staticDescription;
    private JavaPlugin plugin;


    /**
     * Set this command's name. This is case sensitive and must
     * mirror a command defined in your plugin.yml.
     *
     * @param name The name for this command. Case sensitive
     * @return {@link CommandBuilder}, for method chaining.
     */
    public CommandBuilder setName(String name, JavaPlugin plugin)
    {
        this.name = name;
        this.plugin = plugin;
        return this;
    }


    public CommandBuilder setDescription(String descriptionKey)
    {
        this.descriptionKey = descriptionKey;
        return this;
    }


    public CommandBuilder setStaticDescription(String description)
    {
        this.staticDescription = description;
        return this;
    }


    public CommandBuilder setDescriptionBundleBaseName(String baseName)
    {
        this.descriptionBundleBaseName = baseName;
        return this;
    }


    /**
     * Add a sub command to this command.
     *
     * @param subCommand The {@link NinSubCommand} to add.
     * @return {@link CommandBuilder}, for method chaining.
     */
    public CommandBuilder addSubCommand(NinSubCommand subCommand)
    {
        this.subCommands.add(subCommand);
        return this;
    }


    /**
     * Set this command's executor.
     *
     * @param executor This command's {@link CommandExecutor}
     * @return {@link CommandBuilder}, for method chaining.
     */
    public CommandBuilder setExecutor(NinCommandExecutor executor)
    {
        this.executor = executor;
        return this;
    }


    /**
     * Construct the command.
     *
     * @return The constructed {@link NinCommand}.
     */
    public NinCommand construct()
    {
        return NinCore.getImplementation().constructCommand(this.name, this.descriptionKey, this.descriptionBundleBaseName,
                this.staticDescription, this.subCommands, this.executor, this.plugin);
    }
}
