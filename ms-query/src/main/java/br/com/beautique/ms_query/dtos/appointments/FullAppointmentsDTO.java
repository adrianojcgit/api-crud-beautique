package br.com.beautique.ms_query.dtos.appointments;

import br.com.beautique.ms_query.dtos.beautyprocedures.BeautyProcedureDTO;
import br.com.beautique.ms_query.dtos.customers.CustomerDTO;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Document(collation = "appointments")
public class FullAppointmentsDTO {

    private Long id;
    private LocalDateTime dateTime;
    private Boolean appointmentsOpen;
    private CustomerDTO customerDTO;
    private BeautyProcedureDTO beautyProcedureDTO;

}
