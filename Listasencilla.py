class Nodo:
    def __init__(self, dato):
        self.siguiente = None
        self.info = dato

    def verNodo(self):
        return self.info

class Lista:

    def __init__(self):
         self.primero = None

    def vacia(self):
        if self.primero==None:
            return True
        else:
            return False

    def InsertarprimerNodo(self, dato):
        temporal=Nodo(dato)
        temporal.siguiente=self.primero
        self.primero=temporal

    def listar(self):
        print("...........")
        temporal=self.primero
        while temporal!=None:
            print(temporal.verNodo(), end= '')
            temporal = temporal.siguiente

    def borrarPrimero(self):
        if self.vacia()==False:
            self.primero=self.primero.siguiente

    def borrarUltimo(self):
        anterior=self.primero
        actual=self.primero
        while actual.siguiente!=None:
            anterior=actual
            actual=actual.siguiente
            anterior.siguiente=None

    listas = Lista()
    listas.InsertarprimerNodo(5)
    listas.InsertarprimerNodo(10)
    listas.InsertarprimerNodo(15)
    listas.InsertarprimerNodo(20)
    listas.InsertarprimerNodo(25)
    listas.listar()
    listas.borrarUltimo()
    listas.listar()


    
