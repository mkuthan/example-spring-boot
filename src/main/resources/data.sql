insert into individual(id, first_name, last_name) values (1, 'Jack', 'Rayan')
insert into individual(id, first_name, last_name) values (2, 'Caroline', 'Rayan')
insert into individual(id, first_name, last_name) values (3, 'Sally', 'Rayan')
insert into individual(id, first_name, last_name) values (4, 'Jack Jr', 'Rayan')
insert into individual(id, first_name, last_name) values (5, 'Katie', 'Rayan')

insert into family(id, husband_id, wife_id) values (1, 1, 2)
insert into family_children(family_id, children_id) values (1, 3)
insert into family_children(family_id, children_id) values (1, 4)
insert into family_children(family_id, children_id) values (1, 5)
