package se.premex.compose.preview.devices

import kotlin.Any
import se.premex.compose.preview.Devices

/**
 * SUNNY device specifications for Android Compose previews.
 *
 * This extension provides SUNNY device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Sunny.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Sunny: Any
  get() = object {
      /** SUNNY TABLET */
      val TABLET = "spec:width=1200,height=1920,unit=px,dpi=320"

      /** SUNNY YQB */
      val YQB = "spec:width=1080,height=1920,unit=px,dpi=320"

  }
