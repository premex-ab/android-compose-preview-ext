package se.premex.compose.preview.devices

import kotlin.Any
import se.premex.compose.preview.Devices

/**
 * Altibox device specifications for Android Compose previews.
 *
 * This extension provides Altibox device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Altibox.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Altibox: Any
  get() = object {
      /** Altibox uiw4054aib */
      val UIW4054AIB = "spec:width=1080,height=1920,unit=px,dpi=320"

  }
