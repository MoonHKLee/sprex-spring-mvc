package me.moonh.sprexspringmvc;

import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service
public class EventService {

    public List<Event> getEvents(){
        Event event1 = Event.builder()
                .name("스프링 웹 mvc 스터디")
                .startDateTime(LocalDateTime.of(2020,3,28,10,0))
                .endDateTime(LocalDateTime.of(2020,3,28,20,0))
                .build();

        Event event2 = Event.builder()
                .name("스프링 웹 mvc 스터디")
                .startDateTime(LocalDateTime.of(2020,3,28,10,0))
                .endDateTime(LocalDateTime.of(2020,3,28,20,0))
                .build();
    }

}
