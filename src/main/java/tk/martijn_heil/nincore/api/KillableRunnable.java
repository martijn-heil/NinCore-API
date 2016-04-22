package tk.martijn_heil.nincore.api;

/**
 * This loops infinitely over the runInner() method until it is killed.
 */
public abstract class KillableRunnable implements Runnable
{
    private volatile boolean isRunning = true;
    private volatile boolean useDelay = false;
    private volatile long delay;


    public KillableRunnable()
    {
    }


    public KillableRunnable(long delay)
    {
        this.useDelay = true;
        this.delay = delay;
    }


    public synchronized boolean useDelay()
    {
        return useDelay;
    }


    public synchronized long getDelay()
    {
        return delay;
    }


    public synchronized void setDelay(long delay)
    {
        this.delay = delay;
        this.useDelay = true;
    }


    public synchronized void setUseDelay(boolean bool)
    {
        this.useDelay = bool;
    }


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
        while (this.isRunning)
        {
            if (useDelay) try
            {
                Thread.sleep(delay);
            }
            catch (InterruptedException e)
            {
                e.printStackTrace();
            }

            this.runInner();
        }
    }


    public abstract void runInner();
}
