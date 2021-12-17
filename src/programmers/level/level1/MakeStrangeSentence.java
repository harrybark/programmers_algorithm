package programmers.level.level1;

/***
 * @author Harry (@aka 갈색토마토)
 * @since 2021.12.17
 * Programmers algorithm
 * 이상한 문자 만들기
 * 문자열 s는 한 개 이상의 단어로 구성되어 있습니다.
 * 각 단어는 하나 이상의 공백문자로 구분되어 있습니다.
 * 각 단어의 짝수번째 알파벳은 대문자로, 홀수번째 알파벳은 소문자로 바꾼 문자열을 리턴하는 함수, solution을 완성하세요.
 *
 * 제한사항
 * 문자열 전체의 짝/홀수 인덱스가 아니라, 단어(공백을 기준)별로 짝/홀수 인덱스를 판단해야합니다.
 * 첫 번째 글자는 0번째 인덱스로 보아 짝수번째 알파벳으로 처리해야 합니다.
 *
 * s	return
 * "try hello world"	"TrY HeLlO WoRlD"
 */
public class MakeStrangeSentence {

    public static void main(String[] args) {
        System.out.println("Answer is " + solution("Try hello world"));


    }

    public static String solution(String s) {
        String answer = "";
        String[] arr = s.split(" ", -1);
        StringBuffer sb = new StringBuffer();
        for( int i = 0; i < arr.length; i++){
            char[] temp = arr[i].toCharArray();

            for ( int j = 0 ; j < temp.length; j++) {
                if( j % 2 == 0) {
                    if (temp[j] >= 97 && temp[j] <= 122) {
                        sb.append((char) (temp[j] - 32));
                    } else {
                        sb.append(temp[j]);
                    }
                } else {
                    if (temp[j] >= 65 && temp[j] <= 90) {
                        sb.append((char) (temp[j] + 32));
                    } else {
                        sb.append(temp[j]);
                    }
                }
            }
            if(i != arr.length-1) {
                sb.append(" ");
            }
        }
        answer = sb.toString();
        return answer;
    }

}
