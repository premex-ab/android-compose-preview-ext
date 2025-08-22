package se.premex.compose.preview.devices

import kotlin.Any
import se.premex.compose.preview.Devices

/**
 * Paitanry device specifications for Android Compose previews.
 *
 * This extension provides Paitanry device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Paitanry.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Paitanry: Any
  get() = object {
      /** Paitanry CH10PRO */
      val CH10PRO = "spec:width=800,height=1280,unit=px,dpi=160"

      /** Paitanry CH10PROMAX */
      val CH10PROMAX = "spec:width=800,height=1280,unit=px,dpi=160"

      /** Paitanry R16-PRO */
      val R16_PRO = "spec:width=800,height=1280,unit=px,dpi=160"

      /** Paitanry SSK10 */
      val SSK10 = "spec:width=800,height=1280,unit=px,dpi=160"

  }
