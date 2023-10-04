insert into persons (person_id, lastname, firstname, patronymic, info, birthdate, place_of_birth, zodiac_sign, sex, height, age, photo, website, email, phone, carrer, surwives)
values (1, '������������', '�������', '����� ', '������������ ����������, ���������������, ��������, ��������, ��������������� � ������������ ������� ������������ �������������', '1947-07-30 00:00:00'::timestamp, '�������', '-', 'M', '100', '67', 'photo.jpg', '-', '-', '-', '�����, ����������, ����������', '����� ������� (1986�2021)');
insert into persons (person_id, lastname, firstname, patronymic, info, birthdate, place_of_birth, zodiac_sign, sex, height, age, photo, website, email, phone, carrer, surwives)
values (2, '������', '����', '�����', '�������� � �������� �������� ������ Scooter', '1964-03-16 00:00:00'::timestamp, '��� (������ ��������)', '-', 'M', '80', '59', 'photo.jpg', '-', '-', '-', '�����', '����');
insert into persons (person_id, lastname, firstname, patronymic, info, birthdate, place_of_birth, zodiac_sign, sex, height, age, photo, website, email, phone, carrer, surwives)
values (3, '�����', '������', '����������', '��������� � ���������� ����� � ����������, ���������� ����� ����� ���-���, Carbonrock � Double Jazzy', '1965-05-14 00:00:00'::timestamp, '������, ����', '�����', '�', '80', '58', 'photo.jpg', '-', '-', '-', '�����, ����������', '��������� �������');
insert into persons (person_id, lastname, firstname, patronymic, info, birthdate, place_of_birth, zodiac_sign, sex, height, age, photo, website, email, phone, carrer, surwives)
values (4, '�����', '�������', '-', '��������� ������������ �����������, ����� ���� � ������ ���������������� Java, C, C#, C++', '1965-05-14 00:00:00'::timestamp, '������, ���� ��������', '-', '�', '80', '72', 'photo.jpg', 'http://www.herbschildt.com', '-', '-', '�����������', '-');

insert into projects (project_id, person_id, title, original_title, date_begin, date_end, info, country, website, email, phone, photo, logo) values (1, 1, '����������', 'The terminator', '1984', '2019', '����� �������, ���������� ��������������� ��� �������, �� ������������ �������������� � �������������� ��������', '���', '-', '-', '-', 'photo.jpg', 'logo.jpg');
insert into projects (project_id, person_id, title, original_title, date_begin, date_end, info, country, website, email, phone, photo, logo) values (2, 1, '�����������', 'The Expendables', '2010', '2023', ' �������������, ���������� �� ���������� ����� ������������ ��������, ��������� ��������� Millennium Media', '���', '-', '-', '-', 'photo.jpg', 'logo.jpg');
insert into projects (project_id, person_id, title, original_title, date_begin, date_end, info, country, website, email, phone, photo, logo) values (3, 2, 'Scooter', 'Scooter', '1993', '��������� �����', '�������� ����������� ���������, ������������ � 1993 ����, � ����������� ����������� ������������ ������. ������ ��������� �� ������ ������� ����, � ��� ����� ��������� ������������ ������� (�� ���������� ������������) � ��������� ����� � ����������', '��������', 'https://scootertechno.com', '-', 'management@scootertechno.com', 'photo.jpg', 'logo.jpg');
insert into projects (project_id, person_id, title, original_title, date_begin, date_end, info, country, website, email, phone, photo, logo) values (4, 3, '���-���', '���-���', '1989', '��������� �����', '��������� � ���������� ������. ������� ������ �������� ������ �����', '����, ������', 'https://www.carmanmusic.ru', 'ashovikov@mail.ru', '+7 (903) 582-84-94', 'photo.jpg', '/img/logos/logocm.jpg');
insert into projects (project_id, person_id, title, original_title, date_begin, date_end, info, country, website, email, phone, photo, logo) values (5, 3, '�������', '�������', '1997', '1997', '���������������� ������ ����������� ����� � �����������, ��������� ������ ����-���� ������ ������', '������', '-', 'ashovikov@mail.ru', '+7 (903) 582-84-94', 'photo.jpg', 'logo.jpg');
insert into projects (project_id, person_id, title, original_title, date_begin, date_end, info, country, website, email, phone, photo, logo) values (6, 4, 'Java. ������ �����������', 'Java: The Complete Reference', '1995', '��������� �����', '� ���� ����� ����, �������������� � Java Platform Standard', '-', '-', '-', '-', 'photo.jpg', 'logo.jpg');

