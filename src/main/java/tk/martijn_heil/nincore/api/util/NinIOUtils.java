package tk.martijn_heil.nincore.api.util;

import org.apache.commons.io.IOUtils;

import java.io.*;
import java.net.URL;
import java.security.CodeSource;
import java.util.ArrayList;
import java.util.List;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;

/**
 * Utilities related to IO operations.
 */
public class NinIOUtils
{
    /**
     * Export a resource embedded into a Jar file to the local file path.
     *
     * @param resourceName ie.: "/SmartLibrary.dll"
     * @param loader The {@link ClassLoader} to be used for loading the resource.
     * @return The path to the exported resource
     * @throws IOException
     */
    public static String exportResource(String resourceName, String outputPath, ClassLoader loader) throws IOException
    {
        InputStream stream;
        OutputStream resStreamOut;

        stream = loader.getResourceAsStream(resourceName); //note that each / is a directory down in the "jar tree" been the jar the root of the tree
        if (stream == null)
        {
            throw new IOException("Cannot get resource \"" + resourceName + "\" from Jar file.");
        }

        resStreamOut = new FileOutputStream(outputPath);

        IOUtils.copy(stream, resStreamOut);

        stream.close();
        resStreamOut.close();

        return outputPath;
    }


    public static List<ZipEntry> getResourcesStartingWith(String start, Class executingClass) throws Exception
    {
        List<ZipEntry> list = new ArrayList<>();

        CodeSource src = executingClass.getProtectionDomain().getCodeSource();
        if (src != null)
        {
            URL jar = src.getLocation();
            ZipInputStream zip = new ZipInputStream(jar.openStream());
            while (true)
            {
                ZipEntry e = zip.getNextEntry();
                if (e == null)
                    break;
                String name = e.getName();
                if (name.startsWith(start) && !e.isDirectory())
                {
                    list.add(e);
                }
            }
        }
        else
        {
            throw new Exception("Could not get CodeSource");
        }

        return list;
    }


    public static void exportResourceFolder(String inputPath, File outputDirectory, Class executingClass) throws Exception
    {
        if(!outputDirectory.exists())
        {
            outputDirectory.mkdirs();
        }

        for (ZipEntry entry : getResourcesStartingWith(inputPath, executingClass))
        {
            String simpleName = new File(entry.getName()).getName();

            // Don't overwrite any existing files.
            if(!new File(outputDirectory.getPath() + "/" + simpleName).exists())
            {
                exportResource(entry.getName(), outputDirectory.getPath() + "/" + simpleName, executingClass.getClassLoader());
            }
        }
    }
}
