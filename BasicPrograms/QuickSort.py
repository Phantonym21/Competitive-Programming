"""Implement quick sort in Python.
Input a list.
Output a sorted list."""
def quicksort(array):   
    a =array
    def partition(l,h):
        p = l
        i = l;
        j = h;
        while(i<j):
            while(a[i]<=a[p]):
                print(a[i],a[p])
                i+=1
            while(a[j]>a[p]):
                j-=1
            if(i<j):
                temp = a[i]
                a[i] = a[j]
                a[j] = temp
        temp = a[p]
        a[p] = a[j]
        a[j] = temp
        return j
    
    def qsort(l,h):
        if l<h:
            pivot = partition(l,h)
            qsort(l,pivot-1)
            qsort(pivot+1,h)
    start = 0
    end = len(array)-1
    qsort(start,end)
    return a
    
    

test = [22, 4, 1, 3, 21, 20, 25, 6, 21, 14]
print quicksort(test)