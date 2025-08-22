package se.premex.compose.preview.devices

import kotlin.Any
import se.premex.compose.preview.Devices

/**
 * Evertek device specifications for Android Compose previews.
 *
 * This extension provides Evertek device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Evertek.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Evertek: Any
  get() = object {
      /** Evertek Evertek_M10_Pro */
      val EVERTEK_M10_PRO = "spec:width=480,height=960,unit=px,dpi=240"

      /** Evertek Hero */
      val HERO = "spec:width=720,height=1560,unit=px,dpi=320"

      /** Evertek M10 */
      val M10 = "spec:width=480,height=960,unit=px,dpi=240"

      /** Evertek M10_Lite */
      val M10_LITE = "spec:width=480,height=800,unit=px,dpi=240"

      /** Evertek M10_Nano */
      val M10_NANO = "spec:width=480,height=800,unit=px,dpi=240"

      /** Evertek M20 */
      val M20 = "spec:width=720,height=1600,unit=px,dpi=300"

      /** Evertek M20_Mini */
      val M20_MINI = "spec:width=720,height=1600,unit=px,dpi=300"

      /** Evertek M20_NANO */
      val M20_NANO = "spec:width=480,height=800,unit=px,dpi=240"

      /** Evertek M20_Pro */
      val M20_PRO = "spec:width=720,height=1560,unit=px,dpi=280"

      /** Evertek M20_S */
      val M20_S = "spec:width=720,height=1600,unit=px,dpi=300"

      /** Evertek V5 */
      val V5 = "spec:width=480,height=960,unit=px,dpi=240"

      /** Evertek V5_Nano */
      val V5_NANO = "spec:width=480,height=800,unit=px,dpi=240"

  }
