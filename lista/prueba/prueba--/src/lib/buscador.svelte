<script>
    let search = '';
    const items = ['manzana','pera', 'banana', 'Naranja'];
    function filterItems() {
        return items.filter(item => item.toLowerCase().includes(search.toLowerCase()))
    }
</script>

<div class="container">
    <p>buscador</p>
    <input type = "text" bind:value={search} placeholder="buscar....">
    
   <ul>
        {#each filterItems() as item}
            <li>{item}</li>
            {/each}
    
    </ul>

    

</div>

