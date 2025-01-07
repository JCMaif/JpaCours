CREATE TABLE customer
(
    id        BIGINT GENERATED BY DEFAULT AS IDENTITY NOT NULL,
    firstname VARCHAR(255),
    lastname  VARCHAR(255),
    age       INT,
    CONSTRAINT pk_customer PRIMARY KEY (id)
);