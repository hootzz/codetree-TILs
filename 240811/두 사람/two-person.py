Aage, Agender = map(str, input().split())
Bage, Bgender = map(str, input().split())

Aage = int(Aage)
Bage = int(Bage)

if (Agender == "M" and Aage >= 19) or (Bgender == "M" and Bage >= 19):
    print(1)
else: 
    print(0)