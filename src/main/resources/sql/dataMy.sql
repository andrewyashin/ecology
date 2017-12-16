INSERT INTO ecology.places(name, longitude, latitude) values
    ('CE Chernihivvodokanal', 31.2928155, 51.5015334),
    ('КЕП <Чернігівська ТЕЦ> ТОВ фірми <ТехНова>', 30.8832518, 51.4141177),
    ('PJSC Chernihiv Khimvolokno', 31.2468102, 51.4714599),
    ('PJSC CheZaRa', 31.3427282 ,51.514892),
    ('PJSC KSK Cheksil ', 31.2550733, 51.471092),
    ('Polygon of solid household waste of Chernihiv City Council', 31.2264919, 51.5198387),
    ('CE Bahmach - Vodservis', 32.8142732, 51.1787675),
    ('Burinskiy Dairy Plant Ltd.', 33.826617, 51.195471),
    ('CE The owner of the town of Varva', 32.7236116, 50.4959108),
    ('Гнідинцівський газопереробний завод ПАТ <Укрнафта>', 32.7297157, 50.4820933),
    ('Horodnianskoe VUZHKH', 31.5975294, 51.8831468),
    ('Kozeletsvodokanal', 31.1059613, 50.9107704),
    ('Kulikovsky VUZHKH', 31.6300489, 51.3739788),
    ('PJSC Novgorod - Seversky Cheese Plant', 33.2577342, 51.9918671),
    ('PJSC Slovyansky wallpapers - KFTTP', 32.2494967, 51.7682713),
    ('Branch Mena cheese PPKF Prometheus', 32.21304, 51.519973),
    ('Мринське виробниче управління підземного зберігання газу ПАТ <Укртрансгаз>', 31.5175811, 51.0520933),
    ('PJSC Nosivsky Sugar Plant', 32.9375805, 51.566306),
    ('VAT Priluki', 32.375584, 50.574924),
    ('CE Prilukiteplovodopaspecheniya', 32.3849017, 50.5890859),
    ('PJSC Lynovitsky Sugar Factory Krasny', 32.3978061, 50.47),
    ('PJSC Communalnik', 31.947806, 51.816667),
    ('Чернігівське лінійне виробниче управління магістральних газопроводів ПАТ <Укртрансгаз>', 31.4043137, 50.435882);

insert into ecology.pollutants(name, VMV, GDV, class, tax) values
    ('Діоксид сірки', 6500, 500, 4, 111.26),
    ('Тверді речовини', 500, 50, 2, 74.17),
    ('Сполуки азоту', 100, 5, 3, 1968.65),
    ('Оксид вуглецю', 5000, 500, 4, 74.17),
    ('Неметанові леткі органічні сполуки', 1000, 20, 2, 3224.65),
    ('Метан', 500, 20, 2, 111.26);

insert into ecology.emissions(pollutants_id, emissionVolume, places_id) values
    (1, 1100684.9315, 2),
    (2, 475684.93151, 2),
    (3, 301826.48402, 2),
    (4, 17922.37443, 2),

    (5, 100000, 10),
    (3, 56278.53881, 10),
    (4, 27511.4155, 10),
    (6, 25456.621, 10),

    (5, 50.342466, 23),
    (3, 244.40639, 23),
    (4, 317.57991 , 23),
    (6, 11187.215, 23),

    (5, 77.62557, 17),
    (3, 2283.10502, 17),
    (4, 6392.69406, 17),
    (6, 96689.49772, 17);