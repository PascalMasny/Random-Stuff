import sqlite3

db_file = "my_db.db"

try:
    conn = sqlite3.connect(db_file)
    print("Opened database successfully")

except:
    print("Error: Unable to open database")