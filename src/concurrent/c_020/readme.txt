1. voaltile 与 synchronized

2.CountDownLatch 门闩 await() countDown();

3.ReentrantLock 重入锁 手动释放锁 设置公平锁
  synchronized 会自动释放锁 ReentrantLock必须手动释放

   Lock lock = new ReentrantLock();
    lock.lock();
    lock.unlock();

4. Condition的方式可以更加精确的指定哪些线程被唤醒
Lock lock = new ReentrantLock();
接口  Condition condtion = lock.newCondition();
      conditon.await(); condition.signalAll();

5. ThreadLock  局部线程

6.单列
7.Vector 线程安全  每个方法都是原子性的 但是两个方法之间不存在原子性

8. Queue 队列 ConcurrentLinkedQueue() 并发的类

9.对于map/set的选择使用
HashMap
TreeMap
LinkedHashMap

Hashtable
Collections.sychronizedXXX

ConcurrentHashMap
      锁的粒度变小了 HashTable锁的正个hash表,ConcurrentHashMap--锁桶,默认分为16个桶,可同时16个线程写入,读取不需要上锁。
      http://xuganggogo.iteye.com/blog/321630
ConcurrentSkipListMap
      http://blog.csdn.net/sunxianghuang/article/details/52221913
      http://www.educity.cn/java/498061.html


10.队列
ArrayList
LinkedList
Collections.synchronizedXXX
CopyOnWriteArrayList   写时效率低，读时效率高  适合写少读多的环境
Queue
	CocurrentLinkedQueue //concurrentArrayQueue
	BlockingQueue
		LinkedBQ
		ArrayBQ
		TransferQueue
		SynchronusQueue
	DelayQueue执行定时任务