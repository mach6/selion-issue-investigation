package com.foo.bar.capabilties.builders;

import org.openqa.selenium.remote.DesiredCapabilities;

import com.paypal.selion.platform.grid.browsercapabilities.DefaultCapabilitiesBuilder;

public class CustomCapabilities extends DefaultCapabilitiesBuilder {
    private static final String TUNNEL_CAPABILITY = "tunnelIdentifier";

    @Override
    public DesiredCapabilities getCapabilities(DesiredCapabilities capabilities) {
        String tunnelIdValue = "1231234123410938412lkasdlkfasl;kdf238749812374091234";
        capabilities.setCapability(TUNNEL_CAPABILITY, tunnelIdValue);

        System.out.println("[CAPABLITIES] " +  capabilities.toString());
        return capabilities;
    }

}
