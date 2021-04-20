create table account (id int4 not null, amount int4 not null, discount boolean not null, membership_card_id int4, worker_id int4, primary key (id))
create table author (id int4 not null, first_name varchar(255), last_name varchar(255), nationality varchar(255), primary key (id))
create table awards (id int4 not null, name varchar(255), primary key (id))
create table book (id int4 not null, cover varchar(255), description varchar(255), language varchar(255), number_of_pages int4 not null, price int4 not null, quantity int4 not null, title varchar(255), author_id int4, publishing_house_id int4, primary key (id))
create table book_accounts (book_id int4 not null, accounts_id int4 not null, primary key (book_id, accounts_id))
create table book_genre (book_id int4 not null, genre_id int4 not null, primary key (book_id, genre_id))
create table book_awards (id int4 not null, place varchar(255), year varchar(255), award_id int4 not null, book_id int4 not null, primary key (id))
create table genre (id int4 not null, name varchar(255), primary key (id))
create table membership_card (id int4 not null, address varchar(255), date timestamp, email varchar(255), expire_date timestamp, first_name varchar(255), last_name varchar(255), phone varchar(255), serial_number int4 not null, unique_number varchar(255), primary key (id))
create table publishing_house (id int4 not null, location varchar(255), name varchar(255), primary key (id))
create table worker (id int4 not null, address varchar(255), date_of_birth timestamp, email varchar(255), first_name varchar(255), last_name varchar(255), phone varchar(255), unique_number varchar(255), primary key (id))
create sequence account_seq start 1 increment 1
create sequence author_seq start 1 increment 1
create sequence award_seq start 1 increment 1
create sequence book_seq start 1 increment 1
create sequence bookaward_seq start 1 increment 1
create sequence genre_seq start 1 increment 1
create sequence membership_card_seq start 1 increment 1
create sequence publishing_house_seq start 1 increment 1
create sequence worker_seq start 1 increment 1
alter table account add constraint FK54il87souxbj930icohy9vru9 foreign key (membership_card_id) references membership_card
alter table account add constraint FK2qy1jouj3cdys4q8e9ugmcw6f foreign key (worker_id) references worker
alter table book add constraint FKklnrv3weler2ftkweewlky958 foreign key (author_id) references author
alter table book add constraint FKljoqq01hogerbaa4odx0wkgiu foreign key (publishing_house_id) references publishing_house
alter table book_accounts add constraint FKiismi8jbqov1b9lc2al92yx6y foreign key (accounts_id) references account
alter table book_accounts add constraint FKup68b666jmwq9ypkivrw6svi foreign key (book_id) references book
alter table book_genre add constraint FK8l6ops8exmjrlr89hmfow4mmo foreign key (genre_id) references genre
alter table book_genre add constraint FK52evq6pdc5ypanf41bij5u218 foreign key (book_id) references book
alter table book_awards add constraint FKdabtxgme1to5rwdco8rhj3fj foreign key (award_id) references awards
alter table book_awards add constraint FKoghta69su6jcrn0com0rouc1w foreign key (book_id) references book
