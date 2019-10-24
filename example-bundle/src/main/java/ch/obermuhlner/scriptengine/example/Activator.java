package ch.obermuhlner.scriptengine.example;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;

public class Activator implements BundleActivator {
    @Override
    public void start(BundleContext context) throws Exception {
        System.out.println("Starting " + getClass());

        ScriptEngineExample.main(new String[] {});
    }

    @Override
    public void stop(BundleContext context) throws Exception {
        System.out.println("Stopping " + getClass());

    }
}
