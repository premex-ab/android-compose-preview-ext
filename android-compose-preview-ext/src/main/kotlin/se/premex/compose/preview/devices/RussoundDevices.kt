package se.premex.compose.preview.devices

import kotlin.Any
import se.premex.compose.preview.Devices

/**
 * Russound device specifications for Android Compose previews.
 *
 * This extension provides Russound device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Russound.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Russound: Any
  get() = object {
      /** Russound XTS7 */
      val XTS7 = "spec:width=800,height=1280,unit=px,dpi=160"

  }
