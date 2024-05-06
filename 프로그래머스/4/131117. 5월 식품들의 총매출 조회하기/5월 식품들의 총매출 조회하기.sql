SELECT A.PRODUCT_ID, A.PRODUCT_NAME, SUM(B.AMOUNT * A.PRICE) AS TOTAL_SALES
FROM FOOD_PRODUCT A
INNER JOIN (
    SELECT PRODUCT_ID, AMOUNT
    FROM FOOD_ORDER
    WHERE PRODUCE_DATE BETWEEN STR_TO_DATE(CONCAT('2022-05', '-01'), '%Y-%m-%d')
        AND LAST_DAY(STR_TO_DATE(CONCAT('2022-05', '-01'), '%Y-%m-%d'))
    -- GROUP 전 해당 날짜를 가져와야 GROUP 때 다른 날짜의 AMOUNT 를 합산하지 않습니다.
    -- '2022-05' 리터럴은 파라미터로 변경 될 수 있는 값이기에 YYYY-MM 의 월초, 월말을 구합니다
    -- 컬럼을 형변환 할 시 성능 저하가 발생하여 지양합니다.
    ) B ON A.PRODUCT_ID = B.PRODUCT_ID
-- FOOD_ORDER 테이블의 건수가 많을 경우 조회 대상을 먼저 줄인후 FOOD_PRODUCT 테이블과 조인하여 성능 향상을 기대 할 수 있습니다.
GROUP BY A.PRODUCT_ID, A.PRODUCT_NAME
ORDER BY TOTAL_SALES DESC, A.PRODUCT_ID ASC;