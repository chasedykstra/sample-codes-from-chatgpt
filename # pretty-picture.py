# pretty-picture.py
import turtle

tess = turtle.Turtle()
wn = turtle.Screen()

tess.speed(10)
tess.pensize(2)
tess.color('white')
wn.bgcolor('black')

def drawSquare(t, sz):
    for i in range(4):
        t.fd(sz)
        t.left(90)

def drawGrid(t, sz):
    for i in range(4):
        drawSquare(t, sz)
        t.left(90)

def main():
    for i in range(5):
        drawGrid(tess, 100)
        tess.left(18)

main()

