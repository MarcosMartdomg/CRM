<script>
  import svelteLogo from './assets/svelte.svg'
  import viteLogo from '/vite.svg'
  import Counter from './lib/Counter.svelte'
  import Buscador from './lib/buscador.svelte'
  import ToogleDarkMode from './lib/ToogleDarkMode.svelte';
    import ListaTareas from './lib/ListaTareas.svelte';
    import Conometro from './lib/conometro.svelte';

</script>

<main>
   <h1>Ejercicio Repaso</h1>
 

  <div class="card">
    <Counter />
    <Buscador/>
    <ToogleDarkMode/>
    <ListaTareas/>
    <Conometro/>
  </div>

  
</main>

<style>
  .logo {
    height: 6em;
    padding: 1.5em;
    will-change: filter;
    transition: filter 300ms;
  }
  .logo:hover {
    filter: drop-shadow(0 0 2em #646cffaa);
  }
  .logo.svelte:hover {
    filter: drop-shadow(0 0 2em #ff3e00aa);
  }
  .read-the-docs {
    color: #888;
  }
</style>
