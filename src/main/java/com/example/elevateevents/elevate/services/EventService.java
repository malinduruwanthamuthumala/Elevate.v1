package com.example.elevateevents.elevate.services;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.elevateevents.elevate.beans.Event;
import com.example.elevateevents.elevate.beans.Musical;
import com.example.elevateevents.elevate.beans.Wedding;
import com.example.elevateevents.elevate.repository.EventRepository.EventRepository;
import com.fasterxml.jackson.databind.ObjectMapper;

@Service
public class EventService {
	
	@Autowired
	private ObjectMapper objectMapper;
	
	 public Event createEvent(Map<String, Object> eventPayload,EventRepository eventRepository ) {
	        String eventType = (String) eventPayload.get("type");
	        Event event = null;
	        
	        if ("WEDDING".equalsIgnoreCase(eventType)) {
	            event = objectMapper.convertValue(eventPayload, Wedding.class);
	        } else if ("MUSICAL".equalsIgnoreCase(eventType)) {
	            event = objectMapper.convertValue(eventPayload, Musical.class);
	        } else {
	            throw new IllegalArgumentException("Invalid event type");
	        }

	        return eventRepository.save(event);
	    }

}
