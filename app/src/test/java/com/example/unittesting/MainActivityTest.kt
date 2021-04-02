package com.example.unittesting

import org.junit.Assert
import org.junit.Test

class MainActivityTest {


    @Test
    fun emailIsEmpty() {
        val email = MainActivity().emailIsEmpty("")
        Assert.assertTrue(email)
    }

    @Test
    fun testisValidate() {
        val result = MainActivity().isValidate("abc@gmail.com")
        Assert.assertTrue(result)
    }

    @Test
    fun testEmailContainDot() {
        val result = MainActivity().emailContainDot("abc@gmail.com")
        Assert.assertTrue(result)
    }

    @Test
    fun testEmailstartsWith() {
        val result = MainActivity().emailContainDot("abc@gmail.com")
        Assert.assertTrue(result)
    }
}