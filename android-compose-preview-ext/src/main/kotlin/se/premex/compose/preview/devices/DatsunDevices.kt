package se.premex.compose.preview.devices

import kotlin.Any
import se.premex.compose.preview.Devices

/**
 * DATSUN device specifications for Android Compose previews.
 *
 * This extension provides DATSUN device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Datsun.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Datsun: Any
  get() = object {
      /** DATSUN Datsun_D5001 */
      val DATSUN_D5001 = "spec:width=480,height=960,unit=px,dpi=240"

  }
