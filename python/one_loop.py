def one_loop(l: list) -> bool:
    for i in range(len(l)):
        for j in range(i + 1, len(l)):
            if l[i] == l[j]:
                return True  # Duplicate found
    return False  # No duplicates found

if __name__ == "__main__":
    print(one_loop([1, 2, 3, 4]))  # No Duplicates
    print(one_loop([1, 2, 3, 4, 2])) # Duplicates
