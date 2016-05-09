package tk.martijn_heil.nincore.api;


import tk.martijn_heil.nincore.api.command.NinCommand;
import tk.martijn_heil.nincore.api.command.NinSubCommand;
import tk.martijn_heil.nincore.api.messaging.MessageColor;
import org.bukkit.plugin.Plugin;
import org.bukkit.plugin.java.JavaPlugin;
import org.jetbrains.annotations.NotNull;

public interface MessageRecipient
{
    /**
     * Send an error.
     *
     * @param error The error string to send.
     */
    void sendError(@NotNull String error);


    void sendError(@NotNull String error, @NotNull Plugin plugin);


    void sendMessage(@NotNull MessageColor messageColor, @NotNull String message, @NotNull Plugin plugin);


    void sendMessage(@NotNull MessageColor messageColor, @NotNull String message, @NotNull String prefix);


    void sendMessage(@NotNull String message);

    /**
     * Send command help for a {@link NinCommand}.
     *
     * @param cmd The {@link NinCommand} to send command help about.
     */
    void sendCommandHelp(@NotNull NinCommand cmd);


    /**
     * Send command help for a {@link NinSubCommand}
     *
     * @param subCmd The {@link NinSubCommand} to send command help about.
     */
    void sendCommandHelp(@NotNull NinSubCommand subCmd);

    /**
     * Send plugin information about the specified plugin.
     * This will display the plugin's version and authors.
     *
     * @param plugin The plugin to send information about.
     */
    void sendPluginInfo(@NotNull JavaPlugin plugin);
}
