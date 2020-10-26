package com.zyh.day07;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MarketEmployeeTest {

    @org.junit.jupiter.api.Test
    void getSalary() {
        //上转型对象
        BaseEmployee be = new MarketEmployee("admin");
        assertEquals(3000,be.getSalary());
    }

    @Test
    void print() {
    }
}