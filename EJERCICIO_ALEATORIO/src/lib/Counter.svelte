<script>
  let count = 0

  const increment = () => {
    count += 1

    if (count >= 10){
      count = 10
    }

  }

  let contador2 = 0
  const decrease = () => {
    count -= 1

    if (count <= -10){
      count = -10
    }

  }


</script>

<button>
  {count}
</button>
<br>

<button on:click={increment}>
  + 
</button>

<button on:click={decrease}>
  - 
</button>