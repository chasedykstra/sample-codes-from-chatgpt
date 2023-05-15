import tkinter as tk
import webbrowser

def open_etv_channel():
    webbrowser.open_new("https://www.youtube.com/@etvchannel")

root = tk.Tk()
root.title("Button Redirect")

button = tk.Button(root, text="epicness tv channel page", command=open_etv_channel)
button.pack()

root.mainloop()