from collections import deque

print("# Stack")
stack = deque()
stack.append(2)
stack.append(3)
stack.append(4)
print(stack)
print(stack.pop())
print(stack)

print("\n# Queue")
queue = deque()
queue.append(2)
queue.append(3)
queue.append(4)
print(queue)
print(queue.popleft())
print(queue)