insert into works (dtype, work_id, project_id, title, original_title, date_begin, date_end, release_date, recording_date, duration, info, website, photo, logo, country, type_of_release, format_release, style_genre, type_of_work, tagline, director, scenario, producer, operator, composer, costume_designer, video_editing, budget, fees, world_premiere, dvd_release, bluray_release, age_to_view)
values ('cinema_works', 1, 1, '����������', 'The terminator', '26.10.1984', '-', '26.10.1984', '1983-1984', '108', '������� �������������� ������� ����� ���� � �������-�����������, ��������� � 1984 ��� �� ����-����������������� ��������, ��� ����� ������ ������-������, � ������������ ��������� �� ����� ���������', '-', 'photo.jpg', 'logo.jpg', '���, ��������������', '�����', 'DVD, BluRay', '����������, ������, �������', '�����', '��� ������� � ��� �����', '������ �������', '������ �������, ���� ��� ո��, ������ ����� ��.', '���� �����, ����� ������, ���� ��� ո��', '���� ��������', '���� ������', '����� ������ ����, ������ ��������, ������ ����', '���� ���������', '$6 400 000', '$38 371 200', '26.10.1984', '01.03.2005', '04.10.2012', '16+');
insert into works (dtype, work_id, project_id, title, original_title, date_begin, date_end, release_date, recording_date, duration, info, website, photo, logo, country, type_of_release, format_release, style_genre, type_of_work, tagline, director, scenario, producer, operator, composer, costume_designer, video_editing, budget, fees, world_premiere, dvd_release, bluray_release, age_to_view) values ('cinema_works', 2, 1, '���������� 2: ������ ����', 'Terminator 2: Judgment Day', '01.07.1991', '-', '01.07.1991', '1990-1991', '137', '������ ����� ������ ��� � ��� ���, ��� ������ �� 2029 ���� ������� ���������� ���� ������ � �������, ��� ������� ��� �������� ����� ������������ ������ �����', '-', 'photo.jpg', 'logo.jpg', '���', '�����', 'DVD, BluRay', '����������, ������, �������', '�����', 'Same Make. Same Model. New Mission', '������ �������', '������ �������, ���� ��� ո��, ������ ����� ��.', '���� �����, ����� ������, ���� ��� ո��', '���� ��������', '���� ������', '������ �. ����, ������ ������, ���� �. ������', '������ ���� IV, ���� ����, ���� ���������', '$102 000 000', '$516 950 043', '01.07.1991', '01.09.2009', '-', '18+');
insert into works (dtype, work_id, project_id, title, original_title, date_begin, date_end, release_date, recording_date, duration, info, website, photo, logo, country, type_of_release, format_release, style_genre, type_of_work, tagline, director, scenario, producer, operator, composer, costume_designer, video_editing, budget, fees, world_premiere, dvd_release, bluray_release, age_to_view) values ('cinema_works', 3, 1, '���������� 3: ��������� �����', 'Terminator 3: Rise of the Machines', '30.10.2003', '-', '26.10.1984', '1983-1984', '108', '������ ������ ��� � ��� ���, ��� ���� ������ ����� ������������� ������ ���� � ������ ������������ �� ��������� �����������. ������ ��� 25, ������ �� ����� ���� ��� - � ���� ��� ����, ��� ��������� ����, ��� �������� �������� � ������� ������', '-', 'photo.jpg', 'logo.jpg', '���, ��������������', '�����', 'DVD, BluRay', '����������, ������, �������', '�����', '��� ������� � ��� �����', '������ �������', '������ �������, ���� ��� ո��, ������ ����� ��.', '���� �����, ����� ������, ���� ��� ո��', '���� ��������', '���� ������', '������ �. ����, ������ ������, ���� �. ������', '������ ���� IV, ���� ����, ���� ���������', '$6 400 000', '$38 371 200', '26.10.1984', '01.03.2005', '04.10.2012', '16+');
insert into works (dtype, work_id, project_id, title, original_title, date_begin, date_end, release_date, recording_date, duration, info, website, photo, logo, country, type_of_release, format_release, style_genre, type_of_work, tagline, director, scenario, producer, operator, composer, costume_designer, video_editing, budget, fees, world_premiere, dvd_release, bluray_release, age_to_view) values ('cinema_works', 4, 1, '����������: �� ����� ���������', 'Terminator Salvation', '14.05.2009', '-', '26.10.1984', '1983-1984', '108', '2018 ���. � ���� ��������� ����� � ��������. ���� ������ � �������, ��� ������ � ���������� ������������� ������������ ����� ������� � ����� ������������', '-', 'photo.jpg', 'logo.jpg', '���, ��������������', '�����', 'DVD, BluRay', '����������, ������, �������', '�����', '��� ������� � ��� �����', '������ �������', '������ �������, ���� ��� ո��, ������ ����� ��.', '���� �����, ����� ������, ���� ��� ո��', '���� ��������', '���� ������', '����� ������ ����, ������ ��������, ������ ����', '���� ���������', '$6 400 000', '$38 371 200', '26.10.1984', '01.03.2005', '04.10.2012', '16+');
insert into works (dtype, work_id, project_id, title, original_title, date_begin, date_end, release_date, recording_date, duration, info, website, photo, logo, country, type_of_release, format_release, style_genre, type_of_work, tagline, director, scenario, producer, operator, composer, costume_designer, video_editing, budget, fees, world_premiere, dvd_release, bluray_release, age_to_view) values ('cinema_works', 5, 1, '����������: �������', 'Terminator Genisys', '21.06.2015', '-', '26.10.1984', '1983-1984', '108', '����� ���� ������, ����� �������������, �������� �������� ����� ���� ����� � 1984 ���, ����� �������� ���� ������ � ������ �������, ����������� ������� ������� ������� ������ �� �������', '-', 'photo.jpg', 'logo.jpg', '���, ��������������', '�����', 'DVD, BluRay', '����������, ������, �������', '�����', '��� ������� � ��� �����', '������ �������', '������ �������, ���� ��� ո��, ������ ����� ��.', '���� �����, ����� ������, ���� ��� ո��', '���� ��������', '���� ������', '����� ������ ����, ������ ��������, ������ ����', '���� ���������', '$6 400 000', '$38 371 200', '26.10.1984', '01.03.2005', '04.10.2012', '16+');
insert into works (dtype, work_id, project_id, title, original_title, date_begin, date_end, release_date, recording_date, duration, info, website, photo, logo, country, type_of_release, format_release, style_genre, type_of_work, tagline, director, scenario, producer, operator, composer, costume_designer, video_editing, budget, fees, world_premiere, dvd_release, bluray_release, age_to_view) values ('cinema_works', 6, 1, '����������: Ҹ���� ������', 'Terminator: Dark Fate', '23.10.2019', '-', '26.10.1984', '1983-1984', '108', '�������. ����� ������� ������� �����, � ��� ������ ������ ����, ������ � ������ �������� � ���� �������� �� �����, �� ��� ����������, ��� �� ������ ������� �����������', '-', 'photo.jpg', 'logo.jpg', '���, ��������������', '�����', 'DVD, BluRay', '����������, ������, �������', '�����', '��� ������� � ��� �����', '������ �������', '������ �������, ���� ��� ո��, ������ ����� ��.', '���� �����, ����� ������, ���� ��� ո��', '���� ��������', '���� ������', '����� ������ ����, ������ ��������, ������ ����', '���� ���������', '$6 400 000', '$38 371 200', '26.10.1984', '01.03.2005', '04.10.2012', '16+');
insert into works (dtype, work_id, project_id, title, original_title, date_begin, date_end, release_date, recording_date, duration, info, website, photo, logo, country, type_of_release, format_release, style_genre, type_of_work, tagline, director, scenario, producer, operator, composer, costume_designer, video_editing, budget, fees, world_premiere, dvd_release, bluray_release, age_to_view) values ('cinema_works', 7, 2, '�����������', 'The Expendables', '23.10.2019', '-', '26.10.1984', '1983-1984', '108', '�������. ����� ������� ������� �����, � ��� ������ ������ ����, ������ � ������ �������� � ���� �������� �� �����, �� ��� ����������, ��� �� ������ ������� �����������', '-', 'photo.jpg', 'logo.jpg', '���, ��������������', '�����', 'DVD, BluRay', '����������, ������, �������', '�����', '��� ������� � ��� �����', '������ �������', '������ �������, ���� ��� ո��, ������ ����� ��.', '���� �����, ����� ������, ���� ��� ո��', '���� ��������', '���� ������', '����� ������ ����, ������ ��������, ������ ����', '���� ���������', '$6 400 000', '$38 371 200', '26.10.1984', '01.03.2005', '04.10.2012', '16+');
insert into works (dtype, work_id, project_id, title, original_title, date_begin, date_end, release_date, recording_date, duration, info, website, photo, logo, country, type_of_release, format_release, style_genre, type_of_work, lyricist, vocals, backing_vocals, guitar, design, models, dancers, recording_in_studios, barcode, matrix, sid, mastering, mixing,  version, style)
values ('music_works', 8, 3, 'Mind the gap', 'Mind the gap', '2014', '2014', '08.11.2014', '2013-2014', '50', '������� ��������� ������ ������', 'https://scootertechno.com', '/img/covers/mtg.jpg', 'logo.jpg', '��������', 'CD', 'Album', 'techno', '������', 'H.P. Baxxter', 'H.P. Baxxter', '-', '-', '-', '-', '-', 'Sheffield Tunes', '-', '-', '-', '-', '-', 'Regular', 'Dance');
insert into works (dtype, work_id, project_id, title, original_title, date_begin, date_end, release_date, recording_date, duration, info, website, photo, logo, country, type_of_release, format_release, style_genre, type_of_work, lyricist, vocals, backing_vocals, guitar, design, models, dancers, recording_in_studios, barcode, matrix, sid, mastering, mixing, version, style)
values ('music_works', 9, 4, '���� ����������� ������', '���� ����������� ������', '1996', '1996', '1996', '1995-1996', '45', '��������� ��������� ������ ������', 'https://www.carmanmusic.ru', '/img/covers/tssh.jpg', '/img/logos/logocm.jpg', '������', '������', '������', 'Electronic, Pop', '������', '������ �����', '������ �����', '�-��', '�. ��������, �. ���������', '�. ������������', '�. �������, �. ������, �. �������', '�. �������, �. ������, �. �������', 'Pi-Ton Labs, Poly Max', '4600413000855', 'UL 96541', 'IFPI 1I03', '�. �������', '�. �������, �. �����', '-', 'Hi NRG, Euro House');
insert into works (dtype, work_id, project_id, title, original_title, date_begin, date_end, release_date, recording_date, duration, info, website, photo, logo, country, type_of_release, format_release, style_genre, type_of_work, lyricist, vocals, backing_vocals, guitar, design, models, dancers, recording_in_studios, barcode, matrix, sid, mastering, mixing, version, style)
values ('music_works', 10, 4, '������ �����', '������ �����', '1991', '1991', '1991', '1989-1991', '44', '������ ��������� ������ ������', 'https://www.carmanmusic.ru', '/img/covers/vs.jpg', '/img/logos/logocm.jpg', '������', '������', '������', 'Electronic, Pop', '������', '������ �����', '������ �����', '�-��', '�. ��������, �. ���������', '�. ������������', '�. �������, �. ������, �. �������', '�. �������, �. ������, �. �������', 'Pi-Ton Labs, Poly Max', '4600413000855', 'UL 96541', 'IFPI 1I03', '�. �������', '�. �������, �. �����', '-', 'Hi NRG, Euro House');
insert into works (dtype, work_id, project_id, title, original_title, date_begin, date_end, release_date, recording_date, duration, info, website, photo, logo, country, type_of_release, format_release, style_genre, type_of_work, lyricist, vocals, backing_vocals, guitar, design, models, dancers, recording_in_studios, barcode, matrix, sid, mastering, mixing, version, style)
values ('music_works', 11, 4, '��������', '��������', '1992', '1992', '1992', '1991-1992', '46', '������ ��������� ������ ������', 'https://www.carmanmusic.ru', '/img/covers/cm.jpg', '/img/logos/logocm.jpg', '������', '������', '������', 'Electronic, Pop', '������', '������ �����', '������ �����', '�-��', '�. ��������, �. ���������', '�. ������������', '�. �������, �. ������, �. �������', '�. �������, �. ������, �. �������', 'Pi-Ton Labs, Poly Max', '4600413000855', 'UL 96541', 'IFPI 1I03', '�. �������', '�. �������, �. �����', '-', 'Hi NRG, Euro House');
insert into works (dtype, work_id, project_id, title, original_title, date_begin, date_end, release_date, recording_date, duration, info, website, photo, logo, country, type_of_release, format_release, style_genre, type_of_work, lyricist, vocals, backing_vocals, guitar, design, models, dancers, recording_in_studios, barcode, matrix, sid, mastering, mixing, version, style)
values ('music_works', 12, 4, '������� ������������� �������� ��������', '������� ������������� �������� ��������', '1994', '1994', '1994', '1992-1994', '50', '������ ��������� ������ ������', 'https://www.carmanmusic.ru', '/img/covers/rmza.jpg', '/img/logos/logocm.jpg', '������', '������', '������', 'Electronic, Pop', '������', '������ �����', '������ �����', '�-��', '�. ��������, �. ���������', '�. ������������', '�. �������, �. ������, �. �������', '�. �������, �. ������, �. �������', 'Pi-Ton Labs, Poly Max', '4600413000855', 'UL 96541', 'IFPI 1I03', '�. �������', '�. �������, �. �����', '-', 'Hi NRG, Euro House');
insert into works (dtype, work_id, project_id, title, original_title, date_begin, date_end, release_date, recording_date, duration, info, website, photo, logo, country, type_of_release, format_release, style_genre, type_of_work, lyricist, vocals, backing_vocals, guitar, design, models, dancers, recording_in_studios, barcode, matrix, sid, mastering, mixing, version, style)
values ('music_works', 13, 4, '������ �����', '������ �����', '1998', '1998', '1998', '1997-1998', '41', '����� ��������� ������ ������', 'https://www.carmanmusic.ru', '/img/covers/kd.jpg', '/img/logos/logocm.jpg', '������', '������', '������', 'Electronic, Pop', '������', '������ �����', '������ �����', '�-��', '�. ��������, �. ���������', '�. ������������', '�. �������, �. ������, �. �������', '�. �������, �. ������, �. �������', 'Pi-Ton Labs, Poly Max', '4600413000855', 'UL 96541', 'IFPI 1I03', '�. �������', '�. �������, �. �����', '-', 'Hi NRG, Euro House');
insert into works (dtype, work_id, project_id, title, original_title, date_begin, date_end, release_date, recording_date, duration, info, website, photo, logo, country, type_of_release, format_release, style_genre, type_of_work, lyricist, vocals, backing_vocals, guitar, design, models, dancers, recording_in_studios, barcode, matrix, sid, mastering, mixing, version, style)
values ('music_works', 14, 4, '����� � �������', '����� � �������', '1999', '1999', '1999', '1998-1999', '44', '������ ������ �������� ������', 'https://www.carmanmusic.ru', '/img/covers/nvb.jpg', '/img/logos/logocm.jpg', '������', '������', '������', 'Electronic, Pop', '������', '������ �����', '������ �����', '�-��', '�. ��������, �. ���������', '�. ������������', '�. �������, �. ������, �. �������', '�. �������, �. ������, �. �������', 'Pi-Ton Labs, Poly Max', '4600413000855', 'UL 96541', 'IFPI 1I03', '�. �������', '�. �������, �. �����', '-', 'Hi NRG, Euro House');
insert into works (dtype, work_id, project_id, title, original_title, date_begin, date_end, release_date, recording_date, duration, info, website, photo, logo, country, type_of_release, format_release, style_genre, type_of_work, lyricist, vocals, backing_vocals, guitar, design, models, dancers, recording_in_studios, barcode, matrix, sid, mastering, mixing, version, style)
values ('music_works', 15, 4, '�����', '�����', '2008', '2008', '2008', '2000-2008', '45', '������ ��������� ������ ������', 'https://www.carmanmusic.ru', '/img/covers/n.jpg', '/img/logos/logocm.jpg', '������', '������', '������', 'Electronic, Pop', '������', '������ �����', '������ �����', '�-��', '�. ��������, �. ���������', '�. ������������', '�. �������, �. ������, �. �������', '�. �������, �. ������, �. �������', 'Pi-Ton Labs, Poly Max', '4600413000855', 'UL 96541', 'IFPI 1I03', '�. �������', '�. �������, �. �����', '-', 'Hi NRG, Euro House');
insert into works (dtype, work_id, project_id, title, original_title, date_begin, date_end, release_date, recording_date, duration, info, website, photo, logo, country, type_of_release, format_release, style_genre, type_of_work, lyricist, vocals, backing_vocals, guitar, design, models, dancers, recording_in_studios, barcode, matrix, sid, mastering, mixing, version, style)
values ('music_works', 16, 5, '�������', '�������', '1997', '1997', '1997', '1996-1997', '45', '������ ��������� ������ �������', 'https://www.carmanmusic.ru', '/img/covers/p.jpg', 'logo.jpg', '������', '������', '������', 'Electronic, Pop', '������', '������ �����', '������ �����', '�-��', '�. ��������, �. ���������', '�. ������������', '�. �������, �. ������, �. �������', '�. �������, �. ������, �. �������', 'Pi-Ton Labs, Poly Max', '4600413000855', 'UL 96541', 'IFPI 1I03', '�. �������', '�. �������, �. �����', '-', 'Hi NRG, Euro House');
insert into works (dtype, work_id, project_id, title, original_title, date_begin, date_end, release_date, recording_date, duration, info, website, photo, logo, isbn, author, publishing_house, publication_language, publication_format, circulation, book_type, number_of_pages, cover_type)
values ('book_works', 17, 6, 'Java. ������ �����������. 10-� �������', 'Java: The Complete Reference. 10 Edition', '2020', '2020', '2020', '2020', '-', '-', '-', 'photo.jpg', 'logo.jpg', '645654365436', '������� �����', 'Apress', '�������', '�����', '-', '-', '1200', '������� ��������');
insert into works (dtype, work_id, project_id, title, original_title, date_begin, date_end, release_date, recording_date, duration, info, website, photo, logo, isbn, author, publishing_house, publication_language, publication_format, circulation, book_type, number_of_pages, cover_type)
values ('book_works', 18, 6, 'Java. ������ �����������. 12-� �������', 'Java: The Complete Reference. 12 Edition', '2023', '2023', '2023', '2023', '-', '-', '-', 'photo.jpg', 'logo.jpg', '645654365436', '������� �����', 'Apress', '�������', '�����', '-', '-', '1200', '������� ��������');
insert into works (dtype, work_id, project_id, title, original_title, date_begin, date_end, release_date, recording_date, duration, info, website, photo, logo, country, type_of_release, format_release, style_genre, type_of_work, lyricist, vocals, backing_vocals, guitar, design, models, dancers, recording_in_studios, barcode, matrix, sid, mastering, mixing, version, style)
values ('music_works', 19, 1, 'Terminator OST', 'Terminator OST', '2008', '2008', '2008', '2000-2008', '45', 'Terminator OST', 'https://www.carmanmusic.ru', 'photo.jpg', 'logo.jpg', '������', '������', '������', 'Electronic, Pop', '������', 'Terminator OST', '������ �����', 'Terminator OST', '�. ��������, �. ���������', '�. ������������', '�. �������, �. ������, �. �������', '�. �������, �. ������, �. �������', 'Pi-Ton Labs, Poly Max', '4600413000855', 'UL 96541', 'IFPI 1I03', '�. �������', '�. �������, �. �����', '-', 'Hi NRG, Euro House');

