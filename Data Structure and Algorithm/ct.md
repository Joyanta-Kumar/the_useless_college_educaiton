# Data Structures Exam Notes

## (a) State some applications of linked list. Explain different types of linked list with pictorial view.

**Applications:**
- Dynamic memory allocation
- Implementation of stacks and queues
- Symbol table management in compilers
- Undo/redo functionality in text editors
- Representation of polynomial equations

**Types of Linked List:**

1. **Singly Linked List** – Each node contains data and a pointer to the next node.
```
[Data|Next] -> [Data|Next] -> NULL
```

2. **Doubly Linked List** – Each node has two pointers: one to the next node and one to the previous node.
```
NULL <- [Prev|Data|Next] <-> [Prev|Data|Next] -> NULL
```

3. **Circular Linked List** – Last node points back to the first node.
```
[Data|Next] -> [Data|Next] -> [Data|Next] --
     ^--------------------------------------|
```

---

## (b) Write some differences between linked list and array.

| **Aspect**           | **Array**                             | **Linked List**                          |
|-----------------------|---------------------------------------|-------------------------------------------|
| Memory allocation    | Contiguous (fixed size)              | Non-contiguous (dynamic size)             |
| Insertion/Deletion   | Costly (shifting needed)             | Easy (just change pointers)               |
| Access time          | O(1) random access                   | O(n) sequential access                    |
| Memory efficiency    | May waste memory (fixed allocation)  | Efficient, grows/shrinks dynamically      |
| Cache performance    | Better (contiguous)                  | Poorer (scattered in memory)              |

---

## (c) Briefly explain asymptotic notation.

Asymptotic notation describes the **growth rate of algorithms** as input size becomes very large. It ignores constant factors and lower-order terms, focusing only on efficiency trends.

- **Big-O (O)**: Upper bound (worst case). Example: O(n²).
- **Omega (Ω)**: Lower bound (best case). Example: Ω(n).
- **Theta (Θ)**: Tight bound (average case). Example: Θ(n log n).

---

## (d) Write an algorithm to perform the following operations

### i) Searching a node from a linked list
```
Algorithm SearchLinkedList(head, key)
1. Set temp = head
2. While temp ≠ NULL do
      if temp.data = key then
          return "Found"
      temp = temp.next
3. return "Not Found"
```

### ii) Create a Circular linked list
```
Algorithm CreateCircularList(n)
1. Initialize head = NULL, tail = NULL
2. For i = 1 to n do
      create newNode
      if head = NULL then
          head = newNode
          tail = newNode
      else
          tail.next = newNode
          tail = newNode
3. tail.next = head   // make it circular
4. return head
```
