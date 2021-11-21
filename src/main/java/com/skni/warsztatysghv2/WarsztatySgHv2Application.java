package com.skni.warsztatysghv2;

import com.skni.warsztatysghv2.registration.ApplicationForm;
import com.skni.warsztatysghv2.registration.StatusService;
import com.skni.warsztatysghv2.registration.StudentService;
import com.skni.warsztatysghv2.registration.UUIDStudentIdGenerator;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.event.EventListener;

@SpringBootApplication
public class WarsztatySgHv2Application {

    public static void main(String[] args) {
        SpringApplication.run(WarsztatySgHv2Application.class, args);
    }

    @EventListener(ApplicationReadyEvent.class)
    public void doAfterStartup() {
        ApplicationContext context = new AnnotationConfigApplicationContext(UUIDStudentIdGenerator.class, StatusService.class, ApplicationForm.class);
        StudentService studentService = context.getBean(StudentService.class);
        studentService.printStudent();
    }

}
