Use computer_shop;

INSERT INTO roles (id, role)
VALUES (1, 'ADMIN');
INSERT INTO roles (id, role)
VALUES (2, 'MODERATOR');
INSERT INTO roles (id, role)
VALUES (3, 'USER');

INSERT INTO users (id, email, first_name, last_name, money, password, phone_number, username)
VALUES (1, 'na44kata@gmail.com', 'Naiden', 'Naidenov',  10000, '175436173b0815a1780d0e8abaf900c612dd78641b1bff578a5fc1546e9534ef2080c8bec2cf100d', '0888293829', 'Naiden99');

INSERT INTO users_roles (`user_entity_id`, `roles_id`)
VALUES (1, 1);
INSERT INTO users_roles (`user_entity_id`, `roles_id`)
VALUES (1, 2);
INSERT INTO users_roles (`user_entity_id`, `roles_id`)
VALUES (1, 3);

INSERT INTO pictures (`id`, `public_id`, `url`)
VALUES (1, 'qguxnq0n1ayhwykfcyt0', 'http://res.cloudinary.com/naydennn/image/upload/v1638126940/qguxnq0n1ayhwykfcyt0.png');
INSERT INTO pictures (`id`, `public_id`, `url`)
VALUES (2, 'rykxicg2a2kxrdfwsitg', 'http://res.cloudinary.com/naydennn/image/upload/v1638127016/rykxicg2a2kxrdfwsitg.jpg');
INSERT INTO pictures (`id`, `public_id`, `url`)
VALUES (3, 'wpvyo8jypyj16qhafdha', 'http://res.cloudinary.com/naydennn/image/upload/v1638127068/wpvyo8jypyj16qhafdha.jpg');
INSERT INTO pictures (`id`, `public_id`, `url`)
VALUES (4, 'tjhajufijkmzutjmyw25', 'http://res.cloudinary.com/naydennn/image/upload/v1638127105/tjhajufijkmzutjmyw25.jpg');
INSERT INTO pictures (`id`, `public_id`, `url`)
VALUES (5, 'Dell-Inspiron-3880_irwmlq', 'https://res.cloudinary.com/naydennn/image/upload/v1638212581/Dell-Inspiron-3880_irwmlq.jpg');
INSERT INTO pictures (`id`, `public_id`, `url`)
VALUES (6, 'lenovo-v55t-15api_o4tow0', 'https://res.cloudinary.com/naydennn/image/upload/v1638212915/lenovo-v55t-15api_o4tow0.jpg');
INSERT INTO pictures (`id`, `public_id`, `url`)
VALUES (7, 'dell-vostro-3888_oiogee', 'https://res.cloudinary.com/naydennn/image/upload/v1638212962/dell-vostro-3888_oiogee.jpg');
INSERT INTO pictures (`id`, `public_id`, `url`)
VALUES (8, 'asus-g513-rog-strix-g15-304800_meijgc', 'https://res.cloudinary.com/naydennn/image/upload/v1638215947/asus-g513-rog-strix-g15-304800_meijgc.jpg');
INSERT INTO pictures (`id`, `public_id`, `url`)
VALUES (9, 'alienware-m15-r2-251519_crfejc', 'https://res.cloudinary.com/naydennn/image/upload/v1638215946/alienware-m15-r2-251519_crfejc.jpg');
INSERT INTO pictures (`id`, `public_id`, `url`)
VALUES (10, 'asus-ux371-zenbook-flip-s13-304305_iwk883.jpg', 'https://res.cloudinary.com/naydennn/image/upload/v1638215946/asus-ux371-zenbook-flip-s13-304305_iwk883.jpg');
INSERT INTO pictures (`id`, `public_id`, `url`)
VALUES (11, 'hp-250-g8-302213_z6hjmg', 'https://res.cloudinary.com/naydennn/image/upload/v1638215946/hp-250-g8-302213_z6hjmg.jpg');
INSERT INTO pictures (`id`, `public_id`, `url`)
VALUES (12, 'msi-modern-14_fkleob', 'https://res.cloudinary.com/naydennn/image/upload/v1638215947/msi-modern-14_fkleob.jpg');
INSERT INTO pictures (`id`, `public_id`, `url`)
VALUES (13, 'apple-macbook-pro-14_mcawtl', 'https://res.cloudinary.com/naydennn/image/upload/v1638215946/apple-macbook-pro-14_mcawtl.jpg');
INSERT INTO pictures (`id`, `public_id`, `url`)
VALUES (14, 'msi-gf65-thin_hevz4r', 'https://res.cloudinary.com/naydennn/image/upload/v1638215947/msi-gf65-thin_hevz4r.jpg');
INSERT INTO pictures (`id`, `public_id`, `url`)
VALUES (15, 'lg-oled_sxtjid', 'https://res.cloudinary.com/naydennn/image/upload/v1638303190/lg-oled_sxtjid.jpg');
INSERT INTO pictures (`id`, `public_id`, `url`)
VALUES (16, 'monitor-asus-rog-strix-_aowvrr', 'https://res.cloudinary.com/naydennn/image/upload/v1638303190/monitor-asus-rog-strix-_aowvrr.jpg');
INSERT INTO pictures (`id`, `public_id`, `url`)
VALUES (17, '24-5-alienware-aw2521h_exgq6x', 'https://res.cloudinary.com/naydennn/image/upload/v1638303190/24-5-alienware-aw2521h_exgq6x.jpg');
INSERT INTO pictures (`id`, `public_id`, `url`)
VALUES (18, 'monitor-aoc-23_aw8pxc', 'https://res.cloudinary.com/naydennn/image/upload/v1638303190/monitor-aoc-23_aw8pxc.jpg');
INSERT INTO pictures (`id`, `public_id`, `url`)
VALUES (19, 'tach-monitor-asus_it0ov2', 'https://res.cloudinary.com/naydennn/image/upload/v1638303190/tach-monitor-asus_it0ov2.jpg');
INSERT INTO pictures (`id`, `public_id`, `url`)
VALUES (20, 'pro-display-og-apple_gipn9a', 'https://res.cloudinary.com/naydennn/image/upload/v1638303190/pro-display-og-apple_gipn9a.jpg');
INSERT INTO pictures (`id`, `public_id`, `url`)
VALUES (21, 'aoc-24v2q_pqkuwi', 'https://res.cloudinary.com/naydennn/image/upload/v1638303191/aoc-24v2q_pqkuwi.jpg');



