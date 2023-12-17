create database food;
use food;

create table food (
                       id SERIAL PRIMARY KEY,
                       title TEXT NOT NULL,
                       price INTEGER NOT NULL,
                       image TEXT

);