# 30-Day Java Backend Developer Roadmap (6 hrs/day)

**Goal:** Basic → Advanced in OOP, DSA, Collections, Multithreading, JDBC, SQL, Spring Boot, REST APIs — plus the extra skills that actually move the needle in interviews.

## How each day is structured (6 hrs)
| Block | Time | Focus |
|---|---|---|
| 1 | 2 hr | Theory / concept study (read + take notes) |
| 2 | 2 hr | Hands-on coding — implement what you just learned |
| 3 | 1 hr | DSA problem-solving (daily, non-negotiable) |
| 4 | 1 hr | Revision + flashcards + write a short summary in your own words |

> Rule: **DSA every single day**, even on "Spring Boot days." Consistency on DSA is what separates people who clear interviews from people who don't.

---

## Week 1 — Java Core, OOP Deep Dive, Collections

| Day | Theory (2h) | Coding (2h) | DSA (1h) | Notes |
|---|---|---|---|---|
| 1 | Java basics recap: JVM/JRE/JDK, memory model (stack/heap), data types, operators | Write programs using all data types, type casting, simple I/O | Arrays basics: traversal, rotation, max/min | Set up IntelliJ + GitHub repo "java-backend-journey" |
| 2 | OOP Pillar 1&2: Encapsulation, Abstraction (abstract class vs interface) | Build a small "Library Management" mini-model with encapsulated classes | Arrays: two-pointer problems | |
| 3 | OOP Pillar 3&4: Inheritance, Polymorphism (compile-time vs runtime) | Extend Library model with inheritance hierarchy (Book, EBook, AudioBook) | Strings: reverse, palindrome, anagram check | |
| 4 | OOP advanced: composition vs inheritance, `this`/`super`, constructors, static vs instance | Refactor yesterday's model to use composition where it fits better | Strings: substring problems | |
| 5 | SOLID principles (S, O, L, I, D) with real code smells → fixes | Refactor Library model to follow SOLID | Sliding window pattern intro | |
| 6 | Collections Framework I: List (ArrayList vs LinkedList), Set (HashSet, TreeSet, LinkedHashSet) — internal working | Benchmark ArrayList vs LinkedList insert/delete/access | Sliding window: max subarray sum | |
| 7 | Collections Framework II: Map (HashMap internals — buckets, hashing, treeification since Java 8), TreeMap, Comparable vs Comparator | Implement custom `equals()`/`hashCode()` and use objects as HashMap keys | **Weekly mock test:** 5 mixed problems, timed | Review week, identify weak spots |

---

## Week 2 — DSA Intensive + Multithreading + Exception Handling

