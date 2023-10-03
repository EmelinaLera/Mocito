import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.netology.mockito.PosterManager;

public class PosterManagerTest {

    @Test
    public void shouldAddFilm() {
        PosterManager posterManager = new PosterManager();
        posterManager.add("Movie 1");
        posterManager.add("Movie 2");
        posterManager.add("Movie 3");

        String[] expected = {"Movie 1", "Movie 2", "Movie 3"};
        String[] actual = posterManager.findAll();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldAddOneFilm() {
        PosterManager posterManager = new PosterManager();
        posterManager.add("Movie 1");

        String[] expected = {"Movie 1"};
        String[] actual = posterManager.findAll();

        Assertions.assertArrayEquals(expected, actual);
    }


    @Test
    public void shouldLastFilmsIfLimit() {
        PosterManager posterManager = new PosterManager();
        posterManager.add("Movie 1");
        posterManager.add("Movie 2");
        posterManager.add("Movie 3");
        posterManager.add("Movie 4");
        posterManager.add("Movie 5");

        String[] expected = {"Movie 5", "Movie 4", "Movie 3", "Movie 2", "Movie 1"};
        String[] actual = posterManager.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldLastFilmsIfMoreLimit() {
        PosterManager posterManager = new PosterManager();
        posterManager.add("Movie 1");
        posterManager.add("Movie 2");
        posterManager.add("Movie 3");
        posterManager.add("Movie 4");
        posterManager.add("Movie 5");
        posterManager.add("Movie 6");

        String[] expected = {"Movie 6", "Movie 5", "Movie 4", "Movie 3", "Movie 2"};
        String[] actual = posterManager.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }


    @Test
    public void shoulLastFilmsWithLimitIfMoreLimit() {
        PosterManager posterManager = new PosterManager(4);
        posterManager.add("Movie 1");
        posterManager.add("Movie 2");
        posterManager.add("Movie 3");
        posterManager.add("Movie 4");
        posterManager.add("Movie 5");
        posterManager.add("Movie 6");

        String[] expected = {"Movie 6", "Movie 5", "Movie 4", "Movie 3"};
        String[] actual = posterManager.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldLastFilmsWithLimit() {
        PosterManager posterManager = new PosterManager(6);
        posterManager.add("Movie 1");
        posterManager.add("Movie 2");
        posterManager.add("Movie 3");
        posterManager.add("Movie 4");
        posterManager.add("Movie 5");
        posterManager.add("Movie 6");

        String[] expected = {"Movie 6", "Movie 5", "Movie 4", "Movie 3", "Movie 2", "Movie 1"};
        String[] actual = posterManager.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }
}