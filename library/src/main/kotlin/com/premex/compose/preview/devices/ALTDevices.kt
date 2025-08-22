package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * ALT device specifications for Android Compose previews.
 *
 * This extension provides ALT device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.ALT.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.ALT: Any
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
