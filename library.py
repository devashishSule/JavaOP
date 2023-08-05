class book:
    
    def __init__(self,name,author,price,copies):
        self.name= name
        self.author = author
        self.price  = price
        self.copies = copies
        
class library: 
    def ___init__(self):
        self.books_in_library=[]
    
    def add_book(self):
        print("Add a Book: ")
        name=input("\nEnter the name of the book: ")
        author=input("\nEnter the name of the author: ")
        price = float("\nEnter the price of the book: ")
        copies = int("\nNo. of copies: ")
        
        newBook=book(name,author,price,copies)
        self.books_in_library.append(newBook)
        
    def displayBooks(self):
        for i in range (len(self.books_in_library)):
            print("-----------------------")
            print("\nBook Name: {book.name}")
            print("\nBook Author: {book.author}")
            print("\nBook Price: {book.price}")
            print("\nBook Copies: {book.copies}")
    
    def search_book_by_name(self):
        