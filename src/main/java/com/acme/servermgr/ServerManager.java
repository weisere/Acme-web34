package com.acme.servermgr;

import org.springframework.stereotype.Service;
/**
 * Manage all servers (service providers) being tracked by the Acme server tracking system
 * For now just some simple static methods for use in school project.
 * Treat this as a 'black box' that gives back indicators like up, running etc for
 * various 'services' that are being managed.
 */
@Service
public class ServerManager implements ServerManagerInterface {
    /**
     * Get the status of this server
     * @return a descriptive string about the servers status
     */
     @Override
     public String getCurrentServerStatus() {
        return "up";  // The server is up
    }

    /**
     * Find out if this server is operating normally
     * @return Boolean indicating if server is operating normally
     */
     @Override
     public Boolean isOperatingNormally()
    {
        return true;
    }
}
