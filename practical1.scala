def area(r:Double):Double=math.Pi*r*r

def faren(c:Double):Double=(c*1.8)+32

def volume(r:Double):Double=4/3*math.Pi*r*r*r

def bookPrice(x:Int):Double=x*24.95
def dicount(amount:Double):Double=amount*0.4
def shipcost(n:Int):Double=3*n+(n-50)*0.75
def totalCost(n:Int):Double=bookPrice(n)-dicount(n)+shipcost(n)

def easy(x:Int):Double=x*8
def tempo(x:Int):Double=x*7

