package se.premex.compose.preview.devices

import kotlin.Any
import se.premex.compose.preview.Devices

/**
 * Trident device specifications for Android Compose previews.
 *
 * This extension provides Trident device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Trident.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Trident: Any
  get() = object {
      /** Trident A23_Max */
      val A23_MAX = "spec:width=720,height=1560,unit=px,dpi=320"

      /** Trident A24 */
      val A24 = "spec:width=1080,height=2340,unit=px,dpi=480"

      /** Trident A25 */
      val A25 = "spec:width=1080,height=2340,unit=px,dpi=480"

      /** Trident A43 */
      val A43 = "spec:width=720,height=1600,unit=px,dpi=320"

      /** Trident A53_PRO */
      val A53_PRO = "spec:width=1080,height=2340,unit=px,dpi=480"

      /** Trident A54 */
      val A54 = "spec:width=1080,height=2340,unit=px,dpi=480"

      /** Trident A55 */
      val A55 = "spec:width=720,height=1600,unit=px,dpi=320"

      /** Trident A60 */
      val A60 = "spec:width=1080,height=2400,unit=px,dpi=480"

      /** Trident A75 */
      val A75 = "spec:width=1080,height=2460,unit=px,dpi=480"

  }
