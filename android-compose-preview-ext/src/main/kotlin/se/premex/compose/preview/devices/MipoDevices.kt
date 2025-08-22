package se.premex.compose.preview.devices

import kotlin.Any
import se.premex.compose.preview.Devices

/**
 * mipo device specifications for Android Compose previews.
 *
 * This extension provides mipo device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Mipo.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Mipo: Any
  get() = object {
      /** mipo mipo_M17 */
      val MIPO_M17 = "spec:width=720,height=1600,unit=px,dpi=320"

      /** mipo mipo_M25 */
      val MIPO_M25 = "spec:width=720,height=1600,unit=px,dpi=320"

      /** mipo mipo_M46_Plus */
      val MIPO_M46_PLUS = "spec:width=720,height=1640,unit=px,dpi=320"

      /** mipo mipo_M59 */
      val MIPO_M59 = "spec:width=1080,height=2460,unit=px,dpi=480"

  }
