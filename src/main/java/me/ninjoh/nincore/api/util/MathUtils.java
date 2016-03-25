package me.ninjoh.nincore.api.util;


import me.ninjoh.nincore.api.CardinalDirection;
import org.bukkit.Location;
import org.bukkit.util.Vector;

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

    public static void main(String[] args)
    {
        System.out.println(CardinalDirection.fromCompassDegrees(45).toString());
    }
}
