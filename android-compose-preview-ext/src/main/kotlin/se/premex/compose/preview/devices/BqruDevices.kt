package se.premex.compose.preview.devices

import kotlin.Any
import se.premex.compose.preview.Devices

/**
 * BQru device specifications for Android Compose previews.
 *
 * This extension provides BQru device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Bqru.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Bqru: Any
  get() = object {
      /** BQru BQru */
      val BQRU = "spec:width=720,height=1280,unit=px,dpi=320"

      /** BQru BQru-1020L */
      val BQRU_1020L = "spec:width=600,height=1024,unit=px,dpi=160"

      /** BQru BQru-1022L */
      val BQRU_1022L = "spec:width=800,height=1280,unit=px,dpi=213"

      /** BQru BQru-1024L */
      val BQRU_1024L = "spec:width=800,height=1280,unit=px,dpi=160"

      /** BQru BQru-1025L */
      val BQRU_1025L = "spec:width=1200,height=1920,unit=px,dpi=280"

      /** BQru BQru-1045 */
      val BQRU_1045 = "spec:width=800,height=1280,unit=px,dpi=213"

      /** BQru BQru-1045G_2019 */
      val BQRU_1045G_2019 = "spec:width=800,height=1280,unit=px,dpi=213"

      /** BQru BQru-1045G_A11 */
      val BQRU_1045G_A11 = "spec:width=800,height=1280,unit=px,dpi=213"

      /** BQru BQru_1056L */
      val BQRU_1056L = "spec:width=800,height=1280,unit=px,dpi=213"

      /** BQru BQru-1077L */
      val BQRU_1077L = "spec:width=800,height=1280,unit=px,dpi=213"

      /** BQru BQru-1077L_2019 */
      val BQRU_1077L_2019 = "spec:width=800,height=1280,unit=px,dpi=213"

      /** BQru BQru-1081G */
      val BQRU_1081G = "spec:width=600,height=1024,unit=px,dpi=213"

      /** BQru BQru-1081G_2019 */
      val BQRU_1081G_2019 = "spec:width=600,height=1024,unit=px,dpi=160"

      /** BQru BQru-1082G */
      val BQRU_1082G = "spec:width=600,height=1024,unit=px,dpi=160"

      /** BQru BQru-1082G_2019 */
      val BQRU_1082G_2019 = "spec:width=600,height=1024,unit=px,dpi=160"

      /** BQru BQru-1082G_2020 */
      val BQRU_1082G_2020 = "spec:width=600,height=1024,unit=px,dpi=160"

      /** BQru BQru-1083G */
      val BQRU_1083G = "spec:width=800,height=1280,unit=px,dpi=213"

      /** BQru BQru-1083G_2019 */
      val BQRU_1083G_2019 = "spec:width=800,height=1280,unit=px,dpi=213"

      /** BQru BQru-1083G_2020 */
      val BQRU_1083G_2020 = "spec:width=800,height=1280,unit=px,dpi=213"

      /** BQru BQru-1084L */
      val BQRU_1084L = "spec:width=800,height=1280,unit=px,dpi=213"

      /** BQru BQru-1085L */
      val BQRU_1085L = "spec:width=800,height=1280,unit=px,dpi=213"

      /** BQru BQru-1085L_2020 */
      val BQRU_1085L_2020 = "spec:width=800,height=1280,unit=px,dpi=160"

      /** BQru BQru-4028 */
      val BQRU_4028 = "spec:width=480,height=800,unit=px,dpi=240"

      /** BQru BQru-4030G */
      val BQRU_4030G = "spec:width=480,height=800,unit=px,dpi=240"

      /** BQru BQru_4072 */
      val BQRU_4072 = "spec:width=480,height=800,unit=px,dpi=240"

      /** BQru BQru-4500 */
      val BQRU_4500 = "spec:width=480,height=854,unit=px,dpi=240"

      /** BQru BQru-4501G */
      val BQRU_4501G = "spec:width=480,height=854,unit=px,dpi=240"

      /** BQru BQru-4583 */
      val BQRU_4583 = "spec:width=480,height=854,unit=px,dpi=240"

      /** BQru BQru-5000G */
      val BQRU_5000G = "spec:width=480,height=854,unit=px,dpi=240"

      /** BQru BQru-5002G */
      val BQRU_5002G = "spec:width=480,height=854,unit=px,dpi=240"

      /** BQru BQru_5003L */
      val BQRU_5003L = "spec:width=720,height=1280,unit=px,dpi=320"

      /** BQru BQru_5005L */
      val BQRU_5005L = "spec:width=720,height=1280,unit=px,dpi=320"

      /** BQru BQru-5007L */
      val BQRU_5007L = "spec:width=720,height=1280,unit=px,dpi=320"

      /** BQru BQru_5009L */
      val BQRU_5009L = "spec:width=720,height=1280,unit=px,dpi=320"

      /** BQru BQru-5010G */
      val BQRU_5010G = "spec:width=720,height=1280,unit=px,dpi=320"

      /** BQru BQru-5011G */
      val BQRU_5011G = "spec:width=480,height=960,unit=px,dpi=240"

      /** BQru BQru_5012L */
      val BQRU_5012L = "spec:width=720,height=1280,unit=px,dpi=320"

      /** BQru BQru-5016G */
      val BQRU_5016G = "spec:width=720,height=1280,unit=px,dpi=320"

      /** BQru BQru-5031G */
      val BQRU_5031G = "spec:width=720,height=1280,unit=px,dpi=300"

      /** BQru BQru_5033 */
      val BQRU_5033 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** BQru BQru-5035 */
      val BQRU_5035 = "spec:width=480,height=854,unit=px,dpi=240"

      /** BQru BQru-5037 */
      val BQRU_5037 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** BQru BQru-5044 */
      val BQRU_5044 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** BQru BQru-5045L */
      val BQRU_5045L = "spec:width=480,height=960,unit=px,dpi=240"

      /** BQru BQru-5047L */
      val BQRU_5047L = "spec:width=480,height=854,unit=px,dpi=240"

      /** BQru BQru-5056 */
      val BQRU_5056 = "spec:width=480,height=854,unit=px,dpi=213"

      /** BQru BQru_5057 */
      val BQRU_5057 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** BQru BQru-5058 */
      val BQRU_5058 = "spec:width=480,height=854,unit=px,dpi=240"

      /** BQru BQru_5059 */
      val BQRU_5059 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** BQru BQru-5060 */
      val BQRU_5060 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** BQru BQru-5060L */
      val BQRU_5060L = "spec:width=480,height=854,unit=px,dpi=240"

      /** BQru BQru-5060L_9832E */
      val BQRU_5060L_9832E = "spec:width=480,height=854,unit=px,dpi=240"

      /** BQru BQru-5201 */
      val BQRU_5201 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** BQru BQru-5202 */
      val BQRU_5202 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** BQru BQru-5203 */
      val BQRU_5203 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** BQru BQru-5204 */
      val BQRU_5204 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** BQru BQru-5206L */
      val BQRU_5206L = "spec:width=720,height=1280,unit=px,dpi=320"

      /** BQru BQru-5211 */
      val BQRU_5211 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** BQru BQru-5300G */
      val BQRU_5300G = "spec:width=480,height=960,unit=px,dpi=240"

      /** BQru BQru-5302G */
      val BQRU_5302G = "spec:width=480,height=960,unit=px,dpi=240"

      /** BQru BQru-5340 */
      val BQRU_5340 = "spec:width=480,height=960,unit=px,dpi=240"

      /** BQru BQru-5500L */
      val BQRU_5500L = "spec:width=720,height=1440,unit=px,dpi=320"

      /** BQru BQru_5504 */
      val BQRU_5504 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** BQru BQru-5508L */
      val BQRU_5508L = "spec:width=480,height=960,unit=px,dpi=240"

      /** BQru BQru_5510 */
      val BQRU_5510 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** BQru BQru-5512L */
      val BQRU_5512L = "spec:width=720,height=1440,unit=px,dpi=320"

      /** BQru BQru-5514G */
      val BQRU_5514G = "spec:width=720,height=1440,unit=px,dpi=320"

      /** BQru BQru-5514L */
      val BQRU_5514L = "spec:width=720,height=1440,unit=px,dpi=320"

      /** BQru BQru-5515L */
      val BQRU_5515L = "spec:width=480,height=960,unit=px,dpi=240"

      /** BQru BQru-5516L */
      val BQRU_5516L = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** BQru BQru-5517L */
      val BQRU_5517L = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** BQru BQru-5518G */
      val BQRU_5518G = "spec:width=480,height=960,unit=px,dpi=240"

      /** BQru BQru-5519G */
      val BQRU_5519G = "spec:width=480,height=960,unit=px,dpi=240"

      /** BQru BQru-5519L */
      val BQRU_5519L = "spec:width=720,height=1440,unit=px,dpi=320"

      /** BQru BQru-5520L */
      val BQRU_5520L = "spec:width=720,height=1440,unit=px,dpi=320"

      /** BQru BQru_5521L */
      val BQRU_5521L = "spec:width=720,height=1280,unit=px,dpi=320"

      /** BQru BQru-5522 */
      val BQRU_5522 = "spec:width=480,height=960,unit=px,dpi=240"

      /** BQru BQru-5528L */
      val BQRU_5528L = "spec:width=720,height=1440,unit=px,dpi=320"

      /** BQru BQru-5530L */
      val BQRU_5530L = "spec:width=720,height=1440,unit=px,dpi=320"

      /** BQru BQru-5533G */
      val BQRU_5533G = "spec:width=480,height=960,unit=px,dpi=200"

      /** BQru BQru-5535L */
      val BQRU_5535L = "spec:width=720,height=1440,unit=px,dpi=320"

      /** BQru BQru-5540L */
      val BQRU_5540L = "spec:width=720,height=1440,unit=px,dpi=320"

      /** BQru BQru-5541L */
      val BQRU_5541L = "spec:width=720,height=1440,unit=px,dpi=320"

      /** BQru BQru-5560L */
      val BQRU_5560L = "spec:width=720,height=1440,unit=px,dpi=320"

      /** BQru BQru-5565L */
      val BQRU_5565L = "spec:width=720,height=1440,unit=px,dpi=320"

      /** BQru BQru-5591 */
      val BQRU_5591 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** BQru BQru_5594 */
      val BQRU_5594 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** BQru BQru-5700L */
      val BQRU_5700L = "spec:width=720,height=1440,unit=px,dpi=320"

      /** BQru BQru-5701L */
      val BQRU_5701L = "spec:width=720,height=1440,unit=px,dpi=320"

      /** BQru BQru_5702 */
      val BQRU_5702 = "spec:width=480,height=960,unit=px,dpi=240"

      /** BQru BQru-5707G */
      val BQRU_5707G = "spec:width=720,height=1440,unit=px,dpi=320"

      /** BQru BQru-5730L */
      val BQRU_5730L = "spec:width=720,height=1520,unit=px,dpi=320"

      /** BQru BQru-5731L */
      val BQRU_5731L = "spec:width=1080,height=2280,unit=px,dpi=480"

      /** BQru BQru-5732L */
      val BQRU_5732L = "spec:width=720,height=1520,unit=px,dpi=320"

      /** BQru BQru-5740G */
      val BQRU_5740G = "spec:width=480,height=960,unit=px,dpi=240"

      /** BQru BQru-5740G_7731 */
      val BQRU_5740G_7731 = "spec:width=480,height=960,unit=px,dpi=240"

      /** BQru BQru-5745L */
      val BQRU_5745L = "spec:width=720,height=1440,unit=px,dpi=320"

      /** BQru BQru-5765L */
      val BQRU_5765L = "spec:width=720,height=1440,unit=px,dpi=320"

      /** BQru BQru-6000L */
      val BQRU_6000L = "spec:width=720,height=1440,unit=px,dpi=320"

      /** BQru BQru-6001L */
      val BQRU_6001L = "spec:width=720,height=1440,unit=px,dpi=320"

      /** BQru BQru_6010G */
      val BQRU_6010G = "spec:width=480,height=960,unit=px,dpi=240"

      /** BQru BQru-6015L */
      val BQRU_6015L = "spec:width=720,height=1528,unit=px,dpi=280"

      /** BQru BQru-6016L */
      val BQRU_6016L = "spec:width=720,height=1440,unit=px,dpi=320"

      /** BQru BQru_6022G */
      val BQRU_6022G = "spec:width=480,height=960,unit=px,dpi=240"

      /** BQru BQru-6030G */
      val BQRU_6030G = "spec:width=480,height=960,unit=px,dpi=240"

      /** BQru BQru-6030G_7731 */
      val BQRU_6030G_7731 = "spec:width=480,height=960,unit=px,dpi=240"

      /** BQru BQru-6035L */
      val BQRU_6035L = "spec:width=1080,height=2160,unit=px,dpi=480"

      /** BQru BQru-6040L */
      val BQRU_6040L = "spec:width=720,height=1560,unit=px,dpi=320"

      /** BQru BQru-6042L */
      val BQRU_6042L = "spec:width=600,height=1280,unit=px,dpi=240"

      /** BQru BQru-6045L */
      val BQRU_6045L = "spec:width=480,height=960,unit=px,dpi=240"

      /** BQru BQru-6061L */
      val BQRU_6061L = "spec:width=720,height=1560,unit=px,dpi=320"

      /** BQru BQru-6065L */
      val BQRU_6065L = "spec:width=720,height=1440,unit=px,dpi=320"

      /** BQru BQru-6200L */
      val BQRU_6200L = "spec:width=1080,height=2246,unit=px,dpi=480"

      /** BQru BQru-6353L */
      val BQRU_6353L = "spec:width=720,height=1520,unit=px,dpi=320"

      /** BQru BQru-6424L */
      val BQRU_6424L = "spec:width=720,height=1560,unit=px,dpi=320"

      /** BQru BQru_6430L */
      val BQRU_6430L = "spec:width=1080,height=2310,unit=px,dpi=480"

      /** BQru BQru-6630L */
      val BQRU_6630L = "spec:width=720,height=1600,unit=px,dpi=320"

      /** BQru BQru-6631G */
      val BQRU_6631G = "spec:width=720,height=1280,unit=px,dpi=320"

      /** BQru BQru-6631G_A11 */
      val BQRU_6631G_A11 = "spec:width=720,height=1560,unit=px,dpi=320"

      /** BQru BQru-6645L */
      val BQRU_6645L = "spec:width=540,height=1200,unit=px,dpi=240"

      /** BQru BQru-6868L */
      val BQRU_6868L = "spec:width=720,height=1600,unit=px,dpi=320"

      /** BQru BQru-7000G */
      val BQRU_7000G = "spec:width=600,height=1024,unit=px,dpi=213"

      /** BQru BQru-7000G_2020 */
      val BQRU_7000G_2020 = "spec:width=600,height=1024,unit=px,dpi=160"

      /** BQru BQru-7036L */
      val BQRU_7036L = "spec:width=600,height=1024,unit=px,dpi=213"

      /** BQru BQru-7038G */
      val BQRU_7038G = "spec:width=600,height=1024,unit=px,dpi=213"

      /** BQru BQru-7040G */
      val BQRU_7040G = "spec:width=600,height=1024,unit=px,dpi=213"

      /** BQru BQru-7040G_2020 */
      val BQRU_7040G_2020 = "spec:width=600,height=1024,unit=px,dpi=160"

      /** BQru BQru-7081 */
      val BQRU_7081 = "spec:width=600,height=1024,unit=px,dpi=213"

      /** BQru BQru-7082 */
      val BQRU_7082 = "spec:width=600,height=1024,unit=px,dpi=213"

      /** BQru BQru-7082G_2019 */
      val BQRU_7082G_2019 = "spec:width=600,height=1024,unit=px,dpi=213"

      /** BQru BQru-7082G_2020 */
      val BQRU_7082G_2020 = "spec:width=600,height=1024,unit=px,dpi=160"

      /** BQru BQru-7083 */
      val BQRU_7083 = "spec:width=600,height=1024,unit=px,dpi=213"

      /** BQru BQru-7083G_Plus */
      val BQRU_7083G_PLUS = "spec:width=600,height=1024,unit=px,dpi=213"

      /** BQru BQru-7098G */
      val BQRU_7098G = "spec:width=600,height=1024,unit=px,dpi=213"

      /** BQru BQru-7098G_2020 */
      val BQRU_7098G_2020 = "spec:width=600,height=1024,unit=px,dpi=160"

      /** BQru BQru-8068L */
      val BQRU_8068L = "spec:width=800,height=1280,unit=px,dpi=240"

      /** BQru BQru-8068L_A11 */
      val BQRU_8068L_A11 = "spec:width=800,height=1280,unit=px,dpi=213"

      /** BQru BQru-8077L */
      val BQRU_8077L = "spec:width=800,height=1280,unit=px,dpi=213"

      /** BQru BQru-9055L */
      val BQRU_9055L = "spec:width=800,height=1280,unit=px,dpi=213"

      /** BQru BQ-1025L */
      val BQ_1025L = "spec:width=1200,height=1920,unit=px,dpi=320"

      /** BQru BQ_1036L */
      val BQ_1036L = "spec:width=1200,height=1920,unit=px,dpi=280"

      /** BQru BQ-5046L */
      val BQ_5046L = "spec:width=720,height=1280,unit=px,dpi=320"

      /** BQru BQ-7055L */
      val BQ_7055L = "spec:width=600,height=1024,unit=px,dpi=213"

      /** BQru BQ_8088L */
      val BQ_8088L = "spec:width=800,height=1280,unit=px,dpi=213"

  }
