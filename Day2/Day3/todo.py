todo_list = []


def add_todo():
    todo = input("Enter a to-do item: ")
    todo_list.append(todo)
    print(f'To-do "{todo}" added.')

def remove_todo():
    todo = input("Enter the to-do item to remove: ")
    if todo in todo_list:
        todo_list.remove(todo)
        print(f'To-do "{todo}" removed.')
    else:
        print(f'To-do "{todo}" not found.')

def get_all_todos():
    return todo_list

def menu():
    while True:
        print("\nTo-Do List Menu:")
        print("1. Add a to-do")
        print("2. Remove a to-do")
        print("3. View all to-dos")
        print("4. Exit")
        choice = input("Enter your choice (1-4): ")

        if choice == '1':
            add_todo()
        elif choice == '2':
            remove_todo()
        elif choice == '3':
            print("Current to-dos:", get_all_todos())
        elif choice == '4':
            print("Exiting the to-do list program.")
            break
        else:
            print("Invalid choice. Please enter a number between 1 and 4.")


menu()