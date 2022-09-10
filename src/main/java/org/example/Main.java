package org.example;

import jadex.base.PlatformConfiguration;
import jadex.base.Starter;

// Jadex Active Components Documentation:
// https://github.com/actoron/jadex/blob/master/docs/index.md

public class Main {
    public static void main(String[] args) {
        // For Active Components to be executed, a Platform needs to be running.
        // PlatformConfiguration models the Configuration of a Jadex Platform.
        // It includes a configuration for the Starter as well as one for
        // the RootComponent (usually an Agent).
        PlatformConfiguration platformConfig = PlatformConfiguration.getDefaultNoGui();
        // getDefaultNoGui returns a PlatformConfiguration with the default parameters but without gui.

        // enables the printing of info and warning messages in addition to severe messages.
        //platformConfig.setLogging(true);

        // With Jadex, the behaviour of a software is defined by the interaction between components,
        // each of them providing a clearly defined functionality.
        platformConfig.addComponent("org.example.AgentBDI.class");

        // The object returned by Starter.createPlatform() is called a Future.
        // It represents a result that is not yet available.
        // Futures are used for asynchronous programming
        Starter.createPlatform(platformConfig).get();
        // Using get() will block until the result is available, so you can work with it.
    }
}
