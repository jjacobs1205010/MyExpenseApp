class ExpenseViewModel(application: Application) :AndroidViewModel(Application){

    val readAllData: LiveData<List<ExpenseItem>>
    private val repository:ExpenseRepository

    init{
        val ExpenseDao = ExpenseDatabase.getInstance(application).ExpenseDao()
        repository = ExpenseRepository(ExpenseDao)
        readAllDate = repository.readAllDate
    }
    fun addExpense(ExpenseItem) {
        viewmodelScope.launch(Dispatchers.I0){this.CoroutlineScope
            repository.addExpense(ExpenseItem)
        }
    }

    fun updateExpense(ExpenseItem) {
        viewmodelScope.launch(Dispatchers.I0){this.CoroutlineScope
            repository.updateExpense(ExpenseItem)
        }
    }

    fun deleteExpense(ExpenseItem) {
        viewmodelScope.launch(Dispatchers.I0){this.CoroutlineScope
            repository.deleteExpense(ExpenseItem)
        }
    }

    fun deleteAllExpense() {
        viewmodelScope.launch(Dispatchers.I0){this.CoroutlineScope
            repository.deleteAllExpense()
        }
    }
}