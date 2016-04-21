package me.ninjoh.nincore.api;


import me.ninjoh.nincore.api.logging.NinPluginLogger;

import java.util.logging.LogRecord;

public class ModuleLogger extends NinPluginLogger
{
    private CoreModule module;

    public ModuleLogger(CoreModule module)
    {
        super(module.getCore());
        this.module = module;
    }


    // Insert [ModuleName] in front of the message, then pass the log record on.
    @Override
    public void log(LogRecord logRecord)
    {
        String message = logRecord.getMessage();
        message = "[" + module.getClass().getSimpleName() + "] " + message;
        logRecord.setMessage(message);
        super.log(logRecord);
    }
}
