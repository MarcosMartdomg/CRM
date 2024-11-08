<script>
    let task = '';
    let priority = 'media';


    

</script>
<div>
    <input type="text" bind:value={task}  placeholder="Nueva tarea"/>
    <button></button>


<ul>
    {#each task as { text, priority},index}
    <li class={priority}
    {Text} - {priority}
    <button on:click={() => deletetask(index)}> Eliminar </button>   
    {/each}
</ul>
</div>