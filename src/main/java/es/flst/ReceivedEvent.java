package es.flst;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by francisco on 29/11/16.
 */
public class ReceivedEvent {

    public String type;
    public String token;
    public String api_app_id;
    public String team_id;
    public List<String> authed_users = new ArrayList<>();
    public SlackEventData event;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public String getApi_app_id() {
        return api_app_id;
    }

    public void setApi_app_id(String api_app_id) {
        this.api_app_id = api_app_id;
    }

    public List<String> getAuthed_users() {
        return authed_users;
    }

    public void setAuthed_users(List<String> authed_users) {
        this.authed_users = authed_users;
    }

    public SlackEventData getEvent() {
        return event;
    }

    public void setEvent(SlackEventData event) {
        this.event = event;
    }

    public String getTeam_id() {
        return team_id;
    }

    public void setTeam_id(String team_id) {
        this.team_id = team_id;
    }
}
