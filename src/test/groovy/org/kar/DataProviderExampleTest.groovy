package org.kar

import groovy.util.GroovyTestCase
import org.testng.annotations.Test
import org.testng.annotations.DataProvider
import org.testng.Assert

/**
 * Tests demonstrating use of TestNG DataProvider.
 */
class DataProviderExampleTest
{
    @DataProvider (name = "test1")
    public Object[][] createListInjectData()
    {
        def array = new Object[3][]
        array[0] = [[1, 2, 3], 6] as Object[]
        array[1] = [[2, 4, 6], 12] as Object[]
        array[2] = [[3, 6, 9], 18] as Object[]
        return array
    }

    @Test (dataProvider = "test1")
    void testListInjectSummation(list, expectedSum)
    {
        Assert.assertEquals(new ListInjectExample().sum(list), expectedSum)
    }
}
