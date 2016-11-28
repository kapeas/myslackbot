package es.flst;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;

/**
 * Created by francisco on 28/11/16.
 */
@Path("/created")
public class ChannelCreatedResource {

    public static Logger log = LoggerFactory.getLogger(ChannelCreatedResource.class);

    @POST
    @Produces("application/x-www-form-urlencoded")
    public Response handleChannelCreated(EventRequest req){
        log.info("Received Event request.");
        log.info("Challenge: {}", req.getChallenge());
        log.info("Token: {}", req.getToken());
        log.info("Type: {}", req.getType());
        return Response.ok().entity(req.getChallenge()).build();
    }


    private class EventRequest {

        private String token;
        private String challenge;
        private String type;

        public String getToken() {
            return token;
        }

        public void setToken(String token) {
            this.token = token;
        }

        public String getChallenge() {
            return challenge;
        }

        public void setChallenge(String challenge) {
            this.challenge = challenge;
        }

        public String getType() {
            return type;
        }

        public void setType(String type) {
            this.type = type;
        }

        /*
        *  "challenge": "3eZbrw1aBm2rZgRNFdxV2595E9CY3gmdALWMmHkvFXO7tYXAYM8P",
    "type": "url_verification"
        *
        * */
    }
}
