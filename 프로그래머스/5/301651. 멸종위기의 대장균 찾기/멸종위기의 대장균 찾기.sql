WITH RECURSIVE CTE AS(
    SELECT D1.ID AS ID, D2.ID AS CHILD_ID, 1 AS LEVEL
    FROM ECOLI_DATA D1 LEFT OUTER JOIN ECOLI_DATA D2 ON D1.ID=D2.PARENT_ID
    WHERE D1.PARENT_ID IS NULL

    UNION ALL

    SELECT C.CHILD_ID AS ID, E.ID AS CHILD_ID , LEVEL+1 AS LEVEL
    FROM CTE C LEFT OUTER JOIN ECOLI_DATA E ON C.CHILD_ID=E.PARENT_ID
    WHERE  C.CHILD_ID IS NOT NULL
)

SELECT COUNT(DISTINCT(ID)) AS COUNT, LEVEL AS GENERATION
FROM CTE
WHERE CHILD_ID IS NULL
GROUP BY LEVEL