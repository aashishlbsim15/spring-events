package events;

import events.customEvents.*;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class MainEvent {

  public static void main(String[] args) {
    ConfigurableApplicationContext context =
            new ClassPathXmlApplicationContext("Beans.xml");
    context.start();

    CustomPublisher publisher= (CustomPublisher) context.getBean("customPublisher");
    EmployeePublisher publisher1=(EmployeePublisher)context.getBean("employeepublisher");

//    Email email=new Email().setToMail("abc.tothenew.com")
//        .setSubject("Test mail for Synchronous Event")
//        .setBody("Hi, \n Today's session is Spring Event and Integration");
//
//    EmailEvent emailEvent=new EmailEvent(email);
//    publisher.publish(emailEvent);
    Employee employee=new Employee();
    employee.setId(1);
    employee.setMailid("aas@fg.com");
    employee.setSalary(35000);
    if(employee.getSalary()>30000) {
      EmployeeEvent employeeEvent = new EmployeeEvent(employee);
      publisher1.publish(employeeEvent);
    }
    context.stop();
  }
}
