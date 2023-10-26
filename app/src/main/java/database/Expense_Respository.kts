class ExpenseRepository(private val ExpenseDatabaseDao) {
    valreadAllData :LiveData<List<ExpenseItem> = ExspenseDatabaseDao.getAll()

    suspend fun addExpense(ExpenseItem:ExpenseItem){
        ExpenseDatabaseDao.insert(ExpenseItem)
    }

    suspend fun updateExpense(ExpenseItem:ExpenseItem){
        ExpenseDatabaseDao.update(ExpenseItem)
    }

    suspend fun deleteExpense(ExpenseItem:ExpenseItem){
        ExpenseDatabaseDao.delete(ExpenseItem)
    }
    suspend fun deleteAllExpense(){
        ExpenseDatabaseDao.deleteAllExpense()
    }

}