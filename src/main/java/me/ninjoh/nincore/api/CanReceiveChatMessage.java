package me.ninjoh.nincore.api;


import me.ninjoh.nincore.api.command.NinCommand;
import me.ninjoh.nincore.api.command.NinSubCommand;
import org.bukkit.plugin.java.JavaPlugin;

public interface CanReceiveChatMessage
{
    /**
     * Send an error.
     *
     * @param error The error string to send.
     */
    void sendError(String error);


    /**
     * Send command help for a {@link NinCommand}.
     *
     * @param cmd The {@link NinCommand} to send command help about.
     */
    void sendCommandHelp(NinCommand cmd);


    /**
     * Send command help for a {@link NinSubCommand}
     *
     * @param subCmd The {@link NinSubCommand} to send command help about.
     */
    void sendCommandHelp(NinSubCommand subCmd);

    /**
     * Send plugin information about the specified plugin.
     * This will display the plugin's version and authors.
     *
     * @param plugin The plugin to send information about.
     */
    void sendPluginInfo(JavaPlugin plugin);
}
