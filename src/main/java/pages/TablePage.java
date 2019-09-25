package pages;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;

import java.util.Collections;
import java.util.List;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;
import static org.testng.AssertJUnit.assertEquals;

/**
 * The type Table page.
 */
public class TablePage {

    /**
     * The private ElementsCollection.
     */
    private final transient ElementsCollection sortingElements = $$("#table2 > tbody .first-name");

    /**
     * The private SelenideElement.
     */
    private final transient SelenideElement header = $("#table2 tr th:nth-child(2)");


    /**
     * The type Table page.
     */
    public TablePage() {
        super();
        //empty
        return;
    }

    /**
     * The method sorting.
     *
     * @return this.
     */
    private TablePage sorting() {

        final List<String> expectedSorting = sortingElements.texts();
        Collections.sort(expectedSorting);

        return this;
    }


    /**
     * Method sortHeaderAscending.
     *
     * @return this.
     */
    private TablePage sortHeaderAscending() {

        header.click();

        return this;
    }

    /**
     * Assert result table page.
     *
     * @return the table page.
     */
    public TablePage assertResult() {
        sorting();
        sortHeaderAscending();
        final List<String> actualSort = sortingElements.texts();
        final List<String> expectedSorting = sortingElements.texts();

        assertResultHaveTheSameSorting(expectedSorting, actualSort);


        return this;
    }

    /**
     * Sort header descending table page.
     *
     * @return the table page
     */
    public TablePage sortHeaderDescending() {

        header.click();
        final List<String> expectedSorting = sortingElements.texts();
        Collections.reverse(expectedSorting);
        final List<String> actualDescendingSort = sortingElements.texts();
        assertResultHaveTheSameSorting(expectedSorting, actualDescendingSort);

        return this;
    }

    private TablePage assertResultHaveTheSameSorting(final List<String> firstNameColumnExpectedSort,
                                                     final List<String> firstNameColumnActualSort) {
        assertEquals(firstNameColumnExpectedSort, firstNameColumnActualSort);
        return this;
    }
}
