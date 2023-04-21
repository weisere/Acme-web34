package com.acme.statusmgr.beans.SystemStatuses;

/**
 *
 */
public interface SystemStatusInterface {
    public long getAvailableProcessors();
    public long getFreeJVMMemory();
    public Runtime.Version getJreVersion();
    public String getTempLocation();
    public long getTotalJVMMemory();

}
