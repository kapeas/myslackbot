package es.flst;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.ws.rs.*;
import javax.ws.rs.core.Response;

/**
 * Created by francisco on 29/11/16.
 */
@Path("/channelcreated")
public class CreatedResource {

    public static Logger log = LoggerFactory.getLogger(CreatedResource.class);

    @POST
    @Consumes("application/json")
    @Produces("application/json")
    public Response handleChannelCreated(SlackEventData createdEvent){
        Channel chan = createdEvent.getChannel();
        log.info( "Channel {} created. EventType: {}. Created: {}. Creator: {}. ChannelID: {}",
                chan.getName(), createdEvent.getType(), chan.getCreated(), chan.getCreator() , chan.getId() );
        return processEvent(chan);
    }

    private Response processEvent(Channel channelCreated) {
        log.info("I'm as useless as you programmed me...");
        return Response.ok().entity(channelCreated).build();
    }

}
