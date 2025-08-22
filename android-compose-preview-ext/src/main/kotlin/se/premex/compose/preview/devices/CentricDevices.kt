package se.premex.compose.preview.devices

import kotlin.Any
import se.premex.compose.preview.Devices

/**
 * Centric device specifications for Android Compose previews.
 *
 * This extension provides Centric device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Centric.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Centric: Any
  get() = object {
      /** Centric Centric_L4 */
      val CENTRIC_L4 = "spec:width=720,height=1280,unit=px,dpi=320"

  }
