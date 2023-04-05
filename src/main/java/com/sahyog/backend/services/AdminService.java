package com.sahyog.backend.services;


import com.sahyog.backend.entities.Doctor;
import com.sahyog.backend.repo.DoctorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AdminService {

    @Autowired
    private DoctorRepository doctorRepository;

    public Doctor addDoctor(Doctor doctor)
    {
        return doctorRepository.save(doctor);
    }

    public List<Doctor> findDoctors()
    {
        return doctorRepository.findAll();
    }

    public Doctor findDoctorByHealthId(String healthIdNumber) { return doctorRepository.findByHealthIdNumber(healthIdNumber);}

//    public Doctor findDoctorById(int id) { return doctorRepository.findById(id).orElse(null);}
    public String deleteDoctor(int id)
    {
        doctorRepository.deleteById(id);
        return "doctor deleted !! " + id;
    }

    public Doctor updateDoctor(Doctor doctor){
        Doctor existingDoctor = doctorRepository.findByHealthIdNumber(doctor.getHealthIdNumber());
        existingDoctor.setAddress(doctor.getAddress());
        existingDoctor.setGender(doctor.getGender());
        existingDoctor.setName(doctor.getName());
        existingDoctor.setMobile(doctor.getMobile());
        existingDoctor.setDayOfBirth(doctor.getDayOfBirth());
        existingDoctor.setMonthOfBirth(doctor.getMonthOfBirth());
        existingDoctor.setYearOfBirth(doctor.getYearOfBirth());
        existingDoctor.setRegistrationNumber(doctor.getRegistrationNumber());
        existingDoctor.setHealthId(doctor.getHealthId());
        return doctorRepository.save(existingDoctor);
    }

}
