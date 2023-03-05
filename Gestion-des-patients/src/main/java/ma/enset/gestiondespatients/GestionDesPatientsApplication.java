package ma.enset.gestiondespatients;

import ma.enset.gestiondespatients.entities.Patient;
import ma.enset.gestiondespatients.repositories.PatientRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import javax.xml.crypto.Data;
import java.util.Date;

@SpringBootApplication
public class GestionDesPatientsApplication {

    public static void main(String[] args) {
        SpringApplication.run(GestionDesPatientsApplication.class, args);
    }
    @Bean
    CommandLineRunner commandLineRunner(PatientRepository patientRepository){
        return args -> {
            /*patientRepository.save(
                    new Patient(0,"HOUD","Fatiza",new Date(),false,10)
            );
            patientRepository.save(
                    new Patient(1,"ALAMI","Hiba",new Date(),true,1)
            );
            patientRepository.save(
                    new Patient(2,"JALAL","Ihssan",new Date(),false,10)
            );
            patientRepository.save(
                    new Patient(3,"HOUD","Hind",new Date(),false,18)
            );*/
            patientRepository.findAll().forEach(p->{
                System.out.println(p.getNom()+" "+p.getPrenom());
            });
        };
    }
}
