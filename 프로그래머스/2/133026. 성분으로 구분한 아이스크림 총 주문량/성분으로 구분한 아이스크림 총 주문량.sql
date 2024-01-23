-- 코드를 입력하세요
SELECT
    INGREDIENT_TYPE
    , sum (TOTAL_ORDER) as TOTAL_ORDER
from FIRST_HALF  a
join ICECREAM_INFO b
on a.FLAVOR  = b.FLAVOR 
group by b.INGREDIENT_TYPE
order by 2 asc