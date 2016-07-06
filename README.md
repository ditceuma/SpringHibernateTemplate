# SpringHibernateTemplate

- TEMPLATE JSF + HIBERNATE + SPRING 4
- TEMPLATE EM FASE DE DESENVOLVIMENTO


- CONFIGURAÇAO DE BANCO DE DADOS

Configurações de banco no arquivo (application.properties)

CREATE TABLE EMPLOYEE(
    id INT NOT NULL auto_increment, 
    name VARCHAR(50) NOT NULL,
    joining_date DATE NOT NULL,
    salary DOUBLE NOT NULL,
    ssn VARCHAR(30) NOT NULL UNIQUE,
    PRIMARY KEY (id)
);


