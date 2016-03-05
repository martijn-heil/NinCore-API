package me.ninjoh.nincore.api.command.builders;


import me.ninjoh.nincore.api.NinCore;
import me.ninjoh.nincore.api.command.NinCommand;
import me.ninjoh.nincore.api.command.NinSubCommand;
import me.ninjoh.nincore.api.command.executors.NinCommandExecutor;
import org.bukkit.command.CommandExecutor;
import org.bukkit.plugin.java.JavaPlugin;

import java.util.List;

public class CommandBuilder
{
    private String name; // Required
    private String description; // Automatic
    private String usage; // Automatic
    private String permission; // Automatic
    private List<String> aliases; // Automatic
    private List<NinSubCommand> subCommands; // Optional
    private NinCommandExecutor executor; // Required
    private boolean useArgumentValidation; // Required
    private JavaPlugin plugin;


    // Case sensitive

    /**
     * Set this command's name.
     *
     * @param name The name for this command. Case sensitive
     * @return {@link SubCommandBuilder}, for method chaining.
     */
    public CommandBuilder setName(String name, JavaPlugin plugin)
    {
        this.name = name;
        this.plugin = plugin;
        return this;
    }


    /**
     * Add a sub command to this command.
     *
     * @param subCommand The {@link NinSubCommand} to add.
     * @return {@link SubCommandBuilder}, for method chaining.
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
     * @return {@link SubCommandBuilder}, for method chaining
     */
    public CommandBuilder setExecutor(NinCommandExecutor executor)
    {
        this.executor = executor;
        return this;
    }


    public CommandBuilder setUseArgumentValidation(boolean value)
    {
        this.useArgumentValidation = value;
        return this;
    }


    /**
     * Construct the command.
     *
     * @return The constructed {@link NinCommand}.
     */
    public NinCommand construct()
    {
        return NinCore.getImplementation().constructCommand(this.name, this.subCommands, null, this.executor,
                this.useArgumentValidation, this.plugin);
    }
}
