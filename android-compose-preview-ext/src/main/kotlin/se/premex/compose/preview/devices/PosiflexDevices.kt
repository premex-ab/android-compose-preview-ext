package se.premex.compose.preview.devices

import kotlin.Any
import se.premex.compose.preview.Devices

/**
 * Posiflex device specifications for Android Compose previews.
 *
 * This extension provides Posiflex device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Posiflex.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Posiflex: Any
  get() = object {
      /** Posiflex MK_1000 */
      val MK_1000 = "spec:width=768,height=1366,unit=px,dpi=160"

  }
