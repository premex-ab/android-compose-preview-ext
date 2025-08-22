package se.premex.compose.preview.devices

import kotlin.Any
import se.premex.compose.preview.Devices

/**
 * Iskon device specifications for Android Compose previews.
 *
 * This extension provides Iskon device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Iskon.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Iskon: Any
  get() = object {
      /** Iskon HY44G */
      val HY44G = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** Iskon wh220_iskon */
      val WH220_ISKON = "spec:width=1080,height=1920,unit=px,dpi=320"

  }
