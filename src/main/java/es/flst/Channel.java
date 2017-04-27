package es.flst;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;

@JsonSerialize
public class Channel {
    public String id;
    public String name;
    public long created;
    public String creator;
    public boolean is_channel;
    public boolean is_shared;
    public boolean is_org_shared;


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getCreated() {
        return created;
    }

    public void setCreated(long created) {
        this.created = created;
    }

    public String getCreator() {
        return creator;
    }

    public void setCreator(String creator) {
        this.creator = creator;
    }

    public boolean isIs_channel() {
        return is_channel;
    }

    public void setIs_channel(boolean is_channel) {
        this.is_channel = is_channel;
    }

    public boolean isIs_shared() {
        return is_shared;
    }

    public void setIs_shared(boolean is_shared) {
        this.is_shared = is_shared;
    }

    public boolean isIs_org_shared() {
        return is_org_shared;
    }

    public void setIs_org_shared(boolean is_org_shared) {
        this.is_org_shared = is_org_shared;
    }
}
