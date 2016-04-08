package me.ninjoh.nincore.api.command.builders;


import me.ninjoh.nincore.api.NinCore;
import me.ninjoh.nincore.api.command.NinCommand;
import me.ninjoh.nincore.api.command.NinSubCommand;
import me.ninjoh.nincore.api.command.executors.NinCommandExecutor;
import me.ninjoh.nincore.api.localization.LocalizedString;
import org.bukkit.command.CommandExecutor;
import org.bukkit.plugin.java.JavaPlugin;

import java.util.ArrayList;
import java.util.List;

public class CommandBuilder
{
    private String name; // Required
    private List<NinSubCommand> subCommands = new ArrayList<>(); // Optional
    private NinCommandExecutor executor; // Required
    private LocalizedString localizedDescription;
    private String requiredPermission;
    boolean useStaticDescription = false;
    private JavaPlugin plugin;


    public CommandBuilder(JavaPlugin plugin)
    {
        this.plugin = plugin;
    }


    /**
     * Set this command's name. This is case sensitive and must
     * mirror a command defined in your plugin.yml.
     *
     * @param name The name for this command. Case sensitive
     * @return {@link CommandBuilder}, for method chaining.
     */
    public CommandBuilder setName(String name)
    {
        this.name = name;
        return this;
    }


    public CommandBuilder setLocalizedDescription(LocalizedString localizedDescription)
    {
        this.localizedDescription = localizedDescription;
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


    public CommandBuilder setUseStaticDescription(boolean value)
    {
        this.useStaticDescription = value;
        return this;
    }


    public CommandBuilder setRequiredPermission(String requiredPermission)
    {
        this.requiredPermission = requiredPermission;
        return this;
    }


    /**
     * Construct the command.
     *
     * @return The constructed {@link NinCommand}.
     */
    public NinCommand construct()
    {
        return NinCore.get().constructCommand(this.name, this.useStaticDescription, this.localizedDescription, this.requiredPermission, this.executor, this.subCommands, this.plugin);
    }
}
