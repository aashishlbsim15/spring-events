package events.customEvents;

import org.springframework.context.ApplicationEventPublisher;
import org.springframework.context.ApplicationEventPublisherAware;

public class EmployeePublisher implements ApplicationEventPublisherAware {
    private ApplicationEventPublisher publisher;
    @Override
    public void setApplicationEventPublisher(ApplicationEventPublisher applicationEventPublisher) {

       System.out.println("Application event Publisher is set to Custom Publisher");
    publisher=applicationEventPublisher;
    }
    public void publish(EmployeeEvent event){
        publisher.publishEvent(event);
    }
}