| Day | Theory (2h) | Coding (2h) | DSA (1h) | Notes |
|---|---|---|---|---|
| 8 | Big-O notation, time/space complexity analysis (do this properly — it's asked in every interview) | Analyze complexity of your Week 1 code | Recursion basics: factorial, fibonacci, backtracking intro | |
| 9 | DSA: Stack & Queue (theory + use cases) | Implement Stack/Queue from scratch (array + linked list based) | Problems: valid parentheses, next greater element | |
| 10 | DSA: Linked List (singly, doubly, circular) | Implement full LinkedList class (add/remove/reverse) | Reverse linked list, detect cycle (Floyd's) | |
| 11 | DSA: Trees (Binary Tree, BST) — traversals (in/pre/post/level order) | Implement BST with insert/delete/search | Height of tree, LCA, validate BST | |
| 12 | DSA: Heaps & Priority Queue, Tries (intro) | Implement min-heap; use `PriorityQueue` in Java | Kth largest element, top-K frequent | |
| 13 | **Multithreading I:** Process vs Thread, Thread lifecycle, creating threads (`Thread` vs `Runnable`), `synchronized`, race conditions | Write producer-consumer using `synchronized`/`wait-notify` | Graph basics: BFS/DFS | |
| 14 | **Multithreading II:** Executor Framework, `ExecutorService`, Thread Pools, `Callable`/`Future`, `CompletableFuture` | Rebuild producer-consumer using `ExecutorService` + `BlockingQueue` | Weekly mock test | Review week |

---

## Week 3 — Multithreading Advanced, JDBC, SQL, Exception Handling, Java 8+

| Day | Theory (2h) | Coding (2h) | DSA (1h) | Notes |
|---|---|---|---|---|
| 15 | **Multithreading III:** `volatile`, `Atomic` classes, `ReentrantLock`, `ReadWriteLock`, deadlock/livewlock/starvation & how to avoid them | Fix a deliberately deadlocked program; implement thread-safe counter 3 ways | Graph: shortest path (Dijkstra intro) | |
| 16 | **Multithreading IV:** Concurrent Collections (`ConcurrentHashMap`, `CopyOnWriteArrayList`), `CountDownLatch`, `Semaphore`, `CyclicBarrier` | Build a simple multi-threaded file/word-counter using concurrent collections | Graph problems continued | Multithreading is interview-heavy — redo Day 13-16 problems from memory |
| 17 | SQL I: DDL/DML/DCL/TCL, joins (inner/outer/left/right/self), subqueries | Practice 15-20 SQL queries on a sample DB (use SQLite/MySQL) | DP intro: memoization vs tabulation | Install MySQL/PostgreSQL locally |
| 18 | SQL II: Indexing (B-Tree), normalization (1NF-3NF), aggregate functions, GROUP BY/HAVING, window functions | Write optimized queries with `EXPLAIN` plan analysis | DP: knapsack, coin change | |
| 19 | SQL III: Transactions, ACID properties, isolation levels, locking | Simulate a transaction with rollback; explain isolation level differences with examples | DP: LCS, LIS | |
| 20 | JDBC: Connection, Statement/PreparedStatement/CallableStatement, ResultSet, connection pooling (HikariCP) | Build a console CRUD app connecting Java to MySQL via JDBC | DP practice continued | This is your bridge into Spring Data JPA next week |
| 21 | Java 8+ essentials: Lambdas, Streams API, Optional, functional interfaces, method references | Rewrite Collections exercises from Week 1 using Streams | Weekly mock test | Review week |

---

## Week 4 — Spring Boot, REST APIs, Optimization, System Design Basics, Interview Prep

| Day | Theory (2h) | Coding (2h) | DSA (1h) | Notes |
|---|---|---|---|---|
| 22 | Spring Core: IoC, DI, Bean lifecycle, `@Component`/`@Autowired`/`@Configuration` | Set up first Spring Boot project (Spring Initializr) | Mixed problem set (arrays+strings) | |
| 23 | Spring Boot: layered architecture (Controller-Service-Repository), Spring Data JPA, `@Entity`/`@Repository` | Build CRUD REST API for "Employee Management" with JPA + MySQL | Mixed problems | |
| 24 | REST API design: HTTP methods/status codes, REST maturity model, DTOs, request validation (`@Valid`) | Add validation, exception handling (`@ControllerAdvice`), pagination & sorting to your API | Mixed problems | |
| 25 | Spring Security basics: authentication vs authorization, JWT, filters | Secure your Employee API with JWT-based login | Trees/Graphs revision | |
| 26 | Optimization techniques: N+1 query problem, caching (`@Cacheable`), lazy vs eager loading, connection pool tuning, JVM tuning basics (GC overview) | Apply caching + fix an N+1 issue in your project; add pagination properly | DP revision | |
| 27 | Testing & tooling: JUnit 5, Mockito, writing unit + integration tests; intro to Docker (containerize your app) | Write test suite for your Employee API; Dockerize it | Revision of weak-area DSA topics | |
| 28 | System design basics: monolith vs microservices, load balancing, caching layers, message queues (Kafka/RabbitMQ overview), CAP theorem | Diagram + explain design for a "URL Shortener" or "Rate Limiter" (whiteboard-style, no need to fully build) | Full mock DSA test (timed, 3 problems) | |
| 29 | Mock technical interview day: OOP + Multithreading + SQL rapid-fire Q&A (use ChatGPT/Claude or a friend to grill you) | Polish your capstone project README, add proper Git commit history, deploy to Render/Railway | Solve 3 random past problems cold | |
| 30 | Resume + LinkedIn polish, behavioral question prep (STAR method), final full revision pass across all topics | Push final project to GitHub with clean README + architecture diagram | Light review only — rest your brain | You're interview-ready |

---

## What to add beyond your list (these matter a lot for getting hired)

1. **Git & GitHub** — daily commits, meaningful messages, a clean profile with pinned repos. Recruiters check this.
2. **One capstone project** — the Employee Management API you build in Week 4 should end up production-flavored: validation, security, tests, Docker, deployed live link. This is your strongest interview talking point.
3. **Design Patterns** — Singleton, Factory, Builder, Strategy, Observer. Weave these in during Week 1 (OOP) and Week 4 (Spring uses them everywhere).
4. **System design fundamentals** — even basic-level (Day 28) helps enormously for mid-level roles; Spring Boot devs are increasingly asked "how would you scale this."
5. **Communication practice** — being able to explain HashMap internals or a deadlock fix out loud, clearly, is often worth more than knowing it silently. Practice explaining daily during your revision hour.
6. **Version-control your notes** — keep a `NOTES.md` per topic in your GitHub repo. This becomes a personal wiki you can review before any interview, and it's proof of consistent learning if a recruiter looks at your GitHub activity graph.
7. **Curated problem count target** — aim for roughly 45-55 DSA problems by the end of the month (the daily 1-hr slots above already build to this) covering arrays, strings, linked lists, trees, graphs, DP, and heaps — that's the common interview spread, not just volume for its own sake.

## Consistency tactics (so you actually finish this)
- **Same time block every day.** Even if 6 hours means splitting morning/evening, keep the DSA hour fixed — it's the easiest to skip and the most important to protect.
- **Public accountability:** commit code to GitHub daily, even one line — the green squares are a strong personal motivator.
- **Weekly checkpoint (Days 7, 14, 21):** a timed mixed-problem test. If you score poorly, use the next day's revision hour to patch the gap rather than moving on blind.
- **Don't chase 100% theory mastery before coding.** Theory block → immediately apply in coding block, same day, always. That's how it sticks.
- **If you miss a day:** don't try to "double up" the next day — just resume the plan where you left off and let the weekly checkpoint absorb the slack.
