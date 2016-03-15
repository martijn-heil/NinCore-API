package me.ninjoh.nincore.api.util;


import org.bukkit.Bukkit;
import org.bukkit.World;
import org.bukkit.entity.Entity;

public class ServerUtils
{
    /**
     * Dispatch a command from console.
     *
     * @param command The command string to send.
     */
    public static void dispatchCommand(String command)
    {
        Bukkit.dispatchCommand(Bukkit.getConsoleSender(), command);
    }


    public static Entity getEntityById(int id)
    {
        Entity e = null;

        for (World w : Bukkit.getWorlds())
        {
            for (Entity entity : w.getEntities())
            {
                if(entity.getEntityId() == id) // Found the entity!
                {
                    e = entity;
                    break; // Stop searching any further
                }
            }

            // We found the entity!
            if(e != null)
            {
                break; // Stop searching any further
            }
        }

        return e; // Will be null if we didn't find any entity with that entity ID.
    }
}
