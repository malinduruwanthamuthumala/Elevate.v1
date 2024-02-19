package com.example.elevateevents.elevate.repository.EventRepository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.elevateevents.elevate.beans.Event;

public interface EventRepository extends JpaRepository<Event,Long>{

}
