--liquibase formatted sql

--changeset stepanov:1
create table public."user_account" (
    id bigserial primary key,
    login text not null unique,
    password text not null
);