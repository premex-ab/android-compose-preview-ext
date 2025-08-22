package se.premex.compose.preview.devices

import kotlin.Any
import se.premex.compose.preview.Devices

/**
 * OXYGEN-id device specifications for Android Compose previews.
 *
 * This extension provides OXYGEN-id device specifications that can be used with @Preview
 * annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.OxygenId.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.OxygenId: Any
  get() = object {
      /** OXYGEN-id SEI700MRT */
      val SEI700MRT = "spec:width=1080,height=1920,unit=px,dpi=320"

  }