INSERT INTO processor (`id`, `cores`, `frequency`, `model`)
VALUES (1, 8, 4.60, 'AMD Ryzen 7 PRO');
INSERT INTO processor (`id`, `cores`, `frequency`, `model`)
VALUES (2, 8, 2.50, 'Intel Core i7-11700F');
INSERT INTO processor (`id`, `cores`, `frequency`, `model`)
VALUES (3, 8, 5.3, 'Intel Core i9-11900KF');
INSERT INTO processor (`id`, `cores`, `frequency`, `model`)
VALUES (4, 6, 3.90, 'Intel Core i5-11600K');
INSERT INTO processor (`id`, `cores`, `frequency`, `model`)
VALUES (5, 6, 3.20, 'Intel Core i5');
INSERT INTO processor (`id`, `cores`, `frequency`, `model`)
VALUES (6, 4, 3.60, 'AMD Ryzen 3 3200G');
INSERT INTO processor (`id`, `cores`, `frequency`, `model`)
VALUES (7, 6, 2.90, 'Intel Core i5-10400');
INSERT INTO processor (`id`, `cores`, `frequency`, `model`)
VALUES (8, 8, 3.30, 'AMD Ryzen 7 4800H');
INSERT INTO processor (`id`, `cores`, `frequency`, `model`)
VALUES (9, 6, 4.50, 'Intel Core i7-9750H');
INSERT INTO processor (`id`, `cores`, `frequency`, `model`)
VALUES (10, 4, 3.2, 'Intel Core i7-1165G7');
INSERT INTO processor (`id`, `cores`, `frequency`, `model`)
VALUES (11, 4, 2.20, 'AMD Ryzen 5 3500U');
INSERT INTO processor (`id`, `cores`, `frequency`, `model`)
VALUES (12, 4, 2.40, 'Intel Core i5-10210U');
INSERT INTO processor (`id`, `cores`, `frequency`, `model`)
VALUES (13, 10, 3.20, 'Apple M1 Max');
INSERT INTO processor (`id`, `cores`, `frequency`, `model`)
VALUES (14, 4, 2.50, 'Intel Core i5-10300H');

