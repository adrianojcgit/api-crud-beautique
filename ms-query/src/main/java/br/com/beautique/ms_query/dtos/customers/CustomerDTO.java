package br.com.beautique.ms_query.dtos.customers;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Document(collation = "customers")
public class CustomerDTO {
    private Long id;
    private String name;
    private String email;
    private String phone;
}
