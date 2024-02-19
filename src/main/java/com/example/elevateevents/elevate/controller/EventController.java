package com.example.elevateevents.elevate.controller;

import java.util.List;
import java.util.Map;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.elevateevents.elevate.beans.Event;
import com.example.elevateevents.elevate.beans.Meeting;
import com.example.elevateevents.elevate.beans.Musical;
import com.example.elevateevents.elevate.beans.Speach;
import com.example.elevateevents.elevate.repository.EventRepository.EventRepository;
import com.example.elevateevents.elevate.services.EventService;

@RestController
public class EventController {
	
	@Autowired
	EventRepository repository;
	
	@Autowired
	EventService service;
	
	@GetMapping("/event")
	public List<Event> getAllEvents(){
		return repository.findAll();
	}
	
	@GetMapping("/event/{id}")
	public Event findById(@PathVariable Long id) {
		Optional<Event>  ev1= repository.findById(id);
		if(ev1.isPresent()) {
			return ev1.get();
		} else {
			throw new RuntimeException("event cannot be found");
		}
	}
	
	@PostMapping("/createEvent")
	public ResponseEntity<Event> createEvent(@RequestBody Map<String, Object> eventPayload) {
		Event event = service.createEvent(eventPayload,repository);
		return ResponseEntity.ok(event);
	}
	
	@DeleteMapping("/event/{id}")
	public void deleteEvent(@PathVariable Long id) {
		repository.deleteById(id);
	}
	
	
	
	
	

}
