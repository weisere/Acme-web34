package com.acme.statusmgr.beans.SystemStatuses;

public class mockSystemStatus implements SystemStatusInterface{
    @Override
    public long getAvailableProcessors() {
        return 4;
    }

    @Override
    public long getFreeJVMMemory() {
        return 127268272;
    }

    @Override
    public Runtime.Version getJreVersion() {
        return Runtime.Version.parse("15.0.2+7-27");
    }

    @Override
    public String getTempLocation() {
        return "M:\\\\AppData\\\\Local\\\\Temp";
    }

    @Override
    public long getTotalJVMMemory() {
        return 159383552;
    }
}
