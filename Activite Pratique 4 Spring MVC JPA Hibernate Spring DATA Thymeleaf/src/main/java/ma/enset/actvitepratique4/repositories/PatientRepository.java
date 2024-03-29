package ma.enset.actvitepratique4.repositories;


import ma.enset.actvitepratique4.entities.Patient;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

public interface
PatientRepository extends JpaRepository<Patient, Long> {
    Page<Patient> findByNomContains(String mc, Pageable pageable );
}
