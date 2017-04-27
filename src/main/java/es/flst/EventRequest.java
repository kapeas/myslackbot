package es.flst;

/**
 * Created by francisco on 29/11/16.
 */
public class EventRequest extends SlackEventData {

    public String challenge;

    public EventRequest() {}

    public String getChallenge() {
        return challenge;
    }

    public void setChallenge(String challenge) {
        this.challenge = challenge;
    }


    //This is the testEvent to register app event url.

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