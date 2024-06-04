SELECT COUNT(ID) AS FISH_COUNT
FROM FISH_INFO AS FI
LEFT JOIN FISH_NAME_INFO AS FNI ON FI.FISH_TYPE = FNI.FISH_TYPE
WHERE FISH_NAME IN ('BASS', 'SNAPPER')