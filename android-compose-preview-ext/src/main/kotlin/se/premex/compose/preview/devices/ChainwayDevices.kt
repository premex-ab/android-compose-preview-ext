package se.premex.compose.preview.devices

import kotlin.Any
import se.premex.compose.preview.Devices

/**
 * chainway device specifications for Android Compose previews.
 *
 * This extension provides chainway device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Chainway.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Chainway: Any
  get() = object {
      /** chainway C6000 */
      val C6000 = "spec:width=480,height=800,unit=px,dpi=240"

      /** chainway C90 */
      val C90 = "spec:width=720,height=1440,unit=px,dpi=320"

  }
