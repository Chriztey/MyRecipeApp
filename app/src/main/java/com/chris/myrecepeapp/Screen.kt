package com.chris.myrecepeapp

sealed class Screen (val route: String) {
    object RecipeScreen:Screen("recipeScreen")
    object DetailScreen:Screen("detailScreen")

}