"2022-04-04"접근제한과 static : 접근제한자란 클래스의 데이터나 메소드에 대해서 다른 클래스로부터 접근을 제한하는 것이다.
[접근제한자][static/final] 데이터형 변수명; 의 형식으로 사용하고 가장 큰 범위의 public : 다른 모든 클래스에서 사용 가능, protected : 해당 클래스와 동일한 패키지나 상속받은 클래스일 경우 사용 가능
default : 같은 패키지내의 클래스들은 public 권한을 갖고 접근가능, private : 해당 클래스만이 사용할수있고 외부에서는 절대로 접근불가.
static(정적)이란 고정된 의미를 가지고 있다. static 클래스변수는 클래스로부터 생성된 객체들의 수와 상관없이 하나만 생성된다.
객체들끼리 공유하고 싶은 데이터나 정보가 있을 때 사용하는 깍두기라고 생각하면 된다.
