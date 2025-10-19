package br.com.beautique.ms_query.repositories;

import br.com.beautique.ms_query.dtos.appointments.FullAppointmentsDTO;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface AppointmentRepository extends MongoRepository<FullAppointmentsDTO, Long> {
}
