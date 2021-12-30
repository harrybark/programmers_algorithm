package programmers.level.level1;


/***
 * @author Harry (@aka 갈색토마토)
 * @since 2021.12.28
 * Programmers algorithm
 * 가운데 글자 가져오기
 * 문제 설명
 * 단어 s의 가운데 글자를 반환하는 함수, solution을 만들어 보세요.
 * 단어의 길이가 짝수라면 가운데 두글자를 반환하면 됩니다.
 * 재한사항
 * s는 길이가 1 이상, 100이하인 스트링입니다.
 * 입출력 예
 * s	return
 * "abcde"	"c"
 * "qwer"	"we"
 *
 */
public class BringCenterString {

    private final static String INPUT_STRING = "qweaar";

    public static void main(String[] args) {
        String answer = String.format("The Answer is %s.", answer(INPUT_STRING));
        System.out.println(answer);
    }

    private static String answer(String input) {
        int sLength = input.length();

        return (input.length() % 2 == 0) ?
                input.substring( sLength/2-1,  sLength/2+1)
                : input.substring( sLength/2, sLength/2 + 1);
    }
}
