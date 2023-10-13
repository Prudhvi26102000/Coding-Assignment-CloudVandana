function submitForm() {
  const form = document.getElementById("surveyForm");
  if (form.checkValidity()) {
    const formData = new FormData(form);
    let message = "Survey Form Data:\n";
    for (const [key, value] of formData.entries()) {
      message += `${key}: ${value}\n`;
    }
    alert(message);
    resetForm();
  }
}

function resetForm() {
  document.getElementById("surveyForm").reset();
}
