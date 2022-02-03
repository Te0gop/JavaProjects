package com.rest.conferencedemo.models.projections;

import com.rest.conferencedemo.models.Session;
import com.rest.conferencedemo.models.Speaker;
import org.springframework.data.rest.core.config.Projection;

import java.util.List;

@Projection(name = "sessionDetail", types = {Session.class})
public interface SessionDetail {
    String getSessionName();
    String getSessionDescription();
    Integer getSessionLength();
    List<Speaker> getSpeaker();
}
