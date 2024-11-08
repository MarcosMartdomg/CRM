<script>
    let time = 0;
    let interval;
    let running = false;

    function startTime() {
        if (!running) {
            running = true;
            interval = setInterval(() => {
                time++;
            }, 1000);
        }
    }
    function stopTime() {
        clearInterval(interval);
        running = false;
    }
    function resetTime() {
        clearInterval(interval);
        time = 0;
    }
</script>

<div class="container">
    <p>Conometro</p>
    <p>tiempo: {time}</p>
    <button on:click={startTime}>Iniciar</button>
    <button on:click={stopTime}>Pausar</button>
    <button on:click={resetTime}>Reiniciar</button>
</div>
