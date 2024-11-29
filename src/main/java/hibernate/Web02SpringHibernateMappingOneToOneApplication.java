package hibernate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import jakarta.transaction.Transactional;


@SpringBootApplication
public class Web02SpringHibernateMappingOneToOneApplication implements CommandLineRunner {
	@Autowired
	RepositoryInstructor repositoryinstructor;

	@Transactional
	public void saveOneToOne(Instructor ins, InstructorDetail insdetail) {
		ins.setInstructordetail(insdetail);
		repositoryinstructor.save(ins);
		System.out.println("Save successfully!");
	}

	public static void main(String[] args) {
		SpringApplication.run(Web02SpringHibernateMappingOneToOneApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		InstructorDetail insdetail = new InstructorDetail(
				"https://www.youtube.com/watch?v=vKuHQRTS20U&list=RDnuANwLqdGpM&index=19", "code");
		Instructor insr = new Instructor("Trung", "Ngo Le", "hieupham@gmail.com");
		saveOneToOne(insr, insdetail);
	}
}
