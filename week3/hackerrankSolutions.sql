
 1) select * from CITY;
 2) select * from CITY where ID= 1661;
 3) select * from CITY where COUNTRYCODE='JPN';
 4) select NAME from CITY where COUNTRYCODE = 'JPN'
 5) select CITY, STATE from STATION;
 6) select distinct(CITY) from STATION where ID%2=0;
 7) select CITY, length(CITY) from STATION order by length(CITY)asc, CITY limit 1;
    select CITY, length(CITY) from STATION order by length(CITY)desc limit 1;
 8) select distinct(CITY) from station where substr(CITY, length(CITY),1) in ('a', 'e', 'i', 'o', 'u');
 9) select Name from STUDENTS where Marks>75 order by right(Name,3),ID;
 10) select name from Employee order by name asc;