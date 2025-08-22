package se.premex.compose.preview.devices

import kotlin.Any
import se.premex.compose.preview.Devices

/**
 * TVision device specifications for Android Compose previews.
 *
 * This extension provides TVision device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Tvision.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Tvision: Any
  get() = object {
      /** TVision SEI400TM */
      val SEI400TM = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** TVision SEI700TM */
      val SEI700TM = "spec:width=1080,height=1920,unit=px,dpi=320"

  }
