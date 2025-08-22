package se.premex.compose.preview.devices

import kotlin.Any
import se.premex.compose.preview.Devices

/**
 * HOTWAV device specifications for Android Compose previews.
 *
 * This extension provides HOTWAV device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Hotwav.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Hotwav: Any
  get() = object {
      /** HOTWAV Cosmos_U */
      val COSMOS_U = "spec:width=480,height=996,unit=px,dpi=240"

      /** HOTWAV Cyber_13 */
      val CYBER_13 = "spec:width=720,height=1612,unit=px,dpi=300"

      /** HOTWAV Cyber_13_Pro */
      val CYBER_13_PRO = "spec:width=1080,height=2408,unit=px,dpi=440"

      /** HOTWAV Cyber_15 */
      val CYBER_15 = "spec:width=1080,height=2408,unit=px,dpi=480"

      /** HOTWAV Cyber_7 */
      val CYBER_7 = "spec:width=1080,height=2340,unit=px,dpi=480"

      /** HOTWAV Cyber_8 */
      val CYBER_8 = "spec:width=720,height=1520,unit=px,dpi=320"

      /** HOTWAV Cyber_9_Pro */
      val CYBER_9_PRO = "spec:width=720,height=1520,unit=px,dpi=320"

      /** HOTWAV Cyber_X */
      val CYBER_X = "spec:width=1080,height=2460,unit=px,dpi=480"

      /** HOTWAV Cyber_X_Pro */
      val CYBER_X_PRO = "spec:width=1080,height=2460,unit=px,dpi=480"

      /** HOTWAV H1 */
      val H1 = "spec:width=480,height=1014,unit=px,dpi=240"

      /** HOTWAV HOT_6 */
      val HOT_6 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** HOTWAV Hyper_7 */
      val HYPER_7 = "spec:width=1080,height=2408,unit=px,dpi=480"

      /** HOTWAV Hyper_7_Pro */
      val HYPER_7_PRO = "spec:width=1080,height=2408,unit=px,dpi=480"

      /** HOTWAV M5 */
      val M5 = "spec:width=720,height=1440,unit=px,dpi=320"

      /** HOTWAV M5i */
      val M5I = "spec:width=720,height=1440,unit=px,dpi=320"

      /** HOTWAV M5_Plus */
      val M5_PLUS = "spec:width=720,height=1440,unit=px,dpi=320"

      /** HOTWAV M6 */
      val M6 = "spec:width=720,height=1440,unit=px,dpi=320"

      /** HOTWAV Note_12_2024 */
      val NOTE_12_2024 = "spec:width=720,height=1640,unit=px,dpi=320"

      /** HOTWAV Note_12_EF */
      val NOTE_12_EF = "spec:width=720,height=1640,unit=px,dpi=320"

      /** HOTWAV Note_13 */
      val NOTE_13 = "spec:width=720,height=1612,unit=px,dpi=320"

      /** HOTWAV Note_13_Max */
      val NOTE_13_MAX = "spec:width=720,height=1640,unit=px,dpi=320"

      /** HOTWAV Note_13_Pro */
      val NOTE_13_PRO = "spec:width=720,height=1612,unit=px,dpi=320"

      /** HOTWAV Note_15 */
      val NOTE_15 = "spec:width=720,height=1612,unit=px,dpi=320"

      /** HOTWAV Note_15_Pro */
      val NOTE_15_PRO = "spec:width=720,height=1612,unit=px,dpi=320"

      /** HOTWAV Note_16 */
      val NOTE_16 = "spec:width=720,height=1640,unit=px,dpi=320"

      /** HOTWAV Pad_11_EEA */
      val PAD_11_EEA = "spec:width=1200,height=1920,unit=px,dpi=320"

      /** HOTWAV Pad_8 */
      val PAD_8 = "spec:width=1200,height=2000,unit=px,dpi=320"

      /** HOTWAV Pearl_K1 */
      val PEARL_K1 = "spec:width=720,height=1520,unit=px,dpi=320"

      /** HOTWAV Pearl_K2 */
      val PEARL_K2 = "spec:width=720,height=1520,unit=px,dpi=320"

      /** HOTWAV Pearl_K2_Prime */
      val PEARL_K2_PRIME = "spec:width=720,height=1520,unit=px,dpi=320"

      /** HOTWAV Pearl_K3 */
      val PEARL_K3 = "spec:width=720,height=1560,unit=px,dpi=320"

      /** HOTWAV Symbol */
      val SYMBOL = "spec:width=720,height=1498,unit=px,dpi=320"

      /** HOTWAV Symbol_Max */
      val SYMBOL_MAX = "spec:width=720,height=1520,unit=px,dpi=320"

      /** HOTWAV Symbol_X */
      val SYMBOL_X = "spec:width=720,height=1498,unit=px,dpi=320"

      /** HOTWAV T5_Pro */
      val T5_PRO = "spec:width=480,height=960,unit=px,dpi=240"

      /** HOTWAV T7 */
      val T7 = "spec:width=720,height=1600,unit=px,dpi=320"

      /** HOTWAV T7_Pro */
      val T7_PRO = "spec:width=1080,height=2408,unit=px,dpi=480"

      /** HOTWAV TAB_R5 */
      val TAB_R5 = "spec:width=800,height=1280,unit=px,dpi=213"

      /** HOTWAV TAB_R6_Pro */
      val TAB_R6_PRO = "spec:width=800,height=1280,unit=px,dpi=213"

      /** HOTWAV TAB_R6_Ultra */
      val TAB_R6_ULTRA = "spec:width=1200,height=2000,unit=px,dpi=320"

      /** HOTWAV TAB_R7 */
      val TAB_R7 = "spec:width=800,height=1280,unit=px,dpi=213"

      /** HOTWAV TAB_R8 */
      val TAB_R8 = "spec:width=800,height=1280,unit=px,dpi=213"

      /** HOTWAV TAB_R9_Pro */
      val TAB_R9_PRO = "spec:width=1200,height=1920,unit=px,dpi=240"

      /** HOTWAV W10 */
      val W10 = "spec:width=720,height=1600,unit=px,dpi=320"

      /** HOTWAV W10_Pro */
      val W10_PRO = "spec:width=720,height=1600,unit=px,dpi=320"

      /** HOTWAV W11 */
      val W11 = "spec:width=1080,height=2408,unit=px,dpi=480"

  }