insert into media_info (dtype, media_id, work_id, title, release_date, recording_date, duration, version, seasons) values ('cinema_info', 1, 1, '����������', '1984', '1984', '80', '����������', '0');
insert into media_info (dtype, media_id, work_id, title, release_date, recording_date, duration, version, seasons) values ('cinema_info', 65, 1, '���������� Making of', '1984', '1984', '80', 'Making of', '0');
insert into media_info (dtype, media_id, work_id, title, release_date, recording_date, duration, version, seasons) values ('cinema_info', 66, 1, '���������� Directors cut', '1984', '1984', '80', 'Directors cut', '0');
insert into media_info (dtype, media_id, work_id, title, release_date, recording_date, duration, version, style, song_number) values ('music_info', 2, 8, 'Shake that!', '2004', '2004', '3:19', '-', '-', '03');
insert into media_info (dtype, media_id, work_id, title, release_date, recording_date, duration, version, style, song_number) values ('music_info', 3, 8, 'Killer Bees', '2004', '2004', '1:30', '-', '-', '01');
insert into media_info (dtype, media_id, work_id, title, release_date, recording_date, duration, version, style, song_number) values ('music_info', 4, 8, 'One (Always hardcore)', '2004', '2004', '3:44', '-', '-', '02');
insert into media_info (dtype, media_id, work_id, title, release_date, recording_date, duration, version, style, song_number) values ('music_info', 5, 8, 'Jigga Jigga!', '2004', '2004', '3:55', '-', '-', '06');
insert into media_info (dtype, media_id, work_id, title, release_date, recording_date, duration, version, style, song_number) values ('music_info', 6, 8, 'Stripped', '2004', '2004', '3:29', '-', '-', '09');
insert into media_info (dtype, media_id, work_id, title, release_date, recording_date, duration, version, style, song_number) values ('music_info', 7, 8, 'Trance-Atlantic', '2004', '2004', '7:53', '-', '-', '08');
insert into media_info (dtype, media_id, work_id, title, release_date, recording_date, duration, version, style, song_number) values ('music_info', 8, 8, 'Trip to nowhere', '2004', '2004', '5:02', '-', '-', '13');
insert into media_info (dtype, media_id, work_id, title, release_date, recording_date, duration, version, style, song_number) values ('music_info', 9, 8, 'Panties wanted', '2004', '2004', '4:33', '-', '-', '07');
insert into media_info (dtype, media_id, work_id, title, release_date, recording_date, duration, version, style, song_number) values ('music_info', 10, 8, 'All I wanna do', '2004', '2004', '4:21', '-', '-', '05');
insert into media_info (dtype, media_id, work_id, title, release_date, recording_date, duration, version, style, song_number) values ('music_info', 11, 8, 'My eyes are dry', '2004', '2004', '2:54', '-', '-', '04');
insert into media_info (dtype, media_id, work_id, title, release_date, recording_date, duration, version, style, song_number) values ('music_info', 12, 8, 'Suavemente', '2004', '2004', '3:38', '-', '-', '10');
insert into media_info (dtype, media_id, work_id, title, release_date, recording_date, duration, version, style, song_number) values ('music_info', 13, 8, 'The chaser', '2004', '2004', '4:10', '-', '-', '11');
insert into media_info (dtype, media_id, work_id, title, release_date, recording_date, duration, version, style, song_number) values ('music_info', 14, 8, 'The avengers back', '2004', '2004', '2:59', '-', '-', '12');
insert into media_info (dtype, media_id, work_id, title, release_date, recording_date, duration, version, style, song_number) values ('music_info', 15, 9, '����� �������', '1996', '1996', '5:07', '-', '-', '02');
insert into media_info (dtype, media_id, work_id, title, release_date, recording_date, duration, version, style, song_number) values ('music_info', 16, 9, '���-����', '1996', '1996', '3:17', '-', '-', '01');
insert into media_info (dtype, media_id, work_id, title, release_date, recording_date, duration, version, style, song_number) values ('music_info', 17, 9, '������ ���� � �����', '1996', '1996', '4:08', '-', '-', '07');
insert into media_info (dtype, media_id, work_id, title, release_date, recording_date, duration, version, style, song_number) values ('music_info', 18, 9, '�����, ������', '1996', '1996', '3:43', '-', '-', '05');
insert into media_info (dtype, media_id, work_id, title, release_date, recording_date, duration, version, style, song_number) values ('music_info', 19, 9, '����� �����', '1996', '1996', '5:19', '-', '-', '04');
insert into media_info (dtype, media_id, work_id, title, release_date, recording_date, duration, version, style, song_number) values ('music_info', 20, 9, '�����������', '1996', '1996', '4:40', '-', '-', '03');
insert into media_info (dtype, media_id, work_id, title, release_date, recording_date, duration, version, style, song_number) values ('music_info', 21, 9, '����, �����!', '1996', '1996', '4:16', '-', 'swingbeat', '06');
insert into media_info (dtype, media_id, work_id, title, release_date, recording_date, duration, version, style, song_number) values ('music_info', 22, 9, '����������� ������', '1996', '1996', '4:41', '-', '-', '08');
insert into media_info (dtype, media_id, work_id, title, release_date, recording_date, duration, version, style, song_number) values ('music_info', 23, 9, '�����������', '1996', '1996', '4:32', '-', '-', '09');
insert into media_info (dtype, media_id, work_id, title, release_date, recording_date, duration, version, style, song_number) values ('music_info', 24, 9, '���� ����', '1996', '1996', '5:46', '���� ����', '-', '10');
insert into media_info (dtype, media_id, work_id, title, release_date, recording_date, duration, version, style, song_number) values ('music_info', 25, 11, 'Bad russians', '1992', '1992', '4:28', '-', '-', '01');
insert into media_info (dtype, media_id, work_id, title, release_date, recording_date, duration, version, style, song_number) values ('music_info', 26, 11, '� ������� �� ��������', '1992', '1992', '4:04', '-', '-', '02');
insert into media_info (dtype, media_id, work_id, title, release_date, recording_date, duration, version, style, song_number) values ('music_info', 27, 11, '������ ����', '1992', '1992', '4:06', '-', '-', '03');
insert into media_info (dtype, media_id, work_id, title, release_date, recording_date, duration, version, style, song_number) values ('music_info', 28, 11, 'Caribbean girl', '1992', '1992', '4:31', '-', '-', '04');
insert into media_info (dtype, media_id, work_id, title, release_date, recording_date, duration, version, style, song_number) values ('music_info', 29, 11, '���-���������', '1992', '1992', '4:46', '-', '-', '05');
insert into media_info (dtype, media_id, work_id, title, release_date, recording_date, duration, version, style, song_number) values ('music_info', 30, 11, '������������ ��������', '1992', '1992', '5:09', '-', '-', '06');
insert into media_info (dtype, media_id, work_id, title, release_date, recording_date, duration, version, style, song_number) values ('music_info', 31, 11, '����� ���', '1992', '1992', '4:23', '-', '-', '07');
insert into media_info (dtype, media_id, work_id, title, release_date, recording_date, duration, version, style, song_number) values ('music_info', 32, 11, '���� �������� � �����-�����', '1992', '1992', '4:48', '-', '-', '08');
insert into media_info (dtype, media_id, work_id, title, release_date, recording_date, duration, version, style, song_number) values ('music_info', 33, 11, '������ �� ������', '1992', '1992', '4:00', '-', '-', '09');
insert into media_info (dtype, media_id, work_id, title, release_date, recording_date, duration, version, style, song_number) values ('music_info', 34, 15, '���������', '2008', '2008', '3:34', '-', '-', '01');
insert into media_info (dtype, media_id, work_id, title, release_date, recording_date, duration, version, style, song_number) values ('music_info', 35, 15, '�����', '2008', '2008', '3:30', '-', '-', '02');
insert into media_info (dtype, media_id, work_id, title, release_date, recording_date, duration, version, style, song_number) values ('music_info', 36, 15, '���������', '2008', '2008', '4:04', '-', '-', '03');
insert into media_info (dtype, media_id, work_id, title, release_date, recording_date, duration, version, style, song_number) values ('music_info', 37, 15, '�����-����', '2008', '2008', '3:51', '-', '-', '04');
insert into media_info (dtype, media_id, work_id, title, release_date, recording_date, duration, version, style, song_number) values ('music_info', 38, 15, '������', '2008', '2008', '5:07', '-', '-', '05');
insert into media_info (dtype, media_id, work_id, title, release_date, recording_date, duration, version, style, song_number) values ('music_info', 39, 15, '������� ����', '2008', '2008', '3:14', '-', '-', '06');
insert into media_info (dtype, media_id, work_id, title, release_date, recording_date, duration, version, style, song_number) values ('music_info', 40, 15, '����', '2008', '2008', '4:16', '-', '-', '07');
insert into media_info (dtype, media_id, work_id, title, release_date, recording_date, duration, version, style, song_number) values ('music_info', 41, 15, '������ �� ����', '2008', '2008', '3:26', '-', '-', '08');
insert into media_info (dtype, media_id, work_id, title, release_date, recording_date, duration, version, style, song_number) values ('music_info', 42, 15, '��������', '2008', '2008', '3:43', '-', '-', '09');
insert into media_info (dtype, media_id, work_id, title, release_date, recording_date, duration, version, style, song_number) values ('music_info', 43, 15, '����', '2008', '2008', '3:13', '-', '-', '10');
insert into media_info (dtype, media_id, work_id, title, release_date, recording_date, duration, version, style, song_number) values ('music_info', 44, 15, '��������� [UnixMix]', '2008', '2008', '3:55', '-', '-', '11');
insert into media_info (dtype, media_id, work_id, title, release_date, recording_date, duration, version, style, song_number) values ('music_info', 45, 10, '��, �����', '1991', '1991', '4:03', '-', '-', '01');
insert into media_info (dtype, media_id, work_id, title, release_date, recording_date, duration, version, style, song_number) values ('music_info', 46, 10, '����', '1991', '1991', '4:54', '-', '-', '02');
insert into media_info (dtype, media_id, work_id, title, release_date, recording_date, duration, version, style, song_number) values ('music_info', 47, 10, '��� �������� �� �������', '1991', '1991', '4:53', '-', '-', '03');
insert into media_info (dtype, media_id, work_id, title, release_date, recording_date, duration, version, style, song_number) values ('music_info', 48, 10, '������, ������', '1991', '1991', '5:24', '-', '-', '04');
insert into media_info (dtype, media_id, work_id, title, release_date, recording_date, duration, version, style, song_number) values ('music_info', 49, 10, '����� ���-�������', '1991', '1991', '5:23', '-', '-', '05');
insert into media_info (dtype, media_id, work_id, title, release_date, recording_date, duration, version, style, song_number) values ('music_info', 50, 10, '���-���-���', '1991', '1991', '4:54', '-', '-', '06');
insert into media_info (dtype, media_id, work_id, title, release_date, recording_date, duration, version, style, song_number) values ('music_info', 51, 10, '������� ��������', '1991', '1991', '3:52', '-', '-', '07');
insert into media_info (dtype, media_id, work_id, title, release_date, recording_date, duration, version, style, song_number) values ('music_info', 52, 10, '������-����', '1991', '1991', '3:45', '-', '-', '08');
insert into media_info (dtype, media_id, work_id, title, release_date, recording_date, duration, version, style, song_number) values ('music_info', 53, 10, '�����', '1991', '1991', '4:34', '-', '-', '09');
insert into media_info (dtype, media_id, work_id, title, release_date, recording_date, duration, version, style, song_number) values ('music_info', 54, 10, '���������� ���-�-����', '1991', '1991', '1:39', '-', '-', '10');
insert into media_info (dtype, media_id, work_id, title, release_date, recording_date, duration, version, style, song_number) values ('music_info', 55, 12, '�������� ��������', '1994', '1994', '3:51', '-', '-', '01');
insert into media_info (dtype, media_id, work_id, title, release_date, recording_date, duration, version, style, song_number) values ('music_info', 56, 12, '������ ���������', '1994', '1994', '4:53', '-', '-', '02');
insert into media_info (dtype, media_id, work_id, title, release_date, recording_date, duration, version, style, song_number) values ('music_info', 57, 12, 'Is it love', '1994', '1994', '4:07', '-', '-', '03');
insert into media_info (dtype, media_id, work_id, title, release_date, recording_date, duration, version, style, song_number) values ('music_info', 58, 12, '������� ����', '1994', '1994', '4:24', '-', '-', '04');
insert into media_info (dtype, media_id, work_id, title, release_date, recording_date, duration, version, style, song_number) values ('music_info', 59, 12, '������ ����� (Moonlight reggey)', '1994', '1994', '3:55', '-', '-', '05');
insert into media_info (dtype, media_id, work_id, title, release_date, recording_date, duration, version, style, song_number) values ('music_info', 60, 12, 'This is Car-Man (��� ���-���)', '1994', '1994', '3:46', '-', '-', '06');
insert into media_info (dtype, media_id, work_id, title, release_date, recording_date, duration, version, style, song_number) values ('music_info', 61, 12, '����� � �������� ����', '1994', '1994', '6:01', '-', '-', '07');
insert into media_info (dtype, media_id, work_id, title, release_date, recording_date, duration, version, style, song_number) values ('music_info', 62, 12, '����-������', '1994', '1994', '5:23', '-', '-', '08');
insert into media_info (dtype, media_id, work_id, title, release_date, recording_date, duration, version, style, song_number) values ('music_info', 63, 12, '������� ����������', '1994', '1994', '4:32', '-', '-', '09');
insert into media_info (dtype, media_id, work_id, title, release_date, recording_date, duration, version, pages) values ('book_info', 64, 18, 'Java. ������ �����������. 12-� �������', '2023', '-', '-', '��������', '1200');