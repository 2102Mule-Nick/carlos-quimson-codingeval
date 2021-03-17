create schema code_activitiy;

create table persons(
	person_id serial primary key,
	identifier text null,
	first_name text not null,
	last_name text not null);
	
create table relationships(
	person_id int not null,
	person_id2 int not null,
	relationship text not null,
		foreign key (person_id) references persons(person_id),
		foreign key (person_id2) references persons(person_id)
	);
	
select * from persons;

insert into persons (first_name, last_name, identifier) values ('carlos', 'quimson', '1234');