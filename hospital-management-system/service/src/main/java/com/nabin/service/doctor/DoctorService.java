package com.nabin.service.doctor;

import com.nabin.dao.doctor.DoctorRepository;
import com.nabin.mailservice.EmailService;
import com.nabin.model.doctor.Doctor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@Service
public class DoctorService {


    @Autowired
    private DoctorRepository doctorRepository;

    @Autowired
    private EmailService emailService;

    @PostConstruct
    public void initDoctor(){
       doctorRepository.saveAll(Stream.of(new Doctor(1,"Nabin","Cardiac"),
               new Doctor(2,"Arjun","Neuro")).collect(Collectors.toList()));
    }

    public List<Doctor> getDoctors(){
        emailService.sendEmail();

        return doctorRepository.findAll();
    }
}
