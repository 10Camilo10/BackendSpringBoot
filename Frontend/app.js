// app.js
document.addEventListener('DOMContentLoaded', function() {
    const userTableBody = document.getElementById('userTable').querySelector('tbody');
    const reviewTableBody = document.getElementById('reviewTable').querySelector('tbody');
    const bookTableBody = document.getElementById('bookTable').querySelector('tbody');
    const authorTableBody = document.getElementById('authorTable').querySelector('tbody');
    const loanTableBody = document.getElementById('loanTable').querySelector('tbody');
    const genderTableBody = document.getElementById('genderTable').querySelector('tbody');

    // Función para obtener los datos de la API
    function fetchUsers() {
        fetch('http://localhost:8080/user')
            .then(response => {
                if (!response.ok) {
                    throw new Error('Network response was not ok');
                }
                return response.json();
            })
            .then(data => {
                data.forEach(user => {
                    addUserToTable(user);
                });
            })
            .catch(error => {
                console.error('There was a problem with the fetch operation:', error);
            });
    }
    function fetchReviews() {
        fetch('http://localhost:8080/review')
            .then(response => {
                if (!response.ok) {
                    throw new Error('Network response was not ok');
                }
                return response.json();
            })
            .then(data => {
                data.forEach(review => {
                    addReviewToTable(review);
                });
            })
            .catch(error => {
                console.error('There was a problem with the fetch operation:', error);
            });
    }
    function fetchBooks() {
        fetch('http://localhost:8080/book')
            .then(response => {
                if (!response.ok) {
                    throw new Error('Network response was not ok');
                }
                return response.json();
            })
            .then(data => {
                data.forEach(book => {
                    addBookToTable(book);
                });
            })
            .catch(error => {
                console.error('There was a problem with the fetch operation:', error);
            });
    }
    function fetchAuthors() {
        fetch('http://localhost:8080/author')
            .then(response => {
                if (!response.ok) {
                    throw new Error('Network response was not ok');
                }
                return response.json();
            })
            .then(data => {
                data.forEach(author => {
                    addAuthorToTable(author);
                });
            })
            .catch(error => {
                console.error('There was a problem with the fetch operation:', error);
            });
    }
    function fetchLoans() {
        fetch('http://localhost:8080/loan')
            .then(response => {
                if (!response.ok) {
                    throw new Error('Network response was not ok');
                }
                return response.json();
            })
            .then(data => {
                data.forEach(loan => {
                    addLoanToTable(loan);
                });
            })
            .catch(error => {
                console.error('There was a problem with the fetch operation:', error);
            });
    }
    function fetchGenders() {
        fetch('http://localhost:8080/gender')
            .then(response => {
                if (!response.ok) {
                    throw new Error('Network response was not ok');
                }
                return response.json();
            })
            .then(data => {
                data.forEach(gender => {
                    addGenderToTable(gender);
                });
            })
            .catch(error => {
                console.error('There was a problem with the fetch operation:', error);
            });
    }


    // Función para agregar un producto a la tabla
    function addUserToTable(user) {
        const row = document.createElement('tr');

        row.innerHTML = `
            <td>${user.id}</td>
            <td>${user.user_name}</td>
            <td>${user.email}</td>
            <td>${user.password}</td>   
            <td>${user.phone_number}</td>   
        `;

        userTableBody.appendChild(row);
    }
    function addReviewToTable(review) {
        const row = document.createElement('tr');

        row.innerHTML = `
            <td>${review.id}</td>
            <td>${review.user}</td>
            <td>${review.book}</td>
            <td>${review.review_description}</td>   
            <td>${review.stars}</td>   
        `;

        reviewTableBody.appendChild(row);
    }
    function addBookToTable(book) {
        const row = document.createElement('tr');

        row.innerHTML = `
            <td>${book.id}</td>
            <td>${book.user}</td>
            <td>${book.gender}</td>
            <td>${book.author}</td>   
            <td>${book.title}</td>   
            <td>${book.loan}</td>   
        `;

        bookTableBody.appendChild(row);
    }
    function addAuthorToTable(author) {
        const row = document.createElement('tr');

        row.innerHTML = `
            <td>${author.id}</td>
            <td>${author.author_name}</td>
            <td>${author.information}</td>
            <td>${author.country}</td>      
        `;

        authorTableBody.appendChild(row);
    }
    function addLoanToTable(loan) {
        const row = document.createElement('tr');

        row.innerHTML = `
            <td>${loan.id}</td>
            <td>${loan.loan}</td>
            <td>${loan.book}</td>
            <td>${loan.date_loan}</td>   
            <td>${loan.date_return}</td>   
        `;

        loanTableBody.appendChild(row);
    }
    function addProductToTable(gender) {
        const row = document.createElement('tr');

        row.innerHTML = `
            <td>${gender.id}</td>
            <td>${gender.gender_name}</td>
            <td>${gender.gender_description}</td> 
        `;

        genderTableBody.appendChild(row);
    }

    // Llamada a la función para obtener los productos al cargar la página
    fetchUsers();
    fetchReviews();
    fetchBooks();
    fetchAuthors();
    fetchLoans();
    fetchGenders();
});
