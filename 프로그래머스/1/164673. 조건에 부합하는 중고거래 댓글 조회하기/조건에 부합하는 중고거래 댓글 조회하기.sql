SELECT A.TITLE, A.BOARD_ID, B.REPLY_ID, B.writer_id, B.CONTENTS,
DATE_FORMAT(B.CREATED_DATE, '%Y-%m-%d')
FROM USED_GOODS_BOARD AS A
JOIN USED_GOODS_REPLY AS B ON A.BOARD_ID = B.BOARD_ID
WHERE YEAR(A.CREATED_DATE) = 2022 AND MONTH(A.CREATED_DATE) = 10
ORDER BY B.CREATED_DATE, A.TITLE;
