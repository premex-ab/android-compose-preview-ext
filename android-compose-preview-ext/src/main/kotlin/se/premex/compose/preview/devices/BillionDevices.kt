package se.premex.compose.preview.devices

import kotlin.Any
import se.premex.compose.preview.Devices

/**
 * Billion device specifications for Android Compose previews.
 *
 * This extension provides Billion device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Billion.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Billion: Any
  get() = object {
      /** Billion rimoB */
      val RIMOB = "spec:width=1080,height=1920,unit=px,dpi=480"

  }
