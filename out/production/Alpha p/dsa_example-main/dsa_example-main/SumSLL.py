import LinkedList
from LinkedList import LinkedList

def sumList(llA,llB):
    n1=llA.head
    n2=llB.head
    carry=0
    ll=LinkedList()
    while n1 or n2:
        result=carry
        if  n1:
            result+=n1.value
            n1=n1.next
        if n2:
            result+=n2.value
            n2=n2.next
        ll.add(int(result%10))
        carry=result/10
    return ll

llA=LinkedList()
llA.add(2)
llA.add(3)
llA.add(5)

llB=LinkedList()
llB.add(9)
llB.add(4)
llB.add(6)
llB.add(7)

print(llB)
print(llA)

print(sumList(llA,llB))
