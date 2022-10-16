CREATE TABLE libreria(
    id INT AUTO_INCREMENT PRIMARY KEY,
    titulo VARCHAR(50) NOT NULL,
    autor VARCHAR(50) NOT NULL,
    precio INT NOT NULL
);

INSERT INTO libreria (titulo, autor, precio)
    VALUES ("Farenheit 451", "Ray Bradbury", 250),
           ("Cronicas Marcianas", "Ray Bradbury", 300),
           ("Un mundo feliz", "Aldous Huxley", 225),
           ("El principito", "Antoine De Saint-Exupery", 500),
           ("Yo, Roboy", "Isaac Asimov", 400),
           ("El viaje del elefante", "José Saramago", 150),
           ("1984", "George Orwell", 250),
           ("Rebelión en la granja", "George Orwell", 50),
           ("Poemas de amor", "Mario Benedetti", 250),
           ("Cien años de soledad", "Gabriel Garcia Marquez", 300),
           ("Rayuela", "Julio Cortazar", 550),
           ("Juego de Tronos", "George R.R Martin", 750),
           ("Danza de dragones", "George R.R Martin", 750),
           ("Festin de Cuervos", "George R.R Martin", 750);