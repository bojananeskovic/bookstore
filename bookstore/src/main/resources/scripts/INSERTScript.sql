--genre
insert into genre(id, name)
values(nextval('genre_seq'), 'Fantasy');
insert into genre(id, name)
values(nextval('genre_seq'), 'Thriller');
insert into genre(id, name)
values(nextval('genre_seq'), 'Romance');

--author
insert into author(id, first_name, last_name, nationality)
values(nextval('author_seq'), 'George', 'Martin', 'American');
insert into author(id, first_name, last_name, nationality)
values(nextval('author_seq'), 'Agatha', 'Christie ', 'English');
insert into author(id, first_name, last_name, nationality)
values(nextval('author_seq'), 'William', 'Shakespeare ', 'English');

--publishing_house
insert into publishing_house(id, location, name)
values(nextval('publishing_house_seq'), 'USA', 'Wiley');
insert into publishing_house(id, location, name)
values(nextval('publishing_house_seq'), 'United Kingdom', 'Macmillan');
insert into publishing_house(id, location, name)
values(nextval('publishing_house_seq'), 'France', 'Hachette Livre');

--worker
insert into worker(id, address, date_of_birth, email, first_name, last_name, phone, unique_number)
values(nextval('worker_seq'), 'Jackson, Mississippi 39211', '11/05/1973', 'john@gmail.com', 'John', 'Smith', '783-892', '3712562716');
insert into worker(id, address, date_of_birth, email, first_name, last_name, phone, unique_number)
values(nextval('worker_seq'), 'Huntington Station, NY 11746', '02/02/1980', 'adam@gmail.com', 'Adam', 'Johanson', '647-272', '74928374897');
insert into worker(id, address, date_of_birth, email, first_name, last_name, phone, unique_number)
values(nextval('worker_seq'), 'Cactus Avenue Battle Creek, MI 49015', '12/11/1985', 'anna@gmail.com', 'Anna', 'King', '464-213', '9873456123');

--membership_card
insert into membership_card(id, address, date, email, expire_date, first_name, last_name, phone, serial_number, unique_number)
values(nextval('membership_card_seq'), 'Beacon Circle Muskegon, MI 49441', '03/03/2020', 'stiv@gmail.com', '03/09/2020', 'Stiv', 'James', '893-231', '1', '23453947364');
insert into membership_card(id, address, date, email, expire_date, first_name, last_name, phone, serial_number, unique_number)
values(nextval('membership_card_seq'), 'Southampton St. Victoria, TX 77904', '04/03/2021', 'julia@gmail.com', '04/09/2020', 'Julia', 'Edvardson', '123-123', '2', '3453678964');
insert into membership_card(id, address, date, email, expire_date, first_name, last_name, phone, serial_number, unique_number)
values(nextval('membership_card_seq'), 'Boston St. Panama City, FL 32404', '11/05/2020', 'jenny@gmail.com', '11/11/2020', 'Jenny', 'Brown', '134-222', '3', '0987645738');

--awards
insert into awards(id, name)
values(nextval('award_seq'), 'National Book Awards');
insert into awards(id, name)
values(nextval('award_seq'), 'Pulitzer Prize for Letters, Drama and Music');
insert into awards(id, name)
values(nextval('award_seq'), 'The John Newbery Medal');

--book
insert into book(id, cover, description, language, number_of_pages, price, quantity, title, author_id, publishing_house_id)
values(nextval('book_seq'), 'Softcover', '', 'english', 820, 30, 100, 'A Game of Thrones', 1, 1);
insert into book(id, cover, description, language, number_of_pages, price, quantity, title, author_id, publishing_house_id)
values(nextval('book_seq'), 'Hardcover', '', 'english', 350, 45, 80, 'The ABC Murders', 2, 2);
insert into book(id, cover, description, language, number_of_pages, price, quantity, title, author_id, publishing_house_id)
values(nextval('book_seq'), 'Hardcover', '', 'english', 150, 20, 50, 'Romeo and Juliet', 3, 3);

--book_awards
insert into book_awards(id, place, year, award_id, book_id)
values(nextval('bookaward_seq'), 'London', '2020', 1, 1);
insert into book_awards(id, place, year, award_id, book_id)
values(nextval('bookaward_seq'), 'Paris', '2017', 2, 2);
insert into book_awards(id, place, year, award_id, book_id)
values(nextval('bookaward_seq'), 'Los Angeles', '2019', 3, 3);

--account
insert into account(id, amount, discount, membership_card_id, worker_id)
values(nextval('account_seq'), 75, true, 1, 1);
insert into account(id, amount, discount, membership_card_id, worker_id)
values(nextval('account_seq'), 50, true, 2, 2);
insert into account(id, amount, discount, membership_card_id, worker_id)
values(nextval('account_seq'), 45, true, 3, 3);

--book_genre
insert into book_genre(book_id, genre_id)
values(1, 1);
insert into book_genre(book_id, genre_id)
values(2, 2);
insert into book_genre(book_id, genre_id)
values(3, 3);

--book_accounts
insert into book_accounts(book_id, accounts_id)
values(1, 1);
insert into book_accounts(book_id, accounts_id)
values(2, 2);
insert into book_accounts(book_id, accounts_id)
values(3, 3);