INSERT INTO ram_memory (`id`, `ram`, `type_of_ram`)
VALUES (1, 8, 'DDR4');
INSERT INTO ram_memory (`id`, `ram`, `type_of_ram`)
VALUES (2, 16, 'DDR4');
INSERT INTO ram_memory (`id`, `ram`, `type_of_ram`)
VALUES (3, 32, 'DDR4');
INSERT INTO ram_memory (`id`, `ram`, `type_of_ram`)
VALUES (4, 16, 'DDR4');
INSERT INTO ram_memory (`id`, `ram`, `type_of_ram`)
VALUES (5, 16, 'DDR4');
INSERT INTO ram_memory (`id`, `ram`, `type_of_ram`)
VALUES (6, 8, 'DDR4');
INSERT INTO ram_memory (`id`, `ram`, `type_of_ram`)
VALUES (7, 16, 'DDR4');
INSERT INTO ram_memory (`id`, `ram`, `type_of_ram`)
VALUES (8, 32, 'DDR4');
INSERT INTO ram_memory (`id`, `ram`, `type_of_ram`)
VALUES (9, 16, 'DDR4');
INSERT INTO ram_memory (`id`, `ram`, `type_of_ram`)
VALUES (10, 16, 'LPDDR4X');
INSERT INTO ram_memory (`id`, `ram`, `type_of_ram`)
VALUES (11, 8, 'DDR4');
INSERT INTO ram_memory (`id`, `ram`, `type_of_ram`)
VALUES (12, 16, 'DDR4');
INSERT INTO ram_memory (`id`, `ram`, `type_of_ram`)
VALUES (13, 32, 'LPDDR4X');
INSERT INTO ram_memory (`id`, `ram`, `type_of_ram`)
VALUES (14, 8, 'DDR4');


INSERT INTO video_cards (`id`, `gpu`, `memory`, `type_of_memory`)
VALUES (1, 'AMD Radeon Graphics', 6, 'GDDR5');
INSERT INTO video_cards (`id`, `gpu`, `memory`, `type_of_memory`)
VALUES (2, 'NVIDIA RTX 3060 Ti', 8, 'GDDR6');
INSERT INTO video_cards (`id`, `gpu`, `memory`, `type_of_memory`)
VALUES (3, 'NVIDIA GeForce RTX 3080', 10, 'GDDR6');
INSERT INTO video_cards (`id`, `gpu`, `memory`, `type_of_memory`)
VALUES (4, 'AMD Radeon RX 6600XT', 8, 'GDDR6');
INSERT INTO video_cards (`id`, `gpu`, `memory`, `type_of_memory`)
VALUES (5, 'Nvidia GeForce GTX 1660', 6, 'GDDR5');
INSERT INTO video_cards (`id`, `gpu`, `memory`, `type_of_memory`)
VALUES (6, 'AMD Radeon RX Vega 8', 4, 'GDDR5');
INSERT INTO video_cards (`id`, `gpu`, `memory`, `type_of_memory`)
VALUES (7, 'NVIDIA GeForce GTX 1060', 6, 'GDDR5');
INSERT INTO video_cards (`id`, `gpu`, `memory`, `type_of_memory`)
VALUES (8, 'NVIDIA GeForce GTX 1650', 4, 'GDDR6');
INSERT INTO video_cards (`id`, `gpu`, `memory`, `type_of_memory`)
VALUES (9, 'NVIDIA RTX 2080 Max-Q', 8, 'GDDR6');
INSERT INTO video_cards (`id`, `gpu`, `memory`, `type_of_memory`)
VALUES (10, 'Intel Iris Xe Graphics', 6, 'GDDR6');
INSERT INTO video_cards (`id`, `gpu`, `memory`, `type_of_memory`)
VALUES (11, 'AMD Radeon Vega 8 Graphics', null, null);
INSERT INTO video_cards (`id`, `gpu`, `memory`, `type_of_memory`)
VALUES (12, 'NVIDIA GeForce MX350', 2, 'GDDR5');
INSERT INTO video_cards (`id`, `gpu`, `memory`, `type_of_memory`)
VALUES (13, 'Apple M1 Max', 32, null);
INSERT INTO video_cards (`id`, `gpu`, `memory`, `type_of_memory`)
VALUES (14, 'NVIDIA GeForce RTX 2060', 6, 'GDDR6');

