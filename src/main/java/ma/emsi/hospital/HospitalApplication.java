package ma.emsi.hospital;

import ma.emsi.hospital.entities.*;
import ma.emsi.hospital.repositories.ConsultationRepository;
import ma.emsi.hospital.repositories.MedecinRepository;
import ma.emsi.hospital.repositories.PatientRepository;
import ma.emsi.hospital.repositories.RendezVousRepository;
import ma.emsi.hospital.service.IHospitalService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.Date;
import java.util.stream.Stream;


@SpringBootApplication
public class HospitalApplication {

    public static void main(String[] args) {
        SpringApplication.run(HospitalApplication.class, args);
    }

   @Bean
   CommandLineRunner start(IHospitalService hospitalService, PatientRepository patientRepository,ConsultationRepository consultationRepository,RendezVousRepository rendezVousRepository,MedecinRepository medecinRepository){

       return args -> {
           Stream.of("Mohammed","Hassan","Najat")
                   .forEach(name->{
                       Patient patient = new Patient();
                       patient.setNom(name);
                       patient.setDatedenaissance(new Date());
                       patient.setMalade(false);
                       hospitalService.savePatient(patient);
                   });
           Stream.of("Dr Ayman","Dr Hanane","Dr Yasmine")
                   .forEach(name->{
                      Medecin medecin= new Medecin();
                      medecin.setNom(name);
                      medecin.setEmail(name+"@gmail.com");
                      medecin.setSpecialite(Math.random()>0.5?"Cardio":"Dentiste");
                       hospitalService.saveMedecin(medecin);
                   });

           Patient patient1=patientRepository.findByNom("Mohamed");
           Patient patient=patientRepository.findById(1L).orElse(null);

           Medecin medecin=medecinRepository.findByNom("Dr Yasmine");

           RendezVous rendezVous=new RendezVous();
           rendezVous.setDate(new Date());
           rendezVous.setStatus(StatusRDV.PENDING);
           rendezVous.setMedecin(medecin);
           rendezVous.setPatient(patient);
           hospitalService.saveRDV(rendezVous);

           RendezVous rendezVous1=rendezVousRepository.findById(1l).orElse(null);
           Consultation consultation=new Consultation();
           consultation.setDateConsultation(new Date());
           consultation.setRendezVous(rendezVous1);
           consultation.setRapport("Rapport de la consultation");
           hospitalService.saveConsultation(consultation);








       };

   }
}