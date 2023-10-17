package practica4.core.driven_ports;

import practica4.core.domain.Book;

public interface BookRepository {
	Book findById(Long id);
}
