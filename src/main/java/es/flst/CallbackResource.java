package es.flst;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.ws.rs.*;
import javax.ws.rs.core.Response;
import java.net.URI;

/**
 * Created by francisco on 29/11/16.
 */
@Path("/callback")
public class CallbackResource {

    public static Logger log = LoggerFactory.getLogger(CallbackResource.class);

    @GET
    @Consumes("application/json")
    @Produces("application/json")
    public Response handleCallback(@QueryParam("code") String code){
        log.info("Received GET request.");
        log.info("CODE: {}", code);
        try{
            String clientId = "109735411348.109598689235";
            String clientSecret = "4031177883a0337e82509baa571aad42";
            URI location = new URI("https://slack.com/api/oauth.access?"
                    + "client_id=" + clientId + "&client_secret=" + clientSecret + "&code="
                    + code + "&redirect_uri=https://flst.es/slackbot/s/callback");
            return Response.temporaryRedirect(location).build();
        } catch (Throwable t){
            t.printStackTrace();
        }
        return Response.ok("Salida...").build();
    }

    @POST
    @Consumes("application/json")
    @Produces("application/json")
    public Response handlePostCallback(@QueryParam("code") String code){
        log.info("CODE: {}", code);
        return Response.ok().build();
    }
}
