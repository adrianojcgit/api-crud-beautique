package br.com.beautique.ms_query.services;

import br.com.beautique.ms_query.dtos.appointments.FullAppointmentDTO;

import java.util.List;

public interface AppointmentService {
    List<FullAppointmentDTO> listAllAppointments();
    List<FullAppointmentDTO> listAllAppointmentsByCustomer(Long customerId);
    List<FullAppointmentDTO> listAllAppointmentsByBeautyProcedure(Long beautyProcedureId);
}
