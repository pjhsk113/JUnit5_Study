package study.javatest.javatest;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

class StudyTest {

    @Test
    void create() {
        Study study = new Study();
        assertNotNull(study);
    }

    @Test
    void create1() {
        System.out.println("create1");
    }

    /**
     * static 메소드 사용해야함.
     * return 타입 없어야함.
     * 모든 테스트가 실행되기 이전에 한번만 실행
     */
    @BeforeAll
    static void beforeAll() {
        System.out.println("before all");
    }

    /**
     * static 메소드 사용해야함.
     * return 타입 없어야함.
     * 모든 테스트가 실행된 후에 한번만 실행
     */
    @AfterAll
    static void afterAll() {
        System.out.println("after all");
    }

    // 모든 테스트마다 실행 이전에 한번 호출
    @BeforeEach
    void beforeEach() {
        System.out.println("before each");
    }

    // 모든 테스트마다 실행 이후에 한번 호출
    @AfterEach
    void afterEach() {
        System.out.println("after each");
    }
}