INSERT INTO computers (`id`, `created`, `description`, `model`, `motherboard`, `power_supply`, `price`, `storage`, `type`, `picture_id`, `processor_id`, `ram_id`, `user_id`, `video_card_id`)
VALUES (1, '2021-11-28', '....', 'AMD Ryzen 7 PRO 5750G', 'MSI B550M PRO-VDH', 600, 649, '500 GB SSD M.2 NVMe', 'OFFICE' , 1 , 1 , 1, null, 1);
INSERT INTO computers (`id`, `created`, `description`, `model`, `motherboard`, `power_supply`, `price`, `storage`, `type`, `picture_id`, `processor_id`, `ram_id`, `user_id`, `video_card_id`)
VALUES (2, '2021-11-28', '....', 'Acer Nitro N50-620', 'AMD B450 chipset', 500, 1200, '512 GB SSD M.2 NVMe', 'GAMING', 2 , 2 , 2, null, 2);
INSERT INTO computers (`id`, `created`, `description`, `model`, `motherboard`, `power_supply`, `price`, `storage`, `type`, `picture_id`, `processor_id`, `ram_id`, `user_id`, `video_card_id`)
VALUES (3, '2021-11-28', '....', 'ASUS ROG Strix GT35', 'Intel Z370 ATX', 700, 3500, '1000 GB SSD M.2 NVMe', 'GAMING',3 , 3 , 3, null, 3);
INSERT INTO computers (`id`, `created`, `description`, `model`, `motherboard`, `power_supply`, `price`, `storage`, `type`, `picture_id`, `processor_id`, `ram_id`, `user_id`, `video_card_id`)
VALUES (4, '2021-11-28', '....', 'Viper RX880', 'GIGABYTE AORUS B560', 850, 1790, '1000 GB SSD M.2', 'GAMING', 4, 4, 4, null, 4);
INSERT INTO computers (`id`, `created`, `description`, `model`, `motherboard`, `power_supply`, `price`, `storage`, `type`, `picture_id`, `processor_id`, `ram_id`, `user_id`, `video_card_id`)
VALUES (5, '2021-11-29', '....', 'Dell - Inspiron 3880', 'Intel B460', 600, 710.99, '256B SSD', 'OFFICE', 5 , 5 , 5, null, 5);
INSERT INTO computers (`id`, `created`, `description`, `model`, `motherboard`, `power_supply`, `price`, `storage`, `type`, `picture_id`, `processor_id`, `ram_id`, `user_id`, `video_card_id`)
VALUES (6, '2021-11-29', '....', 'Lenovo V55t 15API', 'AMD B300', 5500, 499.99, '500 GB SSD', 'HOME',6 , 6 , 6, null, 6);
INSERT INTO computers (`id`, `created`, `description`, `model`, `motherboard`, `power_supply`, `price`, `storage`, `type`, `picture_id`, `processor_id`, `ram_id`, `user_id`, `video_card_id`)
VALUES (7, '2021-11-29', '....', 'Dell Vostro 3888 MT', 'Intel B460', 600, 550, '1TB 7200RPM 3.5" SATA HDD', 'HOME', 7, 7, 7, null, 7);


