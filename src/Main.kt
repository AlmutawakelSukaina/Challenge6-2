fun main()
{


}
interface select
{
    fun selectAll();
    fun selectFrom();
}

interface select1:select
{
    fun selectSome()

}
class Paragraph:select1
{
    override fun selectSome() {

    }

    override fun selectAll() {

    }

    override fun selectFrom() {

    }


}