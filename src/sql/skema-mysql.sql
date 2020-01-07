create table mahasiswa(

    id INT PRIMARY KEY AUTO_INCREMENT,
    npm VARCHAR(255) NOT NULL,
    nama VARCHAR(255) NOT NULL,
    tempat_lahir VARCHAR(255) NOT NULL,
    tanggal_lahir DATE NOT NULL,
    jenis_kelamin VARCHAR(255) NOT NULL,
    alamat VARCHAR(255) NOT NULL
)Engine=InnoDB;