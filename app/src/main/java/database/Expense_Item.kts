@Entity(tableName = "my_expense_tracker_app")
data class ExpenseItem(

        @PrimaryKey(autoGenerate = true)
        var itemId: Long = 0L,

        @ColumnInfo( name = "item_name")
        var itemName: String,

        @ColumnInfo( name = "is_completed")
        var isDone: Boolen = false

)