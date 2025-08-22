package se.premex.compose.preview.devices

import kotlin.Any
import se.premex.compose.preview.Devices

/**
 * Trimble_Navigation device specifications for Android Compose previews.
 *
 * This extension provides Trimble_Navigation device specifications that can be used with @Preview
 * annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.TrimbleNavigation.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.TrimbleNavigation: Any
  get() = object {
      /** Trimble_Navigation DUO */
      val DUO = "spec:width=600,height=1024,unit=px,dpi=160"

      /** Trimble_Navigation MS5 */
      val MS5 = "spec:width=600,height=1024,unit=px,dpi=160"

  }
