package se.premex.compose.preview.devices

import kotlin.Any
import se.premex.compose.preview.Devices

/**
 * Lumigon device specifications for Android Compose previews.
 *
 * This extension provides Lumigon device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Lumigon.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Lumigon: Any
  get() = object {
      /** Lumigon Lumigon_T3 */
      val LUMIGON_T3 = "spec:width=720,height=1280,unit=px,dpi=320"

  }
