package net.javaguides.springboot_backend;

import net.javaguides.springboot_backend.Model.Employee;
import net.javaguides.springboot_backend.Repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringbootBackendApplication implements CommandLineRunner {

	@Autowired
	private EmployeeRepository employeeRepository;

	public static void main(String[] args) {
		System.out.println("ramesh");
		SpringApplication.run(SpringbootBackendApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		Employee employee = new Employee();
		employee.setFirstName("Ramesh");
		employee.setLastName("Rock");
		employee.setEmailId("ramesh@gmail.com");

		Employee employee1 = new Employee();
		employee1.setFirstName("Kayathri");
		employee1.setLastName("Leo");
		employee1.setEmailId("kayathrileo@gmail.com");

		// Saving employees to the database using employeeRepository
		employeeRepository.save(employee);
		employeeRepository.save(employee1);

		// Print message for confirmation
		System.out.println("Employees saved to the database.");
	}
}
