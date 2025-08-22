package se.premex.compose.preview.devices

import kotlin.Any
import se.premex.compose.preview.Devices

/**
 * Stofa device specifications for Android Compose previews.
 *
 * This extension provides Stofa device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Stofa.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Stofa: Any
  get() = object {
      /** Stofa IC1130 */
      val IC1130 = "spec:width=1080,height=1920,unit=px,dpi=320"

  }
