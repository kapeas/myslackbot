package es.flst;

import org.glassfish.jersey.client.ClientConfig;
import org.glassfish.jersey.filter.LoggingFilter;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.Invocation;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

/**
 * Created by francisco on 28/11/16.
 */
@Path("/created")
public class ChannelCreatedResource {

    public static Logger log = LoggerFactory.getLogger(ChannelCreatedResource.class);

    public ChannelCreatedResource(){}

    @POST
    @Consumes("application/json")
    @Produces("application/json")
    public Response handleEventReceive(ReceivedEvent reqObj) {
        SlackEventData event = reqObj.getEvent();
        if ( reqObj.getType().equals("url_verification")) {
            EventRequest req = (EventRequest) event;
            log.info("XML - Received Event request.");
            log.info("XML - Challenge: {}", req.getChallenge());
            log.info("XML - Token: {}", reqObj.getToken());
            log.info("XML - Type: {}", reqObj.getType());
            log.info("XML - Event: {}", req);
            log.info("XML - Event-Type: {}", req.getType());
            return Response.ok().entity(req.getChallenge()).build();
        } else if ( reqObj.getType().equals("event_callback") ) {
            SlackEventData createdEvent = event;
            Channel chan = createdEvent.getChannel();
            log.info( "Channel {} created. EventType: {}. Created: {}. Creator: {}. ChannelID: {}",
                    chan.getName(), createdEvent.getType(), chan.getCreated(), chan.getCreator() , chan.getId() );
            return processEvent(chan);
        }
        return Response.serverError().build();
    }

    private Response processEvent(Channel channelCreated) {
        Client client = ClientBuilder.newClient( new ClientConfig().register( LoggingFilter.class ) );
        WebTarget webTarget = client.target("https://slack.com/api/rtm.start");
        Invocation.Builder invocationBuilder =  webTarget.request(MediaType.APPLICATION_XML);
        Response response = invocationBuilder.get();
        return response;
    }

    /*

     {
      "token": "W5mfvmAq2Nnp6LBmIBEPNPyf",
      "team_id": "T37MMC3A8",
      "api_app_id": "A37HLL96X",
      "event": {
        "type": "channel_created",
        "channel": {
          "id": "C39B5U8BH",
          "is_channel": true,
          "name": "onemore",
          "created": 1480497392,
          "creator": "U37HDE011",
          "is_shared": false,
          "is_org_shared": false
        },
        "event_ts": "1480497392.461634"
      },
      "type": "event_callback",
      "authed_users": [
        "U37HDE011"
      ]
    }

    * */
}
