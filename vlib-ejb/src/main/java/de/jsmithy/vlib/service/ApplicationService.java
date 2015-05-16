package de.jsmithy.vlib.service;

import javax.ejb.Stateless;

/**
 *
 * @author Erik Lotz
 */
@Stateless
public class ApplicationService implements ApplicationServiceLocal {
    private static final String VERSION = "1.0.0-SNAPSHOT";

    @Override
    public String getVersion() {
        return VERSION;
    }

}
