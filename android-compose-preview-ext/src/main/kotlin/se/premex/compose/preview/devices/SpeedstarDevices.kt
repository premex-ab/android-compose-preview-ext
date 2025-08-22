package se.premex.compose.preview.devices

import kotlin.Any
import se.premex.compose.preview.Devices

/**
 * SPEEDSTAR device specifications for Android Compose previews.
 *
 * This extension provides SPEEDSTAR device specifications that can be used with @Preview
 * annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Speedstar.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Speedstar: Any
  get() = object {
      /** SPEEDSTAR StarTab_A324G */
      val STARTAB_A324G = "spec:width=1200,height=1920,unit=px,dpi=240"

  }
