package org.example.lesson41;

import org.example.lesson41.hasDuplicates;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@Nested
class HasDuplicatesTest {
    @Test
    public void shouldReturnTrueWhenListContainsDuplicates() {
        //given
        List<Integer> numbers = Arrays.asList(1, 2, 3, 2);
        //when
        boolean result = hasDuplicates.hasDuplicates(numbers);
        //then
        assertTrue(result);
    }
}









