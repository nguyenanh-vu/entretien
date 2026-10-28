from typing import Optional, List


class Node[T]:

    def __init__(self, value: Optional[T] = None) -> None:
        self.value: Optional[T] = value
        self.prev: Optional[Node[T]] = None
        self.next: Optional[Node[T]] = None


class LinkedList[T]:

    def __init__(self) -> None:
        self.length: int = 0
        self.head: Optional[Node[T]] = None
        self.tail: Optional[Node[T]] = None

    def __getitem__(self, index: int | slice) -> Optional[T] | List[Optional[T]]:
        if isinstance(index, int):
            if index >= self.length or index < -1:
                raise IndexError(index)
            elif index == -1 and self.tail is not None:
                return self.tail.value
            else:
                # TODO
                return None
        else:
            # TODO
            return None

    def __setitem__(self, index: int | slice, value: Optional[T] | List[Optional[T]] | tuple[Optional[T]]) -> None:
        # TODO
        raise IndexError()

    def __delitem__(self, index: int | slice) -> None:
        # TODO
        raise IndexError()

    def __len__(self) -> int:
        return self.length

    def __contains__(self, value: T) -> bool:
        # TODO
        return False

    def get_head_and_tail(self) -> tuple:
        return (self.head, self.tail)

    def as_list(self) -> List[T]:
        # TODO
        return []

    def append(self, value: T | List[Optional[T]] | tuple[Optional[T]]) -> None:
        # TODO
        if isinstance(value, List):
            pass
        elif isinstance(value, tuple):
            pass
        else:
            pass

    def push(self, value: T | List[Optional[T]] | tuple[Optional[T]]) -> None:
        # TODO
        if isinstance(value, List):
            pass
        elif isinstance(value, tuple):
            pass
        else:
            pass

    def insert(self, index: int, value: Optional[T]) -> None:
        # TODO
        pass

    def clear(self) -> None:
        # TODO
        pass

    def remove(self, value: T) -> None:
        # TODO
        # throws ValueError
        pass

    def pop(self, index: int = -1) -> None:
        # TODO
        pass

    def index(self, value: T, start: Optional[int] = None, stop: Optional[int] = None) -> None:
        # TODO
        # throws ValueError
        pass

    def count(self, value: T) -> int:
        # TODO
        return 0

    def reverse(self) -> None:
        # TODO
        pass
