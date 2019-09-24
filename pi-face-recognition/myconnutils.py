import pymysql.cursors  
 
# La fonction renvoie une connexion.
def getConnection():
     
    # Vous pouvez changer les arguments de la connexion.
    connection = pymysql.connect(host='192.168.1.22',
                                 user='seck',
                                 password='ckk',                             
                                 db='gestionabsences',
                                 charset='utf8mb4',
                                 cursorclass=pymysql.cursors.DictCursor)
    return connection