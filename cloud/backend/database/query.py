import database.csv_csql as csv_csql

def get_temp():
    try:
        cursor = csv_csql.openDb()
        cursor.execute('''SELECT temp 
    FROM (SELECT id,temp FROM weather_data 
    ORDER BY id DESC LIMIT 12) t
    ORDER BY id ASC
    ''')
        out = cursor.fetchall()
        csv_csql.closeDb()
        temp = []
        for data in out:
            for contain in data:
                temp.append(contain)
        return temp
    except:
        return []


def get_hum():
    try:
        cursor = csv_csql.openDb()
        cursor.execute(
            '''SELECT hum 
    FROM (SELECT id,hum FROM weather_data 
    ORDER BY id DESC LIMIT 12) t
    ORDER BY id ASC
    ''')
        out = cursor.fetchall()
        csv_csql.closeDb()
        hum = []
        for data in out:
            for contain in data:
                hum.append(contain)
        return hum
    except:
        return []


def get_rain():
    try:
        cursor = csv_csql.openDb()
        cursor.execute(
            '''SELECT rain 
    FROM (SELECT id,rain FROM weather_data 
    ORDER BY id DESC LIMIT 12) t
    ORDER BY id ASC
    ''')
        out = cursor.fetchall()
        csv_csql.closeDb()
        rain = []
        for data in out:
            for contain in data:
                rain.append(contain)
        return rain
    except:
        return []


def get_shine():
    try:
        cursor = csv_csql.openDb()
        cursor.execute(
            '''SELECT shine 
    FROM (SELECT id,shine FROM weather_data 
    ORDER BY id DESC LIMIT 12) t
    ORDER BY id ASC
    ''')
        out = cursor.fetchall()
        csv_csql.closeDb()
        shine = []
        for data in out:
            for contain in data:
                shine.append(contain)
        return shine
    except:
        return []
