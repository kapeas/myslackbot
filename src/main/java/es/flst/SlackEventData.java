package es.flst;

/**
 * Created by francisco on 30/11/16.
 */
public class SlackEventData {

    public String type;
    public Channel channel;
    public String event_ts;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Channel getChannel() {
        return channel;
    }

    public void setChannel(Channel channel) {
        this.channel = channel;
    }

    public String getEvent_ts() {
        return event_ts;
    }

    public void setEvent_ts(String event_ts) {
        this.event_ts = event_ts;
    }
}
