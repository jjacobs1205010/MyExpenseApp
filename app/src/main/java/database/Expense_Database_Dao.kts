@Dao
interface ExpenseDatabaseDao {
    @Query( value: "SELECT * from my_expense_tracker_app")

    @Query( value: "SELECT * from my_expense_tracker_app where itemId = :id")
    fun getAll(): LiveData<List<ExpenseItem?

    @Insert
    suspend fun insert(item:ExpenseItem)

    @Update
    suspend fun update(item:ExpenseItem)

    @Delete
    suspend fun delete(item:ExpenseItem)

    @Query( value: "DELETE FROM my_expense_tracker_app")
    suspend fun deleteAllExpenses(item:ExpenseItem)

}