INSERT INTO laptops (`id`, `color`, `created`, `description`, `display`, `hard_disk`, `model`, `price`, `type`, `picture_id`, `processor_id`, `ram_entity_id`, `user_id`, `video_card_id`)
VALUES (1, 'Graffit', '2021-11-29', '...', 'IPS matte', '512 GB M.2 NVMe SSD', 'ASUS ROG Strix G15', 1400, 'GAMING', 8, 8 ,8, null, 8);
INSERT INTO laptops (`id`, `color`, `created`, `description`, `display`, `hard_disk`, `model`, `price`, `type`, `picture_id`, `processor_id`, `ram_entity_id`, `user_id`, `video_card_id`)
VALUES (2, 'Black', '2021-11-29', '...', 'IPS Matte Full HD', '2048 GB M.2 NVMe SSD', 'Alienware m15 R2', 3500, 'GAMING', 9, 9 , 9, null, 9);
INSERT INTO laptops (`id`, `color`, `created`, `description`, `display`, `hard_disk`, `model`, `price`, `type`, `picture_id`, `processor_id`, `ram_entity_id`, `user_id`, `video_card_id`)
VALUES (3, 'Black', '2021-11-29', '...', 'IPS matte', '1024 GB M.2 NVMe SSD', 'ASUS ZenBook Flip S13', 1350, 'HOME', 10, 10 ,10, null, 10);
INSERT INTO laptops (`id`, `color`, `created`, `description`, `display`, `hard_disk`, `model`, `price`, `type`, `picture_id`, `processor_id`, `ram_entity_id`, `user_id`, `video_card_id`)
VALUES (4, 'Metalic', '2021-11-29', '...', 'IPS Full HD', '512 GB M.2 NVMe SSD', 'HP 255 G8', 550, 'HOME', 11, 11 ,11, null, 11);
INSERT INTO laptops (`id`, `color`, `created`, `description`, `display`, `hard_disk`, `model`, `price`, `type`, `picture_id`, `processor_id`, `ram_entity_id`, `user_id`, `video_card_id`)
VALUES (5, 'Black', '2021-11-29', '...', 'IPS Matte Full HD', '512 GB M.2 NVMe SSD', 'MSI Modern 14 B10RBS', 749.99, 'OFFICE', 12, 12 ,12, null, 12);
INSERT INTO laptops (`id`, `color`, `created`, `description`, `display`, `hard_disk`, `model`, `price`, `type`, `picture_id`, `processor_id`, `ram_entity_id`, `user_id`, `video_card_id`)
VALUES (6, 'Metalic', '2021-11-29', '...', 'Liquid Retina XDR', '1024 SSD', 'Apple MacBook Pro 16', 3049.99, 'OFFICE', 13, 13 ,13, null, 13);
INSERT INTO laptops (`id`, `color`, `created`, `description`, `display`, `hard_disk`, `model`, `price`, `type`, `picture_id`, `processor_id`, `ram_entity_id`, `user_id`, `video_card_id`)
VALUES (14, 'Black', '2021-11-29', '...', 'IPS matte', '512 GB M.2 NVMe SSD', 'MSI GF65 Thin 10SER', 949, 'GAMING', 14, 14 ,14, null, 14);

INSERT INTO monitors(`id`, `color`, `created`, `description`, `model`, `price`, `size`, `screen`, `picture_id`, `user_id`)
VALUES (1, 'Black', '2021-11-30', 'Designed for creative professionals the LG 16:9  Monitor, delivers exceptional color accuracy alongside a variety of connectivity options to support your video editing workflow. Supporting a 3840 x 2160 resolution at 60 Hz, this 4K OLED monitor delivers deliver vibrant colors with high-dynamic range, covering 99% of the DCI-P3 and Adobe RGB spectrums.',
        'LG UltraFine 32EP950-B', 3999.10, 32, '4K HDR OLED IPS', 15, null);
