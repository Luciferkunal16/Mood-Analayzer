import org.junit.*;

 public class MoodAnalyzerTest {

    @Test
    public void givenMessage_WhenSad_ShouldReturnSad() {

        MoodAnalayzer moodAnalyzer = new MoodAnalayzer("This is a Sad message");
        String mood = moodAnalyzer.analyzeMood();
        Assert.assertEquals("SAD",mood);

        }
        @Test
        public void givenMessage_Whenany_ShouldReturnHappy() {

            MoodAnalayzer moodAnalyzer = new MoodAnalayzer("This is a any message");
            String mood = moodAnalyzer.analyzeMood();
            Assert.assertEquals("HAPPY",mood);

        }

    @Test
    public void givenMessage_WhenNull_ShouldThrowMoodAnalysisNullException() {

        MoodAnalayzer moodAnalyzer = new MoodAnalayzer("");
        try {
            moodAnalyzer.analyzeMood();
        } catch (MoodAnalyzerException e) {
            Assert.assertEquals(MoodAnalyzerException.ExceptionType.ENTERED_NULL, e.type);
        }

    }

    @Test
    public void givenMessage_WhenEmpty_ShouldThrowMoodAnalysisEmptyException() {

        MoodAnalayzer moodAnalyzer = new MoodAnalayzer(null);
        try {
            moodAnalyzer.analyzeMood();
        } catch (MoodAnalyzerException e) {
            Assert.assertEquals(MoodAnalyzerException.ExceptionType.ENTERED_EMPTY, e.type);
        }
    }
}

