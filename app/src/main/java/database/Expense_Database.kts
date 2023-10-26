Databae(entities = [ExpenseItem::class], version = 1, exportSchema = false)
abstract class ExspenseDatabase : RoomDatabase() {
    abstract fun ExpenseDao(): ExpenseDatabaseDao

    companion object{
        private var INSTANCE: ExpenseDatabase? = null

        fun getInstance(context: Context): Expensedatabase {
            synchronized(lock: this){
                var instance = INSTANCE

                if (instance ==null){
                    instance = Room.databaseBuilder(
                            context.applicationContext,
                            ExpenseDatabase::class.java,
                            name:"expense_database"
                    ).fallbackToDestructiveMigration()
                    .build()

                    INSTANCE = instance

                }
                return instance
            }
        }
    }


}