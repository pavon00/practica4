package practica4.db_driven_adapter.domain;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import practica4.core.domain.Book;
import practica4.core.domain.BookDoesNotExistException;
import practica4.core.driven_ports.BookRepository;
import practica4.db_driven_adapter.jparepository.HAAJpaRepository;

@Component
public class JpaBookRepository implements BookRepository {

	@Autowired // enlaza repositorio y servicio

	private HAAJpaRepository haaJpaRepository;

	@Override

	public Book findById(Long id) {

		Optional<BookEntity> bookEntityOptional = haaJpaRepository.findById(id);

		BookEntity bookEntity = bookEntityOptional.orElseThrow(BookDoesNotExistException::new);

		return bookEntity.toBook();

	}

}