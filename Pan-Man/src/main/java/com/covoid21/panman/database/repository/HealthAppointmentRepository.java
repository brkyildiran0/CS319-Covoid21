package com.covoid21.panman.database.repository;

import com.covoid21.panman.entity.appointment.HealthAppointment;
import com.covoid21.panman.entity.user.HealthcarePersonnel;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface HealthAppointmentRepository extends AppointmentRepositoryBase<HealthAppointment> {
    List<HealthAppointment> findByDepartment(String department);
    List<HealthAppointment> findByDoctor(HealthcarePersonnel doctor);
}
