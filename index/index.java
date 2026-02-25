
const showMoreBtn = document.getElementById('showMore');
const hiddenCards = document.querySelectorAll('.card.hidden');

showMoreBtn.addEventListener('click', function() {
    hiddenCards.forEach(card => {
        card.style.display = 'block'; 
    });
    showMoreBtn.style.display = 'none'; 
});


const modal = document.getElementById('loginModal');
const loginBtn = document.getElementById('loginBtn');
const closeBtn = document.querySelector('.close');


loginBtn.onclick = function() {
    modal.style.display = "block";
}


closeBtn.onclick = function() {
    modal.style.display = "none";
}


window.onclick = function(event) {
    if (event.target == modal) {
        modal.style.display = "none";
    }
}