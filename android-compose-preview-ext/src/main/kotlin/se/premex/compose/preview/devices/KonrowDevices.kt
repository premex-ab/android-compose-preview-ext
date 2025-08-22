package se.premex.compose.preview.devices

import kotlin.Any
import se.premex.compose.preview.Devices

/**
 * Konrow device specifications for Android Compose previews.
 *
 * This extension provides Konrow device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Konrow.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Konrow: Any
  get() = object {
      /** Konrow KTAB_1003 */
      val KTAB_1003 = "spec:width=800,height=1280,unit=px,dpi=160"

      /** Konrow KTAB_1004 */
      val KTAB_1004 = "spec:width=800,height=1280,unit=px,dpi=160"

      /** Konrow Sky */
      val SKY = "spec:width=640,height=1280,unit=px,dpi=320"

  }
