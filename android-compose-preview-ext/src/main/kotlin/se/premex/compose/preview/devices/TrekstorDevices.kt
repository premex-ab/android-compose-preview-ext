package se.premex.compose.preview.devices

import kotlin.Any
import se.premex.compose.preview.Devices

/**
 * TrekStor device specifications for Android Compose previews.
 *
 * This extension provides TrekStor device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Trekstor.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Trekstor: Any
  get() = object {
      /** TrekStor SurfTab */
      val SURFTAB = "spec:width=800,height=1280,unit=px,dpi=160"

      /** TrekStor tolino7 */
      val TOLINO7 = "spec:width=900,height=1440,unit=px,dpi=240"

      /** TrekStor tolino8 */
      val TOLINO8 = "spec:width=1200,height=1920,unit=px,dpi=320"

      /** TrekStor tolino89 */
      val TOLINO89 = "spec:width=1200,height=1920,unit=px,dpi=240"

  }
