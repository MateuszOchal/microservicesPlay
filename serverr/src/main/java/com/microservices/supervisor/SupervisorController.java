package com.microservices.supervisor;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping
@Slf4j
public class SupervisorController {
    private final SupervisorService service;
    @GetMapping("/supervisor")
    public List<SupervisorDTO> getSupervisor(){
        log.info("All supervisors requested");
        return service.getSupervisors();
    }

}
