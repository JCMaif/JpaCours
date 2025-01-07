INSERT INTO customer(firstname, lastname, age, email) VALUES ('guy', 'tub', 40, 'guy@thub.com');
INSERT INTO customer(firstname, lastname, age, email) VALUES ('lorraine', 'ipsum', 20, 'lorraine@email.com');

INSERT INTO post(message, customer_id) VALUES ('C''est très bien', 1);
INSERT INTO post(message, customer_id) VALUES ('mouais pas mal', 1);
INSERT INTO post(message, customer_id) VALUES ('C''est au pied du mur qu''on voit mieux le mur', 2);

INSERT INTO role(role) VALUES ('USER');
INSERT INTO role(role) VALUES ('ADMIN');
INSERT INTO role(role) VALUES ('BOSS');

INSERT INTO customer_role(CUSTOMER_ID, ROLE_ID) VALUES (1,1);
INSERT INTO customer_role(CUSTOMER_ID, ROLE_ID) VALUES (1,2);
INSERT INTO customer_role(CUSTOMER_ID, ROLE_ID) VALUES (1,3);
INSERT INTO customer_role(CUSTOMER_ID, ROLE_ID) VALUES (2,1);