"2022-03-22"
제어문 - 조건문
조건문 이란?
1. 조건문 if문
if(조건식 1 ) {
     조건식 1이 참일 때 실행할 명령문
} else if (조건식 2 ) {
     조건식 1이 거짓이고 조건식 2가 참일 때 실행할 명령문
} else {
     위의 조건식이 둘 다 참이 아닐 때 실행할 명령문
} 으로 사용한다.
2. 조건문  swith 문
swith문은 if~else if의 친구이다. 상황에 따라서 사용하면 가독성 면에서 좋다.
switch(num) {
case 1 : 
     1일때 실행할 명령문;    break;
case 2 : 
     2일때 실행할 명령문;    break;
case 3 : ....	           break; ...

default
      case값에 들어가지 않는 나머지값에 실행할 명령문;  break;
} switch문은 꼭 끝에 break가 들어가야한다.