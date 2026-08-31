CREATE TABLE videos(
    id INTEGER
    name TEXT,
    creatat_date date,
    published BOOLEAN
);








SELECT table_name, column_name, data_type
FROM information_schema.columns
WHERE table_name = 'videos';
