package org.kar

/**
 * ListInjectExample Groovy class.
 */
class ListInjectExample
{
    /**
     * Use the Groovy added List.inject() method to sum a list of numbers.
     */
    def sum(list)
    {
        def sum = list.inject(0) { sum, item -> sum + item } 
    }
}
