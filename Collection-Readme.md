````                            Iterable (Interface) [Java 1.2]
                                      ↑
                             Collection (Interface) [Java 1.2]
           ___________________________|___________________________
          |                           |                           |
   List (I) [Java 1.2]         Queue (I) [Java 1.5]        Set (I) [Java 1.2]
          |                           |                            |
  ________|________             Deque (I) [Java 1.6]       ________|________
  |        |        |                 |                   |                 |
  Array  Linked   Vector [1.0]   LinkedList (C) [1.2]   HashSet (C) [1.2]   SortedSet (I) [1.2]
  List   List                         |                   |                 |
  (1.2)  (1.2)                        |                   |             TreeSet (C) [1.2]
  |                    ArrayDeque (C) [1.6]  LinkedHashSet (C) [1.4]
  Stack (C) [1.0]

(C) = Class, (I) = Interface
↑ / | = inheritance/implementation direction
[version] = Introduced in Java version
````

# Collection (I)
### base methods of collection

- add(Object c);
- addAll(Collection c);

# list(I)
### by default list interaface also contain some methods
