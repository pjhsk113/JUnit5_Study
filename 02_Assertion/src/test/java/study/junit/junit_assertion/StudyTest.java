package study.junit.junit_assertion;

import org.junit.jupiter.api.*;

import java.util.function.Supplier;

import static org.junit.jupiter.api.Assertions.*;

class StudyTest {

    @Test
    @DisplayName("스터디 만들기")
    void create_new_study() {
        Study study = new Study();
        assertNotNull(study);

        // 메시지를 String 형태로 생성하면, 테스트가 성공하든 실패하든 문자열 연산을 매번 실행한다.
        assertEquals(StudyStatus.DRAFT, study.getStatus(), "스터디를 처음 만들면 DRAFT 상태다.");
        // 람다식을 사용하면 위의 문제를 해결할 수 있어 문자열 연산의 비용을 최소화 할 수 있다.
        assertEquals(StudyStatus.DRAFT, study.getStatus(), () -> "스터디를 처음 만들면 DRAFT 상태다.");

    }

    @Test
    @DisplayName("스터디 다시 만들기")
    void create_new_study_again() {
        System.out.println("create1");
    }
}