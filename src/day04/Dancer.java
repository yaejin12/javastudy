package day04;
//class:객체를 찍어내는 설개도
//라이브러리 클래스: 설계도의 역할만 함, 실행은 안함 - main 이 없음
public class Dancer {
    //클래스에서는 갹채의 속성과 기능을 정의

    //객체의 속성: 객체를 표현하는 데이터
    //필드(field)

    String dancerName;//댄서 이름 //클래스 안에 있으면 변수 아니다
    String crewName;//팀이름
    String genre;
    int danceLevel;//0:초보 1:아마추어 2:프로

    //객체의 기능: 객체가 할 수 있는 일, 행위
    //-> 메서드(method), static 을 붙이지 않는다

    //자기소개하는 기능  //함수 아니야!!
    void  introduce(){
        System.out.println("이름:"+dancerName);
        System.out.println("팀명:"+crewName);
        System.out.println("장르:"+genre);
        System.out.println("레벨:"+danceLevel);

    }

    //춤추는 기능
    void dance() {
        System.out.printf("%s 댄서가 %s춤을 춥니다.\n", dancerName, genre);
    }

    //생성자(constructor)
    //객체가 생성될 때 초기 값을 세팅해준,ㄴ 함수의 일종
    //생성자 규칙
    //1.생성자는 함수의 일종인데 반드시 이름이 클래스이름과 같아야한다.
    //2.생성자는 리턴값이 없음. 따라서 vaid 가 생략됨.
    Dancer(){

        dancerName = "춤꾼";
        crewName = "팝핀크루";
        genre ="ㅔ이팝";
        danceLevel =0;
    }

    //생성자는 여려개 만들 수 있음: 생성자 오버로딩
    //규칙: 파라미터가 달라야함
    Dancer(String dName){
        dancerName=dName;
        crewName="도시춤꾼";
        genre ="어반";
        danceLevel= 1;
    }

    Dancer(String dName, String cName){
        dancerName = dName;
        crewName = cName;
        genre ="케이팝";
        danceLevel= 2;
    }

    Dancer(String dName, String cName, String gName){
        dancerName = dName;
        crewName = cName;
        genre =gName;
        danceLevel= 2;
    }


}
