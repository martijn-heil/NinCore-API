package me.ninjoh.nincore.api;

/**
 * This loops infinitely over the runInner() method until it is killed.
 */
public abstract class KillableRunnable implements Runnable
{
    private volatile boolean isRunning = true;


    public synchronized void kill()
    {
        this.isRunning = false;
    }


    public synchronized boolean isRunning()
    {
        return this.isRunning;
    }


    @Override
    public final void run()
    {
        while(this.isRunning)
        {
            this.runInner();
        }
    }


    public abstract void runInner();
}
