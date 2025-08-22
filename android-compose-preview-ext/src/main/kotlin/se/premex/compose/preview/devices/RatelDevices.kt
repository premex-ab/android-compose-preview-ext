package se.premex.compose.preview.devices

import kotlin.Any
import se.premex.compose.preview.Devices

/**
 * Ratel device specifications for Android Compose previews.
 *
 * This extension provides Ratel device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Ratel.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Ratel: Any
  get() = object {
      /** Ratel Cell */
      val CELL = "spec:width=1080,height=1920,unit=px,dpi=420"

  }
