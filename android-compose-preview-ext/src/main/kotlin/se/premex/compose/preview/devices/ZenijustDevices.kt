package se.premex.compose.preview.devices

import kotlin.Any
import se.premex.compose.preview.Devices

/**
 * Zenijust device specifications for Android Compose previews.
 *
 * This extension provides Zenijust device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Zenijust.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Zenijust: Any
  get() = object {
      /** Zenijust H20_EEA */
      val H20_EEA = "spec:width=800,height=1280,unit=px,dpi=160"

  }
