/*

Copyright (c) 2013 bergerkiller

Permission is hereby granted, free of charge, to any person obtaining a copy
of this software and associated documentation files (the "Software"), to deal
in the Software without restriction, including without limitation the rights
to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
copies of the Software, and to permit persons to whom the Software is
furnished to do so, subject to the following conditions:

The above copyright notice and this permission notice shall be included in all
copies or substantial portions of the Software.

THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
SOFTWARE.

 */
package me.ninjoh.nincore.api.util;

/**
 * A nanosecond stop watch used to measure code execution times
 *
 * @author bergerkiller
 */
public class StopWatch
{
    /**
     * A global testing StopWatch that can be used when debugging
     */
    public static final StopWatch instance = new StopWatch();

    private long prevtime;
    private long prevdur;


    /**
     * Starts this Stop Watch
     *
     * @return This Stop Watch
     */
    public StopWatch start()
    {
        this.prevtime = System.nanoTime();
        return this;
    }


    /**
     * Clears the times of this Stop Watch
     *
     * @return This Stop Watch
     */
    public StopWatch reset()
    {
        this.prevtime = 0;
        this.prevdur = 0;
        return this;
    }


    /**
     * Gets the current total duration of this Stop Watch in milliseconds
     *
     * @return Total time in milliseconds
     */
    public double get()
    {
        return (double) prevdur / 1E6D;
    }


    /**
     * Gets the current total duration of this Stop Watch in milliseconds
     *
     * @param scale to use
     * @return Total time in milliseconds divided by the scale
     */
    public double get(int scale)
    {
        return (double) prevdur / 1E6D / (double) scale;
    }


    /**
     * Sets a new elapsed time using a Strength to average the value
     *
     * @param elapsednanotime to set to
     * @param strength        to use [0 - 1]
     * @return This Stop Watch
     */
    public StopWatch set(long elapsednanotime, double strength)
    {
        elapsednanotime += (1.0 - strength) * (this.prevdur - elapsednanotime);
        this.prevdur = elapsednanotime;
        return this;
    }


    /**
     * Sets a new elapsed time
     *
     * @param elapsednanotime to set to
     * @return This Stop Watch
     */
    public StopWatch set(long elapsednanotime)
    {
        return this.set(elapsednanotime, 1.0);
    }


    /**
     * Performs the next measurement
     *
     * @return This Stop Watch
     */
    public StopWatch next()
    {
        return this.next(1.0);
    }


    /**
     * Stops the measurement
     *
     * @return This Stop Watch
     */
    public StopWatch stop()
    {
        return this.stop(1.0);
    }


    /**
     * Performs the next measurement
     *
     * @return This Stop Watch
     */
    public StopWatch next(double strength)
    {
        return this.set(this.prevdur - prevtime + System.nanoTime(), strength).start();
    }


    /**
     * Stops the measurement
     *
     * @return This Stop Watch
     */
    public StopWatch stop(double strength)
    {
        return this.set(System.nanoTime() - this.prevtime, strength).start();
    }


    /**
     * Logs the current duration to the server console
     *
     * @param name to log for
     * @return This Stop Watch
     */
    public StopWatch log(final String name)
    {
        System.out.println(name + ": " + this.get() + " ms");
        return this;
    }
}