package me.ninjoh.nincore.api.command;

import me.ninjoh.nincore.api.IArgumentDataType;
import me.ninjoh.nincore.api.playerexceptions.IllegalArgumentDataTypeException;
import me.ninjoh.nincore.api.exceptions.PlayerNotFoundException;
import org.bukkit.Bukkit;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;


public enum NinArgumentDataType implements IArgumentDataType
{
    BOOLEAN("boolean"),
    INTEGER("integer"),
    //FLOAT(),
    //DOUBLE(),
    STRING("string"),

    PLAYER("player"), // Can be either offline or online.
    OFFLINE_PLAYER("offline-player"),
    ONLINE_PLAYER("online-player");

//    EXISTING_WORLD(),
//
//    // See http://minecraft.gamepedia.com/Mob
//    MOB_ANY(),
//    MOB_PASSIVE(),
//    MOB_NEUTRAL(),
//    MOB_HOSTILE(),
//    MOB_TAMED(),
//    MOB_UTILITY(),
//    MOB_BOSS(),
//
//    MATERIAL_TYPE(),
//    BLOCK();

    private String humanFriendlyName;

    NinArgumentDataType(String humanFriendlyName)
    {
        this.humanFriendlyName = humanFriendlyName;
    }

    /**
     * Validate data type.
     *
     * @param value The {@link String} to validate.
     * @return True if validation succeeded, false if it didn't.
     */
    public boolean validate(String value)
    {
        switch (this.name())
        {
            // Check if value is a boolean.
            case ("BOOLEAN"):
                return Boolean.parseBoolean(value);


            // Check if value is an integer
            case ("INTEGER"):
                // Bad practices, I know, it works solid tho.
                try
                {
                    //noinspection ResultOfMethodCallIgnored
                    Integer.parseInt(value);
                }
                catch (NumberFormatException e)
                {
                    return false;
                }
                catch (NullPointerException e)
                {
                    return false;
                }

                // Only got here if we didn't return false
                return true;


            // Check if value is a string, it always is, so return true.
            case ("STRING"):
                return true;


            case ("PLAYER"):
                return Bukkit.getPlayer(value) != null;


            case ("OFFLINE_PLAYER"):
                Player p = Bukkit.getPlayer(value);
                return (p != null && !p.isOnline());


            case ("ONLINE_PLAYER"):
                Player p2 = Bukkit.getPlayer(value);
                return (p2 != null && p2.isOnline());
        }

        return false; // We never reach this?
    }

    /**
     * Throw the exception.
     *
     * @param target      The target to send the error message to.
     * @param actualValue The actual value of the parameter.
     */
    public void throwException(CommandSender target, String actualValue)
    {
        switch (this.name())
        {

            case ("BOOLEAN"):
                new IllegalArgumentDataTypeException(target, "BOOLEAN", actualValue);


            case ("INTEGER"):
                new IllegalArgumentDataTypeException(target, "BOOLEAN", actualValue);


//                case("STRING"):
//                    return;


            case ("PLAYER"):
                new PlayerNotFoundException(target);


            case ("OFFLINE_PLAYER"):
                new PlayerNotFoundException(target);


            case ("ONLINE_PLAYER"):
                new PlayerNotFoundException(target);
        }
    }


    /**
     * Get the human friendly name of this data type.
     *
     * @return The human friendly name of this data type.
     */
    public String getHumanFriendlyName()
    {
        return this.humanFriendlyName;
    }
}