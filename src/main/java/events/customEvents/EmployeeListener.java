package events.customEvents;

import org.springframework.context.ApplicationListener;

public class EmployeeListener implements ApplicationListener<EmployeeEvent> {
    @Override
    public void onApplicationEvent(EmployeeEvent event) {
            if(event.getSource() instanceof Employee){
                Employee employee=(Employee) event.getSource();
                System.out.println(employee);
            }else{
                System.out.println("Not an event class!");
            }
        }
    }

