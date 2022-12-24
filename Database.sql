 create table AIRPORT
    (
    Airport_ID integer  PRIMARY KEY,
    Airport_NAME varchar(50),
    CITY varchar(10)
    );


insert into AIRPORT values(101,'Lal Bahadur Shastri International Airport','VARANASI');
insert into AIRPORT values(102,'Indira Gandhi International Airport','DELHI');
insert into AIRPORT values(103,'Rajiv Gandhi International Airport','HYDERABAD');




create table PLANE
    (
    PLANE_ID integer PRIMARY KEY,
    PLANE_COMPANY varchar(10),
    NUM_OF_SEAT integer
   );sele


 insert into PLANE values(201,'INDIGO',70);
 insert into PLANE values(202,'VISTARA',100);
 insert into PLANE values(203,'SPICEJET',40);

create table SCHEDULE
    (
    PLANE_ID int NOT NULL,
    FROM_AIRPORT_ID int NOT NULL,
    TO_AIRPORT_ID int NOT NULL,
    DEPARTURE_TIME varchar(10),
    ARRIVAL_TIME varchar(10),
    SCHEDULE_ID int NOT NULL PRIMARY KEY
    );

 insert into SCHEDULE values(201,103,101,'00.00','03.00',301);
 insert into SCHEDULE values(201,101,102,'04.00','06.00',302);
 insert into SCHEDULE values(201,102,103,'07.00','11.00',303);
 insert into SCHEDULE values(201,103,102,'12.00','16.00',304);
 insert into SCHEDULE values(201,102,101,'17.00','19.00',305);
 insert into SCHEDULE values(201,101,103,'20.00','23.00',306);

 insert into SCHEDULE values(202,103,102,'00.00','04.00',401);
 insert into SCHEDULE values(202,102,101,'05.00','07.00',402);
 insert into SCHEDULE values(202,101,103,'08.00','11.00',403);
 insert into SCHEDULE values(202,103,101,'12.00','15.00',404);
 insert into SCHEDULE values(202,101,102,'16.00','18.00',405);
 insert into SCHEDULE values(202,103,102,'19.00','23.00',406);

 insert into SCHEDULE values(203,102,101,'00.00','02.00',501);
 insert into SCHEDULE values(203,101,103,'03.00','06.00',502);
 insert into SCHEDULE values(203,103,101,'07.00','10.00',503);
 insert into SCHEDULE values(203,101,102,'11.00','13.00',504);
 insert into SCHEDULE values(203,102,103,'14.00','18.00',505);
 insert into SCHEDULE values(203,103,102,'19.00','23.00',506);

 create table reservation
    (
    SCHEDULE_ID int NOT NULL,
    SEAT_LEFT int NOT NULL
    );
 
insert into reservation values(301,30);
insert into reservation values(302,20);
insert into reservation values(303,40);
insert into reservation values(304,15);
insert into reservation values(305,35);
insert into reservation values(306,69);

insert into reservation values(401,58);
insert into reservation values(402,46);
insert into reservation values(403,34);
insert into reservation values(404,12);
insert into reservation values(405,07);
insert into reservation values(406,24);

insert into reservation values(501,30);
insert into reservation values(502,56);
insert into reservation values(503,41);
insert into reservation values(504,29);
insert into reservation values(505,10);
insert into reservation values(506,74);




PLANE_ID,FROM_AIRPORT_ID,TO_AIRPORT_ID,DEPARTURE_TIME,ARRIVAL_TIME,SCHEDULE_ID