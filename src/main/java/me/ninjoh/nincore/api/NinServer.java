package me.ninjoh.nincore.api;


import me.ninjoh.nincore.api.entity.NinPlayer;
import org.bukkit.Server;
import org.bukkit.entity.Player;

import java.util.List;

public interface NinServer
{
    List<NinPlayer> getOnlineNinPlayers();

    NinPlayer getNinPlayer(Player p);

    Server getServer();
}
