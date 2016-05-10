package tk.martijn_heil.nincore.api.util;


import tk.martijn_heil.nincore.api.CardinalDirection;
import org.bukkit.Location;
import org.bukkit.util.Vector;

/**
 * All math related utilities.
 */
public class MathUtils
{
    public static float radiansToCompassDegrees(float radians)
    {
        return radians % 360;
    }


    public static CardinalDirection getCardinalDirection(Location start, Location destination)
    {
        Vector playerLocVector = start.toVector();
        Vector headLocVector = destination.toVector();
        float angle = playerLocVector.angle(headLocVector);

        return CardinalDirection.fromRadians(angle);
    }
}
