package org.example.lesson_22

data class MainScreenState (val data: String = "", val isLoading: Boolean = false)

class MainScreenViewModel() {

    private var mainScreenState = MainScreenState()

    fun loadData() {
        println("Начальное состояние: $mainScreenState")
        mainScreenState = mainScreenState.copy(isLoading = true)

        println("Состояние при загрузке: $mainScreenState")

        mainScreenState = mainScreenState.copy(data = "Данные загружены", isLoading = false)
        println("Состояние после загрузки: $mainScreenState")
    }
}

fun main() {
    val viewModel = MainScreenViewModel()

    viewModel.loadData()
}