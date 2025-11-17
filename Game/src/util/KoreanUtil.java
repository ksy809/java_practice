package util;

// 이(가) 있는 것보다는 없는 게 깔끔해보여서.. 지피티의 힘을 받았습니다..
public class KoreanUtil {
	// 조사 자동 처리: 받침 여부에 따라 withBatchim/withoutBatchim 붙임
    public static String josa(String word, String withBatchim, String withoutBatchim) {
        if (word == null || word.isEmpty()) return word;
        char last = word.charAt(word.length() - 1);
        if (last < 0xAC00 || last > 0xD7A3) {
            return word + withoutBatchim; // 한글 범위 밖이면 그냥 withoutBatchim
        }
        int jong = (last - 0xAC00) % 28; // 종성(받침) 확인
        return word + (jong == 0 ? withoutBatchim : withBatchim);
    }

}
