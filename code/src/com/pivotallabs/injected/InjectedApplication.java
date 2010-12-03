package com.pivotallabs.injected;

import com.google.inject.Module;
import roboguice.application.GuiceApplication;

import java.util.List;

public class InjectedApplication extends GuiceApplication {
    public Module module = new RobolectricSampleModule();

    @Override protected void addApplicationModules(List<Module> modules) {
        modules.add(module);
    }

    public void setModule(Module module) {
        this.module = module;
    }
}
