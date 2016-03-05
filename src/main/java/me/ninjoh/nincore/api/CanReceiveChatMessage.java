package me.ninjoh.nincore.api;


import me.ninjoh.nincore.api.command.NinCommand;
import me.ninjoh.nincore.api.command.NinSubCommand;
import org.bukkit.plugin.java.JavaPlugin;

public interface CanReceiveChatMessage
{
    void sendError(String error);

    void sendCommandHelp(NinCommand cmd);

    void sendSubCommandHelp(NinCommand cmd, NinSubCommand subCmd);

    void sendPluginInfo(JavaPlugin plugin);
}
