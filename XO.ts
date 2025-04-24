// main.ts
const message = document.getElementById("message");

if (message) {
  window.addEventListener("scroll", () => {
    const y = window.scrollY;
    if (y > 100) {
      message.textContent = "You're scrolling down!";
    } else {
      message.textContent = "Scroll down to see the fixed navbar.";
    }
  });
}
