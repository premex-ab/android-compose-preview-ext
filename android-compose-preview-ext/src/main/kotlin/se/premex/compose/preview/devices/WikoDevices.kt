package se.premex.compose.preview.devices

import kotlin.Any
import se.premex.compose.preview.Devices

/**
 * WIKO device specifications for Android Compose previews.
 *
 * This extension provides WIKO device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Wiko.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Wiko: Any
  get() = object {
      /** WIKO C210AE */
      val C210AE = "spec:width=480,height=960,unit=px,dpi=240"

      /** WIKO DBA-AN00 */
      val DBA_AN00 = "spec:width=720,height=1600,unit=px,dpi=480"

      /** WIKO i9031 */
      val I9031 = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** WIKO L5221 */
      val L5221 = "spec:width=480,height=854,unit=px,dpi=240"

      /** WIKO L5227AC */
      val L5227AC = "spec:width=480,height=854,unit=px,dpi=240"

      /** WIKO L5251 */
      val L5251 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** WIKO l5261 */
      val L5261 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** WIKO l5320 */
      val L5320 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** WIKO l5421 */
      val L5421 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** WIKO l5460 */
      val L5460 = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** WIKO l5510 */
      val L5510 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** WIKO l5560ae */
      val L5560AE = "spec:width=720,height=1280,unit=px,dpi=320"

      /** WIKO l9010 */
      val L9010 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** WIKO P4601AN */
      val P4601AN = "spec:width=720,height=1280,unit=px,dpi=320"

      /** WIKO P4661AN */
      val P4661AN = "spec:width=720,height=1280,unit=px,dpi=320"

      /** WIKO P4901AC */
      val P4901AC = "spec:width=720,height=1280,unit=px,dpi=320"

      /** WIKO P4903JP */
      val P4903JP = "spec:width=720,height=1280,unit=px,dpi=320"

      /** WIKO P4903LA */
      val P4903LA = "spec:width=720,height=1280,unit=px,dpi=320"

      /** WIKO P6601AE */
      val P6601AE = "spec:width=720,height=1280,unit=px,dpi=320"

      /** WIKO P6609BC */
      val P6609BC = "spec:width=720,height=1280,unit=px,dpi=320"

      /** WIKO P6609BCD */
      val P6609BCD = "spec:width=720,height=1280,unit=px,dpi=320"

      /** WIKO p6901 */
      val P6901 = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** WIKO p7201 */
      val P7201 = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** WIKO p7203 */
      val P7203 = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** WIKO s4050ap */
      val S4050AP = "spec:width=480,height=800,unit=px,dpi=240"

      /** WIKO s5030 */
      val S5030 = "spec:width=480,height=854,unit=px,dpi=240"

      /** WIKO S5030AP12H */
      val S5030AP12H = "spec:width=480,height=854,unit=px,dpi=240"

      /** WIKO s5201ap */
      val S5201AP = "spec:width=480,height=854,unit=px,dpi=240"

      /** WIKO s5222 */
      val S5222 = "spec:width=480,height=854,unit=px,dpi=240"

      /** WIKO s5250 */
      val S5250 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** WIKO s5254 */
      val S5254 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** WIKO S5260 */
      val S5260 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** WIKO S5420 */
      val S5420 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** WIKO s8515 */
      val S8515 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** WIKO T20 */
      val T20 = "spec:width=720,height=1612,unit=px,dpi=320"

      /** WIKO T2800AN */
      val T2800AN = "spec:width=480,height=854,unit=px,dpi=240"

      /** WIKO T3903BN */
      val T3903BN = "spec:width=480,height=854,unit=px,dpi=240"

      /** WIKO T3931AC */
      val T3931AC = "spec:width=720,height=1280,unit=px,dpi=320"

      /** WIKO T60 */
      val T60 = "spec:width=1080,height=2408,unit=px,dpi=480"

      /** WIKO T6901AC */
      val T6901AC = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** WIKO T9051AC */
      val T9051AC = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** WIKO U307AS */
      val U307AS = "spec:width=480,height=960,unit=px,dpi=213"

      /** WIKO U316AT */
      val U316AT = "spec:width=480,height=960,unit=px,dpi=220"

      /** WIKO U520AS */
      val U520AS = "spec:width=720,height=1440,unit=px,dpi=300"

      /** WIKO U614AS */
      val U614AS = "spec:width=720,height=1560,unit=px,dpi=300"

      /** WIKO U616AT */
      val U616AT = "spec:width=720,height=1600,unit=px,dpi=280"

      /** WIKO v12bn */
      val V12BN = "spec:width=720,height=1440,unit=px,dpi=320"

      /** WIKO v12bnlite */
      val V12BNLITE = "spec:width=720,height=1440,unit=px,dpi=320"

      /** WIKO v12dnlite */
      val V12DNLITE = "spec:width=720,height=1440,unit=px,dpi=320"

      /** WIKO v12enlite */
      val V12ENLITE = "spec:width=720,height=1440,unit=px,dpi=320"

      /** WIKO V2502AN */
      val V2502AN = "spec:width=480,height=800,unit=px,dpi=240"

      /** WIKO v2508 */
      val V2508 = "spec:width=480,height=800,unit=px,dpi=240"

      /** WIKO v2510 */
      val V2510 = "spec:width=480,height=800,unit=px,dpi=240"

      /** WIKO v2520 */
      val V2520 = "spec:width=480,height=800,unit=px,dpi=240"

      /** WIKO v2600cn */
      val V2600CN = "spec:width=480,height=854,unit=px,dpi=240"

      /** WIKO v2610 */
      val V2610 = "spec:width=480,height=854,unit=px,dpi=240"

      /** WIKO V2800AN */
      val V2800AN = "spec:width=480,height=854,unit=px,dpi=240"

      /** WIKO V2802AN */
      val V2802AN = "spec:width=480,height=854,unit=px,dpi=240"

      /** WIKO v2806 */
      val V2806 = "spec:width=480,height=854,unit=px,dpi=240"

      /** WIKO V3610AN */
      val V3610AN = "spec:width=480,height=854,unit=px,dpi=240"

      /** WIKO V3702AN */
      val V3702AN = "spec:width=720,height=1280,unit=px,dpi=320"

      /** WIKO v3720 */
      val V3720 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** WIKO v3740 */
      val V3740 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** WIKO V3750AN */
      val V3750AN = "spec:width=720,height=1280,unit=px,dpi=320"

      /** WIKO V3802AN */
      val V3802AN = "spec:width=720,height=1280,unit=px,dpi=320"

      /** WIKO V3903BN */
      val V3903BN = "spec:width=480,height=854,unit=px,dpi=240"

      /** WIKO v3913 */
      val V3913 = "spec:width=480,height=854,unit=px,dpi=240"

      /** WIKO V3913BN22I */
      val V3913BN22I = "spec:width=480,height=854,unit=px,dpi=240"

      /** WIKO V3921 */
      val V3921 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** WIKO V3931AC */
      val V3931AC = "spec:width=720,height=1280,unit=px,dpi=320"

      /** WIKO V3933AC */
      val V3933AC = "spec:width=720,height=1280,unit=px,dpi=320"

      /** WIKO v3941 */
      val V3941 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** WIKO v3953 */
      val V3953 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** WIKO V3953AN25K */
      val V3953AN25K = "spec:width=720,height=1280,unit=px,dpi=320"

      /** WIKO v3961 */
      val V3961 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** WIKO v3971 */
      val V3971 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** WIKO V3991AN */
      val V3991AN = "spec:width=720,height=1280,unit=px,dpi=320"

      /** WIKO VHEM */
      val VHEM = "spec:width=720,height=1600,unit=px,dpi=260"

      /** WIKO WC300 */
      val WC300 = "spec:width=720,height=1440,unit=px,dpi=320"

      /** WIKO WC300SN */
      val WC300SN = "spec:width=720,height=1440,unit=px,dpi=320"

      /** WIKO W_C200SN */
      val W_C200SN = "spec:width=480,height=960,unit=px,dpi=240"

      /** WIKO W_C201 */
      val W_C201 = "spec:width=480,height=960,unit=px,dpi=240"

      /** WIKO W_C800 */
      val W_C800 = "spec:width=720,height=1528,unit=px,dpi=280"

      /** WIKO W_C800S */
      val W_C800S = "spec:width=720,height=1528,unit=px,dpi=280"

      /** WIKO W_C860 */
      val W_C860 = "spec:width=720,height=1528,unit=px,dpi=280"

      /** WIKO W_K101 */
      val W_K101 = "spec:width=480,height=800,unit=px,dpi=240"

      /** WIKO W_K101S */
      val W_K101S = "spec:width=480,height=800,unit=px,dpi=240"

      /** WIKO W_K120 */
      val W_K120 = "spec:width=480,height=854,unit=px,dpi=240"

      /** WIKO W-K130 */
      val W_K130 = "spec:width=480,height=854,unit=px,dpi=240"

      /** WIKO W-K200 */
      val W_K200 = "spec:width=480,height=960,unit=px,dpi=240"

      /** WIKO W-K211 */
      val W_K211 = "spec:width=720,height=1600,unit=px,dpi=300"

      /** WIKO W_K300 */
      val W_K300 = "spec:width=480,height=960,unit=px,dpi=240"

      /** WIKO W_K300S */
      val W_K300S = "spec:width=480,height=960,unit=px,dpi=240"

      /** WIKO W-K360 */
      val W_K360 = "spec:width=720,height=1440,unit=px,dpi=320"

      /** WIKO W-K380 */
      val W_K380 = "spec:width=720,height=1600,unit=px,dpi=300"

      /** WIKO W_K400 */
      val W_K400 = "spec:width=720,height=1440,unit=px,dpi=320"

      /** WIKO W-K420 */
      val W_K420 = "spec:width=720,height=1440,unit=px,dpi=320"

      /** WIKO W-K510 */
      val W_K510 = "spec:width=480,height=960,unit=px,dpi=240"

      /** WIKO W-K510DG */
      val W_K510DG = "spec:width=480,height=960,unit=px,dpi=240"

      /** WIKO W-K521 */
      val W_K521 = "spec:width=480,height=854,unit=px,dpi=200"

      /** WIKO W-K560 */
      val W_K560 = "spec:width=480,height=960,unit=px,dpi=240"

      /** WIKO W_K600 */
      val W_K600 = "spec:width=480,height=960,unit=px,dpi=240"

      /** WIKO W-K610 */
      val W_K610 = "spec:width=720,height=1560,unit=px,dpi=280"

      /** WIKO W-K630 */
      val W_K630 = "spec:width=720,height=1600,unit=px,dpi=320"

      /** WIKO W_P130 */
      val W_P130 = "spec:width=720,height=1440,unit=px,dpi=320"

      /** WIKO W_P200 */
      val W_P200 = "spec:width=720,height=1440,unit=px,dpi=320"

      /** WIKO W_P200CM */
      val W_P200CM = "spec:width=720,height=1440,unit=px,dpi=320"

      /** WIKO W-P210 */
      val W_P210 = "spec:width=720,height=1512,unit=px,dpi=320"

      /** WIKO W-P220 */
      val W_P220 = "spec:width=720,height=1512,unit=px,dpi=320"

      /** WIKO W-P311 */
      val W_P311 = "spec:width=720,height=1520,unit=px,dpi=280"

      /** WIKO W-P611 */
      val W_P611 = "spec:width=1080,height=2340,unit=px,dpi=420"

      /** WIKO W-P861 */
      val W_P861 = "spec:width=1080,height=2400,unit=px,dpi=400"

      /** WIKO W-U300 */
      val W_U300 = "spec:width=480,height=960,unit=px,dpi=213"

      /** WIKO W-V600 */
      val W_V600 = "spec:width=720,height=1440,unit=px,dpi=320"

      /** WIKO W-V673 */
      val W_V673 = "spec:width=720,height=1600,unit=px,dpi=280"

      /** WIKO W-V680 */
      val W_V680 = "spec:width=720,height=1520,unit=px,dpi=280"

      /** WIKO W-V720 */
      val W_V720 = "spec:width=720,height=1440,unit=px,dpi=320"

      /** WIKO W-V730 */
      val W_V730 = "spec:width=720,height=1600,unit=px,dpi=280"

      /** WIKO W-V745 */
      val W_V745 = "spec:width=720,height=1640,unit=px,dpi=280"

      /** WIKO W-V750BN */
      val W_V750BN = "spec:width=720,height=1640,unit=px,dpi=260"

      /** WIKO W-V755 */
      val W_V755 = "spec:width=720,height=1640,unit=px,dpi=260"

      /** WIKO W-V770 */
      val W_V770 = "spec:width=720,height=1600,unit=px,dpi=280"

      /** WIKO W-V800 */
      val W_V800 = "spec:width=720,height=1560,unit=px,dpi=320"

      /** WIKO W-V830 */
      val W_V830 = "spec:width=720,height=1600,unit=px,dpi=280"

      /** WIKO W-V850 */
      val W_V850 = "spec:width=720,height=1600,unit=px,dpi=280"

      /** WIKO W-V851 */
      val W_V851 = "spec:width=720,height=1600,unit=px,dpi=280"

  }
