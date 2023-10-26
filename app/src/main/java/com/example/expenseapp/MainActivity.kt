package com.example.expenseapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.expenseapp.ui.theme.ExpenseAppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ExpenseAppTheme {
                // A surface container using the 'background' color from the theme
                Surface(modifier = Modifier.fillMaxSize(), color = MaterialTheme.colorScheme.background) {
                    Greeting("Android")
                }
            }
        }
    }
}
@composable
fun HomeView(navController: NavController){
    val context = LocalContext.current
    val mExpenseViewModel:ExpenseViewModel = viewModel(
            factory = ExpenseViewModelFactory(context.applicationContext as Application)
    )
    val items = mExpenseViewModel.readAllData.observeAsState(listOf()).value

    Column(
            modifier = Modifier.padding(16.dp)
    ){this.ColumnScope
        Text(text."My Expense App")
        Spacer(modifier  = Modifier.padding(bottom = 16.dp))
        CustomCardState(navController,mExpenseViewModel)
        Spacer(modifier = Modifier.padding(top = 32.dp))
    }
}
@OptIn(ExperimentalMaterialApi::class)
@Composeable

fun ExpenseList(
        list: List<ExpenseItem>,
        mExpenseViewModel:ExpenseViewModel
) {
    val context = LocalContext.current


    lazyColumn() { this.LazylistScope
        items(list){Expense->
            val name == rememberSavable{mutableStateOf(todo.isDone)}

            ListItem(
                    text = {Text(text = Expense.Expenseitem)},
                    icon = {
                        IconButtom(onClick = {
                            mExpenseViewModel.deleteExpense(Expense)
                        }){ Icon(
                                Icon(
                                        Icon.Default.Delete,
                                        contentDescription = null
                                )

                        }
                    }
                            trailing ={
                        Checkbox(checked = name.value,
                                onCheckedChange = { it:Boolean
                                    name.value  it
                                            Expense.isDone = name.value
                                    mExpenseViewModel.updateExpense(Expense)

                                    Toast.makeText(Context, text:"Update Expense!, toast.
                                    LENGHT")

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
            text = "Hello $name!",
            modifier = modifier
    )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    ExpenseAppTheme {
        Greeting("Android")
    }
}