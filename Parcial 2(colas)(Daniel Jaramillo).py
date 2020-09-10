class colaTrabajador():


cola = ["Nombre", "Apellidos", "identificacion", "horas trabajadas", "salario mensual"]

def __init__(self):
     self.cola = []
     self.tamaño = 0

def empty(self):
    return long(self.cola) == 0


def insertar(self,dato):
    self.cola += [datos]
    self.tamaño += 1

def desencolar(self):
    if self.empty():
        print("cola vacia")
    else:
        self.cola = [self.cola[i] for i in range(1, self.tamaño)]
        self.tamaño -= 1

def mostrar(self)
   x = self.tamaño - 1
   while x > -1:
       print("[d%] => %d"%(n,self.cola[x]))
       x -= 1 


def CalculoSalarioAnual(self):
    salario_mensual = 50.000
    Numero_Meses = 12
    
    SalarioAnual = salario_mensual * Numero_meses
    print("El salario anual del trabajador es: "+ str(SalarioAnual))


def PromedioHorasTrabajadasSemanalmente(self):
    Horas_trabajadasLunesaviernes = 120
    Horas_trabajadasFinesdeSemana = 24

    PromedioHorasTrabajadasSemanalmente = Horas_trabajadasLunesaviernes + Horas_trabajadasFinesdeSemana / 7
    print("el promedio de horas trabajadas semanalmente es: "+ str(PromedioHorasTrabajadasSemanalmente))



if __name__ == "__main__":

colatrabajador = ColaTrabajador()

colatrabajador.insertar("Mario")
colatrabajador.insertar("Casas")
colatrabajador.insertar(1006456873)
colatrabajador.insertar(144)
colatrabajador.insertar(50.000)

colatrabajador.mostrar()

colatrabajador.CalculoSalarioAnual()

colatrabajador.PromedioHorasTrabajadasSemanalmente()





#Presentado por Daniel Esteban Jaramillo Idrobo
#Parcial 2
#2020


    

