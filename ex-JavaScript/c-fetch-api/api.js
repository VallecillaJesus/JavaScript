
const apiUrl = 'https://dog.ceo/api/breeds/image/random';
const img = document.createElement('img');

fetch(apiUrl)
.then(res => {
    return res.json();
}).then(data => {
    renderizarImg(data.message);
})

function renderizarImg(message) {
    img.setAttribute('src', message);
    document.body.appendChild(img);
}