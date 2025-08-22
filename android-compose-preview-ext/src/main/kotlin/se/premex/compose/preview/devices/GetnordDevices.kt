package se.premex.compose.preview.devices

import kotlin.Any
import se.premex.compose.preview.Devices

/**
 * Getnord device specifications for Android Compose previews.
 *
 * This extension provides Getnord device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Getnord.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Getnord: Any
  get() = object {
      /** Getnord LYNX */
      val LYNX = "spec:width=480,height=854,unit=px,dpi=240"

  }
