package io.id.app.util.rest.feature;

import javax.ws.rs.core.Feature;
import javax.ws.rs.core.FeatureContext;
import javax.ws.rs.ext.Provider;
import io.id.app.util.rest.binder.ApplicationBinder;

@Provider
public class DependencyInjectionFeature implements Feature {

    @Override
    public boolean configure(FeatureContext context) {
        context.register(new ApplicationBinder());
        return true;
    }

}
