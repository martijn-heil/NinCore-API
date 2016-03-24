package me.ninjoh.nincore.api;


import me.ninjoh.nincore.api.command.NinCommand;
import me.ninjoh.nincore.api.command.NinSubCommand;
import me.ninjoh.nincore.api.util.MessageUtil;
import org.bukkit.Bukkit;
import org.bukkit.command.CommandSender;
import org.bukkit.command.ConsoleCommandSender;
import org.bukkit.plugin.java.JavaPlugin;
import org.jetbrains.annotations.NotNull;

public class NinConsoleCommandSender implements CanReceiveChatMessage
{


    /**
     * Get the ConsoleCommandSender
     *
     * @return The ConsoleCommandSender
     */
    public ConsoleCommandSender getConsoleCommandSender()
    {
        return Bukkit.getServer().getConsoleSender();
    }


    /**
     * Send plugin info to this using {@link MessageUtil#sendPluginInfo(CommandSender, JavaPlugin)}
     *
     * @param plugin The {@link JavaPlugin} to send information about.
     */
    @Override
    public void sendPluginInfo(@NotNull JavaPlugin plugin)
    {
        MessageUtil.sendPluginInfo(getConsoleCommandSender(), plugin);
    }


    /**
     * Sends an error to this using {@link MessageUtil#sendError(CommandSender, String)}
     *
     * @param error the error string to send.
     */
    @Override
    public void sendError(@NotNull String error)
    {
        MessageUtil.sendError(getConsoleCommandSender(), error);
    }


    /**
     * Send command help to the player
     *
     * @param cmd The command to send help for
     */
    @Override
    public void sendCommandHelp(@NotNull NinCommand cmd)
    {
        MessageUtil.sendCommandHelp(getConsoleCommandSender(), cmd);
    }


    /**
     * Send sub command help to the player.
     *
     * @param subCmd The sub command to send help for.
     */
    @Override
    public void sendCommandHelp(@NotNull NinSubCommand subCmd)
    {
        MessageUtil.sendCommandHelp(getConsoleCommandSender(), subCmd);
    }
}
