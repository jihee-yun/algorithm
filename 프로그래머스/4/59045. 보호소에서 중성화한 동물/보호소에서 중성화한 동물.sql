SELECT ai.ANIMAL_ID,
       ai.ANIMAL_TYPE,
       ai.NAME
from ANIMAL_INS ai inner join ANIMAL_OUTS ao on ai.ANIMAL_ID=ao.ANIMAL_ID
where ai.SEX_UPON_INTAKE like '%Intact%' and ao.SEX_UPON_OUTCOME not like '%Intact%'