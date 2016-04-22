package tk.martijn_heil.nincore.api;

import tk.martijn_heil.nincore.api.util.MathUtils;
import org.bukkit.block.BlockFace;

/**
 * See https://en.wikipedia.org/wiki/Points_of_the_compass#32_cardinal_points
 */
public enum CardinalDirection
{
    NORTH(354.38, 0, 5.62, BlockFace.NORTH),
    NORTH_NORTH_EAST(16.88, 22.50, 28.12, BlockFace.NORTH_NORTH_EAST),
    NORTH_EAST(39.38, 45, 50.62, BlockFace.NORTH_EAST),
    EAST_NORTH_EAST(61.88, 67.50, 73.12, BlockFace.EAST_NORTH_EAST),
    EAST(84.38, 90, 95.62, BlockFace.EAST),
    EAST_SOUTH_EAST(129.38, 135, 140.62, BlockFace.EAST_SOUTH_EAST),
    SOUTH_EAST(129.38, 135, 140, BlockFace.SOUTH_WEST),
    SOUTH_SOUTH_EAST(151.88, 157.50, 163.12, BlockFace.SOUTH_SOUTH_EAST),
    SOUTH(174.38, 180, 185.62, BlockFace.SOUTH),
    SOUTH_SOUTH_WEST(196.88, 202.50, 208.12, BlockFace.SOUTH_SOUTH_WEST),
    SOUTH_WEST(219.38, 225, 230.62, BlockFace.SOUTH_WEST),
    WEST_SOUTH_WEST(241.88, 247.50, 253.12, BlockFace.WEST_SOUTH_WEST),
    WEST(264.63, 270, 275.62, BlockFace.WEST),
    WEST_NORTH_WEST(286.88, 292.50, 298.12, BlockFace.WEST_NORTH_WEST),
    NORTH_WEST(309.38, 315, 320.62, BlockFace.NORTH_WEST);


    private double min;
    private double max;
    private double middle;
    private BlockFace blockFace;


    CardinalDirection(double min, double middle, double max, BlockFace blockFace)
    {
        this.min = min;
        this.max = max;
        this.middle = middle;
        this.blockFace = blockFace;
    }


    public static CardinalDirection fromCompassDegrees(double degrees)
    {
        CardinalDirection directions[] =
                {
                        NORTH,
                        NORTH_NORTH_EAST,
                        NORTH_EAST,
                        EAST_NORTH_EAST,
                        EAST,
                        EAST_SOUTH_EAST,
                        SOUTH_EAST,
                        SOUTH_SOUTH_EAST,
                        SOUTH,
                        SOUTH_SOUTH_WEST,
                        SOUTH_WEST,
                        WEST_SOUTH_WEST,
                        WEST,
                        WEST_NORTH_WEST,
                        NORTH_WEST
                };

        return directions[(int) Math.round(((degrees % 360) / 22.5))];
    }


    public static CardinalDirection fromRadians(float radians)
    {
        return fromCompassDegrees(MathUtils.radiansToCompassDegrees(radians));
    }


    public double getMin()
    {
        return this.min;
    }


    public double getMiddle()
    {
        return this.middle;
    }


    public double getMax()
    {
        return this.max;
    }


    public BlockFace toBlockFace()
    {
        return this.blockFace;
    }
}
