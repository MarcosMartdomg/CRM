<script>
let isDarkMode =false;
function toogleTheme(){
    isDarkMode = !isDarkMode;
}
</script>

<div class="container" class:dark-mode={isDarkMode} class:light-mode={!isDarkMode}>
<button on:click={toogleTheme}>
    cambiar a {isDarkMode ? 'modo claro' : 'modo oscuro'}
</button>
<h1>Este es un ejemplo de tema {isDarkMode? 'oscuro' : 'claro'}</h1>
</div>
<style>
    .dark-mode {
    background-color: black;
    color: white;
    }
    .light-mode {
    background-color: white;
    color: black;
    }
</style>
