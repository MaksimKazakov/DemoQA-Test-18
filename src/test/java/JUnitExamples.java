import org.junit.jupiter.api.*;

public class JUnitExamples {
    @BeforeAll //выполняется перед всеми тестами
    static void beforeAll(){
        System.out.println("Here is beforeAll()");
    }

    @BeforeEach // выполняется перед каждым тестом
    void beforeEach(){
        System.out.println("    Here is beforeEach()");
    }

    @AfterAll  //выполняется после всех тестов
    static void afterAll(){
        System.out.println("Here is afterAll()");
    }

    @AfterEach // выполняется после каждого теста
    void afterEach(){
        System.out.println("        Here is afterEach()");
    }
    @Test
    void firstTest(){
        System.out.println("        Here is firstTest()");
    }

    @Test
    void secondTest(){
        System.out.println("        Here is secondTest()");
    }
}
