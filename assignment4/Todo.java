package no.hvl.dat110.rest.counters;

import com.google.gson.Gson;

public class Todo {
    private String id;
    private String summary;
    private String description;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getSummary() {
        return summary;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    String toJson() {
        Gson gson = new Gson();
        return gson.toJson(this);
    }

}
