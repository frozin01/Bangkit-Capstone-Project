import pandas
import mysql.connector
from mysql.connector.constants import ClientFlag

config = {
    'user': 'root',
    'password': '?????',
    'host': '0.0.0.0',
    'client_flags': [ClientFlag.SSL],
    'ssl_ca': 'database/ssl/server-ca.pem',
    'ssl_cert': 'database/ssl/client-cert.pem',
    'ssl_key': 'database/ssl/client-key.pem',
    'database': 'weather'
}

# config = {
#     'user': 'root',
#     'password': '',
#     'host': 'localhost',
#     'database': 'test'
# }

conn = cursor = None

def openDb():
    global conn, cursor
    conn = mysql.connector.connect(**config)
    cursor = conn.cursor()
    return cursor


def closeDb():
    global conn, cursor
    cursor.close()
    conn.close()


def createTable():
    openDb()
    cursor.execute('CREATE TABLE weather_data (id int, tahun int, bulan int, temp float, hum float, rain float, shine float)')
    # Id, Tahun, Bulan, temp, hum, rain, shine
    closeDb()

def dropTable():
    openDb()
    try:
        cursor.execute('DROP TABLE weather_data')
    except:
        pass
    closeDb()

def convertInsert():
    data =  pandas.read_csv(r'database/csv/database-r1.csv')
    dataFrame = pandas.DataFrame(data, columns=['tahun', 'bulan', 'temp', 'hum', 'rain', 'shine'])
    
    openDb()
    for row in dataFrame.itertuples():
        if (len(str(row.bulan))<2):
            id_schedule = int(str(row.tahun)+"0"+str(row.bulan))
        else:
            id_schedule = int(str(row.tahun)+str(row.bulan))
        cursor.execute('''
                INSERT INTO weather_data (id, tahun, bulan, temp, hum, rain, shine)
                VALUES (%s, %s, %s, %s, %s, %s, %s)
                ''',
                (id_schedule, row.tahun, row.bulan, row.temp, row.hum, row.rain, row.shine)
                )
    conn.commit()
    closeDb()
    
# dropTable()
# createTable()
# convertInsert()
