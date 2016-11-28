package es.flst;

import org.glassfish.jersey.jackson.JacksonFeature;
import org.glassfish.jersey.media.multipart.MultiPartFeature;

import javax.ws.rs.core.Application;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by francisco on 28/11/16.
 */
public class AppConfig extends Application {

    public Set<Class<?>> getClasses() {
        final Set<Class<?>> resources = new HashSet<Class<?>>();

        // Add your resources.
        resources.add(ChannelCreatedResource.class);

        // Add additional features such as support for Multipart.
        resources.add(MultiPartFeature.class);

        //Jackson
        resources.add(JacksonFeature.class);
        return resources;
    }

}
