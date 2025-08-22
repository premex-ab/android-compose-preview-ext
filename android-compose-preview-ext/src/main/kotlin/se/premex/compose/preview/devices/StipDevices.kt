package se.premex.compose.preview.devices

import kotlin.Any
import se.premex.compose.preview.Devices

/**
 * STIP device specifications for Android Compose previews.
 *
 * This extension provides STIP device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Stip.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Stip: Any
  get() = object {
      /** STIP MS9 */
      val MS9 = "spec:width=720,height=1440,unit=px,dpi=320"

  }
