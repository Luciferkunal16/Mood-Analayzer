import org.junit.*;

public class MoodAnalyzerTest {

    @Test
    public void givenMessage_WhenSad_ShouldReturnSad() {

        MoodAnalayzer moodAnalyzer = new MoodAnalayzer("This is a Sad message");
        String mood = moodAnalyzer.analyzeMood();
        Assert.assertEquals("Sad",mood);

        }
        @Test
        public void givenMessage_Whenany_ShouldReturnHappy() {

            MoodAnalayzer moodAnalyzer = new MoodAnalayzer("This is a any message");
            String mood = moodAnalyzer.analyzeMood();
            Assert.assertEquals("Happy",mood);

        }
    @Test
    public void givenMessage_WhenNull_ShouldReturnHappy() {

        MoodAnalayzer moodAnalyzer = new MoodAnalayzer("");
        String mood = moodAnalyzer.analyzeMood();
        Assert.assertEquals("Happy",mood);

    }
}

