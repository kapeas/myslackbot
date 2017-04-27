package es.flst;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;

/**
 * Created by francisco on 29/11/16.
 * */


@JsonSerialize
public class ChannelCreated extends SlackEventData {

    public ChannelCreated(){}
    public String getType() {
        return type;
    }
    public void setType(String type) {
        this.type = type;
    }

 /*

    {
        "type": "channel_created",
        "channel": {
        "id": "C024BE91L",
        "name": "fun",
        "created": 1360782804,
        "creator": "U024BE7LH"
    }


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
 */
}
