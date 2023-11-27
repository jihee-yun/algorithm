-- 코드를 입력하세요
SELECT DISTINCT a.car_id
from CAR_RENTAL_COMPANY_CAR as a join CAR_RENTAL_COMPANY_RENTAL_HISTORY as b
on a.car_id = b.car_id
where month(b.start_date) like '%10%' and a.car_type like '%세단%'
order by a.car_id desc;