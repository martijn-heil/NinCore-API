package me.ninjoh.nincore.api.util;


import me.ninjoh.nincore.api.Tick;
import org.bukkit.Bukkit;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.configuration.file.YamlConfiguration;
import org.bukkit.plugin.java.JavaPlugin;
import org.bukkit.scheduler.BukkitScheduler;
import org.jetbrains.annotations.NotNull;

import java.io.File;
import java.io.IOException;

public class DataManager
{
    private JavaPlugin plugin;
    private FileConfiguration data;

    private File dataF;



    public DataManager(@NotNull JavaPlugin plugin)
    {
        this.plugin = plugin;
        dataF = new File(plugin.getDataFolder(), "data.yml");
    }


    /**
     * Create the data file
     */
    public void createDataFile()
    {
        FileConfiguration dataFile = YamlConfiguration.loadConfiguration(dataF);

        try
        {
            plugin.getLogger().info("Attempting to create data file..");

            dataFile.save(dataF);

            plugin.getLogger().info("Successfully created data file");
        }
        catch (IOException e)
        {
            plugin.getLogger().warning("A" + e.getClass().getName() + "occurred while creating data file;");
            e.printStackTrace();
        }
    }


    /**
     * Check if data file exists
     *
     * @return Does the data file exist? true/false
     */
    public boolean dataFileExists()
    {
        return dataF.exists();
    }


    /**
     * Save the data file.
     */
    public void saveDataFile()
    {
        try
        {
            plugin.getLogger().info("Attempting to save data file..");

            data.save(dataF);

            plugin.getLogger().info("Successfully saved data file");
        }
        catch(IOException e)
        {
            plugin.getLogger().warning("A" + e.getClass().getName() + "occurred while saving data file;");
            e.printStackTrace();
        }
    }


    /**
     * Schedule automatic saving of the data file.
     *
     * @param interval The interval between saving.
     */
    public void scheduleAutomaticDataFileSave(long interval)
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

        plugin.getLogger().info("Scheduled data saving interval is set to " + interval + " ticks(s).");
    }


    /**
     * Schedule automatic saving of the data file.
     *
     * @param interval The interval between saving.
     */
    public void scheduleAutomaticDataFileSave(@NotNull Tick interval)
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

        plugin.getLogger().info("Scheduled data saving interval is set to " + interval + " tick(s).");
    }


    /**
     * Load the data file
     *
     * @return FileConfiguration of the data file
     */
    public FileConfiguration loadDataFile()
    {
        data = YamlConfiguration.loadConfiguration(dataF);
        return data;
    }
}
