package com.example.BootApp0208;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.example.BootApp0208.test.Dog;

@SpringBootApplication
public class BootApp0208Application {

	public static void main(String[] args) {
		SpringApplication.run(BootApp0208Application.class, args);
	}
	//spring2.5버전부터는 xml을 사용하지 않고, 자바코드에서도 번들을 생성 및 설정할 수 있는 방법을 제공한다. 
	//이때 사용되는 어노테이션이 @Bean <bean id="" class"">
	@Bean
	public Dog dog() { //BoardService <bean id="dog" class="Dog"
		return new Dog();
	}
}
