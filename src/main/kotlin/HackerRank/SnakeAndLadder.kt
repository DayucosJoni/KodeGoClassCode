fun main() {
    var board = Board(4)
    board.populateBoard()
}

class Board(var tiles: Int) {
    var boardPlay = Array(tiles) { IntArray(tiles) }


    fun populateBoard() {
        var num = tiles * tiles
        var toggle = true
        for (i in boardPlay.indices) {
            var colArray = IntArray(tiles)
            if(num == tiles * tiles) {
                for (o in colArray.indices) {

                    boardPlay[i][o] = num
                    num--
                }
            }else if (toggle == false) {
                num -= tiles + 1
                for (o in colArray.indices) {

                    boardPlay[i][o] = num
                    num--
                }
                toggle = true
            }else{
                num -= tiles -1
                for (o in colArray.indices) {

                    boardPlay[i][o] = num
                    num++
                }
                toggle = false
            }
            println()
        }

        for (i in boardPlay){
            for (o in i) {
                print("$o ")
            }
            println()
        }
    }


    fun player1Position() {


    }
}