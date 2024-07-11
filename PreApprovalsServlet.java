// JavaScript code to delay submenu closing after mouse leaves
const menuItems = document.querySelectorAll('nav ul li');

menuItems.forEach(item => {
    item.addEventListener('mouseleave', () => {
        const submenu = item.querySelector('.submenu');
        if (submenu) {
            setTimeout(() => {
                submenu.style.opacity = 0;
                submenu.style.pointerEvents = 'none';
                submenu.style.visibility = 'hidden';
            }, 1000); // 1000 milliseconds = 1 second delay
        }
    });
});
