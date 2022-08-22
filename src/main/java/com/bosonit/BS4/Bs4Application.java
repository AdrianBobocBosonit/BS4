package com.bosonit.BS4;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.ConfigurationPropertiesScan;

import javax.annotation.PostConstruct;

@SpringBootApplication
		//La siguiente línea está para hacer lo mismo que sin ella pero con el archivo SimpleProperties2 en vez de con el archivo SimpleProperties directamente
//@EnableConfigurationProperties(SimpleProperties2.class)

		//La siguiente línea es otro método para hacer lo mismo que anteriormente
//@ConfigurationPropertiesScan
public class Bs4Application {

	/*@Autowired
	private SimplePorperties simplePorperties;

	@Autowired
	private ImmutableProperties immutableProperties;

	@Autowired
	private NestedProperties nestedProperties;

	@Autowired
	private ConvertedProperties convertedProperties;*/

	/*@Autowired
	private BeanProperties beanProperties;*/

	public static void main(String[] args) {
		SpringApplication.run(Bs4Application.class, args);
	}

	/*@PostConstruct
	private void postInit() {
		System.out.println("Simple properties info...");
		System.out.println(simplePorperties);

		System.out.println("Immutable properties info...");
		System.out.println(immutableProperties);

		System.out.println("Nested properties info...");
		System.out.println(nestedProperties);

		System.out.println("Converted properties info...");
		System.out.println(convertedProperties);*/


			//No me deja establecer las propiedades de un bean no se muy bien por qué
			//da error de contexto por un cyclo de beanProperties
			//https://www.youtube.com/watch?v=4m5w5pQLPN0
		/*System.out.println("Bean properties info...");
		System.out.println(beanProperties.getName());*/

	//}

	/*@ConfigurationProperties(prefix = "bean")
	@Bean
	BeanProperties beanPropertieses() {
		return new BeanProperties();
	}*/
}
