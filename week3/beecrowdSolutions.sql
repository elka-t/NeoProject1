1) customer address
select name, street from customers where city = 'Porto Alegre';

2) greater than 100 or less than 10
select id, name from products where price<10 or price>100;

3) basic selects
select id, name from products where price<10 or price>100;

4) executive representatives
select products.name, providers.name from products join providers on
products.id_providers = providers.id where products.id_categories=6;

5) categories
select products.id, products.name from products join categories
on products.id_categories = categories.id where categories.name like 'super';

6) Providers City in Alphabetical Order
select distinct(city) from providers order by city;

7) Higher and lower price
select max(price), min(price) from products;

8) Products by categories
select categories.name, sum(amount) as sum from categories join products
on categories.id = products.id_categories group by categories.name;

9) September rentals
select name, rentals_date from customers join
rentals on customers.id = rentals.id_customers
where (select extract(month from rentals_date)) = '09';

10) No rental
select id,name from  customers
where id not in (select id_customers from locations);

11) Cheap movies
select movies.id, movies.name
from movies join prices on movies.id_prices = prices.id
where prices.value<2.00;

12) Action movies
select movies.id, movies.name
from movies join genres
on movies.id_genres=genres.id where genres.description = 'Action';

13) Imported products
select products.name, providers.name, categories.name
from ((products join
providers on products.id_providers = providers.id)
join categories on products.id_categories = categories.id)
where providers.name = 'Sansul SA' and categories.name='Imported'
