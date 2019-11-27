<?xml version="1.0" encoding="UTF-8"?>
<WebServiceRequestEntity>
   <description></description>
   <name>Currency Rate cannot be zeroes</name>
   <tag></tag>
   <elementGuidId>6c63dcb2-3d41-46c2-a23b-1badb046b25c</elementGuidId>
   <selectorMethod>BASIC</selectorMethod>
   <useRalativeImagePath>false</useRalativeImagePath>
   <httpBody></httpBody>
   <httpBodyContent>{
  &quot;text&quot;: &quot;{\n  \&quot;changeCurrencyRatesServiceOperation\&quot;: {\n    \&quot;REQUEST\&quot;: {\n      \&quot;Input\&quot;: {\n        \&quot;companyNbr\&quot;: 7,\n        \&quot;owner\&quot;: \&quot;int\&quot;,\n        \&quot;changeControlNbr\&quot;: 1,\n        \&quot;fromCurrency\&quot;: \&quot;840\&quot;,\n        \&quot;rateType\&quot;: \&quot;amt\&quot;,\n        \&quot;effectiveDate\&quot;: \&quot;2025-01-01\&quot;,\n        \&quot;effectiveTime\&quot;: \&quot;044903\&quot;,\n        \&quot;currencyPointsFeesFlag\&quot;: \&quot;Y\&quot;,\n        \&quot;lastChangeDate\&quot;: \&quot;2019-07-17\&quot;, \n        \&quot;lastChangeTime\&quot;: \&quot;070304\&quot;,\n        \&quot;toCurrencyInfo\&quot;: [\n          {\n            \&quot;toCurrencyID\&quot;: \&quot;008\&quot;,\n            \&quot;toCurrencyRateInt\&quot;: 10187,\n            \&quot;toCurrencyRateExp\&quot;: 2\n          },\n          { \&quot;toCurrencyID\&quot;: \&quot;012\&quot;,\n            \&quot;toCurrencyRateInt\&quot;: 7283,\n            \&quot;toCurrencyRateExp\&quot;: 2\n          },\n          { \&quot;toCurrencyID\&quot;: \&quot;971\&quot;,\n            \&quot;toCurrencyRateInt\&quot;: 803616,\n            \&quot;toCurrencyRateExp\&quot;: 4\n          },\n          { \&quot;toCurrencyID\&quot;: \&quot;532\&quot;,\n            \&quot;toCurrencyRateInt\&quot;: 457975,\n            \&quot;toCurrencyRateExp\&quot;: 2\n          },\n          { \&quot;toCurrencyID\&quot;: \&quot;032\&quot;,\n            \&quot;toCurrencyRateInt\&quot;: 3075,\n            \&quot;toCurrencyRateExp\&quot;: 3\n          },\n          { \&quot;toCurrencyID\&quot;: \&quot;036\&quot;,\n            \&quot;toCurrencyRateInt\&quot;: 1388021,\n            \&quot;toCurrencyRateExp\&quot;: 6\n          },\n          { \&quot;toCurrencyID\&quot;: \&quot;044\&quot;,\n            \&quot;toCurrencyRateInt\&quot;: 1,\n            \&quot;toCurrencyRateExp\&quot;: 0\n          },\n          { \&quot;toCurrencyID\&quot;: \&quot;048\&quot;,\n            \&quot;toCurrencyRateInt\&quot;: 376875,\n            \&quot;toCurrencyRateExp\&quot;: 6\n          },\n          { \&quot;toCurrencyID\&quot;: \&quot;050\&quot;,\n            \&quot;toCurrencyRateInt\&quot;: 679,\n            \&quot;toCurrencyRateExp\&quot;: 1\n          },\n          { \&quot;toCurrencyID\&quot;: \&quot;051\&quot;,\n            \&quot;toCurrencyRateInt\&quot;: 4494,\n            \&quot;toCurrencyRateExp\&quot;: 1\n          },\n          { \&quot;toCurrencyID\&quot;: \&quot;944\&quot;,\n            \&quot;toCurrencyRateInt\&quot;: 2014375,\n            \&quot;toCurrencyRateExp\&quot;: 6\n          },\n          { \&quot;toCurrencyID\&quot;: \&quot;060\&quot;,\n            \&quot;toCurrencyRateInt\&quot;: 1,\n            \&quot;toCurrencyRateExp\&quot;: 0\n          },\n          { \&quot;toCurrencyID\&quot;: \&quot;068\&quot;,\n            \&quot;toCurrencyRateInt\&quot;: 8,\n            \&quot;toCurrencyRateExp\&quot;: 0\n          },\n          { \&quot;toCurrencyID\&quot;: \&quot;072\&quot;,\n            \&quot;toCurrencyRateInt\&quot;: 5548,\n            \&quot;toCurrencyRateExp\&quot;: 3\n          },\n          { \&quot;toCurrencyID\&quot;: \&quot;084\&quot;,\n            \&quot;toCurrencyRateInt\&quot;: 96,\n            \&quot;toCurrencyRateExp\&quot;: 2\n          },\n          {\&quot;toCurrencyID\&quot;: \&quot;116\&quot;,\n            \&quot;toCurrencyRateInt\&quot;: 161495,\n            \&quot;toCurrencyRateExp\&quot;: 5\n          },\n          {\&quot;toCurrencyID\&quot;: \&quot;096\&quot;,\n            \&quot;toCurrencyRateInt\&quot;: 162005,\n            \&quot;toCurrencyRateExp\&quot;: 5\n          },\n          {\&quot;toCurrencyID\&quot;: \&quot;108\&quot;,\n            \&quot;toCurrencyRateInt\&quot;: 971,\n            \&quot;toCurrencyRateExp\&quot;: 0\n          },\n          {\&quot;toCurrencyID\&quot;: \&quot;064\&quot;,\n            \&quot;toCurrencyRateInt\&quot;: 117205,\n            \&quot;toCurrencyRateExp\&quot;: 5\n          },\n          {\&quot;toCurrencyID\&quot;: \&quot;124\&quot;,\n            \&quot;toCurrencyRateInt\&quot;: 10255,\n            \&quot;toCurrencyRateExp\&quot;: 2\n          },\n          {\&quot;toCurrencyID\&quot;: \&quot;152\&quot;,\n            \&quot;toCurrencyRateInt\&quot;: 8006508,\n            \&quot;toCurrencyRateExp\&quot;: 6\n          },\n          {\&quot;toCurrencyID\&quot;: \&quot;157\&quot;,\n            \&quot;toCurrencyRateInt\&quot;: 608155,\n            \&quot;toCurrencyRateExp\&quot;: 5\n          },\n          {\&quot;toCurrencyID\&quot;: \&quot;156\&quot;,\n            \&quot;toCurrencyRateInt\&quot;: 4758,\n            \&quot;toCurrencyRateExp\&quot;: 4\n          },\n          {\&quot;toCurrencyID\&quot;: \&quot;170\&quot;,\n            \&quot;toCurrencyRateInt\&quot;: 23749,\n            \&quot;toCurrencyRateExp\&quot;: 3\n          },\n          {\&quot;toCurrencyID\&quot;: \&quot;192\&quot;,\n            \&quot;toCurrencyRateInt\&quot;: 617075,\n            \&quot;toCurrencyRateExp\&quot;: 5\n          },\n          {\&quot;toCurrencyID\&quot;: \&quot;203\&quot;,\n            \&quot;toCurrencyRateInt\&quot;: 1295945,\n            \&quot;toCurrencyRateExp\&quot;: 5\n          },\n          {\&quot;toCurrencyID\&quot;: \&quot;262\&quot;,\n            \&quot;toCurrencyRateInt\&quot;: 775965,\n            \&quot;toCurrencyRateExp\&quot;: 5\n          },\n          {\&quot;toCurrencyID\&quot;: \&quot;208\&quot;,\n            \&quot;toCurrencyRateInt\&quot;: 1787333,\n            \&quot;toCurrencyRateExp\&quot;: 6\n          },\n          {\&quot;toCurrencyID\&quot;: \&quot;818\&quot;,\n            \&quot;toCurrencyRateInt\&quot;: 21978,\n            \&quot;toCurrencyRateExp\&quot;: 2\n          },\n          {\&quot;toCurrencyID\&quot;: \&quot;978\&quot;,\n            \&quot;toCurrencyRateInt\&quot;: 72025,\n            \&quot;toCurrencyRateExp\&quot;: 3\n          },\n          {\&quot;toCurrencyID\&quot;: \&quot;242\&quot;,\n            \&quot;toCurrencyRateInt\&quot;: 4439,\n            \&quot;toCurrencyRateExp\&quot;: 2\n          },\n          {\&quot;toCurrencyID\&quot;: \&quot;826\&quot;,\n            \&quot;toCurrencyRateInt\&quot;: 1475631,\n            \&quot;toCurrencyRateExp\&quot;: 3\n          },\n          {\&quot;toCurrencyID\&quot;: \&quot;936\&quot;,\n            \&quot;toCurrencyRateInt\&quot;: 116595,\n            \&quot;toCurrencyRateExp\&quot;: 3\n          },\n          {\&quot;toCurrencyID\&quot;: \&quot;292\&quot;,\n            \&quot;toCurrencyRateInt\&quot;: 292055 ,\n            \&quot;toCurrencyRateExp\&quot;: 6\n          },\n          {\&quot;toCurrencyID\&quot;: \&quot;344\&quot;,\n            \&quot;toCurrencyRateInt\&quot;: 1335,\n            \&quot;toCurrencyRateExp\&quot;: 3\n          },\n          {\&quot;toCurrencyID\&quot;: \&quot;191\&quot;,\n            \&quot;toCurrencyRateInt\&quot;: 3692,\n            \&quot;toCurrencyRateExp\&quot;: 3\n          },\n          {\&quot;toCurrencyID\&quot;: \&quot;348\&quot;,\n            \&quot;toCurrencyRateInt\&quot;: 3072,\n            \&quot;toCurrencyRateExp\&quot;: 3\n          },\n          {\&quot;toCurrencyID\&quot;: \&quot;360\&quot;,\n            \&quot;toCurrencyRateInt\&quot;: 107568,\n            \&quot;toCurrencyRateExp\&quot;: 4\n          },\n          {\&quot;toCurrencyID\&quot;: \&quot;376\&quot;,\n            \&quot;toCurrencyRateInt\&quot;: 71545,\n            \&quot;toCurrencyRateExp\&quot;: 3\n          },\n          {\&quot;toCurrencyID\&quot;: \&quot;356\&quot;,\n            \&quot;toCurrencyRateInt\&quot;: 179,\n            \&quot;toCurrencyRateExp\&quot;: 2\n          },\n          {\&quot;toCurrencyID\&quot;: \&quot;368\&quot;,\n            \&quot;toCurrencyRateInt\&quot;: 1591597,\n            \&quot;toCurrencyRateExp\&quot;: 6\n          },\n          {\&quot;toCurrencyID\&quot;: \&quot;364\&quot;,\n            \&quot;toCurrencyRateInt\&quot;: 65805,\n            \&quot;toCurrencyRateExp\&quot;: 4\n          },\n          {\&quot;toCurrencyID\&quot;: \&quot;352\&quot;,\n            \&quot;toCurrencyRateInt\&quot;: 5112,\n            \&quot;toCurrencyRateExp\&quot;: 2\n          },\n          {\&quot;toCurrencyID\&quot;: \&quot;392\&quot;,\n            \&quot;toCurrencyRateInt\&quot;: 36395,\n            \&quot;toCurrencyRateExp\&quot;: 4\n          },\n          {\&quot;toCurrencyID\&quot;: \&quot;458\&quot;,\n            \&quot;toCurrencyRateInt\&quot;: 1234,\n            \&quot;toCurrencyRateExp\&quot;: 3\n          },\n          {\&quot;toCurrencyID\&quot;: \&quot;414\&quot;,\n            \&quot;toCurrencyRateInt\&quot;: 1234,\n            \&quot;toCurrencyRateExp\&quot;: 0\n          },\n          {\&quot;toCurrencyID\&quot;: \&quot;418\&quot;,\n            \&quot;toCurrencyRateInt\&quot;: 1234,\n            \&quot;toCurrencyRateExp\&quot;: 0\n          },\n          {\&quot;toCurrencyID\&quot;: \&quot;422\&quot;,\n            \&quot;toCurrencyRateInt\&quot;: 344,\n            \&quot;toCurrencyRateExp\&quot;: 0\n          },\n          {\&quot;toCurrencyID\&quot;: \&quot;144\&quot;,\n            \&quot;toCurrencyRateInt\&quot;: 4566,\n            \&quot;toCurrencyRateExp\&quot;: 0\n          },\n          {\&quot;toCurrencyID\&quot;: \&quot;984\&quot;,\n            \&quot;toCurrencyRateInt\&quot;: 343,\n            \&quot;toCurrencyRateExp\&quot;: 0\n          },\n          {\&quot;toCurrencyID\&quot;: \&quot;434\&quot;,\n            \&quot;toCurrencyRateInt\&quot;: 19999999999,\n            \&quot;toCurrencyRateExp\&quot;: 10\n          },\n          {\&quot;toCurrencyID\&quot;: \&quot;933\&quot;,\n            \&quot;toCurrencyRateInt\&quot;: 2334,\n            \&quot;toCurrencyRateExp\&quot;: 0\n          },\n          {\&quot;toCurrencyID\&quot;: \&quot;756\&quot;,\n            \&quot;toCurrencyRateInt\&quot;: 656,\n            \&quot;toCurrencyRateExp\&quot;: 0\n          },\n          {\&quot;toCurrencyID\&quot;: \&quot;twd\&quot;,\n            \&quot;toCurrencyRateInt\&quot;: 1,\n            \&quot;toCurrencyRateExp\&quot;: 0\n          },\n          {\&quot;toCurrencyID\&quot;: \&quot;uah\&quot;,\n            \&quot;toCurrencyRateInt\&quot;: 1,\n            \&quot;toCurrencyRateExp\&quot;: 0\n          },\n          {\&quot;toCurrencyID\&quot;: \&quot;ugx\&quot;,\n            \&quot;toCurrencyRateInt\&quot;: 1,\n            \&quot;toCurrencyRateExp\&quot;: 0\n          },\n          {\&quot;toCurrencyID\&quot;: \&quot;usd\&quot;,\n            \&quot;toCurrencyRateInt\&quot;: 1,\n            \&quot;toCurrencyRateExp\&quot;: 0\n          },\n          {\&quot;toCurrencyID\&quot;: \&quot;vef\&quot;,\n            \&quot;toCurrencyRateInt\&quot;: 1,\n            \&quot;toCurrencyRateExp\&quot;: 0\n          },\n          {\&quot;toCurrencyID\&quot;: \&quot;xaf\&quot;,\n            \&quot;toCurrencyRateInt\&quot;: 1,\n            \&quot;toCurrencyRateExp\&quot;: 0\n          },\n          {\&quot;toCurrencyID\&quot;: \&quot;xcd\&quot;,\n            \&quot;toCurrencyRateInt\&quot;: 1,\n            \&quot;toCurrencyRateExp\&quot;: 0\n          },\n          {\&quot;toCurrencyID\&quot;: \&quot;xof\&quot;,\n            \&quot;toCurrencyRateInt\&quot;: 1,\n            \&quot;toCurrencyRateExp\&quot;: 0\n          },\n          {\&quot;toCurrencyID\&quot;: \&quot;xpf\&quot;,\n            \&quot;toCurrencyRateInt\&quot;: 1,\n            \&quot;toCurrencyRateExp\&quot;: 0\n          },\n          {\&quot;toCurrencyID\&quot;: \&quot;zar\&quot;,\n            \&quot;toCurrencyRateInt\&quot;: 1,\n            \&quot;toCurrencyRateExp\&quot;: 0\n          },\n          {\&quot;toCurrencyID\&quot;: \&quot;zmw\&quot;,\n            \&quot;toCurrencyRateInt\&quot;: 1,\n            \&quot;toCurrencyRateExp\&quot;: 0\n          },\n          {\&quot;toCurrencyID\&quot;: \&quot;aed\&quot;,\n            \&quot;toCurrencyRateInt\&quot;: 1,\n            \&quot;toCurrencyRateExp\&quot;: 0\n          },\n          {\&quot;toCurrencyID\&quot;: \&quot;awg\&quot;,\n            \&quot;toCurrencyRateInt\&quot;: 1,\n            \&quot;toCurrencyRateExp\&quot;: 0\n          },\n          {\&quot;toCurrencyID\&quot;: \&quot;533\&quot;,\n            \&quot;toCurrencyRateInt\&quot;: 0,\n            \&quot;toCurrencyRateExp\&quot;: 0\n          },\n          {\&quot;toCurrencyID\&quot;: null,\n            \&quot;toCurrencyRateInt\&quot;: 0,\n            \&quot;toCurrencyRateExp\&quot;: 0\n          },\n          {\&quot;toCurrencyID\&quot;: null,\n            \&quot;toCurrencyRateInt\&quot;: 0,\n            \&quot;toCurrencyRateExp\&quot;: 0\n          },\n          {\&quot;toCurrencyID\&quot;: null,\n            \&quot;toCurrencyRateInt\&quot;: 0,\n            \&quot;toCurrencyRateExp\&quot;: 0\n          },\n          {\&quot;toCurrencyID\&quot;: null,\n            \&quot;toCurrencyRateInt\&quot;: 0,\n            \&quot;toCurrencyRateExp\&quot;: 0\n          },\n          {\&quot;toCurrencyID\&quot;: null,\n            \&quot;toCurrencyRateInt\&quot;: 0,\n            \&quot;toCurrencyRateExp\&quot;: 0\n          },\n          {\&quot;toCurrencyID\&quot;: null,\n            \&quot;toCurrencyRateInt\&quot;: 0,\n            \&quot;toCurrencyRateExp\&quot;: 0\n          },\n          {\&quot;toCurrencyID\&quot;: null,\n            \&quot;toCurrencyRateInt\&quot;: 0,\n            \&quot;toCurrencyRateExp\&quot;: 0\n          },\n          {\&quot;toCurrencyID\&quot;: null,\n            \&quot;toCurrencyRateInt\&quot;: 0,\n            \&quot;toCurrencyRateExp\&quot;: 0\n          },\n          {\&quot;toCurrencyID\&quot;: null,\n            \&quot;toCurrencyRateInt\&quot;: 0,\n            \&quot;toCurrencyRateExp\&quot;: 0\n          },\n          {\&quot;toCurrencyID\&quot;: null,\n            \&quot;toCurrencyRateInt\&quot;: 0,\n            \&quot;toCurrencyRateExp\&quot;: 0\n          },\n          {\&quot;toCurrencyID\&quot;: null,\n            \&quot;toCurrencyRateInt\&quot;: 0,\n            \&quot;toCurrencyRateExp\&quot;: 0\n          },\n          {\&quot;toCurrencyID\&quot;: null,\n            \&quot;toCurrencyRateInt\&quot;: 0,\n            \&quot;toCurrencyRateExp\&quot;: 0\n          },\n          {\&quot;toCurrencyID\&quot;: null,\n            \&quot;toCurrencyRateInt\&quot;: 0,\n            \&quot;toCurrencyRateExp\&quot;: 0\n          },\n          {\&quot;toCurrencyID\&quot;: null,\n            \&quot;toCurrencyRateInt\&quot;: 0,\n            \&quot;toCurrencyRateExp\&quot;: 0\n          },\n          {\&quot;toCurrencyID\&quot;: null,\n            \&quot;toCurrencyRateInt\&quot;: 0,\n            \&quot;toCurrencyRateExp\&quot;: 0\n          },\n          {\&quot;toCurrencyID\&quot;: null,\n            \&quot;toCurrencyRateInt\&quot;: 0,\n            \&quot;toCurrencyRateExp\&quot;: 0\n          },\n          {\&quot;toCurrencyID\&quot;: null,\n            \&quot;toCurrencyRateInt\&quot;: 0,\n            \&quot;toCurrencyRateExp\&quot;: 0\n          },\n          {\&quot;toCurrencyID\&quot;: null,\n            \&quot;toCurrencyRateInt\&quot;: 0,\n            \&quot;toCurrencyRateExp\&quot;: 0\n          },\n          {\&quot;toCurrencyID\&quot;: null,\n            \&quot;toCurrencyRateInt\&quot;: 0,\n            \&quot;toCurrencyRateExp\&quot;: 0\n          },\n          {\&quot;toCurrencyID\&quot;: null,\n            \&quot;toCurrencyRateInt\&quot;: 0,\n            \&quot;toCurrencyRateExp\&quot;: 0\n          },\n          {\&quot;toCurrencyID\&quot;: null,\n            \&quot;toCurrencyRateInt\&quot;: 0,\n            \&quot;toCurrencyRateExp\&quot;: 0\n          },\n          {\&quot;toCurrencyID\&quot;: null,\n            \&quot;toCurrencyRateInt\&quot;: 0,\n            \&quot;toCurrencyRateExp\&quot;: 0\n          },\n          {\&quot;toCurrencyID\&quot;: null,\n            \&quot;toCurrencyRateInt\&quot;: 0,\n            \&quot;toCurrencyRateExp\&quot;: 0\n          },\n          {\&quot;toCurrencyID\&quot;: null,\n            \&quot;toCurrencyRateInt\&quot;: 0,\n            \&quot;toCurrencyRateExp\&quot;: 0\n          },\n          {\&quot;toCurrencyID\&quot;: null,\n            \&quot;toCurrencyRateInt\&quot;: 0,\n            \&quot;toCurrencyRateExp\&quot;: 0\n          },\n          {\&quot;toCurrencyID\&quot;: null,\n            \&quot;toCurrencyRateInt\&quot;: 0,\n            \&quot;toCurrencyRateExp\&quot;: 0\n          },\n          {\&quot;toCurrencyID\&quot;: null,\n            \&quot;toCurrencyRateInt\&quot;: 0,\n            \&quot;toCurrencyRateExp\&quot;: 0\n          },\n          {\&quot;toCurrencyID\&quot;: null,\n            \&quot;toCurrencyRateInt\&quot;: 0,\n            \&quot;toCurrencyRateExp\&quot;: 0\n          },\n          {\&quot;toCurrencyID\&quot;: null,\n            \&quot;toCurrencyRateInt\&quot;: 0,\n            \&quot;toCurrencyRateExp\&quot;: 0\n          },\n          {\&quot;toCurrencyID\&quot;: null,\n            \&quot;toCurrencyRateInt\&quot;: 0,\n            \&quot;toCurrencyRateExp\&quot;: 0\n          },\n          {\&quot;toCurrencyID\&quot;: null,\n            \&quot;toCurrencyRateInt\&quot;: 0,\n            \&quot;toCurrencyRateExp\&quot;: 0\n          },\n          {\&quot;toCurrencyID\&quot;: null,\n            \&quot;toCurrencyRateInt\&quot;: 0,\n            \&quot;toCurrencyRateExp\&quot;: 0\n          },\n          {\&quot;toCurrencyID\&quot;: null,\n            \&quot;toCurrencyRateInt\&quot;: 0,\n            \&quot;toCurrencyRateExp\&quot;: 0\n          },\n          {\&quot;toCurrencyID\&quot;: null,\n            \&quot;toCurrencyRateInt\&quot;: 0,\n            \&quot;toCurrencyRateExp\&quot;: 0\n          },\n          {\&quot;toCurrencyID\&quot;: null,\n            \&quot;toCurrencyRateInt\&quot;: 0,\n            \&quot;toCurrencyRateExp\&quot;: 0\n          },\n          {\&quot;toCurrencyID\&quot;: null,\n            \&quot;toCurrencyRateInt\&quot;: 0,\n            \&quot;toCurrencyRateExp\&quot;: 0\n          },\n          {\&quot;toCurrencyID\&quot;: null,\n            \&quot;toCurrencyRateInt\&quot;: 0,\n            \&quot;toCurrencyRateExp\&quot;: 0\n          },\n          {\&quot;toCurrencyID\&quot;: null,\n            \&quot;toCurrencyRateInt\&quot;: 0,\n            \&quot;toCurrencyRateExp\&quot;: 0\n          },\n          {\&quot;toCurrencyID\&quot;: null,\n            \&quot;toCurrencyRateInt\&quot;: 0,\n            \&quot;toCurrencyRateExp\&quot;: 0\n          },\n          {\&quot;toCurrencyID\&quot;: null,\n            \&quot;toCurrencyRateInt\&quot;: 0,\n            \&quot;toCurrencyRateExp\&quot;: 0\n          },\n          {\&quot;toCurrencyID\&quot;: null,\n            \&quot;toCurrencyRateInt\&quot;: 0,\n            \&quot;toCurrencyRateExp\&quot;: 0\n          },\n          {\&quot;toCurrencyID\&quot;: null,\n            \&quot;toCurrencyRateInt\&quot;: 0,\n            \&quot;toCurrencyRateExp\&quot;: 0\n          },\n          {\&quot;toCurrencyID\&quot;: null,\n            \&quot;toCurrencyRateInt\&quot;: 0,\n            \&quot;toCurrencyRateExp\&quot;: 0\n          },\n          {\&quot;toCurrencyID\&quot;: null,\n            \&quot;toCurrencyRateInt\&quot;: 0,\n            \&quot;toCurrencyRateExp\&quot;: 0\n          },\n          {\&quot;toCurrencyID\&quot;: null,\n            \&quot;toCurrencyRateInt\&quot;: 0,\n            \&quot;toCurrencyRateExp\&quot;: 0\n          },\n          {\&quot;toCurrencyID\&quot;: null,\n            \&quot;toCurrencyRateInt\&quot;: 0,\n            \&quot;toCurrencyRateExp\&quot;: 0\n          },\n          {\&quot;toCurrencyID\&quot;: null,\n            \&quot;toCurrencyRateInt\&quot;: 0,\n            \&quot;toCurrencyRateExp\&quot;: 0\n          },\n          {\&quot;toCurrencyID\&quot;: null,\n            \&quot;toCurrencyRateInt\&quot;: 0,\n            \&quot;toCurrencyRateExp\&quot;: 0\n          },\n          {\&quot;toCurrencyID\&quot;: null,\n            \&quot;toCurrencyRateInt\&quot;: 0,\n            \&quot;toCurrencyRateExp\&quot;: 0\n          },\n          {\&quot;toCurrencyID\&quot;: null,\n            \&quot;toCurrencyRateInt\&quot;: 0,\n            \&quot;toCurrencyRateExp\&quot;: 0\n          },\n          {\&quot;toCurrencyID\&quot;: null,\n            \&quot;toCurrencyRateInt\&quot;: 0,\n            \&quot;toCurrencyRateExp\&quot;: 0\n          },\n          {\&quot;toCurrencyID\&quot;: null,\n            \&quot;toCurrencyRateInt\&quot;: 0,\n            \&quot;toCurrencyRateExp\&quot;: 0\n          },\n          {\&quot;toCurrencyID\&quot;: null,\n            \&quot;toCurrencyRateInt\&quot;: 0,\n            \&quot;toCurrencyRateExp\&quot;: 0\n          },\n          {\&quot;toCurrencyID\&quot;: null,\n            \&quot;toCurrencyRateInt\&quot;: 0,\n            \&quot;toCurrencyRateExp\&quot;: 0\n          },\n          {\&quot;toCurrencyID\&quot;: null,\n            \&quot;toCurrencyRateInt\&quot;: 0,\n            \&quot;toCurrencyRateExp\&quot;: 0\n          },\n          {\&quot;toCurrencyID\&quot;: null,\n            \&quot;toCurrencyRateInt\&quot;: 0,\n            \&quot;toCurrencyRateExp\&quot;: 0\n          },\n          {\&quot;toCurrencyID\&quot;: null,\n            \&quot;toCurrencyRateInt\&quot;: 0,\n            \&quot;toCurrencyRateExp\&quot;: 0\n          },\n          {\&quot;toCurrencyID\&quot;: null,\n            \&quot;toCurrencyRateInt\&quot;: 0,\n            \&quot;toCurrencyRateExp\&quot;: 0\n          },\n          {\&quot;toCurrencyID\&quot;: null,\n            \&quot;toCurrencyRateInt\&quot;: 0,\n            \&quot;toCurrencyRateExp\&quot;: 0\n          },\n          {\&quot;toCurrencyID\&quot;: null,\n            \&quot;toCurrencyRateInt\&quot;: 0,\n            \&quot;toCurrencyRateExp\&quot;: 0\n          },\n          {\&quot;toCurrencyID\&quot;: null,\n            \&quot;toCurrencyRateInt\&quot;: 0,\n            \&quot;toCurrencyRateExp\&quot;: 0\n          },\n          {\&quot;toCurrencyID\&quot;: null,\n            \&quot;toCurrencyRateInt\&quot;: 0,\n            \&quot;toCurrencyRateExp\&quot;: 0\n          },\n          {\&quot;toCurrencyID\&quot;: null,\n            \&quot;toCurrencyRateInt\&quot;: 0,\n            \&quot;toCurrencyRateExp\&quot;: 0\n          },\n          {\&quot;toCurrencyID\&quot;: null,\n            \&quot;toCurrencyRateInt\&quot;: 0,\n            \&quot;toCurrencyRateExp\&quot;: 0\n          },\n          {\&quot;toCurrencyID\&quot;: null,\n            \&quot;toCurrencyRateInt\&quot;: 0,\n            \&quot;toCurrencyRateExp\&quot;: 0\n          },\n          {\&quot;toCurrencyID\&quot;: null,\n            \&quot;toCurrencyRateInt\&quot;: 0,\n            \&quot;toCurrencyRateExp\&quot;: 0\n          },\n          {\&quot;toCurrencyID\&quot;: null,\n            \&quot;toCurrencyRateInt\&quot;: 0,\n            \&quot;toCurrencyRateExp\&quot;: 0\n          },\n          {\&quot;toCurrencyID\&quot;: null,\n            \&quot;toCurrencyRateInt\&quot;: 0,\n            \&quot;toCurrencyRateExp\&quot;: 0\n          },\n          {\&quot;toCurrencyID\&quot;: null,\n            \&quot;toCurrencyRateInt\&quot;: 0,\n            \&quot;toCurrencyRateExp\&quot;: 0\n          },\n          {\&quot;toCurrencyID\&quot;: null,\n            \&quot;toCurrencyRateInt\&quot;: 0,\n            \&quot;toCurrencyRateExp\&quot;: 0\n          },\n          {\&quot;toCurrencyID\&quot;: null,\n            \&quot;toCurrencyRateInt\&quot;: 0,\n            \&quot;toCurrencyRateExp\&quot;: 0\n          },\n          {\&quot;toCurrencyID\&quot;: null,\n            \&quot;toCurrencyRateInt\&quot;: 0,\n            \&quot;toCurrencyRateExp\&quot;: 0\n          },\n          {\&quot;toCurrencyID\&quot;: null,\n            \&quot;toCurrencyRateInt\&quot;: 0,\n            \&quot;toCurrencyRateExp\&quot;: 0\n          },\n          {\&quot;toCurrencyID\&quot;: null,\n            \&quot;toCurrencyRateInt\&quot;: 0,\n            \&quot;toCurrencyRateExp\&quot;: 0\n          },\n          {\&quot;toCurrencyID\&quot;: null,\n            \&quot;toCurrencyRateInt\&quot;: 0,\n            \&quot;toCurrencyRateExp\&quot;: 0\n          },\n          {\&quot;toCurrencyID\&quot;: null,\n            \&quot;toCurrencyRateInt\&quot;: 0,\n            \&quot;toCurrencyRateExp\&quot;: 0\n          },\n          {\&quot;toCurrencyID\&quot;: null,\n            \&quot;toCurrencyRateInt\&quot;: 0,\n            \&quot;toCurrencyRateExp\&quot;: 0\n          },\n          {\&quot;toCurrencyID\&quot;: null,\n            \&quot;toCurrencyRateInt\&quot;: 0,\n            \&quot;toCurrencyRateExp\&quot;: 0\n          },\n          {\&quot;toCurrencyID\&quot;: null,\n            \&quot;toCurrencyRateInt\&quot;: 0,\n            \&quot;toCurrencyRateExp\&quot;: 0\n          },\n          {\&quot;toCurrencyID\&quot;: null,\n            \&quot;toCurrencyRateInt\&quot;: 0,\n            \&quot;toCurrencyRateExp\&quot;: 0\n          },\n          {\&quot;toCurrencyID\&quot;: null,\n            \&quot;toCurrencyRateInt\&quot;: 0,\n            \&quot;toCurrencyRateExp\&quot;: 0\n          },\n          {\&quot;toCurrencyID\&quot;: null,\n            \&quot;toCurrencyRateInt\&quot;: 0,\n            \&quot;toCurrencyRateExp\&quot;: 0\n          },\n          {\&quot;toCurrencyID\&quot;: null,\n            \&quot;toCurrencyRateInt\&quot;: 0,\n            \&quot;toCurrencyRateExp\&quot;: 0\n          },\n          {\&quot;toCurrencyID\&quot;: null,\n            \&quot;toCurrencyRateInt\&quot;: 0,\n            \&quot;toCurrencyRateExp\&quot;: 0\n          },\n          {\&quot;toCurrencyID\&quot;: null,\n            \&quot;toCurrencyRateInt\&quot;: 0,\n            \&quot;toCurrencyRateExp\&quot;: 0\n          },\n          {\&quot;toCurrencyID\&quot;: null,\n            \&quot;toCurrencyRateInt\&quot;: 0,\n            \&quot;toCurrencyRateExp\&quot;: 0\n          },\n          {\&quot;toCurrencyID\&quot;: null,\n            \&quot;toCurrencyRateInt\&quot;: 0,\n            \&quot;toCurrencyRateExp\&quot;: 0\n          },\n          {\&quot;toCurrencyID\&quot;: null,\n            \&quot;toCurrencyRateInt\&quot;: 0,\n            \&quot;toCurrencyRateExp\&quot;: 0\n          },\n          {\&quot;toCurrencyID\&quot;: null,\n            \&quot;toCurrencyRateInt\&quot;: 0,\n            \&quot;toCurrencyRateExp\&quot;: 0\n          },\n          {\&quot;toCurrencyID\&quot;: null,\n            \&quot;toCurrencyRateInt\&quot;: 0,\n            \&quot;toCurrencyRateExp\&quot;: 0\n          },\n          {\&quot;toCurrencyID\&quot;: null,\n            \&quot;toCurrencyRateInt\&quot;: 0,\n            \&quot;toCurrencyRateExp\&quot;: 0\n          },\n          {\&quot;toCurrencyID\&quot;: null,\n            \&quot;toCurrencyRateInt\&quot;: 0,\n            \&quot;toCurrencyRateExp\&quot;: 0\n          },\n          {\&quot;toCurrencyID\&quot;: null,\n            \&quot;toCurrencyRateInt\&quot;: 0,\n            \&quot;toCurrencyRateExp\&quot;: 0\n          },\n          {\&quot;toCurrencyID\&quot;: null,\n            \&quot;toCurrencyRateInt\&quot;: 0,\n            \&quot;toCurrencyRateExp\&quot;: 0\n          },\n          {\&quot;toCurrencyID\&quot;: null,\n            \&quot;toCurrencyRateInt\&quot;: 0,\n            \&quot;toCurrencyRateExp\&quot;: 0\n          },\n          {\&quot;toCurrencyID\&quot;: null,\n            \&quot;toCurrencyRateInt\&quot;: 0,\n            \&quot;toCurrencyRateExp\&quot;: 0\n          },\n          {\&quot;toCurrencyID\&quot;: null,\n            \&quot;toCurrencyRateInt\&quot;: 0,\n            \&quot;toCurrencyRateExp\&quot;: 0\n          },\n          {\&quot;toCurrencyID\&quot;: null,\n            \&quot;toCurrencyRateInt\&quot;: 0,\n            \&quot;toCurrencyRateExp\&quot;: 0\n          },\n          {\&quot;toCurrencyID\&quot;: null,\n            \&quot;toCurrencyRateInt\&quot;: 0,\n            \&quot;toCurrencyRateExp\&quot;: 0\n          },\n          {\&quot;toCurrencyID\&quot;: null,\n            \&quot;toCurrencyRateInt\&quot;: 0,\n            \&quot;toCurrencyRateExp\&quot;: 0\n          },\n          {\&quot;toCurrencyID\&quot;: null,\n            \&quot;toCurrencyRateInt\&quot;: 0,\n            \&quot;toCurrencyRateExp\&quot;: 0\n          },\n          {\&quot;toCurrencyID\&quot;: null,\n            \&quot;toCurrencyRateInt\&quot;: 0,\n            \&quot;toCurrencyRateExp\&quot;: 0\n          },\n          {\&quot;toCurrencyID\&quot;: null,\n            \&quot;toCurrencyRateInt\&quot;: 0,\n            \&quot;toCurrencyRateExp\&quot;: 0\n          },\n          {\&quot;toCurrencyID\&quot;: null,\n            \&quot;toCurrencyRateInt\&quot;: 0,\n            \&quot;toCurrencyRateExp\&quot;: 0\n          },\n          {\&quot;toCurrencyID\&quot;: null,\n            \&quot;toCurrencyRateInt\&quot;: 0,\n            \&quot;toCurrencyRateExp\&quot;: 0\n          },\n          {\&quot;toCurrencyID\&quot;: null,\n            \&quot;toCurrencyRateInt\&quot;: 0,\n            \&quot;toCurrencyRateExp\&quot;: 0\n          },\n          {\&quot;toCurrencyID\&quot;: null,\n            \&quot;toCurrencyRateInt\&quot;: 0,\n            \&quot;toCurrencyRateExp\&quot;: 0\n          },\n          {\&quot;toCurrencyID\&quot;: null,\n            \&quot;toCurrencyRateInt\&quot;: 0,\n            \&quot;toCurrencyRateExp\&quot;: 0\n          },\n          {\&quot;toCurrencyID\&quot;: null,\n            \&quot;toCurrencyRateInt\&quot;: 0,\n            \&quot;toCurrencyRateExp\&quot;: 0\n          },\n          {\&quot;toCurrencyID\&quot;: null,\n            \&quot;toCurrencyRateInt\&quot;: 0,\n            \&quot;toCurrencyRateExp\&quot;: 0\n          },\n          {\&quot;toCurrencyID\&quot;: null,\n            \&quot;toCurrencyRateInt\&quot;: 0,\n            \&quot;toCurrencyRateExp\&quot;: 0\n          },\n          {\&quot;toCurrencyID\&quot;: null,\n            \&quot;toCurrencyRateInt\&quot;: 0,\n            \&quot;toCurrencyRateExp\&quot;: 0\n          },\n          {\&quot;toCurrencyID\&quot;: null,\n            \&quot;toCurrencyRateInt\&quot;: 0,\n            \&quot;toCurrencyRateExp\&quot;: 0\n          },\n          {\&quot;toCurrencyID\&quot;: null,\n            \&quot;toCurrencyRateInt\&quot;: 0,\n            \&quot;toCurrencyRateExp\&quot;: 0\n          },\n          {\&quot;toCurrencyID\&quot;: null,\n            \&quot;toCurrencyRateInt\&quot;: 0,\n            \&quot;toCurrencyRateExp\&quot;: 0\n          },\n          {\&quot;toCurrencyID\&quot;: null,\n            \&quot;toCurrencyRateInt\&quot;: 0,\n            \&quot;toCurrencyRateExp\&quot;: 0\n          },\n          {\&quot;toCurrencyID\&quot;: null,\n            \&quot;toCurrencyRateInt\&quot;: 0,\n            \&quot;toCurrencyRateExp\&quot;: 0\n          },\n          {\&quot;toCurrencyID\&quot;: null,\n            \&quot;toCurrencyRateInt\&quot;: 0,\n            \&quot;toCurrencyRateExp\&quot;: 0\n          },\n          {\&quot;toCurrencyID\&quot;: null,\n            \&quot;toCurrencyRateInt\&quot;: 0,\n            \&quot;toCurrencyRateExp\&quot;: 0\n          },\n          {\&quot;toCurrencyID\&quot;: null,\n            \&quot;toCurrencyRateInt\&quot;: 0,\n            \&quot;toCurrencyRateExp\&quot;: 0\n          },\n          {\&quot;toCurrencyID\&quot;: null,\n            \&quot;toCurrencyRateInt\&quot;: 0,\n            \&quot;toCurrencyRateExp\&quot;: 0\n          },\n          {\&quot;toCurrencyID\&quot;: null,\n            \&quot;toCurrencyRateInt\&quot;: 0,\n            \&quot;toCurrencyRateExp\&quot;: 0\n          },\n          {\&quot;toCurrencyID\&quot;: null,\n            \&quot;toCurrencyRateInt\&quot;: 0,\n            \&quot;toCurrencyRateExp\&quot;: 0\n          },\n          {\&quot;toCurrencyID\&quot;: null,\n            \&quot;toCurrencyRateInt\&quot;: 0,\n            \&quot;toCurrencyRateExp\&quot;: 0\n          },\n          {\&quot;toCurrencyID\&quot;: null,\n            \&quot;toCurrencyRateInt\&quot;: 0,\n            \&quot;toCurrencyRateExp\&quot;: 0\n          },\n          {\&quot;toCurrencyID\&quot;: null,\n            \&quot;toCurrencyRateInt\&quot;: 0,\n            \&quot;toCurrencyRateExp\&quot;: 0\n          },\n          {\&quot;toCurrencyID\&quot;: null,\n            \&quot;toCurrencyRateInt\&quot;: 0,\n            \&quot;toCurrencyRateExp\&quot;: 0\n          },\n          {\&quot;toCurrencyID\&quot;: null,\n            \&quot;toCurrencyRateInt\&quot;: 0,\n            \&quot;toCurrencyRateExp\&quot;: 0\n          },\n          {\&quot;toCurrencyID\&quot;: null,\n            \&quot;toCurrencyRateInt\&quot;: 0,\n            \&quot;toCurrencyRateExp\&quot;: 0\n          },\n          {\&quot;toCurrencyID\&quot;: null,\n            \&quot;toCurrencyRateInt\&quot;: 0,\n            \&quot;toCurrencyRateExp\&quot;: 0\n          },\n          {\&quot;toCurrencyID\&quot;: null,\n            \&quot;toCurrencyRateInt\&quot;: 0,\n            \&quot;toCurrencyRateExp\&quot;: 0\n          },\n          {\&quot;toCurrencyID\&quot;: null,\n            \&quot;toCurrencyRateInt\&quot;: 0,\n            \&quot;toCurrencyRateExp\&quot;: 0\n          },\n          {\&quot;toCurrencyID\&quot;: null,\n            \&quot;toCurrencyRateInt\&quot;: 0,\n            \&quot;toCurrencyRateExp\&quot;: 0\n          },\n          {\&quot;toCurrencyID\&quot;: null,\n            \&quot;toCurrencyRateInt\&quot;: 0,\n            \&quot;toCurrencyRateExp\&quot;: 0\n          },\n          {\&quot;toCurrencyID\&quot;: null,\n            \&quot;toCurrencyRateInt\&quot;: 0,\n            \&quot;toCurrencyRateExp\&quot;: 0\n          },\n          {\&quot;toCurrencyID\&quot;: null,\n            \&quot;toCurrencyRateInt\&quot;: 0,\n            \&quot;toCurrencyRateExp\&quot;: 0\n          },\n          {\&quot;toCurrencyID\&quot;: null,\n            \&quot;toCurrencyRateInt\&quot;: 0,\n            \&quot;toCurrencyRateExp\&quot;: 0\n          },\n          {\&quot;toCurrencyID\&quot;: null,\n            \&quot;toCurrencyRateInt\&quot;: 0,\n            \&quot;toCurrencyRateExp\&quot;: 0\n          },\n          {\&quot;toCurrencyID\&quot;: null,\n            \&quot;toCurrencyRateInt\&quot;: 0,\n            \&quot;toCurrencyRateExp\&quot;: 0\n          },\n          {\&quot;toCurrencyID\&quot;: null,\n            \&quot;toCurrencyRateInt\&quot;: 0,\n            \&quot;toCurrencyRateExp\&quot;: 0\n          },\n          {\&quot;toCurrencyID\&quot;: null,\n            \&quot;toCurrencyRateInt\&quot;: 0,\n            \&quot;toCurrencyRateExp\&quot;: 0\n          },\n          {\&quot;toCurrencyID\&quot;: null,\n            \&quot;toCurrencyRateInt\&quot;: 0,\n            \&quot;toCurrencyRateExp\&quot;: 0\n          },\n          {\&quot;toCurrencyID\&quot;: null,\n            \&quot;toCurrencyRateInt\&quot;: 0,\n            \&quot;toCurrencyRateExp\&quot;: 0\n          },\n          {\&quot;toCurrencyID\&quot;: null,\n            \&quot;toCurrencyRateInt\&quot;: 0,\n            \&quot;toCurrencyRateExp\&quot;: 0\n          },\n          {\&quot;toCurrencyID\&quot;: null,\n            \&quot;toCurrencyRateInt\&quot;: 0,\n            \&quot;toCurrencyRateExp\&quot;: 0\n          },\n          {\&quot;toCurrencyID\&quot;: null,\n            \&quot;toCurrencyRateInt\&quot;: 0,\n            \&quot;toCurrencyRateExp\&quot;: 0\n          },\n          {\&quot;toCurrencyID\&quot;: null,\n            \&quot;toCurrencyRateInt\&quot;: 0,\n            \&quot;toCurrencyRateExp\&quot;: 0\n          },\n          {\&quot;toCurrencyID\&quot;: null,\n            \&quot;toCurrencyRateInt\&quot;: 0,\n            \&quot;toCurrencyRateExp\&quot;: 0\n          },\n          {\&quot;toCurrencyID\&quot;: null,\n            \&quot;toCurrencyRateInt\&quot;: 0,\n            \&quot;toCurrencyRateExp\&quot;: 0\n          },\n          {\&quot;toCurrencyID\&quot;: null,\n            \&quot;toCurrencyRateInt\&quot;: 0,\n            \&quot;toCurrencyRateExp\&quot;: 0\n          },\n          {\&quot;toCurrencyID\&quot;: null,\n            \&quot;toCurrencyRateInt\&quot;: 0,\n            \&quot;toCurrencyRateExp\&quot;: 0\n          },\n          {\&quot;toCurrencyID\&quot;: null,\n            \&quot;toCurrencyRateInt\&quot;: 0,\n            \&quot;toCurrencyRateExp\&quot;: 0\n          },\n          {\&quot;toCurrencyID\&quot;: null,\n            \&quot;toCurrencyRateInt\&quot;: 0,\n            \&quot;toCurrencyRateExp\&quot;: 0\n          },\n          {\&quot;toCurrencyID\&quot;: null,\n            \&quot;toCurrencyRateInt\&quot;: 0,\n            \&quot;toCurrencyRateExp\&quot;: 0\n          },\n          {\&quot;toCurrencyID\&quot;: null,\n            \&quot;toCurrencyRateInt\&quot;: 0,\n            \&quot;toCurrencyRateExp\&quot;: 0\n          },\n          {\&quot;toCurrencyID\&quot;: null,\n            \&quot;toCurrencyRateInt\&quot;: 0,\n            \&quot;toCurrencyRateExp\&quot;: 0\n          },\n          {\&quot;toCurrencyID\&quot;: null,\n            \&quot;toCurrencyRateInt\&quot;: 0,\n            \&quot;toCurrencyRateExp\&quot;: 0\n          },\n          {\&quot;toCurrencyID\&quot;: null,\n            \&quot;toCurrencyRateInt\&quot;: 0,\n            \&quot;toCurrencyRateExp\&quot;: 0\n          }\n        ],\n      }\n    }\n  }\n}&quot;,
  &quot;contentType&quot;: &quot;application/json&quot;,
  &quot;charset&quot;: &quot;UTF-8&quot;
}</httpBodyContent>
   <httpBodyType>text</httpBodyType>
   <httpHeaderProperties>
      <isSelected>true</isSelected>
      <matchCondition>equals</matchCondition>
      <name>Content-Type</name>
      <type>Main</type>
      <value>application/json</value>
   </httpHeaderProperties>
   <httpHeaderProperties>
      <isSelected>true</isSelected>
      <matchCondition>equals</matchCondition>
      <name>Authorization</name>
      <type>Main</type>
      <value>Basic RnJlZDpmcmVkcHdk</value>
   </httpHeaderProperties>
   <migratedVersion>5.4.1</migratedVersion>
   <restRequestMethod>PATCH</restRequestMethod>
   <restUrl>https://20.14.209.1:9443/changeCurrencyRates/changeCurrencyRates?</restUrl>
   <serviceType>RESTful</serviceType>
   <soapBody></soapBody>
   <soapHeader></soapHeader>
   <soapRequestMethod></soapRequestMethod>
   <soapServiceFunction></soapServiceFunction>
   <verificationScript>import static org.assertj.core.api.Assertions.*

import com.kms.katalon.core.testobject.RequestObject
import com.kms.katalon.core.testobject.ResponseObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webservice.verification.WSResponseManager

import groovy.json.JsonSlurper
import internal.GlobalVariable as GlobalVariable

RequestObject request = WSResponseManager.getInstance().getCurrentRequest()

ResponseObject response = WSResponseManager.getInstance().getCurrentResponse()
</verificationScript>
   <wsdlAddress></wsdlAddress>
</WebServiceRequestEntity>
