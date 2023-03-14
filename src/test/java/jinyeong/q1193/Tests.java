package jinyeong.q1193;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class Tests {

    @Test
    @DisplayName("1")
    void t1() {
        assertThat(new Solution().solution(1)).isEqualTo("1/1");
    }

    @Test
    @DisplayName("2")
    void t2() {
        assertThat(new Solution().solution(2)).isEqualTo("1/2");
    }

    @Test
    @DisplayName("3")
    void t3() {
        assertThat(new Solution().solution(3)).isEqualTo("2/1");
    }

    @Test
    @DisplayName("4")
    void t4() {
        assertThat(new Solution().solution(4)).isEqualTo("3/1");
    }

    @Test
    @DisplayName("7")
    void t7() {
        assertThat(new Solution().solution(7)).isEqualTo("1/4");
    }

    @Test
    @DisplayName("8")
    void t8() {
        assertThat(new Solution().solution(8)).isEqualTo("2/3");
    }
}
