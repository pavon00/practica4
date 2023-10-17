package practica4;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import practica4.core.driven_ports.BookRepository;
import practica4.core.driver_ports.BookService;
import practica4.core.driver_ports.BookServiceImpl;

@Configuration
public class SpringBeans {
	@Bean
	BookService bookService(final BookRepository bookRepository) {
		return new BookServiceImpl(bookRepository);

	}

}
