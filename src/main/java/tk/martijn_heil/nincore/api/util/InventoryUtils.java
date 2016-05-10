package tk.martijn_heil.nincore.api.util;

import org.bukkit.Bukkit;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.util.io.BukkitObjectInputStream;
import org.bukkit.util.io.BukkitObjectOutputStream;
import org.yaml.snakeyaml.external.biz.base64Coder.Base64Coder;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;

/**
 * All inventory related utilities.
 */
public class InventoryUtils
{
    /**
     * Encode an inventory to base64.
     * @param inventory The inventory to serialize.
     * @return The base64 encoded string.
     * @throws Exception If it was unable to encode the inventory
     */
    public static String toBase64(Inventory inventory) throws Exception
    {
        try
        {
            ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
            BukkitObjectOutputStream dataOutput = new BukkitObjectOutputStream(outputStream);

            // Write the size of the inventory
            dataOutput.writeInt(inventory.getSize());

            // Save every element in the list
            for (int i = 0; i < inventory.getSize(); i++)
            {
                dataOutput.writeObject(inventory.getItem(i));
            }

            // Serialize that array
            dataOutput.close();
            return Base64Coder.encodeLines(outputStream.toByteArray());
        }
        catch (Exception e)
        {
            throw new Exception("Unable to save item stacks.", e);
        }
    }


    /**
     * Decodes an inventory from base64
     *
     * @param data The base64 encoded inventory.
     * @return The decoded inventory.
     * @throws IOException If it was unable to decode.
     */
    public static Inventory fromBase64(String data) throws IOException
    {
        try
        {
            ByteArrayInputStream inputStream = new ByteArrayInputStream(Base64Coder.decodeLines(data));
            BukkitObjectInputStream dataInput = new BukkitObjectInputStream(inputStream);
            Inventory inventory = Bukkit.getServer().createInventory(null, dataInput.readInt());

            // Read the serialized inventory
            for (int i = 0; i < inventory.getSize(); i++)
            {
                inventory.setItem(i, (ItemStack) dataInput.readObject());
            }
            dataInput.close();
            return inventory;
        }
        catch (ClassNotFoundException e)
        {
            throw new IOException("Unable to decode class type.", e);
        }
    }
}