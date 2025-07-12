# Online Book Store

A Java-based book inventory management system that allows handling different types of books and processing purchase orders.

## Overview

This project implements a digital bookstore system that can manage various types of books including:
- eBooks
- Paper Books
- Demo Books

## Features

- **Book Management**
  - Add different types of books to inventory
  - Support for multiple book formats (Paper books, eBooks)
  - Each book contains:
    - Title
    - ISBN
    - Publication Year
    - Price
    - Format-specific details.

- **Purchase Processing**
  - Buy books using customer information
  - Process multiple quantities
  - Handle delivery addresses
  - Validate stock availability
  - Check e-mails for eBooks

- **Inventory Management**
  - Remove outdated books based on year
  - Track book quantities

## Example Usage 
 ```Java
   inventory inv = new inventory();
        inv.addBook(new demoBook("oop c++Grokking Algorithms", "1234567890", 2023, 0.0));
        inv.addBook(new EBook("DSA for beginner", "0987654321", 2022, 9.99, "PDF"));
        inv.addBook(new paperBook("Grokking Algorithms", "1122334455", 2020, 19.99,64));
        inv.addBook(new paperBook("CP algorithm", "2233445566", 2010, 14.99,128));
        inv.buyBook("1234567890", 2,"s7s@fawry", "123 Main St");
        inv.buyBook("0987654321", 1,"s7s@fawry", "456 Elm St");
        inv.buyBook("0987654321", 2,"s7s@fawry", "456 Elm St");
        inv.buyBook("1122334455", 3,"s7s@fawry", "789 Oak St");
        inv.buyBook("1122334455", 70,"s7s@fawry", "79 ak St");
        inv.removeOutDate(2025,3);
```
 ## Example Output : 
<img width="1671" height="247" alt="image" src="https://github.com/user-attachments/assets/bcf47a2e-e07e-43e6-b7a9-2929a8d5e2bd" />
