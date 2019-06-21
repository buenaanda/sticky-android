import com.github.javafaker.Faker

public class data_generator {

	Faker faker = new Faker()

	String firstName() {
		return faker.name.firstName()
	}

	String lastName() {
		return faker.name.lastName()
	}
}
