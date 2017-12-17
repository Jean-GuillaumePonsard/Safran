from tkinter import *

fenetre = Tk()
fenetre.minsize(width=640, height=320)
cadre = Frame(fenetre, width=768, height=576, borderwidth=1)
cadre.pack(fill=BOTH)

champ_label = Label(cadre, text="Safran Mother Base")
champ_label.pack(side="top", fill=X)

var_texte = StringVar()
ligne_texte = Entry(cadre, textvariable=var_texte, width=30)
ligne_texte.pack()

var_case = IntVar()
case = Checkbutton(cadre, text="Don't ask again", variable=var_case)
case.pack()

bouton_quitter = Button(cadre, text="Exit", command=fenetre.quit)
bouton_quitter.pack()

var_choix = StringVar()

choix_rouge = Radiobutton(cadre, text="Rouge", variable=var_choix, value="rouge")
choix_vert = Radiobutton(cadre, text="Vert", variable=var_choix, value="vert")
choix_bleu = Radiobutton(cadre, text="Bleu", variable=var_choix, value="bleu")

choix_rouge.pack()
choix_vert.pack()
choix_bleu.pack()

fenetre.mainloop()
