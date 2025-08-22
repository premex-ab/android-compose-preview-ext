package se.premex.compose.preview.devices

import kotlin.Any
import se.premex.compose.preview.Devices

/**
 * ALT device specifications for Android Compose previews.
 *
 * This extension provides ALT device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Alt.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Alt: Any
  get() = object {
      /** ALT odin */
      val ODIN = "spec:width=720,height=1560,unit=px,dpi=320"

      /** ALT odin2 */
      val ODIN2 = "spec:width=720,height=1560,unit=px,dpi=320"

      /** ALT thor */
      val THOR = "spec:width=480,height=800,unit=px,dpi=240"

      /** ALT thor2 */
      val THOR2 = "spec:width=480,height=800,unit=px,dpi=220"

  }