INSERT INTO monitors(`id`, `color`, `created`, `description`, `model`, `price`, `size`, `screen`, `picture_id`, `user_id`)
VALUES (2, 'Black', '2021-11-30', 'It features a 43-inch 4K panel with an astonishing 120Hz refresh rate, high dynamic range (HDR) technology with 90% DCI-P3 professional color gamut coverage and exceptional contrast for DisplayHDR™ 600 certification, plus support for AMD FreeSync™ Premium Pro technology.',
        'ASUS ROG Strix XG438QR', 1055.99, 43, 'LED-backlit LCD monitor / TFT active matrix', 16, null);
INSERT INTO monitors(`id`, `color`, `created`, `description`, `model`, `price`, `size`, `screen`, `picture_id`, `user_id`)
VALUES (3, 'Black', '2021-11-30', 'The Alienware 25 Gaming Monitor possesses the world''s fastest refresh rate at 360Hz i. Gameplay is now fully optimized to enable split-second reactions and with a refresh rate this fast, you can count on a no-scope headshot before the enemy even knows you''re there.',
        'Alienware AW2521H', 299.99, 32, 'IPS Matte', 17, null);
INSERT INTO monitors(`id`, `color`, `created`, `description`, `model`, `price`, `size`, `screen`, `picture_id`, `user_id`)
VALUES (4, 'Black', '2021-11-30', 'This Full HD monitor''s MVA panel offers brilliant colours and wide viewing angles. Two HDMI ports and integrated speakers make it a good fit for watching Blu-ray and DVD movies.',
        'AOC M2470SWH', 100, 23.6, 'Full HD LED', 18, null);
INSERT INTO monitors(`id`, `color`, `created`, `description`, `model`, `price`, `size`, `screen`, `picture_id`, `user_id`)
VALUES (5, 'Black', '2021-11-30', 'Optimized for Windows 10 and its touchscreen functions that include tap, swipe, slide, pinch/stretch, rotate, 5-point touch, and 10-point touch, the VT229H 21.5" 16:9 Multi-Touch IPS Monitor from ASUS combines a capacitive multi-touch display with panel that has a 7H hardness rating, and a native resolution of 1920 x 1080. It also features In-Plane Switching (IPS) technology, support for 16.7 million colors using 6-bit + FRC, a widescreen 16:9 aspect ratio, a static contrast ratio of 1000:1, an ASUS Smart Contrast Ratio of 100,000,000:1, 250 cd/m2 brightness, 102 pixels per inch, and a 5 ms (GtG) response time.',
        'ASUS VT229H', 219, 21.5, 'IPS, Touchs', 19, null);
INSERT INTO monitors(`id`, `color`, `created`, `description`, `model`, `price`, `size`, `screen`, `picture_id`, `user_id`)
VALUES (6, 'Metalic', '2021-11-30', 'The Pro Display XDR is a 32-inch 6K LCD that can hit 1,600 nits of peak brightness, with 1,000 nits of sustained brightness from a full-array local dimming backlight composed of 576 special blue LEDs. It supports true 10-bit color and the full DCI-P3 color gamut, and Apple says that it can hit a million-to-one contrast ratio using certain industry-standard test patterns.',
        'Apple Pro XDR', 5999, 32, 'IPS LCD display with oxide TFT technology', 20, null);
INSERT INTO monitors(`id`, `color`, `created`, `description`, `model`, `price`, `size`, `screen`, `picture_id`, `user_id`)
VALUES (7, 'Black/Metalic', '2021-11-30', 'The 24V2Q boasts a 3-sides frameless 23.8” IPS display in Full HD resolution, with hidden “Edge” frame design and sturdy metal stand. Ready for fast pace games and moving pictures with FreeSync, 75Hz refresh rate and 5 ms response time.',
        'AOC 24V2Q', 150, 21.5, 'IPS', 21, null);

INSERT INTO connections_types(`monitor_id`, `connection_type`)
VALUES (1, 'HDMI'),
       (1, 'USB'),
       (1, 'DISPLAY_PORT');