package se.premex.compose.preview.devices

import kotlin.Any
import se.premex.compose.preview.Devices

/**
 * Ultimate device specifications for Android Compose previews.
 *
 * This extension provides Ultimate device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Ultimate.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Ultimate: Any
  get() = object {
      /** Ultimate Ultimate_FU */
      val ULTIMATE_FU = "spec:width=720,height=1600,unit=px,dpi=320"

  }
