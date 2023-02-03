import org.junit.*;

@Test(groups = {TRADE_INSERT, REGRESSION, EU, APAC, NY}, dataProvider = "testDataProvider")

@Test Case(id="TI03",name="sales trade",description="Position update and Today's trade view verification for sales trade")

@DataProviderArguments("name=TC03")

public void verifySalesTrade(TestData testData){

        TradeInsertTicket ticket

        TradeInsertActor.with TradeInsert().openTradelnsertTicket(testData.getTraderUserName(),BuySellIndication.B)with Cusips(testData.getCusipList(),null);

        String cusip-ticket.getFieldValue("CUSIP");

//find out the current position and set local variable position accordingly

        Map<Integer, Double> positions=databaseActor.with Db().getSecurityInventoryPositions(testData.getInventoryBook(),cusip);

//Place the sales trade

        List<Trade> trades=ticket

        with Comment(testData.getComment())withQuantity(testData.getDefaultQuantity())

        with Price(testData.getDefaultPrice())

        withSales Person(testData.getSalesPerson())

        with TradeType(TradeType.S)

        with TradeDate(testData.getTradeDate())

        with Trade Execution Time(testData.getTrade ExecutionTime())withAmendment Reason(Trade Amendment ReasonEnum.TraderError)

//.withSettlementDate(testData.getSettlement Dates().get(0))

        with Counterparty(testData.getSalesCounterpartyNoCPID()).with Ledger(testData.getInventoryBook())

        withTmod(TmodCode.C)

        .mustBeComplete()

        setExpected Result(Trade Field.INTERESTDAYS,Trade.ANYVALUE)

        .submit();

        Trade trade=trades.get(0);

        .verifyTradeExistsInTradeView()

//Then : Verify the trade in today's trade view database Actor.withDb().verifyTrade (trade.getTradeld()) .buySellIndication (BuySellIndication.B);

        .securityByCusip(trade.getCusip())

        .quantity(testData.getDefaultQuantity()).price(testData.getDefaultPrice())

//Then: Position updates by trade quantity

        database Actor.withDb().mustSee Position().verifyCurrent Position(trade.getTradeld(),trade.getCusip(),positions,testData.getDefaultQuantity());
