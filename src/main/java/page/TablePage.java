package page;

import java.util.Collections;
import java.util.List;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;
import static org.testng.AssertJUnit.assertEquals;

public class TablePage {

    private TablePage sorting() {

        List<String> expectedSorting = $$("#table2 > tbody .first-name").texts();
        Collections.sort(expectedSorting);

        return this;
    }


    private TablePage sortHeaderAscending() {

        $("#table2 tr th:nth-child(2)").click();

        return this;
    }

    public TablePage assertResult() {
        sorting();
        sortHeaderAscending();
        List<String> actualSort = $$("#table2 > tbody .first-name").texts();
        List<String> expectedSorting = $$("#table2 > tbody .first-name").texts();

        assertResultHaveTheSameSorting(expectedSorting, actualSort);


        return this;
    }

    private TablePage assertResultHaveTheSameSorting(List<String> firstNameColumnExpectedSort,
                                                     List<String> firstNameColumnActualSort) {
        assertEquals(firstNameColumnExpectedSort, firstNameColumnActualSort);
        return this;
    }

    public TablePage sortHeaderDescending() {

        $("#table2 tr th:nth-child(2)").click();
        List<String> expectedSorting = $$("#table2 > tbody .first-name").texts();
        Collections.reverse(expectedSorting);
        List<String> actualDescendingSort = $$("#table2 > tbody .first-name").texts();
        assertResultHaveTheSameSorting(expectedSorting, actualDescendingSort);

        return this;
    }


}
