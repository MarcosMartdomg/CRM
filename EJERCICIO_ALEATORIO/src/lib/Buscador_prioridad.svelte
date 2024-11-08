<script>
    let isDarkMode = false;

    function toggleTheme(){
        isDarkMode = !isDarkMode
    }
    
</script>

<style>
    .dark.mode { 
        background-color: white;
        color: black;
    }

    .light-mode {
        background-color: black;
        color: white;
    }
</style>

<div class="container" class:dark-mode={isDarkMode} class:light-mode={!isDarkMode}>
    <div>
        <button on:click={toggleTheme}>
            Cambiar a {isDarkMode ? 'Modo Claro' : 'Modo Oscuro'}
        </button>

        <h1>Este es un ejemplo de tema {isDarkMode ? 'Oscuro' : 'Claro'}</h1>
    </div>

</div>