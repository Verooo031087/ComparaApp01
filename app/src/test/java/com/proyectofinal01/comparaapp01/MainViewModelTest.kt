package com.proyectofinal01.comparaapp01

import androidx.arch.core.executor.testing.InstantTaskExecutorRule
import org.junit.Before
import org.junit.Rule
import org.junit.Test
import org.junit.rules.TestRule

class MainViewModelTest {

    private lateinit var viewModel: MainViewModel

    @get:Rule
    var rule: TestRule = InstantTaskExecutorRule()

    @Before
    fun setUp() {
        viewModel = MainViewModel()
    }

    @Test
    fun testCompareStrings() {
        viewModel.compareStrings("Hola", "Hola")
        assert(viewModel.comparisonResult.value == "Las cadenas son iguales")

        viewModel.compareStrings("Hola", "Mundo")
        assert(viewModel.comparisonResult.value == "Las cadenas son diferentes")
    }
}
