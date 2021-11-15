import org.junit.*;

public class MoodAnalyzerTest {

    @Test
    public void givenMessage_WhenSad_ShouldReturnSad() {

        MoodAnalayzer moodAnalyzer = new MoodAnalayzer("This is a Sad message");
        String mood = moodAnalyzer.analyzeMood();
        Assert.assertEquals("Sad",mood);

        }
}

