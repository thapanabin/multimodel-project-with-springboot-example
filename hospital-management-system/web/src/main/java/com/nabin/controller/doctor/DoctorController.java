package com.nabin.controller.doctor;

import com.nabin.model.doctor.Doctor;
import com.nabin.service.doctor.DoctorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class DoctorController {

    @Autowired
    DoctorService service;
    @GetMapping("/doctors")
    public List<Doctor> getDoctors() {
        return service.getDoctors();

    }
}
