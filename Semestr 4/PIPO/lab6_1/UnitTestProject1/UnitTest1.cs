using System;
using Microsoft.VisualStudio.TestTools.UnitTesting;
using lab6_1;

namespace UnitTestProject1
{
    [TestClass]
    public class UnitTest1
    {
        [TestMethod]
        public void silnia()
        {
            Silnia sil = new Silnia();
            sil.n = 0;
            Assert.AreEqual(sil.oblicz(), 1);
            sil.n = 1;
            Assert.AreEqual(sil.oblicz(), 1);
            sil.n = 5;
            Assert.AreEqual(sil.oblicz(), 120);


        }
    }
}
