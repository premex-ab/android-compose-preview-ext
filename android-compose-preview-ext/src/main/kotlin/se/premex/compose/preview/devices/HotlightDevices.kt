package se.premex.compose.preview.devices

import kotlin.Any
import se.premex.compose.preview.Devices

/**
 * Hotlight device specifications for Android Compose previews.
 *
 * This extension provides Hotlight device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Hotlight.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Hotlight: Any
  get() = object {
      /** Hotlight C108 */
      val C108 = "spec:width=800,height=1280,unit=px,dpi=160"

  }
