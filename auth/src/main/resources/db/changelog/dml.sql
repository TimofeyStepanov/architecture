--liquibase formatted sql

--changeset stepanov:1
insert into public."user_account"(login, password) values ('admin', '92668751');