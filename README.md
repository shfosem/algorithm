# algorithm
코테 준비 코드 정리
====================
+ Programmers 연습문제:
    - LEVEL 0 : 정답률 높은 순서대로 풀기(JAVA) 
        001. 두 수의 차
        002. 두 수의 곱
        003. 두 수의 합
        004. 몫 구하기
        005. 나머지 구하기
        006. 나이 출력
        007. 숫자 비교하기
        008. 두 수의 나눗셈
        009. 각도기
        010. 짝수의 합
        011. 배열의 평균값
        012. 양꼬치
        013. 중복된 숫자 개수
        014. 머쓱이보다 키 큰사람
        015. 배열 뒤집기
             > Collections.reverse(collection)로 역순 정렬
        016. 배열 두 배 만들기
             > IntStream은 toArray()를 통해 int[]로 반환 가능
        017. 문자열 뒤집기
             > StringBuilder에 reverse() 메서드 있음.
        018. 삼각형의 완성조건 (1)
        019. 피자 나눠 먹기(1)
        020. 피자 나눠 먹기(3)
        021. 점의 위치 구하기
        022. 편지
        023. 배열 원소의 길이
             > int형 Array가 아닐 때 IntStream으로 반환하려면 mapToInt()
        024. 짝수 홀수 개수
             > IntStream.of(...values...)로 IntStream 생성  
        025. 아이스 아메리카노
             > 프로그래머스 solution 메소드 반환형 바꿔줘도 됨
        026. 배열 자르기
             > Arrays.copyOfRange()로 [x,y) 범위 복사
        027. 짝수는 싫어요
             > IntStream.rangeClosed(a,b) [a,b] 구간 정수를 담은 IntStream반환
        028. 특정 문자 제거하기
             > replace 자체가 모든 일치하는 부분들에 대해 처리
        029. 최댓값 만들기(1)
        030. 문자 반복 출력하기
             > repeat()쓰면 코드는 간단하지만 시간이 훨씬 오래걸림.
        031. 중앙값 구하기
        032. 문자열안에 문자열
             > str.contains()
        033. 순서쌍의 개수
             > stream().filter().count() 의 반환타입은 long
        034. 배열의 유사도
        035. 제곱수 판별하기
             > Math.sqrt()로 제곱근 (반환타입 : double)
        036. 자릿수 더하기
        037. 옷가게 할인 받기
        038. 숨어있는 숫자의 덧셈(1)
             > [a-zA-Z] 알파벳 정규식
        039. 개미 군단
        040. 모음 제거
        041. 세균 증식
             > 2배씩 곱하는 경우 << 연산자 활용
        042. n의 배수 고르기
              > IntStream은 toArray()를 통해 int[]로 반환 가능!!(remind) 
        043. 직각삼각형 출력하기
        044. 대문자와 소문자
        045. 암호 해독
        046. 문자열 정렬하기(1)
             > 배열이 아닐 때 정렬<br>
             > Collections.sort(); 로 List, ArrayList 정렬 가능<br>
             > list.sort(Comparator.naturalOrder());
        047. 주사위의 개수
        048. 가위 바위 보
        049. 가장 큰 수 찾기
             > index구해야 할 때, indexOf(val); 로 index 얻어올 수 있음
        050. 약수 구하기
             > import java.util.stream.*; -> IntStream 사용가능             
        051. 배열 회전시키기
             > 배열 3개를 이어붙이면 직관적으로 해결가능.
        052. 피자 나눠 먹기(2)
        053. 외계행성의 나이
             > char형을 int 값으로 불러오기. Character.getNumericValue(ch);
        054. 최댓값 만들기(2)
             > Math.max(), min() 최대, 최소
        055. 인덱스 바꾸기
        056. 숫자 찾기
             > str.indexOf() 활용하면 훨씬 간단하게 구현 가능
        057. 369게임
        058. 문자열 정렬하기(2)    
             > str.toLowerCase() -> 소문자로 변환<br>
             > String.join(charSeq1, charSeq2) charSeq1에 charSeq2 이어붙인 String 반환
        059. 합성수 찾기
             > 소수 판별 시, 나눠지는지 확인은 제곱근까지
        060. 중복된 문자 제거
             > stream 사용 시 distinct() 키워드로 중복 제거 가능<br>
             > collect(Collectors.joining()); 으로 String 반환
        061. 모스부호(1)
             > 문자열 비교는 equals()를 통해서
        062. 팩토리얼
        063. A로 B만들기
             > 정렬해서 같은지 비교해도 되지만, 구성하는 char의 합, 곱이 같으면 같다고 생각해도 될 거 같아서 그렇게 구현하였음.
        064. 2차원으로 만들기
        065. 가까운 수
        066. k의 개수
             > IntStream.rangeClosed(i,j) -> IntStream [i, j] <br>
             > mapToObj(String::valueOf) -> 해당 함수를 적용하여 매핑 <br>
             > collect(Collectors.joining()) -> 해당 문자열 모두 이어붙이기.
        067. 진료순서 정하기
        068. 한 번만 등장한 문자
             > TreeMap 사용해서 정렬된 EntrySet가져오기
        069. 7의 개수
        070. 이진수 더하기
             > ParseInt(str, i); i진법str 10진법 정수로 변환 가능..<br>
             >Integer.toString(num, i) 정수 num i진법 형태 str로 반환
        071. 숨어있는 숫자의 덧셈 (2)
             > split("[regex]")
        072. 공 던지기
        073. 잘라서 배열로 저장하기
        074. 영어가 싫어요
             > 숫자가 커질 수 있으니 정수 범위 잘 보기
        075. 소인수 분해
        076. 문자열 계산하기
        077. 구슬을 나누는 경우의 수
             > Combination 개수를 구하는 문제<br>
             > BigInteger를 통해 매우 큰 수 계산
        078. 종이 자르기
        079. 외계어 사전
             > String.join("", CharSeq); => CharSequence 이어붙여서 String 만들기
        080. 캐릭터의 좌표
        081. 컨트롤 제트
        082. 삼각형의 완성조건(2)
        083. 로그인 성공?
        084. 직사각형 넓이 구하기
        085. 문자열 밀기
             > 문자열을 이어붙이면, 더 직관적으로 코드 구현 가능
        086. 유한소수 판별하기
        087. 치킨 쿠폰
        088. 등수 매기기
        089. 특이한 정렬
        090. 저주의 숫자 3
        091. 최빈값 구하기
        092. 다항식 더하기
        093. OX퀴즈
        094. 다음에 올 숫자
        095. 분수의 덧셈
             > 최대 공약수 a==b return b, GCD(b, a%b);
        096. 연속된 수의 합
        097. 안전지대
        098. 겹치는 선분의 길이
        099. 평행
        100. 옹알이(1)
     
    - LEVEL 1 : 정답률 높은 순서대로 풀기(Python) 
        001. 평균 구하기
        002. 짝수와 홀수
        003. 약수의 합
        004. 자릿수 더하기
             > int, str 변환 : int(), str()
        005. 자연수 뒤집어 배열로 만들기
             > 배열 뒤집기 : list.reverse()
        006. 정수 제곱근 판별 
             > 제곱 및 제곱근 : 연산자 ** 활용
        007. 문자열 내 p와 y의 개수
             > 문자열 내 알파벳 개수 : str.count('')
        008. x만큼 간격이 있는 n개의 숫자
        009. 문자열을 정수로 바꾸기
        010. 하샤드 수
        011. 정수 내림차순으로 배치하기
        012. 나머지가 1이 되는 수 찾기
        013. 두 정수 사이의 합
             > n(n+1)/2 를 통해 합을 구할 수 있음..
        014. 콜라츠 추측
        015. 서울에서 김서방 찾기
        016. 핸드폰 번호 가리기
             > 리스트 컴프리헨션 [ output collection condition ]
        017. 나누어 떨어지는 숫자 배열
        018. 제일 작은 수 제거하기
        019. 음양 더하기
             > zip(a,b)  반복문 묶어서 
        020. 없는 숫자 더하기
        021. 가운데 글자 가져오기
        022. 수박수박수박수박수박수?
             > 문자열 곱셈 활용 '박수'*3 = '박수박수박수'
        023. 내적
        024. 문자열 내림차순으로 배치하기
             > .join을 통해 리스트 요소 문자열에 추가
             > 정렬은 기본적으로 오름차순
             > 기본적으로 대문자는 소문자보다 작음
        025. 약수의 개수와 덧셈
             > **0.5 를 통해 루트 연산 쉽게 가능
             > 제곱수의 경우만 약수의 개수가  홀수이다.
        026. 문자열 다루기 기본
        027. 부족한 금액 계산하기
        028. 행렬의 덧셈
        029. 직사각형 별찍기
        030. 최대공약수와 최소공배수
        031. 같은 숫자는 싫어 
        032. 이상한 문자 만들기
        033. 3진법 뒤집기
             > int(str, 3) 을 통해 문자열을 3진수로 만들 수 있음
        034. 예산
        035. 시저 암호
        036. 최소직사각형
        037. 비밀지도
             > rjust(length, char) : len만큼 char을 앞에 붙여줌
             > bin(a|b) : a|b 연산 후 binary로 반환
        038. 문자열 내 마음대로 정렬하기
             > 정렬 (key=lambda x : (x[n],x)) : x의 n번째 요소 그 다음  x를 기준으로 정렬
        039. K번째수
        040. 숫자 문자열과 영단어
             > 문자열 함수 활용(replace)
        041. 삼총사
             > from itertools import combinations           :combinations 함수 활용해서 조합 기능 사용가능
        042. 두 개 뽑아서 더하기
        043. 2016년
        044. 폰켓몬
        045. 소수 찾기
             > **0.5 로 sqrt 대신할 수 있음
        046. 모의고사
        047. 소수 만들기
        048. 실패율
        049. 콜라 문제
        050. 다트 게임
        051. 푸드 파이트 대회
        052. 로또의 최고 순위와 최저 순위
             > 딕셔너리 key, value 모두 int 들어갈 수 있음..
        053. 체육복
        054. 완주하지 못한선수
        056. 키패드 누르기
        058. 크레인 인형뽑기 게임

        >> 여기부터 JAVA

        055. 과일 장수
        057. 명예의 전당(1)
        059. 숫자 짝궁
             > Character.getNumericValue() 로 char 값 숫자로 변환
          
        
        060. 신규아이디 추천
             > regular expression  <br>
             > [^-_.a-z0-9] 특수문자 - _ . 과 a-z 0-9가 아니면
             > [.][.]+  .이 두 개 이상
             > ^[.][.]$ .으로 시작하거나 끝나는 경우
        061. 기사단원의 무기

        062. 옹알이 (2)
        
        063. 문자열 나누기
        064. 성격 유형 검사하기
        
        065. 햄버거 만들기
        066. 신고 결과 받기


 
         
