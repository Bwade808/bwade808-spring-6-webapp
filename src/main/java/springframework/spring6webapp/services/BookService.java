package springframework.spring6webapp.services;

import springframework.spring6webapp.domain.Book;

public interface BookService {
    public Iterable<Book> findAll();
}
