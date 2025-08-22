package se.premex.compose.preview.devices

import kotlin.Any
import se.premex.compose.preview.Devices

/**
 * KAPSYS device specifications for Android Compose previews.
 *
 * This extension provides KAPSYS device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Kapsys.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Kapsys: Any
  get() = object {
      /** KAPSYS r889 */
      val R889 = "spec:width=480,height=800,unit=px,dpi=240"

      /** KAPSYS SmartVision3 */
      val SMARTVISION3 = "spec:width=640,height=960,unit=px,dpi=260"

      /** KAPSYS SmartVision3us */
      val SMARTVISION3US = "spec:width=640,height=960,unit=px,dpi=260"

  }
