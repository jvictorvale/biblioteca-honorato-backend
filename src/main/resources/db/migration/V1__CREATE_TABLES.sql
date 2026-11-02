CREATE TABLE categories (
                            id BIGSERIAL PRIMARY KEY,
                            name VARCHAR(100) NOT NULL UNIQUE,
                            created_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP NOT NULL,
                            updated_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP NOT NULL
);

CREATE TABLE books (
                       id BIGSERIAL PRIMARY KEY,
                       category_id BIGINT NOT NULL REFERENCES categories(id) ON DELETE RESTRICT,
                       title VARCHAR(255) NOT NULL,
                       author VARCHAR(255) NOT NULL,
                       cover_url TEXT,
                       purchase_link TEXT,
                       status VARCHAR(20) NOT NULL DEFAULT 'WISHLIST',
                       rating INT CHECK (rating BETWEEN 1 AND 5),
                       review TEXT,
                       read_date DATE,
                       description TEXT,
                       page_count INT,
                       isbn VARCHAR(20),
                       publisher VARCHAR(150),
                       created_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP NOT NULL,
                       updated_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP NOT NULL
);

CREATE TABLE best_of_the_year (
                                  id BIGSERIAL PRIMARY KEY,
                                  book_id BIGINT NOT NULL UNIQUE REFERENCES books(id) ON DELETE CASCADE,
                                  year INT NOT NULL UNIQUE,
                                  justification TEXT NOT NULL,
                                  created_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP NOT NULL,
                                  updated_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP NOT NULL
);

CREATE TABLE gift_intentions (
                                 id BIGSERIAL PRIMARY KEY,
                                 book_id BIGINT NOT NULL REFERENCES books(id) ON DELETE CASCADE,
                                 friend_name VARCHAR(100) NOT NULL,
                                 friend_note VARCHAR(255),
                                 created_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP NOT NULL,
                                 updated_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP NOT NULL
);

CREATE INDEX idx_books_status ON books(status);
CREATE INDEX idx_books_category ON books(category_id);
CREATE INDEX idx_gift_intentions_book ON gift_intentions(book_id);