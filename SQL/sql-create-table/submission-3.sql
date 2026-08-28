CREATE TABLE videos (
    id INTEGER,
    name TEXT,
    created_at DATE,
    published BOOLEAN
);

SELECT table_name, column_name, data_type
FROM information_schema.columns
WHERE table_name = 'videos';