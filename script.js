// Get references to the HTML elements
const titleInput = document.getElementById('titleInput');
const descriptionInput = document.getElementById('descriptionInput');
const submitButton = document.getElementById('submitButton');
const showButton = document.getElementById('showButton');
const todoList = document.getElementById('todoList');

// Define an array to store the to-do items
let todos = [];

// Add event listener to the submit button
submitButton.addEventListener('click', function() {
  // Get the values from the input fields
  const title = titleInput.value;
  const description = descriptionInput.value;

  // Create a new to-do item object with the title, description, and current timestamp
  const todoItem = {
    title: title,
    description: description,
    timestamp: new Date().toLocaleString()
  };

  // Add the to-do item to the todos array
  todos.push(todoItem);

  // Clear the input fields
  titleInput.value = '';
  descriptionInput.value = '';
});

// Add event listener to the show button
showButton.addEventListener('click', function() {
  // Clear the current contents of the to-do list
  todoList.innerHTML = '';

  // Iterate over the todos array and create list items for each to-do item
  todos.forEach(function(todoItem) {
    // Create the list item element
    const li = document.createElement('li');
    li.classList.add('todo-item');

    // Create span elements for the title, description, and timestamp
    const titleSpan = document.createElement('span');
    titleSpan.classList.add('title-span');
    titleSpan.textContent = todoItem.title;

    const descriptionSpan = document.createElement('span');
    descriptionSpan.classList.add('description-span');
    descriptionSpan.textContent = todoItem.description;

    const timestampSpan = document.createElement('span');
    timestampSpan.classList.add('timestamp-span');
    timestampSpan.textContent = todoItem.timestamp;

    // Create the edit button
    const editButton = document.createElement('button');
    editButton.classList.add('edit-button');
    editButton.textContent = 'Edit';

    // Create the delete button
    const deleteButton = document.createElement('button');
    deleteButton.classList.add('delete-button');
    deleteButton.textContent = 'Delete';

    // Append the spans and buttons to the list item
    li.appendChild(titleSpan);
    li.appendChild(descriptionSpan);
    li.appendChild(timestampSpan);
    li.appendChild(editButton);
    li.appendChild(deleteButton);

    // Append the list item to the to-do list
    todoList.appendChild(li);
  });
});
