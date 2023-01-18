

#https://www.hackerrank.com/challenges/nested-list/problem?isFullScreen=true

def printsecondlargestnames(namesscores):
    list.sort(namesscores)
    D = {}
    for x in namesscores:
        #print(x[1])
        if x[1] in D.keys():
            D[x[1]] = D[x[1]] + " " + x[0]
        else:
            D[x[1]] = x[0]
    D1 = sorted(D.keys(), reverse = True) #sorted(D.items())
    """
    print(D)
    print(D1)
    print(D1[1])
    print(D[D1[1]])
    """
    second_values = (D[D1[-2]]) #list(D.keys())[0]
    #print(second_values)
    values = second_values.split(" ")
    for i in values:
        print(i)

if __name__ == '__main__':
    names = []
    scores = []
    namesscores = []
    for _ in range(int(input())):
        name = input()
        score = float(input())
        namesscores.append([name,score])
        names.append(name)
        scores.append(score)
        
printsecondlargestnames(namesscores)
