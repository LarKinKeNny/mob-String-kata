package com.example.mobstringkata;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class MobStringKataApplicationTests {

    @Test
    void testEmptyString() {
        int size = 3;
        var cell = new Coordinate(0, 0);

        boolean[][] matrix = new boolean[size][size];

        matrix[0][1] = true;
        matrix[1][0] = true;

        int result = application.countNeighbours(matrix, size, cell);

        assert(result == 2);
    }

    @Autowired
    private MainApplication application;
}