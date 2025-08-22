package se.premex.compose.preview.devices

import kotlin.Any
import se.premex.compose.preview.Devices

/**
 * Caxilysh device specifications for Android Compose previews.
 *
 * This extension provides Caxilysh device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Caxilysh.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Caxilysh: Any
  get() = object {
      /** Caxilysh A10 */
      val A10 = "spec:width=800,height=1280,unit=px,dpi=160"

  }
