package me.ninjoh.nincore.api.util;


import com.google.common.base.Preconditions;
import me.ninjoh.nincore.api.NinCorePlugin;
import me.ninjoh.nincore.api.Tick;
import org.bukkit.Bukkit;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.configuration.file.YamlConfiguration;
import org.bukkit.scheduler.BukkitScheduler;
import org.jetbrains.annotations.NotNull;

import java.io.File;
import java.io.IOException;

public class DataManager
{
    private volatile NinCorePlugin plugin;
    private volatile FileConfiguration data;

    private volatile File dataF;


    public DataManager(@NotNull NinCorePlugin plugin)
    {
        Preconditions.checkNotNull(plugin);

        this.plugin = plugin;
        dataF = new File(plugin.getDataFolder(), "data.yml");
    }


    /**
     * Create the data file
     */
    public synchronized void createDataFile()
    {
        FileConfiguration dataFile = YamlConfiguration.loadConfiguration(dataF);

        try
        {
            plugin.getNinLogger().info("Attempting to create data file..");

            dataFile.save(dataF);

            plugin.getNinLogger().info("Successfully created data file.");
        }
        catch (IOException e)
        {
            // Vowels, A or An (Grammar)
            String s = "A ";
            if (e.getClass().getName().startsWith("a") || e.getClass().getName().startsWith("e") ||
                    e.getClass().getName().startsWith("i") || e.getClass().getName().startsWith("o") ||
                    e.getClass().getName().startsWith("u"))
            {
                s = "An ";
            }

            plugin.getNinLogger().warning(s + e.getClass().getName() + "occurred while creating data file;");
            e.printStackTrace();
        }
    }


    /**
     * Check if data file exists
     *
     * @return Does the data file exist? true/false
     */
    public synchronized boolean dataFileExists()
    {
        return dataF.exists();
    }


    /**
     * Save the data file.
     */
    public synchronized void saveDataFile()
    {
        try
        {
            plugin.getNinLogger().info("Attempting to save data file..");

            data.save(dataF);

            plugin.getNinLogger().info("Successfully saved data file.");
        }
        catch (IOException e)
        {
            // Vowels, A or An (Grammar)
            String s = "A ";
            if (e.getClass().getName().startsWith("a") || e.getClass().getName().startsWith("e") ||
                    e.getClass().getName().startsWith("i") || e.getClass().getName().startsWith("o") ||
                    e.getClass().getName().startsWith("u"))
            {
                s = "An ";
            }

            plugin.getNinLogger().warning(s + e.getClass().getName() + " occurred while saving data file;");
            e.printStackTrace();
        }
    }


    /**
     * Schedule automatic saving of the data file.
     *
     * @param interval The interval between saving.
     */
    public synchronized void scheduleAutomaticDataFileSave(long interval)
    {
        // Schedule automatic saving of data file.
        BukkitScheduler scheduler = Bukkit.getServer().getScheduler();
        scheduler.scheduleSyncRepeatingTask(plugin, new Runnable()
        {
            @Override
            public void run()
            {
                saveDataFile();
            }
        }, interval, interval);

        plugin.getNinLogger().info("Scheduled data saving interval is set to " + interval + " ticks(s).");
    }


    /**
     * Schedule automatic saving of the data file.
     *
     * @param interval The interval between saving.
     */
    public synchronized void scheduleAutomaticDataFileSave(@NotNull Tick interval)
    {
        // Schedule automatic saving of data file.
        BukkitScheduler scheduler = Bukkit.getServer().getScheduler();
        scheduler.scheduleSyncRepeatingTask(plugin, new Runnable()
        {
            @Override
            public void run()
            {
                saveDataFile();
            }
        }, interval.toLong(), interval.toLong());

        plugin.getNinLogger().info("Scheduled data saving interval is set to " + interval + " tick(s).");
    }


    /**
     * Load the data file
     */
    public synchronized void loadDataFile()
    {
        data = YamlConfiguration.loadConfiguration(dataF);
    }


    public synchronized FileConfiguration getData()
    {
        return this.data;
    }
}
