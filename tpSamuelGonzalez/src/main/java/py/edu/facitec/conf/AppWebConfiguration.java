package py.edu.facitec.conf;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.format.datetime.DateFormatter;
import org.springframework.format.datetime.DateFormatterRegistrar;
import org.springframework.format.support.DefaultFormattingConversionService;
import org.springframework.format.support.FormattingConversionService;
import org.springframework.web.servlet.config.annotation.DefaultServletHandlerConfigurer;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

import py.edu.facitec.dao.VentaDAO;
import py.edu.facitec.nombre.controller.HomeController;
// Habilita la Arquitectura MVC de Spring
@EnableWebMvc 
// Clase a gestionar por Spring
@ComponentScan(basePackageClasses={HomeController.class, VentaDAO.class}) public class AppWebConfiguration extends WebMvcConfigurerAdapter { 
 // Definir un metodo gestionado por Spring
@Bean 
public InternalResourceViewResolver internalResourceViewResolver() { 
	InternalResourceViewResolver resolver =new InternalResourceViewResolver();
	// Prefijo para todas las paginas
resolver.setPrefix("/static/");
// Sufijo para todas las paginas
resolver.setSuffix(".html"); 
return resolver; 
}
// HABILITAR LA PETICIONES PARA RECURSOS ESTAICOS DENTRO DEL AppWebConfigurations
@Override
public void configureDefaultServletHandling(DefaultServletHandlerConfigurer configurer) {
	configurer.enable();
}
@Bean  	
public FormattingConversionService mvcConversionService() 
{ 
 	DefaultFormattingConversionService conversionService =  	new DefaultFormattingConversionService(true);
 	DateFormatterRegistrar registrar = new DateFormatterRegistrar(); 
 	registrar.setFormatter(new DateFormatter("yyyy-MM-dd"));  
 	registrar.registerFormatters(conversionService); 
 	return conversionService; 
 	} 


} 

