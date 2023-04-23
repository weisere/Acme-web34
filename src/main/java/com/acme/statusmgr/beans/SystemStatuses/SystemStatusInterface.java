package com.acme.statusmgr.beans.SystemStatuses;

/**
 *This class is a interface for the facade of all the varied types of system status we make use of. So the information is obtainable through a centralized,
 *simple class, so that new programmers can easily see what status items we care about and how to obtain them
 */
public interface SystemStatusInterface {
    public long getAvailableProcessors();
    public long getFreeJVMMemory();
    public Runtime.Version getJreVersion();
    public String getTempLocation();
    public long getTotalJVMMemory();

}
