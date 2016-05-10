package tk.martijn_heil.nincore.api;

import lombok.Getter;
import lombok.Setter;

/**
 * This loops infinitely over the runInner() method until it is killed.
 */
public abstract class KillableRunnable implements Runnable
{
    @Getter         private volatile boolean isRunning = true;
    @Getter @Setter private volatile long interval;


    public KillableRunnable()
    {
    }


    public KillableRunnable(long interval)
    {
        this.interval = interval;
    }



    public synchronized void kill()
    {
        this.isRunning = false;
    }


    @Override
    public final void run()
    {
        while (this.isRunning)
        {
            if (interval > 0) try
            {
                Thread.sleep(interval);
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
