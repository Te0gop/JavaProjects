INSERT INTO driver(id, address, name, phone, surname)
VALUES(1, 'St.George str.', 'George', '+3595436544711', 'Michaels');

INSERT INTO driver(id, address, name, phone, surname)
VALUES(2, 'St.Lucas str.', 'Luke', '+35954344444711', 'Steward');

INSERT INTO driver(id, address, name, phone, surname)
VALUES(3, 'Dondukov str.', 'Ivan', '+3595432222711', 'Ivanov');

INSERT INTO car(id, color, model, year, driver_id)
VALUES(1, 'Red', 'FIAT', 2018, 1);

INSERT INTO car(id, color, model, year, driver_id)
VALUES(2, 'Green', 'Lambo', 2021, 2);

INSERT INTO car(id, color, model, year, driver_id)
VALUES(3, 'Red', 'Honda', 2020, 3);

INSERT INTO car_wash(id, date, price, car_id, driver_id)
VALUES(1, '01.01.2019', 1500, 1, 2);

INSERT INTO car_wash(id, date, price, car_id, driver_id)
VALUES(2, '01.01.2020', 1500, 2, 2);

INSERT INTO car_wash(id, date, price, car_id, driver_id)
VALUES(3, '01.01.2021', 1500, 3, 1);
